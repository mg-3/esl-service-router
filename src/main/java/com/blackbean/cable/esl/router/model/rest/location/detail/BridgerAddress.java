
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
        "bridgerBidirectional",
        "bridgerGateControl",
        "bridgerPrivate"
})
public class BridgerAddress {

    @JsonProperty("bridgerBidirectional")
    private String bridgerBidirectional;
    @JsonProperty("bridgerGateControl")
    private String bridgerGateControl;
    @JsonProperty("bridgerPrivate")
    private String bridgerPrivate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The bridgerBidirectional
     */
    @JsonProperty("bridgerBidirectional")
    public String getBridgerBidirectional() {
        return bridgerBidirectional;
    }

    /**
     *
     * @param bridgerBidirectional
     *     The bridgerBidirectional
     */
    @JsonProperty("bridgerBidirectional")
    public void setBridgerBidirectional(String bridgerBidirectional) {
        this.bridgerBidirectional = bridgerBidirectional;
    }

    public BridgerAddress withBridgerBidirectional(String bridgerBidirectional) {
        this.bridgerBidirectional = bridgerBidirectional;
        return this;
    }

    /**
     *
     * @return
     *     The bridgerGateControl
     */
    @JsonProperty("bridgerGateControl")
    public String getBridgerGateControl() {
        return bridgerGateControl;
    }

    /**
     *
     * @param bridgerGateControl
     *     The bridgerGateControl
     */
    @JsonProperty("bridgerGateControl")
    public void setBridgerGateControl(String bridgerGateControl) {
        this.bridgerGateControl = bridgerGateControl;
    }

    public BridgerAddress withBridgerGateControl(String bridgerGateControl) {
        this.bridgerGateControl = bridgerGateControl;
        return this;
    }

    /**
     *
     * @return
     *     The bridgerPrivate
     */
    @JsonProperty("bridgerPrivate")
    public String getBridgerPrivate() {
        return bridgerPrivate;
    }

    /**
     *
     * @param bridgerPrivate
     *     The bridgerPrivate
     */
    @JsonProperty("bridgerPrivate")
    public void setBridgerPrivate(String bridgerPrivate) {
        this.bridgerPrivate = bridgerPrivate;
    }

    public BridgerAddress withBridgerPrivate(String bridgerPrivate) {
        this.bridgerPrivate = bridgerPrivate;
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

    public BridgerAddress withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bridgerBidirectional).append(bridgerGateControl).append(bridgerPrivate).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BridgerAddress) == false) {
            return false;
        }
        BridgerAddress rhs = ((BridgerAddress) other);
        return new EqualsBuilder().append(bridgerBidirectional, rhs.bridgerBidirectional).append(bridgerGateControl, rhs.bridgerGateControl).append(bridgerPrivate, rhs.bridgerPrivate).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
