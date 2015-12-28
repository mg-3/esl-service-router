package com.blackbean.cable.esl.router.model.rest.location.query;

import com.blackbean.cable.esl.router.model.rest.EslResponse;
import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "addresses",
        "geoCoderError"
})
public class QueryAttemptiveResponse implements EslResponse {

    @JsonProperty("addresses")
    private List<Address> addresses = new ArrayList<Address>();
    @JsonProperty("geoCoderError")
    private Object geoCoderError;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public QueryAttemptiveResponse() {
    }

    /**
     * @param geoCoderError
     * @param addresses
     */
    public QueryAttemptiveResponse(List<Address> addresses, Object geoCoderError) {
        this.addresses = addresses;
        this.geoCoderError = geoCoderError;
    }

    /**
     * @return The addresses
     */
    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * @param addresses The addresses
     */
    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public QueryAttemptiveResponse withAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * @return The geoCoderError
     */
    @JsonProperty("geoCoderError")
    public Object getGeoCoderError() {
        return geoCoderError;
    }

    /**
     * @param geoCoderError The geoCoderError
     */
    @JsonProperty("geoCoderError")
    public void setGeoCoderError(Object geoCoderError) {
        this.geoCoderError = geoCoderError;
    }

    public QueryAttemptiveResponse withGeoCoderError(Object geoCoderError) {
        this.geoCoderError = geoCoderError;
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

    public QueryAttemptiveResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(addresses).append(geoCoderError).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QueryAttemptiveResponse) == false) {
            return false;
        }
        QueryAttemptiveResponse rhs = ((QueryAttemptiveResponse) other);
        return new EqualsBuilder().append(addresses, rhs.addresses).append(geoCoderError, rhs.geoCoderError).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
