
package com.blackbean.cable.esl.router.model.rest.markets.detail;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "level",
        "marketName",
        "marketId"
})
public class MarketHierarchy {

    @JsonProperty("level")
    private long level;
    @JsonProperty("marketName")
    private String marketName;
    @JsonProperty("marketId")
    private long marketId;

    /**
     * No args constructor for use in serialization
     */
    public MarketHierarchy() {
    }

    /**
     * @param marketId
     * @param level
     * @param marketName
     */
    public MarketHierarchy(long level, String marketName, long marketId) {
        this.level = level;
        this.marketName = marketName;
        this.marketId = marketId;
    }

    /**
     * @return The level
     */
    @JsonProperty("level")
    public long getLevel() {
        return level;
    }

    /**
     * @param level The level
     */
    @JsonProperty("level")
    public void setLevel(long level) {
        this.level = level;
    }

    public MarketHierarchy withLevel(long level) {
        this.level = level;
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

    public MarketHierarchy withMarketName(String marketName) {
        this.marketName = marketName;
        return this;
    }

    /**
     * @return The marketId
     */
    @JsonProperty("marketId")
    public long getMarketId() {
        return marketId;
    }

    /**
     * @param marketId The marketId
     */
    @JsonProperty("marketId")
    public void setMarketId(long marketId) {
        this.marketId = marketId;
    }

    public MarketHierarchy withMarketId(long marketId) {
        this.marketId = marketId;
        return this;
    }

}
