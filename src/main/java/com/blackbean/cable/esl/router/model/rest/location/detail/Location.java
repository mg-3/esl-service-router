
package com.blackbean.cable.esl.router.model.rest.location.detail;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.ALWAYS)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "addressId",
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
        "zip4",
        "country",
        "postalDwellCode",
        "fraudInd",
        "cCode",
        "locationStatus",
        "altAddress",
        "location",
        "marketInfo",
        "mktHierarchy",
        "telephony",
        "network",
        "timeZone",
        "billerInfo",
        "capabilities",
        "capabilityExceptions"
})
public class Location {

    @JsonProperty("addressId")
    private long addressId;
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
    @JsonProperty("country")
    private String country;
    @JsonProperty("postalDwellCode")
    private Object postalDwellCode;
    @JsonProperty("fraudInd")
    private Object fraudInd;
    @JsonProperty("cCode")
    private Object cCode;
    @JsonProperty("locationStatus")
    private String locationStatus;
    @JsonProperty("altAddress")
    private AltAddress altAddress;
    @JsonProperty("location")
    private Location_ location;
    @JsonProperty("marketInfo")
    private MarketInfo marketInfo;
    @JsonProperty("mktHierarchy")
    private List<MktHierarchy> mktHierarchy = new ArrayList<MktHierarchy>();
    @JsonProperty("telephony")
    private Telephony telephony;
    @JsonProperty("network")
    private Network network;
    @JsonProperty("timeZone")
    private TimeZone timeZone;
    @JsonProperty("billerInfo")
    private BillerInfo billerInfo;
    @JsonProperty("capabilities")
    private List<String> capabilities = new ArrayList<String>();
    @JsonProperty("capabilityExceptions")
    private Object capabilityExceptions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The addressId
     */
    @JsonProperty("addressId")
    public long getAddressId() {
        return addressId;
    }

    /**
     *
     * @param addressId
     *     The addressId
     */
    @JsonProperty("addressId")
    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public Location withAddressId(long addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *
     * @return
     *     The houseNumPrefix
     */
    @JsonProperty("houseNumPrefix")
    public Object getHouseNumPrefix() {
        return houseNumPrefix;
    }

    /**
     *
     * @param houseNumPrefix
     *     The houseNumPrefix
     */
    @JsonProperty("houseNumPrefix")
    public void setHouseNumPrefix(Object houseNumPrefix) {
        this.houseNumPrefix = houseNumPrefix;
    }

    public Location withHouseNumPrefix(Object houseNumPrefix) {
        this.houseNumPrefix = houseNumPrefix;
        return this;
    }

    /**
     *
     * @return
     *     The houseNumber
     */
    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     *
     * @param houseNumber
     *     The houseNumber
     */
    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Location withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     *
     * @return
     *     The houseNumSuffix
     */
    @JsonProperty("houseNumSuffix")
    public Object getHouseNumSuffix() {
        return houseNumSuffix;
    }

    /**
     *
     * @param houseNumSuffix
     *     The houseNumSuffix
     */
    @JsonProperty("houseNumSuffix")
    public void setHouseNumSuffix(Object houseNumSuffix) {
        this.houseNumSuffix = houseNumSuffix;
    }

    public Location withHouseNumSuffix(Object houseNumSuffix) {
        this.houseNumSuffix = houseNumSuffix;
        return this;
    }

    /**
     *
     * @return
     *     The streetPredir
     */
    @JsonProperty("streetPredir")
    public Object getStreetPredir() {
        return streetPredir;
    }

    /**
     *
     * @param streetPredir
     *     The streetPredir
     */
    @JsonProperty("streetPredir")
    public void setStreetPredir(Object streetPredir) {
        this.streetPredir = streetPredir;
    }

    public Location withStreetPredir(Object streetPredir) {
        this.streetPredir = streetPredir;
        return this;
    }

    /**
     *
     * @return
     *     The streetName
     */
    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    /**
     *
     * @param streetName
     *     The streetName
     */
    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Location withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     *
     * @return
     *     The streetSuffix
     */
    @JsonProperty("streetSuffix")
    public String getStreetSuffix() {
        return streetSuffix;
    }

    /**
     *
     * @param streetSuffix
     *     The streetSuffix
     */
    @JsonProperty("streetSuffix")
    public void setStreetSuffix(String streetSuffix) {
        this.streetSuffix = streetSuffix;
    }

    public Location withStreetSuffix(String streetSuffix) {
        this.streetSuffix = streetSuffix;
        return this;
    }

    /**
     *
     * @return
     *     The streetPostdir
     */
    @JsonProperty("streetPostdir")
    public Object getStreetPostdir() {
        return streetPostdir;
    }

    /**
     *
     * @param streetPostdir
     *     The streetPostdir
     */
    @JsonProperty("streetPostdir")
    public void setStreetPostdir(Object streetPostdir) {
        this.streetPostdir = streetPostdir;
    }

    public Location withStreetPostdir(Object streetPostdir) {
        this.streetPostdir = streetPostdir;
        return this;
    }

    /**
     *
     * @return
     *     The unitType1
     */
    @JsonProperty("unitType1")
    public String getUnitType1() {
        return unitType1;
    }

    /**
     *
     * @param unitType1
     *     The unitType1
     */
    @JsonProperty("unitType1")
    public void setUnitType1(String unitType1) {
        this.unitType1 = unitType1;
    }

    public Location withUnitType1(String unitType1) {
        this.unitType1 = unitType1;
        return this;
    }

    /**
     *
     * @return
     *     The unitValue1
     */
    @JsonProperty("unitValue1")
    public String getUnitValue1() {
        return unitValue1;
    }

    /**
     *
     * @param unitValue1
     *     The unitValue1
     */
    @JsonProperty("unitValue1")
    public void setUnitValue1(String unitValue1) {
        this.unitValue1 = unitValue1;
    }

    public Location withUnitValue1(String unitValue1) {
        this.unitValue1 = unitValue1;
        return this;
    }

    /**
     *
     * @return
     *     The unitType2
     */
    @JsonProperty("unitType2")
    public Object getUnitType2() {
        return unitType2;
    }

    /**
     *
     * @param unitType2
     *     The unitType2
     */
    @JsonProperty("unitType2")
    public void setUnitType2(Object unitType2) {
        this.unitType2 = unitType2;
    }

    public Location withUnitType2(Object unitType2) {
        this.unitType2 = unitType2;
        return this;
    }

    /**
     *
     * @return
     *     The unitValue2
     */
    @JsonProperty("unitValue2")
    public Object getUnitValue2() {
        return unitValue2;
    }

    /**
     *
     * @param unitValue2
     *     The unitValue2
     */
    @JsonProperty("unitValue2")
    public void setUnitValue2(Object unitValue2) {
        this.unitValue2 = unitValue2;
    }

    public Location withUnitValue2(Object unitValue2) {
        this.unitValue2 = unitValue2;
        return this;
    }

    /**
     *
     * @return
     *     The unitType3
     */
    @JsonProperty("unitType3")
    public Object getUnitType3() {
        return unitType3;
    }

    /**
     *
     * @param unitType3
     *     The unitType3
     */
    @JsonProperty("unitType3")
    public void setUnitType3(Object unitType3) {
        this.unitType3 = unitType3;
    }

    public Location withUnitType3(Object unitType3) {
        this.unitType3 = unitType3;
        return this;
    }

    /**
     *
     * @return
     *     The unitValue3
     */
    @JsonProperty("unitValue3")
    public Object getUnitValue3() {
        return unitValue3;
    }

    /**
     *
     * @param unitValue3
     *     The unitValue3
     */
    @JsonProperty("unitValue3")
    public void setUnitValue3(Object unitValue3) {
        this.unitValue3 = unitValue3;
    }

    public Location withUnitValue3(Object unitValue3) {
        this.unitValue3 = unitValue3;
        return this;
    }

    /**
     *
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Location withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     *
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Location withState(String state) {
        this.state = state;
        return this;
    }

    /**
     *
     * @return
     *     The zip5
     */
    @JsonProperty("zip5")
    public String getZip5() {
        return zip5;
    }

    /**
     *
     * @param zip5
     *     The zip5
     */
    @JsonProperty("zip5")
    public void setZip5(String zip5) {
        this.zip5 = zip5;
    }

    public Location withZip5(String zip5) {
        this.zip5 = zip5;
        return this;
    }

    /**
     *
     * @return
     *     The zip4
     */
    @JsonProperty("zip4")
    public Object getZip4() {
        return zip4;
    }

    /**
     *
     * @param zip4
     *     The zip4
     */
    @JsonProperty("zip4")
    public void setZip4(Object zip4) {
        this.zip4 = zip4;
    }

    public Location withZip4(Object zip4) {
        this.zip4 = zip4;
        return this;
    }

    /**
     *
     * @return
     *     The country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     *     The country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public Location withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     *
     * @return
     *     The postalDwellCode
     */
    @JsonProperty("postalDwellCode")
    public Object getPostalDwellCode() {
        return postalDwellCode;
    }

    /**
     *
     * @param postalDwellCode
     *     The postalDwellCode
     */
    @JsonProperty("postalDwellCode")
    public void setPostalDwellCode(Object postalDwellCode) {
        this.postalDwellCode = postalDwellCode;
    }

    public Location withPostalDwellCode(Object postalDwellCode) {
        this.postalDwellCode = postalDwellCode;
        return this;
    }

    /**
     *
     * @return
     *     The fraudInd
     */
    @JsonProperty("fraudInd")
    public Object getFraudInd() {
        return fraudInd;
    }

    /**
     *
     * @param fraudInd
     *     The fraudInd
     */
    @JsonProperty("fraudInd")
    public void setFraudInd(Object fraudInd) {
        this.fraudInd = fraudInd;
    }

    public Location withFraudInd(Object fraudInd) {
        this.fraudInd = fraudInd;
        return this;
    }

    /**
     *
     * @return
     *     The cCode
     */
    @JsonProperty("cCode")
    public Object getCCode() {
        return cCode;
    }

    /**
     *
     * @param cCode
     *     The cCode
     */
    @JsonProperty("cCode")
    public void setCCode(Object cCode) {
        this.cCode = cCode;
    }

    public Location withCCode(Object cCode) {
        this.cCode = cCode;
        return this;
    }

    /**
     *
     * @return
     *     The locationStatus
     */
    @JsonProperty("locationStatus")
    public String getLocationStatus() {
        return locationStatus;
    }

    /**
     *
     * @param locationStatus
     *     The locationStatus
     */
    @JsonProperty("locationStatus")
    public void setLocationStatus(String locationStatus) {
        this.locationStatus = locationStatus;
    }

    public Location withLocationStatus(String locationStatus) {
        this.locationStatus = locationStatus;
        return this;
    }

    /**
     *
     * @return
     *     The altAddress
     */
    @JsonProperty("altAddress")
    public AltAddress getAltAddress() {
        return altAddress;
    }

    /**
     *
     * @param altAddress
     *     The altAddress
     */
    @JsonProperty("altAddress")
    public void setAltAddress(AltAddress altAddress) {
        this.altAddress = altAddress;
    }

    public Location withAltAddress(AltAddress altAddress) {
        this.altAddress = altAddress;
        return this;
    }

    /**
     *
     * @return
     *     The location
     */
    @JsonProperty("location")
    public Location_ getLocation() {
        return location;
    }

    /**
     *
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(Location_ location) {
        this.location = location;
    }

    public Location withLocation(Location_ location) {
        this.location = location;
        return this;
    }

    /**
     *
     * @return
     *     The marketInfo
     */
    @JsonProperty("marketInfo")
    public MarketInfo getMarketInfo() {
        return marketInfo;
    }

    /**
     *
     * @param marketInfo
     *     The marketInfo
     */
    @JsonProperty("marketInfo")
    public void setMarketInfo(MarketInfo marketInfo) {
        this.marketInfo = marketInfo;
    }

    public Location withMarketInfo(MarketInfo marketInfo) {
        this.marketInfo = marketInfo;
        return this;
    }

    /**
     *
     * @return
     *     The mktHierarchy
     */
    @JsonProperty("mktHierarchy")
    public List<MktHierarchy> getMktHierarchy() {
        return mktHierarchy;
    }

    /**
     *
     * @param mktHierarchy
     *     The mktHierarchy
     */
    @JsonProperty("mktHierarchy")
    public void setMktHierarchy(List<MktHierarchy> mktHierarchy) {
        this.mktHierarchy = mktHierarchy;
    }

    public Location withMktHierarchy(List<MktHierarchy> mktHierarchy) {
        this.mktHierarchy = mktHierarchy;
        return this;
    }

    /**
     *
     * @return
     *     The telephony
     */
    @JsonProperty("telephony")
    public Telephony getTelephony() {
        return telephony;
    }

    /**
     *
     * @param telephony
     *     The telephony
     */
    @JsonProperty("telephony")
    public void setTelephony(Telephony telephony) {
        this.telephony = telephony;
    }

    public Location withTelephony(Telephony telephony) {
        this.telephony = telephony;
        return this;
    }

    /**
     *
     * @return
     *     The network
     */
    @JsonProperty("network")
    public Network getNetwork() {
        return network;
    }

    /**
     *
     * @param network
     *     The network
     */
    @JsonProperty("network")
    public void setNetwork(Network network) {
        this.network = network;
    }

    public Location withNetwork(Network network) {
        this.network = network;
        return this;
    }

    /**
     *
     * @return
     *     The timeZone
     */
    @JsonProperty("timeZone")
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     *
     * @param timeZone
     *     The timeZone
     */
    @JsonProperty("timeZone")
    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public Location withTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     *
     * @return
     *     The billerInfo
     */
    @JsonProperty("billerInfo")
    public BillerInfo getBillerInfo() {
        return billerInfo;
    }

    /**
     *
     * @param billerInfo
     *     The billerInfo
     */
    @JsonProperty("billerInfo")
    public void setBillerInfo(BillerInfo billerInfo) {
        this.billerInfo = billerInfo;
    }

    public Location withBillerInfo(BillerInfo billerInfo) {
        this.billerInfo = billerInfo;
        return this;
    }

    /**
     *
     * @return
     *     The capabilities
     */
    @JsonProperty("capabilities")
    public List<String> getCapabilities() {
        return capabilities;
    }

    /**
     *
     * @param capabilities
     *     The capabilities
     */
    @JsonProperty("capabilities")
    public void setCapabilities(List<String> capabilities) {
        this.capabilities = capabilities;
    }

    public Location withCapabilities(List<String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     *
     * @return
     *     The capabilityExceptions
     */
    @JsonProperty("capabilityExceptions")
    public Object getCapabilityExceptions() {
        return capabilityExceptions;
    }

    /**
     *
     * @param capabilityExceptions
     *     The capabilityExceptions
     */
    @JsonProperty("capabilityExceptions")
    public void setCapabilityExceptions(Object capabilityExceptions) {
        this.capabilityExceptions = capabilityExceptions;
    }

    public Location withCapabilityExceptions(Object capabilityExceptions) {
        this.capabilityExceptions = capabilityExceptions;
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

    public Location withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(addressId).append(houseNumPrefix).append(houseNumber).append(houseNumSuffix).append(streetPredir).append(streetName).append(streetSuffix).append(streetPostdir).append(unitType1).append(unitValue1).append(unitType2).append(unitValue2).append(unitType3).append(unitValue3).append(city).append(state).append(zip5).append(zip4).append(country).append(postalDwellCode).append(fraudInd).append(cCode).append(locationStatus).append(altAddress).append(location).append(marketInfo).append(mktHierarchy).append(telephony).append(network).append(timeZone).append(billerInfo).append(capabilities).append(capabilityExceptions).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return new EqualsBuilder().append(addressId, rhs.addressId).append(houseNumPrefix, rhs.houseNumPrefix).append(houseNumber, rhs.houseNumber).append(houseNumSuffix, rhs.houseNumSuffix).append(streetPredir, rhs.streetPredir).append(streetName, rhs.streetName).append(streetSuffix, rhs.streetSuffix).append(streetPostdir, rhs.streetPostdir).append(unitType1, rhs.unitType1).append(unitValue1, rhs.unitValue1).append(unitType2, rhs.unitType2).append(unitValue2, rhs.unitValue2).append(unitType3, rhs.unitType3).append(unitValue3, rhs.unitValue3).append(city, rhs.city).append(state, rhs.state).append(zip5, rhs.zip5).append(zip4, rhs.zip4).append(country, rhs.country).append(postalDwellCode, rhs.postalDwellCode).append(fraudInd, rhs.fraudInd).append(cCode, rhs.cCode).append(locationStatus, rhs.locationStatus).append(altAddress, rhs.altAddress).append(location, rhs.location).append(marketInfo, rhs.marketInfo).append(mktHierarchy, rhs.mktHierarchy).append(telephony, rhs.telephony).append(network, rhs.network).append(timeZone, rhs.timeZone).append(billerInfo, rhs.billerInfo).append(capabilities, rhs.capabilities).append(capabilityExceptions, rhs.capabilityExceptions).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
