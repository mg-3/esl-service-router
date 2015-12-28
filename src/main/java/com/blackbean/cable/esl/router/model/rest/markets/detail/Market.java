
package com.blackbean.cable.esl.router.model.rest.markets.detail;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.validation.Valid;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "id",
        "name",
        "consumerName",
        "legacyMarketType",
        "parent",
        "company",
        "glcode",
        "legacyMarketId",
        "capabilities"
})
public class Market {

    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("consumerName")
    private String consumerName;
    @JsonProperty("legacyMarketType")
    private String legacyMarketType;
    @JsonProperty("parent")
    private long parent;
    @JsonProperty("company")
    private String company;
    @JsonProperty("glcode")
    private String glcode;
    @JsonProperty("legacyMarketId")
    @Valid
    private LegacyMarketId legacyMarketId;
    @JsonProperty("capabilities")
    @Valid
    private Capabilities capabilities;

    /**
     * No args constructor for use in serialization
     */
    public Market() {
    }

    /**
     * @param consumerName
     * @param id
     * @param company
     * @param name
     * @param glcode
     * @param parent
     * @param legacyMarketType
     * @param capabilities
     * @param legacyMarketId
     */
    public Market(long id, String name, String consumerName, String legacyMarketType, long parent, String company, String glcode, LegacyMarketId legacyMarketId, Capabilities capabilities) {
        this.id = id;
        this.name = name;
        this.consumerName = consumerName;
        this.legacyMarketType = legacyMarketType;
        this.parent = parent;
        this.company = company;
        this.glcode = glcode;
        this.legacyMarketId = legacyMarketId;
        this.capabilities = capabilities;
    }

    /**
     * @return The id
     */
    @JsonProperty("id")
    public long getId() {
        return id;
    }

    /**
     * @param id The id
     */
    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public Market withId(long id) {
        this.id = id;
        return this;
    }

    /**
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Market withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * @return The consumerName
     */
    @JsonProperty("consumerName")
    public String getConsumerName() {
        return consumerName;
    }

    /**
     * @param consumerName The consumerName
     */
    @JsonProperty("consumerName")
    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public Market withConsumerName(String consumerName) {
        this.consumerName = consumerName;
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

    public Market withLegacyMarketType(String legacyMarketType) {
        this.legacyMarketType = legacyMarketType;
        return this;
    }

    /**
     * @return The parent
     */
    @JsonProperty("parent")
    public long getParent() {
        return parent;
    }

    /**
     * @param parent The parent
     */
    @JsonProperty("parent")
    public void setParent(long parent) {
        this.parent = parent;
    }

    public Market withParent(long parent) {
        this.parent = parent;
        return this;
    }

    /**
     * @return The company
     */
    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    /**
     * @param company The company
     */
    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    public Market withCompany(String company) {
        this.company = company;
        return this;
    }

    /**
     * @return The glcode
     */
    @JsonProperty("glcode")
    public String getGlcode() {
        return glcode;
    }

    /**
     * @param glcode The glcode
     */
    @JsonProperty("glcode")
    public void setGlcode(String glcode) {
        this.glcode = glcode;
    }

    public Market withGlcode(String glcode) {
        this.glcode = glcode;
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

    public Market withLegacyMarketId(LegacyMarketId legacyMarketId) {
        this.legacyMarketId = legacyMarketId;
        return this;
    }

    /**
     * @return The capabilities
     */
    @JsonProperty("capabilities")
    public Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * @param capabilities The capabilities
     */
    @JsonProperty("capabilities")
    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    public Market withCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

}
