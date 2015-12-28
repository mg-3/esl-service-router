package com.blackbean.cable.esl.router.model.rest.location.query;

import com.blackbean.cable.esl.router.model.rest.cc.CSGLegacyMarketType;
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
        "source",
        "csgMarket",
        "ddpMarket"
})
public class LegacyMarketId {

    @JsonProperty("source")
    private String source;
    @JsonProperty("csgMarket")
    private CSGLegacyMarketType csgMarket;
    @JsonProperty("ddpMarket")
    private DdpMarket ddpMarket;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public LegacyMarketId() {
    }

    /**
     * @param csgMarket
     * @param source
     * @param ddpMarket
     */
    public LegacyMarketId(String source, CSGLegacyMarketType csgMarket, DdpMarket ddpMarket) {
        this.source = source;
        this.csgMarket = csgMarket;
        this.ddpMarket = ddpMarket;
    }

    /**
     * @return The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * @param source The source
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public LegacyMarketId withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * @return The csgMarket
     */
    @JsonProperty("csgMarket")
    public CSGLegacyMarketType getCsgMarket() {
        return csgMarket;
    }

    /**
     * @param csgMarket The csgMarket
     */
    @JsonProperty("csgMarket")
    public void setCsgMarket(CSGLegacyMarketType csgMarket) {
        this.csgMarket = csgMarket;
    }

    public LegacyMarketId withCsgMarket(CSGLegacyMarketType csgMarket) {
        this.csgMarket = csgMarket;
        return this;
    }

    /**
     * @return The ddpMarket
     */
    @JsonProperty("ddpMarket")
    public DdpMarket getDdpMarket() {
        return ddpMarket;
    }

    /**
     * @param ddpMarket The ddpMarket
     */
    @JsonProperty("ddpMarket")
    public void setDdpMarket(DdpMarket ddpMarket) {
        this.ddpMarket = ddpMarket;
    }

    public LegacyMarketId withDdpMarket(DdpMarket ddpMarket) {
        this.ddpMarket = ddpMarket;
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

    public LegacyMarketId withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(source).append(csgMarket).append(ddpMarket).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LegacyMarketId) == false) {
            return false;
        }
        LegacyMarketId rhs = ((LegacyMarketId) other);
        return new EqualsBuilder().append(source, rhs.source).append(csgMarket, rhs.csgMarket).append(ddpMarket, rhs.ddpMarket).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
