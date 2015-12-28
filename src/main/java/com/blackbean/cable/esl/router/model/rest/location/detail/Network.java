
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
        "headend",
        "headendType",
        "networkAddress",
        "nodeName",
        "nodeDesc"
})
public class Network {

    @JsonProperty("headend")
    private String headend;
    @JsonProperty("headendType")
    private String headendType;
    @JsonProperty("networkAddress")
    private String networkAddress;
    @JsonProperty("nodeName")
    private Object nodeName;
    @JsonProperty("nodeDesc")
    private Object nodeDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Network withHeadend(String headend) {
        this.headend = headend;
        return this;
    }

    /**
     *
     * @return
     *     The headendType
     */
    @JsonProperty("headendType")
    public String getHeadendType() {
        return headendType;
    }

    /**
     *
     * @param headendType
     *     The headendType
     */
    @JsonProperty("headendType")
    public void setHeadendType(String headendType) {
        this.headendType = headendType;
    }

    public Network withHeadendType(String headendType) {
        this.headendType = headendType;
        return this;
    }

    /**
     *
     * @return
     *     The networkAddress
     */
    @JsonProperty("networkAddress")
    public String getNetworkAddress() {
        return networkAddress;
    }

    /**
     *
     * @param networkAddress
     *     The networkAddress
     */
    @JsonProperty("networkAddress")
    public void setNetworkAddress(String networkAddress) {
        this.networkAddress = networkAddress;
    }

    public Network withNetworkAddress(String networkAddress) {
        this.networkAddress = networkAddress;
        return this;
    }

    /**
     *
     * @return
     *     The nodeName
     */
    @JsonProperty("nodeName")
    public Object getNodeName() {
        return nodeName;
    }

    /**
     *
     * @param nodeName
     *     The nodeName
     */
    @JsonProperty("nodeName")
    public void setNodeName(Object nodeName) {
        this.nodeName = nodeName;
    }

    public Network withNodeName(Object nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     *
     * @return
     *     The nodeDesc
     */
    @JsonProperty("nodeDesc")
    public Object getNodeDesc() {
        return nodeDesc;
    }

    /**
     *
     * @param nodeDesc
     *     The nodeDesc
     */
    @JsonProperty("nodeDesc")
    public void setNodeDesc(Object nodeDesc) {
        this.nodeDesc = nodeDesc;
    }

    public Network withNodeDesc(Object nodeDesc) {
        this.nodeDesc = nodeDesc;
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

    public Network withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(headend).append(headendType).append(networkAddress).append(nodeName).append(nodeDesc).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Network) == false) {
            return false;
        }
        Network rhs = ((Network) other);
        return new EqualsBuilder().append(headend, rhs.headend).append(headendType, rhs.headendType).append(networkAddress, rhs.networkAddress).append(nodeName, rhs.nodeName).append(nodeDesc, rhs.nodeDesc).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
