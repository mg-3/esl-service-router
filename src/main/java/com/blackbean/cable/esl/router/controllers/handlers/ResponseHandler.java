package com.blackbean.cable.esl.router.controllers.handlers;

import com.blackbean.cable.esl.router.client.soap.SoapClient;
import com.blackbean.cable.esl.router.model.rest.EslResponse;
import org.springframework.stereotype.Component;

/**
 * @author Mike Garcia
 *         Date: 12/3/2015
 *         esl-service-router
 */
@Component
public class ResponseHandler<S extends SoapClient, T extends EslResponse> {

    private S soapClient;
    private T responseType;

    public ResponseHandler() {

    }

    public T getResponseType() {
        return responseType;
    }

    public S getSoapClient() {
        return soapClient;
    }

    public void setResponseType(T responseType) {
        this.responseType = responseType;
    }

    public void setSoapClient(S soapClient) {
        this.soapClient = soapClient;
    }
}
