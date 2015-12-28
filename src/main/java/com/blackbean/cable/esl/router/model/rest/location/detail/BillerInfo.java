
package com.blackbean.cable.esl.router.model.rest.location.detail;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.ALWAYS)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "billerType",
        "csgLegacyDetails",
        "ddpLegacyDetails"
})
public class BillerInfo {

    @JsonProperty("billerType")
    private String billerType;
    @JsonProperty("csgLegacyDetails")
    private List<CsgLegacyDetail> csgLegacyDetails = new ArrayList<CsgLegacyDetail>();
    @JsonProperty("ddpLegacyDetails")
    private Object ddpLegacyDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The billerType
     */
    @JsonProperty("billerType")
    public String getBillerType() {
        return billerType;
    }

    /**
     *
     * @param billerType
     *     The billerType
     */
    @JsonProperty("billerType")
    public void setBillerType(String billerType) {
        this.billerType = billerType;
    }

    public BillerInfo withBillerType(String billerType) {
        this.billerType = billerType;
        return this;
    }

    /**
     *
     * @return
     *     The csgLegacyDetails
     */
    @JsonProperty("csgLegacyDetails")
    public List<CsgLegacyDetail> getCsgLegacyDetails() {
        return csgLegacyDetails;
    }

    /**
     *
     * @param csgLegacyDetails
     *     The csgLegacyDetails
     */
    @JsonProperty("csgLegacyDetails")
    public void setCsgLegacyDetails(List<CsgLegacyDetail> csgLegacyDetails) {
        this.csgLegacyDetails = csgLegacyDetails;
    }

    public BillerInfo withCsgLegacyDetails(List<CsgLegacyDetail> csgLegacyDetails) {
        this.csgLegacyDetails = csgLegacyDetails;
        return this;
    }

    /**
     *
     * @return
     *     The ddpLegacyDetails
     */
    @JsonProperty("ddpLegacyDetails")
    public Object getDdpLegacyDetails() {
        return ddpLegacyDetails;
    }

    /**
     *
     * @param ddpLegacyDetails
     *     The ddpLegacyDetails
     */
    @JsonProperty("ddpLegacyDetails")
    public void setDdpLegacyDetails(Object ddpLegacyDetails) {
        this.ddpLegacyDetails = ddpLegacyDetails;
    }

    public BillerInfo withDdpLegacyDetails(Object ddpLegacyDetails) {
        this.ddpLegacyDetails = ddpLegacyDetails;
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

    public BillerInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(billerType).append(csgLegacyDetails).append(ddpLegacyDetails).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BillerInfo) == false) {
            return false;
        }
        BillerInfo rhs = ((BillerInfo) other);
        return new EqualsBuilder().append(billerType, rhs.billerType).append(csgLegacyDetails, rhs.csgLegacyDetails).append(ddpLegacyDetails, rhs.ddpLegacyDetails).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
