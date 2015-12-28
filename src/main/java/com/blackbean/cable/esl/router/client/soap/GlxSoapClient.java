package com.blackbean.cable.esl.router.client.soap;

import com.blackbean.cable.esl.router.model.jaxb14_08.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * @author Mike Garcia
 *         Date: 12/3/2015
 *         esl-service-router
 */
@Service
public class GlxSoapClient<R extends GetLocationXfinityResponseType>
        extends SoapClient<R> {

    @Autowired
    private ObjectFactory locationServicesObjectFactory;

    private final static Logger log = LoggerFactory.getLogger(GlxSoapClient.class);

    @Autowired
    public GlxSoapClient(LocationServicePort locationServicePort) {
        super(locationServicePort);
    }

    @Override
    public Future<R> performOperation(Map<String, String> params, String u, String p) throws Exception {
        setHeaders(u, p);
        GetLocationXfinityRequestType glx = locationServicesObjectFactory.createGetLocationXfinityRequestType();
        glx.setLocationID(Long.valueOf(params.get("id")));
        GetLocationXfinityRequestedResultsType wantedResults = locationServicesObjectFactory.createGetLocationXfinityRequestedResultsType();
        /*
         * The service is picky; you have to explicitly tell it what to return otherwise you wont get what you expect ;)
         */
        wantedResults.setGeographyInfo(Boolean.TRUE);
        wantedResults.setBillingDetailsInfo(Boolean.TRUE);
        wantedResults.setAddressInfo(Boolean.TRUE);
        wantedResults.setCapabilityInfo(Boolean.TRUE);
        wantedResults.setE911AddressInfo(Boolean.TRUE);
        wantedResults.setHomeSecurityInfo(Boolean.TRUE);
        wantedResults.setMarketInfo(Boolean.TRUE);
        wantedResults.setMarketHierarchyInfo(locationServicesObjectFactory
                .createGetLocationXfinityRequestedResultsTypeMarketHierarchyInfo(Boolean.TRUE));
        glx.setRequestedResults(wantedResults);

        try {
            GetLocationXfinityResponseType response = port.getLocationXfinity(glx);
            return new AsyncResult(response);
        } catch (LocationServiceFault fault) {
            List<MessageType> errors = fault.getFaultInfo().getMessages().getMessage();
            errors.forEach(mt -> log.error("Location service error: {}, {}", mt.getCode(), mt.getText()));
            throw fault;
        }
    }

}
