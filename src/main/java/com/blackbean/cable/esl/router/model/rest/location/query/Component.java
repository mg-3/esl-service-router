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
        "city",
        "state",
        "zip5",
        "zip4",
        "addressLine2",
        "addressLine1"
})
public class Component {

    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("zip5")
    private String zip5;
    @JsonProperty("zip4")
    private String zip4;
    @JsonProperty("addressLine2")
    private String addressLine2;
    @JsonProperty("addressLine1")
    private String addressLine1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Component() {
    }

    /**
     * @param zip5
     * @param zip4
     * @param state
     * @param addressLine2
     * @param addressLine1
     * @param city
     */
    public Component(String city, String state, String zip5, String zip4, String addressLine2, String addressLine1) {
        this.city = city;
        this.state = state;
        this.zip5 = zip5;
        this.zip4 = zip4;
        this.addressLine2 = addressLine2;
        this.addressLine1 = addressLine1;
    }

    /**
     * @return The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * @param city The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Component withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * @return The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * @param state The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Component withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * @return The zip5
     */
    @JsonProperty("zip5")
    public String getZip5() {
        return zip5;
    }

    /**
     * @param zip5 The zip5
     */
    @JsonProperty("zip5")
    public void setZip5(String zip5) {
        this.zip5 = zip5;
    }

    public Component withZip5(String zip5) {
        this.zip5 = zip5;
        return this;
    }

    /**
     * @return The zip4
     */
    @JsonProperty("zip4")
    public String getZip4() {
        return zip4;
    }

    /**
     * @param zip4 The zip4
     */
    @JsonProperty("zip4")
    public void setZip4(String zip4) {
        this.zip4 = zip4;
    }

    public Component withZip4(String zip4) {
        this.zip4 = zip4;
        return this;
    }

    /**
     * @return The addressLine2
     */
    @JsonProperty("addressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * @param addressLine2 The addressLine2
     */
    @JsonProperty("addressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Component withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * @return The addressLine1
     */
    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * @param addressLine1 The addressLine1
     */
    @JsonProperty("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Component withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
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

    public Component withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(city).append(state).append(zip5).append(zip4).append(addressLine2).append(addressLine1).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Component) == false) {
            return false;
        }
        Component rhs = ((Component) other);
        return new EqualsBuilder().append(city, rhs.city).append(state, rhs.state).append(zip5, rhs.zip5).append(zip4, rhs.zip4).append(addressLine2, rhs.addressLine2).append(addressLine1, rhs.addressLine1).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
