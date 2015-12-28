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
        "marketId",
        "marketName",
        "paretMktId",
        "legacyMarketType",
        "legacyMarketId",
        "glCode",
        "cCode",
        "marketCapabilities"
})
public class MarketInfo {

    @JsonProperty("marketId")
    private int marketId;
    @JsonProperty("marketName")
    private String marketName;
    @JsonProperty("paretMktId")
    private int paretMktId;
    @JsonProperty("legacyMarketType")
    private String legacyMarketType;
    @JsonProperty("legacyMarketId")
    private LegacyMarketId legacyMarketId;
    @JsonProperty("glCode")
    private String glCode;
    @JsonProperty("cCode")
    private Object cCode;
    @JsonProperty("marketCapabilities")
    private Object marketCapabilities;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public MarketInfo() {
    }

    /**
     * @param cCode
     * @param marketId
     * @param marketName
     * @param legacyMarketType
     * @param marketCapabilities
     * @param legacyMarketId
     * @param paretMktId
     * @param glCode
     */
    public MarketInfo(int marketId, String marketName, int paretMktId, String legacyMarketType, LegacyMarketId legacyMarketId, String glCode, Object cCode, Object marketCapabilities) {
        this.marketId = marketId;
        this.marketName = marketName;
        this.paretMktId = paretMktId;
        this.legacyMarketType = legacyMarketType;
        this.legacyMarketId = legacyMarketId;
        this.glCode = glCode;
        this.cCode = cCode;
        this.marketCapabilities = marketCapabilities;
    }

    /**
     * @return The marketId
     */
    @JsonProperty("marketId")
    public int getMarketId() {
        return marketId;
    }

    /**
     * @param marketId The marketId
     */
    @JsonProperty("marketId")
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    public MarketInfo withMarketId(int marketId) {
        this.marketId = marketId;
        return this;
    }

    /**
     * @return The marketName
     */
    @JsonProperty("marketName")
    public String getMarketName() {
        return marketName;
    }

    /**
     * @param marketName The marketName
     */
    @JsonProperty("marketName")
    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public MarketInfo withMarketName(String marketName) {
        this.marketName = marketName;
        return this;
    }

    /**
     * @return The paretMktId
     */
    @JsonProperty("paretMktId")
    public int getParetMktId() {
        return paretMktId;
    }

    /**
     * @param paretMktId The paretMktId
     */
    @JsonProperty("paretMktId")
    public void setParetMktId(int paretMktId) {
        this.paretMktId = paretMktId;
    }

    public MarketInfo withParetMktId(int paretMktId) {
        this.paretMktId = paretMktId;
        return this;
    }

    /**
     * @return The legacyMarketType
     */
    @JsonProperty("legacyMarketType")
    public String getLegacyMarketType() {
        return legacyMarketType;
    }

    /**
     * @param legacyMarketType The legacyMarketType
     */
    @JsonProperty("legacyMarketType")
    public void setLegacyMarketType(String legacyMarketType) {
        this.legacyMarketType = legacyMarketType;
    }

    public MarketInfo withLegacyMarketType(String legacyMarketType) {
        this.legacyMarketType = legacyMarketType;
        return this;
    }

    /**
     * @return The legacyMarketId
     */
    @JsonProperty("legacyMarketId")
    public LegacyMarketId getLegacyMarketId() {
        return legacyMarketId;
    }

    /**
     * @param legacyMarketId The legacyMarketId
     */
    @JsonProperty("legacyMarketId")
    public void setLegacyMarketId(LegacyMarketId legacyMarketId) {
        this.legacyMarketId = legacyMarketId;
    }

    public MarketInfo withLegacyMarketId(LegacyMarketId legacyMarketId) {
        this.legacyMarketId = legacyMarketId;
        return this;
    }

    /**
     * @return The glCode
     */
    @JsonProperty("glCode")
    public String getGlCode() {
        return glCode;
    }

    /**
     * @param glCode The glCode
     */
    @JsonProperty("glCode")
    public void setGlCode(String glCode) {
        this.glCode = glCode;
    }

    public MarketInfo withGlCode(String glCode) {
        this.glCode = glCode;
        return this;
    }

    /**
     * @return The cCode
     */
    @JsonProperty("cCode")
    public Object getCCode() {
        return cCode;
    }

    /**
     * @param cCode The cCode
     */
    @JsonProperty("cCode")
    public void setCCode(Object cCode) {
        this.cCode = cCode;
    }

    public MarketInfo withCCode(Object cCode) {
        this.cCode = cCode;
        return this;
    }

    /**
     * @return The marketCapabilities
     */
    @JsonProperty("marketCapabilities")
    public Object getMarketCapabilities() {
        return marketCapabilities;
    }

    /**
     * @param marketCapabilities The marketCapabilities
     */
    @JsonProperty("marketCapabilities")
    public void setMarketCapabilities(Object marketCapabilities) {
        this.marketCapabilities = marketCapabilities;
    }

    public MarketInfo withMarketCapabilities(Object marketCapabilities) {
        this.marketCapabilities = marketCapabilities;
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

    public MarketInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(marketId).append(marketName).append(paretMktId).append(legacyMarketType).append(legacyMarketId).append(glCode).append(cCode).append(marketCapabilities).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MarketInfo) == false) {
            return false;
        }
        MarketInfo rhs = ((MarketInfo) other);
        return new EqualsBuilder().append(marketId, rhs.marketId).append(marketName, rhs.marketName).append(paretMktId, rhs.paretMktId).append(legacyMarketType, rhs.legacyMarketType).append(legacyMarketId, rhs.legacyMarketId).append(glCode, rhs.glCode).append(cCode, rhs.cCode).append(marketCapabilities, rhs.marketCapabilities).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
