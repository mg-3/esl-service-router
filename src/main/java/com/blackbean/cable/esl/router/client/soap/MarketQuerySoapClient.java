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
public class MarketQuerySoapClient<R extends QueryMarketResponseType> extends SoapClient<R> {

    private final static Logger log = LoggerFactory.getLogger(MarketQuerySoapClient.class);

    @Autowired
    public MarketQuerySoapClient(LocationServicePort locationServicePort) {
        super(locationServicePort);
    }

    @Override
    public Future<R> performOperation(Map<String, String> params, String u, String p) throws Exception {
        setHeaders(u, p);
        QueryMarketAddressSearchType queryMarketRequestType = new QueryMarketAddressSearchType();
        queryMarketRequestType.setCity(params.get("city"));
        queryMarketRequestType.setState(params.get("state"));
        queryMarketRequestType.setZip(params.get("zip"));
        QueryMarketRequestType requestType = new QueryMarketRequestType();
        requestType.setAddressSearch(queryMarketRequestType);

        try {
            QueryMarketResponseType response = port.queryMarket(requestType);
            return new AsyncResult(response);
        } catch (LocationServiceFault fault) {
            List<MessageType> errors = fault.getFaultInfo().getMessages().getMessage();
            errors.forEach(mt -> log.error("Location service error: {}, {}", mt.getCode(), mt.getText()));
            throw fault;
        }

    }

}
