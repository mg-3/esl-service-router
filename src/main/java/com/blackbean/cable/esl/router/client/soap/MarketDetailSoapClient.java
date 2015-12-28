package com.blackbean.cable.esl.router.client.soap;

import com.blackbean.cable.esl.router.model.jaxb14_08.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.AsyncResult;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * @author Mike Garcia
 *         Date: 12/3/2015
 *         esl-service-router
 */
public class MarketDetailSoapClient<R extends GetMarketResponseType> extends SoapClient<R> {

    private final static Logger log = LoggerFactory.getLogger(MarketDetailSoapClient.class);

    @Autowired
    public MarketDetailSoapClient(LocationServicePort locationServicePort) {
        super(locationServicePort);
    }

    @Override
    public Future<R> performOperation(Map<String, String> params, String u, String p) throws Exception {
        setHeaders(u, p);
        GetMarketRequestType getMarketRequestType = new GetMarketRequestType();
        getMarketRequestType.setMarketID(Long.parseLong(params.get("id")));

        try {
            GetMarketResponseType response = port.getMarket(getMarketRequestType);
            return new AsyncResult(response);
        } catch (LocationServiceFault fault) {
            List<MessageType> errors = fault.getFaultInfo().getMessages().getMessage();
            errors.forEach(mt -> log.error("Location service error: {}, {}", mt.getCode(), mt.getText()));
            throw fault;
        }
    }
}
