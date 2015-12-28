package com.blackbean.cable.esl.router.model.rest.location.query;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "accountCorp",
        "franchiseTaxArea",
        "managementArea"
})
public class DdpMarket {

    @JsonProperty("accountCorp")
    private String accountCorp;
    @JsonProperty("franchiseTaxArea")
    private String franchiseTaxArea;
    @JsonProperty("managementArea")
    private Object managementArea;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public DdpMarket() {
    }

    /**
     * @param accountCorp
     * @param managementArea
     * @param franchiseTaxArea
     */
    public DdpMarket(String accountCorp, String franchiseTaxArea, Object managementArea) {
        this.accountCorp = accountCorp;
        this.franchiseTaxArea = franchiseTaxArea;
        this.managementArea = managementArea;
    }

    /**
     * @return The accountCorp
     */
    @JsonProperty("accountCorp")
    public String getAccountCorp() {
        return accountCorp;
    }

    /**
     * @param accountCorp The accountCorp
     */
    @JsonProperty("accountCorp")
    public void setAccountCorp(String accountCorp) {
        this.accountCorp = accountCorp;
    }

    public DdpMarket withAccountCorp(String accountCorp) {
        this.accountCorp = accountCorp;
        return this;
    }

    /**
     * @return The franchiseTaxArea
     */
    @JsonProperty("franchiseTaxArea")
    public String getFranchiseTaxArea() {
        return franchiseTaxArea;
    }

    /**
     * @param franchiseTaxArea The franchiseTaxArea
     */
    @JsonProperty("franchiseTaxArea")
    public void setFranchiseTaxArea(String franchiseTaxArea) {
        this.franchiseTaxArea = franchiseTaxArea;
    }

    public DdpMarket withFranchiseTaxArea(String franchiseTaxArea) {
        this.franchiseTaxArea = franchiseTaxArea;
        return this;
    }

    /**
     * @return The managementArea
     */
    @JsonProperty("managementArea")
    public Object getManagementArea() {
        return managementArea;
    }

    /**
     * @param managementArea The managementArea
     */
    @JsonProperty("managementArea")
    public void setManagementArea(Object managementArea) {
        this.managementArea = managementArea;
    }

    public DdpMarket withManagementArea(Object managementArea) {
        this.managementArea = managementArea;
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

    public DdpMarket withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accountCorp).append(franchiseTaxArea).append(managementArea).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DdpMarket) == false) {
            return false;
        }
        DdpMarket rhs = ((DdpMarket) other);
        return new EqualsBuilder().append(accountCorp, rhs.accountCorp).append(franchiseTaxArea, rhs.franchiseTaxArea).append(managementArea, rhs.managementArea).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
