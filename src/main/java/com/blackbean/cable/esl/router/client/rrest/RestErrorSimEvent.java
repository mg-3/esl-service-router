package com.blackbean.cable.esl.router.client.rrest;

import org.springframework.context.ApplicationEvent;

/**
 * @author Mike Garcia
 *         Date: 12/1/2015
 *         esl-service-router
 */
public class RestErrorSimEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public RestErrorSimEvent(Object source) {
        super(source);
    }

    public Object getSource() {
        return this.source;
    }
}
