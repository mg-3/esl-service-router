
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
        "houseNumPrefix",
        "houseNumber",
        "houseNumSuffix",
        "streetPredir",
        "streetName",
        "streetSuffix",
        "streetPostdir",
        "unitType1",
        "unitValue1",
        "unitType2",
        "unitValue2",
        "unitType3",
        "unitValue3",
        "city",
        "state",
        "zip5",
        "zip4"
})
public class AltAddress {

    @JsonProperty("houseNumPrefix")
    private Object houseNumPrefix;
    @JsonProperty("houseNumber")
    private String houseNumber;
    @JsonProperty("houseNumSuffix")
    private Object houseNumSuffix;
    @JsonProperty("streetPredir")
    private Object streetPredir;
    @JsonProperty("streetName")
    private String streetName;
    @JsonProperty("streetSuffix")
    private String streetSuffix;
    @JsonProperty("streetPostdir")
    private Object streetPostdir;
    @JsonProperty("unitType1")
    private String unitType1;
    @JsonProperty("unitValue1")
    private String unitValue1;
    @JsonProperty("unitType2")
    private Object unitType2;
    @JsonProperty("unitValue2")
    private Object unitValue2;
    @JsonProperty("unitType3")
    private Object unitType3;
    @JsonProperty("unitValue3")
    private Object unitValue3;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("zip5")
    private String zip5;
    @JsonProperty("zip4")
    private Object zip4;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The houseNumPrefix
     */
    @JsonProperty("houseNumPrefix")
    public Object getHouseNumPrefix() {
        return houseNumPrefix;
    }

    /**
     * @param houseNumPrefix The houseNumPrefix
     */
    @JsonProperty("houseNumPrefix")
    public void setHouseNumPrefix(Object houseNumPrefix) {
        this.houseNumPrefix = houseNumPrefix;
    }

    public AltAddress withHouseNumPrefix(Object houseNumPrefix) {
        this.houseNumPrefix = houseNumPrefix;
        return this;
    }

    /**
     * @return The houseNumber
     */
    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * @param houseNumber The houseNumber
     */
    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public AltAddress withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * @return The houseNumSuffix
     */
    @JsonProperty("houseNumSuffix")
    public Object getHouseNumSuffix() {
        return houseNumSuffix;
    }

    /**
     * @param houseNumSuffix The houseNumSuffix
     */
    @JsonProperty("houseNumSuffix")
    public void setHouseNumSuffix(Object houseNumSuffix) {
        this.houseNumSuffix = houseNumSuffix;
    }

    public AltAddress withHouseNumSuffix(Object houseNumSuffix) {
        this.houseNumSuffix = houseNumSuffix;
        return this;
    }

    /**
     * @return The streetPredir
     */
    @JsonProperty("streetPredir")
    public Object getStreetPredir() {
        return streetPredir;
    }

    /**
     * @param streetPredir The streetPredir
     */
    @JsonProperty("streetPredir")
    public void setStreetPredir(Object streetPredir) {
        this.streetPredir = streetPredir;
    }

    public AltAddress withStreetPredir(Object streetPredir) {
        this.streetPredir = streetPredir;
        return this;
    }

    /**
     * @return The streetName
     */
    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    /**
     * @param streetName The streetName
     */
    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public AltAddress withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     * @return The streetSuffix
     */
    @JsonProperty("streetSuffix")
    public String getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * @param streetSuffix The streetSuffix
     */
    @JsonProperty("streetSuffix")
    public void setStreetSuffix(String streetSuffix) {
        this.streetSuffix = streetSuffix;
    }

    public AltAddress withStreetSuffix(String streetSuffix) {
        this.streetSuffix = streetSuffix;
        return this;
    }

    /**
     * @return The streetPostdir
     */
    @JsonProperty("streetPostdir")
    public Object getStreetPostdir() {
        return streetPostdir;
    }

    /**
     * @param streetPostdir The streetPostdir
     */
    @JsonProperty("streetPostdir")
    public void setStreetPostdir(Object streetPostdir) {
        this.streetPostdir = streetPostdir;
    }

    public AltAddress withStreetPostdir(Object streetPostdir) {
        this.streetPostdir = streetPostdir;
        return this;
    }

    /**
     * @return The unitType1
     */
    @JsonProperty("unitType1")
    public String getUnitType1() {
        return unitType1;
    }

    /**
     * @param unitType1 The unitType1
     */
    @JsonProperty("unitType1")
    public void setUnitType1(String unitType1) {
        this.unitType1 = unitType1;
    }

    public AltAddress withUnitType1(String unitType1) {
        this.unitType1 = unitType1;
        return this;
    }

    /**
     * @return The unitValue1
     */
    @JsonProperty("unitValue1")
    public String getUnitValue1() {
        return unitValue1;
    }

    /**
     * @param unitValue1 The unitValue1
     */
    @JsonProperty("unitValue1")
    public void setUnitValue1(String unitValue1) {
        this.unitValue1 = unitValue1;
    }

    public AltAddress withUnitValue1(String unitValue1) {
        this.unitValue1 = unitValue1;
        return this;
    }

    /**
     * @return The unitType2
     */
    @JsonProperty("unitType2")
    public Object getUnitType2() {
        return unitType2;
    }

    /**
     * @param unitType2 The unitType2
     */
    @JsonProperty("unitType2")
    public void setUnitType2(Object unitType2) {
        this.unitType2 = unitType2;
    }

    public AltAddress withUnitType2(Object unitType2) {
        this.unitType2 = unitType2;
        return this;
    }

    /**
     * @return The unitValue2
     */
    @JsonProperty("unitValue2")
    public Object getUnitValue2() {
        return unitValue2;
    }

    /**
     * @param unitValue2 The unitValue2
     */
    @JsonProperty("unitValue2")
    public void setUnitValue2(Object unitValue2) {
        this.unitValue2 = unitValue2;
    }

    public AltAddress withUnitValue2(Object unitValue2) {
        this.unitValue2 = unitValue2;
        return this;
    }

    /**
     * @return The unitType3
     */
    @JsonProperty("unitType3")
    public Object getUnitType3() {
        return unitType3;
    }

    /**
     * @param unitType3 The unitType3
     */
    @JsonProperty("unitType3")
    public void setUnitType3(Object unitType3) {
        this.unitType3 = unitType3;
    }

    public AltAddress withUnitType3(Object unitType3) {
        this.unitType3 = unitType3;
        return this;
    }

    /**
     * @return The unitValue3
     */
    @JsonProperty("unitValue3")
    public Object getUnitValue3() {
        return unitValue3;
    }

    /**
     * @param unitValue3 The unitValue3
     */
    @JsonProperty("unitValue3")
    public void setUnitValue3(Object unitValue3) {
        this.unitValue3 = unitValue3;
    }

    public AltAddress withUnitValue3(Object unitValue3) {
        this.unitValue3 = unitValue3;
        return this;
    }

    /**
     * @return The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * @param city The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public AltAddress withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * @return The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * @param state The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public AltAddress withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * @return The zip5
     */
    @JsonProperty("zip5")
    public String getZip5() {
        return zip5;
    }

    /**
     * @param zip5 The zip5
     */
    @JsonProperty("zip5")
    public void setZip5(String zip5) {
        this.zip5 = zip5;
    }

    public AltAddress withZip5(String zip5) {
        this.zip5 = zip5;
        return this;
    }

    /**
     * @return The zip4
     */
    @JsonProperty("zip4")
    public Object getZip4() {
        return zip4;
    }

    /**
     * @param zip4 The zip4
     */
    @JsonProperty("zip4")
    public void setZip4(Object zip4) {
        this.zip4 = zip4;
    }

    public AltAddress withZip4(Object zip4) {
        this.zip4 = zip4;
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

    public AltAddress withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(houseNumPrefix).append(houseNumber).append(houseNumSuffix).append(streetPredir).append(streetName).append(streetSuffix).append(streetPostdir).append(unitType1).append(unitValue1).append(unitType2).append(unitValue2).append(unitType3).append(unitValue3).append(city).append(state).append(zip5).append(zip4).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AltAddress) == false) {
            return false;
        }
        AltAddress rhs = ((AltAddress) other);
        return new EqualsBuilder().append(houseNumPrefix, rhs.houseNumPrefix).append(houseNumber, rhs.houseNumber).append(houseNumSuffix, rhs.houseNumSuffix).append(streetPredir, rhs.streetPredir).append(streetName, rhs.streetName).append(streetSuffix, rhs.streetSuffix).append(streetPostdir, rhs.streetPostdir).append(unitType1, rhs.unitType1).append(unitValue1, rhs.unitValue1).append(unitType2, rhs.unitType2).append(unitValue2, rhs.unitValue2).append(unitType3, rhs.unitType3).append(unitValue3, rhs.unitValue3).append(city, rhs.city).append(state, rhs.state).append(zip5, rhs.zip5).append(zip4, rhs.zip4).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
