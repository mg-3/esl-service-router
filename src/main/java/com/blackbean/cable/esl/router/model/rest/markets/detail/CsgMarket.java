
package com.blackbean.cable.esl.router.model.rest.markets.detail;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "system",
        "principle",
        "agent"
})
public class CsgMarket {

    @JsonProperty("system")
    private String system;
    @JsonProperty("principle")
    private String principle;
    @JsonProperty("agent")
    private String agent;

    /**
     * No args constructor for use in serialization
     */
    public CsgMarket() {
    }

    /**
     * @param principle
     * @param system
     * @param agent
     */
    public CsgMarket(String system, String principle, String agent) {
        this.system = system;
        this.principle = principle;
        this.agent = agent;
    }

    /**
     * @return The system
     */
    @JsonProperty("system")
    public String getSystem() {
        return system;
    }

    /**
     * @param system The system
     */
    @JsonProperty("system")
    public void setSystem(String system) {
        this.system = system;
    }

    public CsgMarket withSystem(String system) {
        this.system = system;
        return this;
    }

    /**
     * @return The principle
     */
    @JsonProperty("principle")
    public String getPrinciple() {
        return principle;
    }

    /**
     * @param principle The principle
     */
    @JsonProperty("principle")
    public void setPrinciple(String principle) {
        this.principle = principle;
    }

    public CsgMarket withPrinciple(String principle) {
        this.principle = principle;
        return this;
    }

    /**
     * @return The agent
     */
    @JsonProperty("agent")
    public String getAgent() {
        return agent;
    }

    /**
     * @param agent The agent
     */
    @JsonProperty("agent")
    public void setAgent(String agent) {
        this.agent = agent;
    }

    public CsgMarket withAgent(String agent) {
        this.agent = agent;
        return this;
    }

}
