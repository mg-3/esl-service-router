
package com.blackbean.cable.esl.router.model.rest.markets.detail;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.validation.Valid;

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
    @Valid
    private CsgMarket csgMarket;
    @JsonProperty("ddpMarket")
    private Object ddpMarket;

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
    public LegacyMarketId(String source, CsgMarket csgMarket, Object ddpMarket) {
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
    public CsgMarket getCsgMarket() {
        return csgMarket;
    }

    /**
     * @param csgMarket The csgMarket
     */
    @JsonProperty("csgMarket")
    public void setCsgMarket(CsgMarket csgMarket) {
        this.csgMarket = csgMarket;
    }

    public LegacyMarketId withCsgMarket(CsgMarket csgMarket) {
        this.csgMarket = csgMarket;
        return this;
    }

    /**
     * @return The ddpMarket
     */
    @JsonProperty("ddpMarket")
    public Object getDdpMarket() {
        return ddpMarket;
    }

    /**
     * @param ddpMarket The ddpMarket
     */
    @JsonProperty("ddpMarket")
    public void setDdpMarket(Object ddpMarket) {
        this.ddpMarket = ddpMarket;
    }

    public LegacyMarketId withDdpMarket(Object ddpMarket) {
        this.ddpMarket = ddpMarket;
        return this;
    }

}
