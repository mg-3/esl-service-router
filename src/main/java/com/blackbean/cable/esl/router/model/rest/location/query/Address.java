package com.blackbean.cable.esl.router.model.rest.location.query;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents the response type from queryAttemptive in AC/TH
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "addressID",
        "address",
        "lat",
        "lon",
        "fraudIndicator",
        "component",
        "marketInfo",
        "legacyLocationIds"
})
public class Address {

    @JsonProperty("addressID")
    private int addressID;
    @JsonProperty("address")
    private String address;
    @JsonProperty("lat")
    private double lat;
    @JsonProperty("lon")
    private double lon;
    @JsonProperty("fraudIndicator")
    private Object fraudIndicator;
    @JsonProperty("component")
    private Component component;
    @JsonProperty("marketInfo")
    private MarketInfo marketInfo;
    @JsonProperty("legacyLocationIds")
    private List<LegacyLocationId> legacyLocationIds = new ArrayList<LegacyLocationId>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Address() {
    }

    /**
     * @param lon
     * @param component
     * @param address
     * @param marketInfo
     * @param fraudIndicator
     * @param legacyLocationIds
     * @param addressID
     * @param lat
     */
    public Address(int addressID, String address, double lat, double lon, Object fraudIndicator, Component component, MarketInfo marketInfo, List<LegacyLocationId> legacyLocationIds) {
        this.addressID = addressID;
        this.address = address;
        this.lat = lat;
        this.lon = lon;
        this.fraudIndicator = fraudIndicator;
        this.component = component;
        this.marketInfo = marketInfo;
        this.legacyLocationIds = legacyLocationIds;
    }

    /**
     * @return The addressID
     */
    @JsonProperty("addressID")
    public int getAddressID() {
        return addressID;
    }

    /**
     * @param addressID The addressID
     */
    @JsonProperty("addressID")
    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public Address withAddressID(int addressID) {
        this.addressID = addressID;
        return this;
    }

    /**
     * @return The address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * @param address The address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    public Address withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * @return The lat
     */
    @JsonProperty("lat")
    public double getLat() {
        return lat;
    }

    /**
     * @param lat The lat
     */
    @JsonProperty("lat")
    public void setLat(double lat) {
        this.lat = lat;
    }

    public Address withLat(double lat) {
        this.lat = lat;
        return this;
    }

    /**
     * @return The lon
     */
    @JsonProperty("lon")
    public double getLon() {
        return lon;
    }

    /**
     * @param lon The lon
     */
    @JsonProperty("lon")
    public void setLon(double lon) {
        this.lon = lon;
    }

    public Address withLon(double lon) {
        this.lon = lon;
        return this;
    }

    /**
     * @return The fraudIndicator
     */
    @JsonProperty("fraudIndicator")
    public Object getFraudIndicator() {
        return fraudIndicator;
    }

    /**
     * @param fraudIndicator The fraudIndicator
     */
    @JsonProperty("fraudIndicator")
    public void setFraudIndicator(Object fraudIndicator) {
        this.fraudIndicator = fraudIndicator;
    }

    public Address withFraudIndicator(Object fraudIndicator) {
        this.fraudIndicator = fraudIndicator;
        return this;
    }

    /**
     * @return The component
     */
    @JsonProperty("component")
    public Component getComponent() {
        return component;
    }

    /**
     * @param component The component
     */
    @JsonProperty("component")
    public void setComponent(Component component) {
        this.component = component;
    }

    public Address withComponent(Component component) {
        this.component = component;
        return this;
    }

    /**
     * @return The marketInfo
     */
    @JsonProperty("marketInfo")
    public MarketInfo getMarketInfo() {
        return marketInfo;
    }

    /**
     * @param marketInfo The marketInfo
     */
    @JsonProperty("marketInfo")
    public void setMarketInfo(MarketInfo marketInfo) {
        this.marketInfo = marketInfo;
    }

    public Address withMarketInfo(MarketInfo marketInfo) {
        this.marketInfo = marketInfo;
        return this;
    }

    /**
     * @return The legacyLocationIds
     */
    @JsonProperty("legacyLocationIds")
    public List<LegacyLocationId> getLegacyLocationIds() {
        return legacyLocationIds;
    }

    /**
     * @param legacyLocationIds The legacyLocationIds
     */
    @JsonProperty("legacyLocationIds")
    public void setLegacyLocationIds(List<LegacyLocationId> legacyLocationIds) {
        this.legacyLocationIds = legacyLocationIds;
    }

    public Address withLegacyLocationIds(List<LegacyLocationId> legacyLocationIds) {
        this.legacyLocationIds = legacyLocationIds;
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

    public Address withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(addressID).append(address).append(lat).append(lon).append(fraudIndicator).append(component).append(marketInfo).append(legacyLocationIds).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return new EqualsBuilder().append(addressID, rhs.addressID).append(address, rhs.address).append(lat, rhs.lat).append(lon, rhs.lon).append(fraudIndicator, rhs.fraudIndicator).append(component, rhs.component).append(marketInfo, rhs.marketInfo).append(legacyLocationIds, rhs.legacyLocationIds).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
