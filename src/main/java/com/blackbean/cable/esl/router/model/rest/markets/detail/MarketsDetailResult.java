
package com.blackbean.cable.esl.router.model.rest.markets.detail;

import com.blackbean.cable.esl.router.model.rest.EslResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "market",
        "marketHierarchy"
})
public class MarketsDetailResult implements EslResponse {

    @JsonProperty("market")
    @Valid
    private Market market;
    @JsonProperty("marketHierarchy")
    @Valid
    private List<MarketHierarchy> marketHierarchy = new ArrayList<MarketHierarchy>();

    /**
     * No args constructor for use in serialization
     */
    public MarketsDetailResult() {
    }

    /**
     * @param market
     * @param marketHierarchy
     */
    public MarketsDetailResult(Market market, List<MarketHierarchy> marketHierarchy) {
        this.market = market;
        this.marketHierarchy = marketHierarchy;
    }

    /**
     * @return The market
     */
    @JsonProperty("market")
    public Market getMarket() {
        return market;
    }

    /**
     * @param market The market
     */
    @JsonProperty("market")
    public void setMarket(Market market) {
        this.market = market;
    }

    public MarketsDetailResult withMarket(Market market) {
        this.market = market;
        return this;
    }

    /**
     * @return The marketHierarchy
     */
    @JsonProperty("marketHierarchy")
    public List<MarketHierarchy> getMarketHierarchy() {
        return marketHierarchy;
    }

    /**
     * @param marketHierarchy The marketHierarchy
     */
    @JsonProperty("marketHierarchy")
    public void setMarketHierarchy(List<MarketHierarchy> marketHierarchy) {
        this.marketHierarchy = marketHierarchy;
    }

    public MarketsDetailResult withMarketHierarchy(List<MarketHierarchy> marketHierarchy) {
        this.marketHierarchy = marketHierarchy;
        return this;
    }

}
