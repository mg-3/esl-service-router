
package com.blackbean.cable.esl.router.model.rest.markets.query;

import com.blackbean.cable.esl.router.model.rest.EslResponse;
import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "markets"
})
public class MarketsQueryRespose implements EslResponse {

    @JsonProperty("markets")
    private List<Market> markets = new ArrayList<Market>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public MarketsQueryRespose() {
    }

    /**
     * @param markets
     */
    public MarketsQueryRespose(List<Market> markets) {
        this.markets = markets;
    }

    /**
     * @return The markets
     */
    @JsonProperty("markets")
    public List<Market> getMarkets() {
        return markets;
    }

    /**
     * @param markets The markets
     */
    @JsonProperty("markets")
    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }

    public MarketsQueryRespose withMarkets(List<Market> markets) {
        this.markets = markets;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public MarketsQueryRespose withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
