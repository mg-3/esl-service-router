
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
        "lobType",
        "headend",
        "serviceStatus",
        "tapStatus",
        "disableServiceStatus"
})
public class Lob {

    @JsonProperty("lobType")
    private String lobType;
    @JsonProperty("headend")
    private String headend;
    @JsonProperty("serviceStatus")
    private String serviceStatus;
    @JsonProperty("tapStatus")
    private String tapStatus;
    @JsonProperty("disableServiceStatus")
    private Object disableServiceStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The lobType
     */
    @JsonProperty("lobType")
    public String getLobType() {
        return lobType;
    }

    /**
     *
     * @param lobType
     *     The lobType
     */
    @JsonProperty("lobType")
    public void setLobType(String lobType) {
        this.lobType = lobType;
    }

    public Lob withLobType(String lobType) {
        this.lobType = lobType;
        return this;
    }

    /**
     *
     * @return
     *     The headend
     */
    @JsonProperty("headend")
    public String getHeadend() {
        return headend;
    }

    /**
     *
     * @param headend
     *     The headend
     */
    @JsonProperty("headend")
    public void setHeadend(String headend) {
        this.headend = headend;
    }

    public Lob withHeadend(String headend) {
        this.headend = headend;
        return this;
    }

    /**
     *
     * @return
     *     The serviceStatus
     */
    @JsonProperty("serviceStatus")
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     *
     * @param serviceStatus
     *     The serviceStatus
     */
    @JsonProperty("serviceStatus")
    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public Lob withServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }

    /**
     *
     * @return
     *     The tapStatus
     */
    @JsonProperty("tapStatus")
    public String getTapStatus() {
        return tapStatus;
    }

    /**
     *
     * @param tapStatus
     *     The tapStatus
     */
    @JsonProperty("tapStatus")
    public void setTapStatus(String tapStatus) {
        this.tapStatus = tapStatus;
    }

    public Lob withTapStatus(String tapStatus) {
        this.tapStatus = tapStatus;
        return this;
    }

    /**
     *
     * @return
     *     The disableServiceStatus
     */
    @JsonProperty("disableServiceStatus")
    public Object getDisableServiceStatus() {
        return disableServiceStatus;
    }

    /**
     *
     * @param disableServiceStatus
     *     The disableServiceStatus
     */
    @JsonProperty("disableServiceStatus")
    public void setDisableServiceStatus(Object disableServiceStatus) {
        this.disableServiceStatus = disableServiceStatus;
    }

    public Lob withDisableServiceStatus(Object disableServiceStatus) {
        this.disableServiceStatus = disableServiceStatus;
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

    public Lob withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lobType).append(headend).append(serviceStatus).append(tapStatus).append(disableServiceStatus).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Lob) == false) {
            return false;
        }
        Lob rhs = ((Lob) other);
        return new EqualsBuilder().append(lobType, rhs.lobType).append(headend, rhs.headend).append(serviceStatus, rhs.serviceStatus).append(tapStatus, rhs.tapStatus).append(disableServiceStatus, rhs.disableServiceStatus).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
