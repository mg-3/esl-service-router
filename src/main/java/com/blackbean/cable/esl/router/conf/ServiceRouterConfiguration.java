package com.blackbean.cable.esl.router.conf;

import com.blackbean.cable.esl.router.client.rrest.RestService;
import com.blackbean.cable.esl.router.client.soap.GlxSoapClient;
import com.blackbean.cable.esl.router.client.soap.MarketDetailSoapClient;
import com.blackbean.cable.esl.router.client.soap.MarketQuerySoapClient;
import com.blackbean.cable.esl.router.client.soap.QlxSoapClient;
import com.blackbean.cable.esl.router.controllers.handlers.ResponseHandler;
import com.blackbean.cable.esl.router.model.jaxb14_08.LocationServicePort;
import com.blackbean.cable.esl.router.model.jaxb14_08.LocationServiceSoapBindingQSService;
import com.blackbean.cable.esl.router.model.jaxb14_08.ObjectFactory;
import com.blackbean.cable.esl.router.model.rest.location.detail.LocationDetailResponse;
import com.blackbean.cable.esl.router.model.rest.location.query.QueryAttemptiveResponse;
import com.blackbean.cable.esl.router.model.rest.markets.detail.MarketsDetailResult;
import com.blackbean.cable.esl.router.model.rest.markets.query.MarketsQueryRespose;
import com.google.common.collect.ImmutableMap;
import ma.glasnost.orika.Mapper;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * @author Mike Garcia
 *         Date: 11/18/2015
 *         esl-service-router
 */
@Configuration
public class ServiceRouterConfiguration {

    @Autowired
    ApplicationContext appCtx;

    @Autowired
    private Environment environment;

    @Bean
    @DependsOn({"glxSoapClient", "qlxSoapClient"})
    public ImmutableMap responseHandlerMap() {
        ImmutableMap handlerMap = ImmutableMap.of(
                "/router/eslrestapi/addresscache/v1/location/query/attemptive",
                qlxResponseHandler(),
                "/router/eslrestapi/addresscache/v1/location/detail",
                glxResponseHandler(),
                "/router/eslrestapi/addresscache/v1/market/detail",
                gmResponseHandler(),
                "/router/eslrestapi/addresscache/v1/market/query",
                qmResponseHandler()
        );
        return handlerMap;
    }

    @Bean
    public ResponseHandler qlxResponseHandler() {
        ResponseHandler qlxResponseHandler = new ResponseHandler();
        qlxResponseHandler.setSoapClient(qlxSoapClient());
        qlxResponseHandler.setResponseType(new QueryAttemptiveResponse());
        return qlxResponseHandler;
    }

    @Bean
    public ResponseHandler glxResponseHandler() {
        ResponseHandler glxResponseHandler = new ResponseHandler();
        glxResponseHandler.setSoapClient(glxSoapClient());
        glxResponseHandler.setResponseType(new LocationDetailResponse());
        return glxResponseHandler;
    }

    @Bean
    public ResponseHandler gmResponseHandler() {
        ResponseHandler gmResponseHandler = new ResponseHandler();
        gmResponseHandler.setSoapClient(marketDetailSoapClient());
        gmResponseHandler.setResponseType(new MarketsDetailResult());
        return gmResponseHandler;
    }

    @Bean
    public ResponseHandler qmResponseHandler() {
        ResponseHandler qmResponseHandler = new ResponseHandler();
        qmResponseHandler.setSoapClient(marketQuerySoapClient());
        qmResponseHandler.setResponseType(new MarketsQueryRespose());
        return qmResponseHandler;
    }

    @Bean
    @DependsOn("soapServicePort")
    public MarketQuerySoapClient marketQuerySoapClient() {
        MarketQuerySoapClient mqsc = new MarketQuerySoapClient(soapServicePort());
        return mqsc;
    }

    @Bean
    @DependsOn("soapServicePort")
    public MarketDetailSoapClient marketDetailSoapClient() {
        MarketDetailSoapClient mdss = new MarketDetailSoapClient(soapServicePort());
        return mdss;
    }

    @Bean
    @DependsOn("soapServicePort")
    public QlxSoapClient qlxSoapClient() {
        QlxSoapClient soapClient = new QlxSoapClient(soapServicePort());
        return soapClient;
    }

    @Bean
    @DependsOn("soapServicePort")
    public GlxSoapClient glxSoapClient() {
        GlxSoapClient soapClient = new GlxSoapClient(soapServicePort());
        return soapClient;
    }

    @Bean
    public RestService restService() {
        String endpoint = environment.getProperty("esl.gslb.endpoint");
        assert endpoint != null;
        return new RestService(endpoint);
    }

    @Bean
    public MapperFacade getMapperFacade() {
        DefaultMapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        Map<String, Mapper> mappers = appCtx.getBeansOfType(Mapper.class);
        mappers.values().forEach(mapper -> mapperFactory.registerMapper(mapper));
        return mapperFactory.getMapperFacade();
    }

    @Bean
    public LocationServicePort soapServicePort() {
        LocationServiceSoapBindingQSService service = new LocationServiceSoapBindingQSService();
        LocationServicePort port = service.getLocationServiceSoapBindingQSPort();
        return port;
    }

    @Bean
    public ObjectFactory locationServicesObjectFactory() {
        return new ObjectFactory();
    }

}
