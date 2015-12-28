
package com.blackbean.cable.esl.router.model.rest.markets.query;

import com.fasterxml.jackson.annotation.*;

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
    private CsgMarket csgMarket;
    @JsonProperty("ddpMarket")
    private Object ddpMarket;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LegacyMarketId() {
    }

    /**
     * 
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
     *
     * @return
     *     The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     *
     * @param source
     *     The source
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
     *
     * @return
     *     The csgMarket
     */
    @JsonProperty("csgMarket")
    public CsgMarket getCsgMarket() {
        return csgMarket;
    }

    /**
     *
     * @param csgMarket
     *     The csgMarket
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
     *
     * @return
     *     The ddpMarket
     */
    @JsonProperty("ddpMarket")
    public Object getDdpMarket() {
        return ddpMarket;
    }

    /**
     *
     * @param ddpMarket
     *     The ddpMarket
     */
    @JsonProperty("ddpMarket")
    public void setDdpMarket(Object ddpMarket) {
        this.ddpMarket = ddpMarket;
    }

    public LegacyMarketId withDdpMarket(Object ddpMarket) {
        this.ddpMarket = ddpMarket;
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

    public LegacyMarketId withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
