package com.blackbean.cable.esl.router.controllers;

import com.blackbean.cable.esl.router.client.rrest.RestErrorSimEvent;
import com.blackbean.cable.esl.router.client.rrest.RestService;
import com.blackbean.cable.esl.router.client.soap.SoapClient;
import com.blackbean.cable.esl.router.controllers.handlers.ResponseHandler;
import com.blackbean.cable.esl.router.model.rest.EslResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import ma.glasnost.orika.MapperFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.context.ApplicationListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Future;

/**
 * This controller is the entry point for all of the routing capabilities.  Consumers can point to
 * the REST endpooints exposed here and the router will attempt to request the data from the
 * Address-Cache/Type-Ahead (AC/TH) system.  If the request is successful, then the response
 * will be sent back to the consumer.<p/>
 * If the request fails, the controller will fallback
 * to making the original consumer request to LocationServices.This is accomplished by taking the original incoming REST request, mapping all fields to a SOAP envelope and forwarding to the legacy LocationServices system.
 *<p/>
 * <em>Service mappings are:</em>
 * <ol>
 * <li>REST request --> SOAP request</li>
 * <li>SOAP response --> REST response</li>
 * </ol>
 *
 * @author Mike Garcia
 *         Date: 11/18/2015
 *         esl-service-router
 */
@RequestMapping
@RestController
public class ServiceRouterController implements ApplicationListener<RestErrorSimEvent> {

    private final static Logger log = LoggerFactory.getLogger(ServiceRouterController.class);

    private final static char[] p = new char[]{'P', 'a', 's', 's', 'w', 'o', 'r', 'd', '1', '!'};
    private final static ObjectMapper objMapper = new ObjectMapper();
    private static final String ELOC_SOAP_METRIC = "router.service.locationsrvc.called";
    private static final String ESL_ACTH_METRIC = "router.service.addresscache.called";

    private final ImmutableMap<String, ResponseHandler> responseHandlerMap;
    private final RestService restService;
    private final MapperFacade mapperFacade;
    private boolean doErrorSimulation = false;

    @Autowired
    private CounterService counterService;

    @Autowired
    public ServiceRouterController(
            ImmutableMap<String, ResponseHandler> responseHandlerMap,
            RestService restService,
            MapperFacade mapperFacade) {
        this.responseHandlerMap = responseHandlerMap;
        this.restService = restService;
        this.mapperFacade = mapperFacade;
    }

    @RequestMapping(value = "/router/**", produces = "application/json")
    public ResponseEntity<byte[]> routeToDestination(
            HttpServletRequest httpRequest
    ) throws IOException, ServletException {

        String user = httpRequest.getHeader("client-name");
        String pwd = httpRequest.getHeader("client-password");
        String servicePath = httpRequest.getServletPath();
        log.trace("Servlet path {}", httpRequest.getServletPath());
        log.trace("Query string = {}", httpRequest.getQueryString());
        Map<String, String[]> params = httpRequest.getParameterMap();

        try {
            /*
             * If this throws an exception we'll use the parameters provided and attempt to make
             * a legacy location soap request; then map that to an attemptive repsonse and respond
             * successfully.
             */
            if (this.doErrorSimulation) {
//                ErrorGenerator.throwOccasionalError();
                throw new Exception("Mikes testing error");
            }

            byte[] response = restService.passThrough(httpRequest, user, pwd.toCharArray());
            counterService.increment(ESL_ACTH_METRIC);
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            log.error("Address cache/type-ahead could not respond to this request: {}", e.getMessage());
            try {
                SoapClient<?> soapClient = responseHandlerMap.get(servicePath).getSoapClient();
                Future<?> soapResponse = soapClient.performOperation(getMapOf(params),
                        "smoketestuser", String.copyValueOf(p));

                counterService.increment(ELOC_SOAP_METRIC);
                EslResponse eslResponseObject = responseHandlerMap.get(servicePath)
                        .getResponseType();
                mapperFacade.map(soapResponse.get(), eslResponseObject);
                return ResponseEntity.ok(objMapper.writeValueAsBytes(eslResponseObject));
            } catch (Exception e1) {
                log.warn("Router request to Location Services failed", e1);
                return new ResponseEntity<>("Address service unavailable".getBytes(), HttpStatus.SERVICE_UNAVAILABLE);
            }
        }
    }

    private Map<String, String> getMapOf(Map<String, String[]> params) {
        Map<String, String> paramMap = Maps.newHashMap();
        String[] addressLine1 = params.get("addressLine1");
        String[] addressLine2 = params.get("addressLine2");
        String[] city = params.get("city");
        String[] state = params.get("state");
        String[] zip = params.get("zip");
        String[] id = params.get("id");

        if (addressLine1 != null) paramMap.put("addressLine1", addressLine1[0]);
        if (addressLine2 != null) paramMap.put("addressLine2", addressLine2[0]);
        if (city != null) paramMap.put("city", city[0]);
        if (state != null) paramMap.put("state", state[0]);
        if (zip != null) paramMap.put("zip", zip[0]);
        if (id != null && id.length == 1) paramMap.put("id", id[0]);
        return paramMap;
    }

    @Override
    public void onApplicationEvent(RestErrorSimEvent event) {
        log.info("Received an simulation-enable event {}", event);
        if (event.getSource() != null) {
            this.doErrorSimulation = true;
        }
    }

    private static class ErrorGenerator {

        private static final Random random = new Random();

        /**
         * When x is a multiple of 5, throw error
         *
         * @throws Exception
         */
        public static void throwOccasionalError() throws Exception {
            int x = random.nextInt(1000);
            if (x % 5 == 0) {
                throw new Exception("This is a simulated error!");
            }
        }
    }
}
