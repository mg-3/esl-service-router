
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
        "level",
        "marketName",
        "marketId"
})
public class MktHierarchy {

    @JsonProperty("level")
    private long level;
    @JsonProperty("marketName")
    private String marketName;
    @JsonProperty("marketId")
    private long marketId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The level
     */
    @JsonProperty("level")
    public long getLevel() {
        return level;
    }

    /**
     *
     * @param level
     *     The level
     */
    @JsonProperty("level")
    public void setLevel(long level) {
        this.level = level;
    }

    public MktHierarchy withLevel(long level) {
        this.level = level;
        return this;
    }

    /**
     *
     * @return
     *     The marketName
     */
    @JsonProperty("marketName")
    public String getMarketName() {
        return marketName;
    }

    /**
     *
     * @param marketName
     *     The marketName
     */
    @JsonProperty("marketName")
    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public MktHierarchy withMarketName(String marketName) {
        this.marketName = marketName;
        return this;
    }

    /**
     *
     * @return
     *     The marketId
     */
    @JsonProperty("marketId")
    public long getMarketId() {
        return marketId;
    }

    /**
     *
     * @param marketId
     *     The marketId
     */
    @JsonProperty("marketId")
    public void setMarketId(long marketId) {
        this.marketId = marketId;
    }

    public MktHierarchy withMarketId(long marketId) {
        this.marketId = marketId;
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

    public MktHierarchy withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(level).append(marketName).append(marketId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MktHierarchy) == false) {
            return false;
        }
        MktHierarchy rhs = ((MktHierarchy) other);
        return new EqualsBuilder().append(level, rhs.level).append(marketName, rhs.marketName).append(marketId, rhs.marketId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
