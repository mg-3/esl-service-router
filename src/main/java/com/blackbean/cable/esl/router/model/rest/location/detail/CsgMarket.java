
package com.blackbean.cable.esl.router.model.rest.location.detail;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.ALWAYS)
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The system
     */
    @JsonProperty("system")
    public String getSystem() {
        return system;
    }

    /**
     *
     * @param system
     *     The system
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
     *
     * @return
     *     The principle
     */
    @JsonProperty("principle")
    public String getPrinciple() {
        return principle;
    }

    /**
     *
     * @param principle
     *     The principle
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
     *
     * @return
     *     The agent
     */
    @JsonProperty("agent")
    public String getAgent() {
        return agent;
    }

    /**
     *
     * @param agent
     *     The agent
     */
    @JsonProperty("agent")
    public void setAgent(String agent) {
        this.agent = agent;
    }

    public CsgMarket withAgent(String agent) {
        this.agent = agent;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CsgMarket withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(system).append(principle).append(agent).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CsgMarket) == false) {
            return false;
        }
        CsgMarket rhs = ((CsgMarket) other);
        return new EqualsBuilder().append(system, rhs.system).append(principle, rhs.principle).append(agent, rhs.agent).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
