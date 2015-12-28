package com.blackbean.cable.esl.router.client.rrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * @author Mike Garcia
 *         Date: 11/24/2015
 *         esl-service-router
 */
@Service
public class RestService {

    private final String endpoint;

    @Autowired
    public RestService(String endpoint) {
        this.endpoint = endpoint;
    }

    public byte[] passThrough(HttpServletRequest httpRequest, String user, char[] pwd) throws UnsupportedEncodingException {
        HttpHeaders headers = new HttpHeaders();
        headers.add("client-name", user);
        headers.add("client-password", String.copyValueOf(pwd));
        String targetURL = endpoint + httpRequest.getServletPath().replace("/router", "") + "?" +
                URLDecoder.decode(httpRequest.getQueryString(), "UTF-8");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<byte[]> response = restTemplate.exchange(targetURL, HttpMethod.GET,
                new HttpEntity<byte[]>(headers), byte[].class, httpRequest.getParameterMap());
        return response.getBody();

    }
}
