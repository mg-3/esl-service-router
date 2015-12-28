
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
        "rateCenterName",
        "rateCenterAltName",
        "tnOrderPool"
})
public class Telephony {

    @JsonProperty("rateCenterName")
    private String rateCenterName;
    @JsonProperty("rateCenterAltName")
    private String rateCenterAltName;
    @JsonProperty("tnOrderPool")
    private String tnOrderPool;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The rateCenterName
     */
    @JsonProperty("rateCenterName")
    public String getRateCenterName() {
        return rateCenterName;
    }

    /**
     *
     * @param rateCenterName
     *     The rateCenterName
     */
    @JsonProperty("rateCenterName")
    public void setRateCenterName(String rateCenterName) {
        this.rateCenterName = rateCenterName;
    }

    public Telephony withRateCenterName(String rateCenterName) {
        this.rateCenterName = rateCenterName;
        return this;
    }

    /**
     *
     * @return
     *     The rateCenterAltName
     */
    @JsonProperty("rateCenterAltName")
    public String getRateCenterAltName() {
        return rateCenterAltName;
    }

    /**
     *
     * @param rateCenterAltName
     *     The rateCenterAltName
     */
    @JsonProperty("rateCenterAltName")
    public void setRateCenterAltName(String rateCenterAltName) {
        this.rateCenterAltName = rateCenterAltName;
    }

    public Telephony withRateCenterAltName(String rateCenterAltName) {
        this.rateCenterAltName = rateCenterAltName;
        return this;
    }

    /**
     *
     * @return
     *     The tnOrderPool
     */
    @JsonProperty("tnOrderPool")
    public String getTnOrderPool() {
        return tnOrderPool;
    }

    /**
     *
     * @param tnOrderPool
     *     The tnOrderPool
     */
    @JsonProperty("tnOrderPool")
    public void setTnOrderPool(String tnOrderPool) {
        this.tnOrderPool = tnOrderPool;
    }

    public Telephony withTnOrderPool(String tnOrderPool) {
        this.tnOrderPool = tnOrderPool;
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

    public Telephony withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rateCenterName).append(rateCenterAltName).append(tnOrderPool).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Telephony) == false) {
            return false;
        }
        Telephony rhs = ((Telephony) other);
        return new EqualsBuilder().append(rateCenterName, rhs.rateCenterName).append(rateCenterAltName, rhs.rateCenterAltName).append(tnOrderPool, rhs.tnOrderPool).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
