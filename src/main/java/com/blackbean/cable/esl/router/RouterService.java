package com.blackbean.cable.esl.router;

import com.blackbean.cable.esl.router.client.rrest.RestErrorSimEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author Mike Garcia
 *         Date: 11/18/2015
 *         esl-service-router
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableAsync
public class RouterService {

    private final static Logger log = LoggerFactory.getLogger(RouterService.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext appCtx = SpringApplication.run(RouterService.class, args);
        log.info("Esl router service started");
        String simulateErrors = System.getProperty("error.simulate");
        if (simulateErrors != null &&
                (simulateErrors.equalsIgnoreCase("yes") || simulateErrors.equalsIgnoreCase("true"))) {
            /*
             * Notify listener that we are in simulation mode; i.e. sporadically generate errors to force
             * fallback to SOAP service
             */
            Object source = new Object();
            appCtx.publishEvent(new RestErrorSimEvent(source));

        }
    }
}
