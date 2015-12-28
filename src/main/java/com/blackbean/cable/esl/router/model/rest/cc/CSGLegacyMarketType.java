package com.blackbean.cable.esl.router.model.rest.cc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CSGLegacyMarketType implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 8508915180001078410L;
    @JsonProperty
    private String system;
    @JsonProperty
    private String principle;
    @JsonProperty
    private String agent;

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getPrinciple() {
        return principle;
    }

    public void setPrinciple(String principle) {
        this.principle = principle;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }


}
