
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
        "houseKey",
        "locationType",
        "system",
        "principle",
        "agent",
        "customerType",
        "dwellCodeDesc",
        "hub",
        "rightOfEntryPermission",
        "technicianArea",
        "locationStatus",
        "mapCode",
        "suppressCSGAddrStandardization",
        "lineTags",
        "cell",
        "lastCallDate",
        "houseMisc",
        "houseComments",
        "dropLength",
        "amplifier",
        "unincorporatedFlag",
        "demographicCode",
        "locationCountyID",
        "dropType",
        "bridgerAddress",
        "dropSite",
        "powerSupply",
        "timezone",
        "lastCallStatus",
        "hookupType",
        "ground",
        "pedestal",
        "serviceArea",
        "salesArea",
        "poleOwner",
        "poleNumber",
        "lobs"
})
public class CsgLegacyDetail {

    @JsonProperty("houseKey")
    private String houseKey;
    @JsonProperty("locationType")
    private String locationType;
    @JsonProperty("system")
    private String system;
    @JsonProperty("principle")
    private String principle;
    @JsonProperty("agent")
    private String agent;
    @JsonProperty("customerType")
    private String customerType;
    @JsonProperty("dwellCodeDesc")
    private String dwellCodeDesc;
    @JsonProperty("hub")
    private Object hub;
    @JsonProperty("rightOfEntryPermission")
    private String rightOfEntryPermission;
    @JsonProperty("technicianArea")
    private String technicianArea;
    @JsonProperty("locationStatus")
    private String locationStatus;
    @JsonProperty("mapCode")
    private String mapCode;
    @JsonProperty("suppressCSGAddrStandardization")
    private String suppressCSGAddrStandardization;
    @JsonProperty("lineTags")
    private List<LineTag> lineTags = new ArrayList<LineTag>();
    @JsonProperty("cell")
    private Object cell;
    @JsonProperty("lastCallDate")
    private Object lastCallDate;
    @JsonProperty("houseMisc")
    private Object houseMisc;
    @JsonProperty("houseComments")
    private List<HouseComment> houseComments = new ArrayList<HouseComment>();
    @JsonProperty("dropLength")
    private Object dropLength;
    @JsonProperty("amplifier")
    private Object amplifier;
    @JsonProperty("unincorporatedFlag")
    private Object unincorporatedFlag;
    @JsonProperty("demographicCode")
    private String demographicCode;
    @JsonProperty("locationCountyID")
    private Object locationCountyID;
    @JsonProperty("dropType")
    private Object dropType;
    @JsonProperty("bridgerAddress")
    private BridgerAddress bridgerAddress;
    @JsonProperty("dropSite")
    private String dropSite;
    @JsonProperty("powerSupply")
    private Object powerSupply;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("lastCallStatus")
    private Object lastCallStatus;
    @JsonProperty("hookupType")
    private String hookupType;
    @JsonProperty("ground")
    private Object ground;
    @JsonProperty("pedestal")
    private Object pedestal;
    @JsonProperty("serviceArea")
    private Object serviceArea;
    @JsonProperty("salesArea")
    private String salesArea;
    @JsonProperty("poleOwner")
    private Object poleOwner;
    @JsonProperty("poleNumber")
    private Object poleNumber;
    @JsonProperty("lobs")
    private List<Lob> lobs = new ArrayList<Lob>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The houseKey
     */
    @JsonProperty("houseKey")
    public String getHouseKey() {
        return houseKey;
    }

    /**
     *
     * @param houseKey
     *     The houseKey
     */
    @JsonProperty("houseKey")
    public void setHouseKey(String houseKey) {
        this.houseKey = houseKey;
    }

    public CsgLegacyDetail withHouseKey(String houseKey) {
        this.houseKey = houseKey;
        return this;
    }

    /**
     *
     * @return
     *     The locationType
     */
    @JsonProperty("locationType")
    public String getLocationType() {
        return locationType;
    }

    /**
     *
     * @param locationType
     *     The locationType
     */
    @JsonProperty("locationType")
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public CsgLegacyDetail withLocationType(String locationType) {
        this.locationType = locationType;
        return this;
    }

    /**
     *
     * @return
     *     The system
     */
    @JsonProperty("system")
    public String getSystem() {
        return system;
    }

    /**
     *
     * @param system
     *     The system
     */
    @JsonProperty("system")
    public void setSystem(String system) {
        this.system = system;
    }

    public CsgLegacyDetail withSystem(String system) {
        this.system = system;
        return this;
    }

    /**
     *
     * @return
     *     The principle
     */
    @JsonProperty("principle")
    public String getPrinciple() {
        return principle;
    }

    /**
     *
     * @param principle
     *     The principle
     */
    @JsonProperty("principle")
    public void setPrinciple(String principle) {
        this.principle = principle;
    }

    public CsgLegacyDetail withPrinciple(String principle) {
        this.principle = principle;
        return this;
    }

    /**
     *
     * @return
     *     The agent
     */
    @JsonProperty("agent")
    public String getAgent() {
        return agent;
    }

    /**
     *
     * @param agent
     *     The agent
     */
    @JsonProperty("agent")
    public void setAgent(String agent) {
        this.agent = agent;
    }

    public CsgLegacyDetail withAgent(String agent) {
        this.agent = agent;
        return this;
    }

    /**
     *
     * @return
     *     The customerType
     */
    @JsonProperty("customerType")
    public String getCustomerType() {
        return customerType;
    }

    /**
     *
     * @param customerType
     *     The customerType
     */
    @JsonProperty("customerType")
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public CsgLegacyDetail withCustomerType(String customerType) {
        this.customerType = customerType;
        return this;
    }

    /**
     *
     * @return
     *     The dwellCodeDesc
     */
    @JsonProperty("dwellCodeDesc")
    public String getDwellCodeDesc() {
        return dwellCodeDesc;
    }

    /**
     *
     * @param dwellCodeDesc
     *     The dwellCodeDesc
     */
    @JsonProperty("dwellCodeDesc")
    public void setDwellCodeDesc(String dwellCodeDesc) {
        this.dwellCodeDesc = dwellCodeDesc;
    }

    public CsgLegacyDetail withDwellCodeDesc(String dwellCodeDesc) {
        this.dwellCodeDesc = dwellCodeDesc;
        return this;
    }

    /**
     *
     * @return
     *     The hub
     */
    @JsonProperty("hub")
    public Object getHub() {
        return hub;
    }

    /**
     *
     * @param hub
     *     The hub
     */
    @JsonProperty("hub")
    public void setHub(Object hub) {
        this.hub = hub;
    }

    public CsgLegacyDetail withHub(Object hub) {
        this.hub = hub;
        return this;
    }

    /**
     *
     * @return
     *     The rightOfEntryPermission
     */
    @JsonProperty("rightOfEntryPermission")
    public String getRightOfEntryPermission() {
        return rightOfEntryPermission;
    }

    /**
     *
     * @param rightOfEntryPermission
     *     The rightOfEntryPermission
     */
    @JsonProperty("rightOfEntryPermission")
    public void setRightOfEntryPermission(String rightOfEntryPermission) {
        this.rightOfEntryPermission = rightOfEntryPermission;
    }

    public CsgLegacyDetail withRightOfEntryPermission(String rightOfEntryPermission) {
        this.rightOfEntryPermission = rightOfEntryPermission;
        return this;
    }

    /**
     *
     * @return
     *     The technicianArea
     */
    @JsonProperty("technicianArea")
    public String getTechnicianArea() {
        return technicianArea;
    }

    /**
     *
     * @param technicianArea
     *     The technicianArea
     */
    @JsonProperty("technicianArea")
    public void setTechnicianArea(String technicianArea) {
        this.technicianArea = technicianArea;
    }

    public CsgLegacyDetail withTechnicianArea(String technicianArea) {
        this.technicianArea = technicianArea;
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

    public CsgLegacyDetail withLocationStatus(String locationStatus) {
        this.locationStatus = locationStatus;
        return this;
    }

    /**
     *
     * @return
     *     The mapCode
     */
    @JsonProperty("mapCode")
    public String getMapCode() {
        return mapCode;
    }

    /**
     *
     * @param mapCode
     *     The mapCode
     */
    @JsonProperty("mapCode")
    public void setMapCode(String mapCode) {
        this.mapCode = mapCode;
    }

    public CsgLegacyDetail withMapCode(String mapCode) {
        this.mapCode = mapCode;
        return this;
    }

    /**
     *
     * @return
     *     The suppressCSGAddrStandardization
     */
    @JsonProperty("suppressCSGAddrStandardization")
    public String getSuppressCSGAddrStandardization() {
        return suppressCSGAddrStandardization;
    }

    /**
     *
     * @param suppressCSGAddrStandardization
     *     The suppressCSGAddrStandardization
     */
    @JsonProperty("suppressCSGAddrStandardization")
    public void setSuppressCSGAddrStandardization(String suppressCSGAddrStandardization) {
        this.suppressCSGAddrStandardization = suppressCSGAddrStandardization;
    }

    public CsgLegacyDetail withSuppressCSGAddrStandardization(String suppressCSGAddrStandardization) {
        this.suppressCSGAddrStandardization = suppressCSGAddrStandardization;
        return this;
    }

    /**
     *
     * @return
     *     The lineTags
     */
    @JsonProperty("lineTags")
    public List<LineTag> getLineTags() {
        return lineTags;
    }

    /**
     *
     * @param lineTags
     *     The lineTags
     */
    @JsonProperty("lineTags")
    public void setLineTags(List<LineTag> lineTags) {
        this.lineTags = lineTags;
    }

    public CsgLegacyDetail withLineTags(List<LineTag> lineTags) {
        this.lineTags = lineTags;
        return this;
    }

    /**
     *
     * @return
     *     The cell
     */
    @JsonProperty("cell")
    public Object getCell() {
        return cell;
    }

    /**
     *
     * @param cell
     *     The cell
     */
    @JsonProperty("cell")
    public void setCell(Object cell) {
        this.cell = cell;
    }

    public CsgLegacyDetail withCell(Object cell) {
        this.cell = cell;
        return this;
    }

    /**
     *
     * @return
     *     The lastCallDate
     */
    @JsonProperty("lastCallDate")
    public Object getLastCallDate() {
        return lastCallDate;
    }

    /**
     *
     * @param lastCallDate
     *     The lastCallDate
     */
    @JsonProperty("lastCallDate")
    public void setLastCallDate(Object lastCallDate) {
        this.lastCallDate = lastCallDate;
    }

    public CsgLegacyDetail withLastCallDate(Object lastCallDate) {
        this.lastCallDate = lastCallDate;
        return this;
    }

    /**
     *
     * @return
     *     The houseMisc
     */
    @JsonProperty("houseMisc")
    public Object getHouseMisc() {
        return houseMisc;
    }

    /**
     *
     * @param houseMisc
     *     The houseMisc
     */
    @JsonProperty("houseMisc")
    public void setHouseMisc(Object houseMisc) {
        this.houseMisc = houseMisc;
    }

    public CsgLegacyDetail withHouseMisc(Object houseMisc) {
        this.houseMisc = houseMisc;
        return this;
    }

    /**
     *
     * @return
     *     The houseComments
     */
    @JsonProperty("houseComments")
    public List<HouseComment> getHouseComments() {
        return houseComments;
    }

    /**
     *
     * @param houseComments
     *     The houseComments
     */
    @JsonProperty("houseComments")
    public void setHouseComments(List<HouseComment> houseComments) {
        this.houseComments = houseComments;
    }

    public CsgLegacyDetail withHouseComments(List<HouseComment> houseComments) {
        this.houseComments = houseComments;
        return this;
    }

    /**
     *
     * @return
     *     The dropLength
     */
    @JsonProperty("dropLength")
    public Object getDropLength() {
        return dropLength;
    }

    /**
     *
     * @param dropLength
     *     The dropLength
     */
    @JsonProperty("dropLength")
    public void setDropLength(Object dropLength) {
        this.dropLength = dropLength;
    }

    public CsgLegacyDetail withDropLength(Object dropLength) {
        this.dropLength = dropLength;
        return this;
    }

    /**
     *
     * @return
     *     The amplifier
     */
    @JsonProperty("amplifier")
    public Object getAmplifier() {
        return amplifier;
    }

    /**
     *
     * @param amplifier
     *     The amplifier
     */
    @JsonProperty("amplifier")
    public void setAmplifier(Object amplifier) {
        this.amplifier = amplifier;
    }

    public CsgLegacyDetail withAmplifier(Object amplifier) {
        this.amplifier = amplifier;
        return this;
    }

    /**
     *
     * @return
     *     The unincorporatedFlag
     */
    @JsonProperty("unincorporatedFlag")
    public Object getUnincorporatedFlag() {
        return unincorporatedFlag;
    }

    /**
     *
     * @param unincorporatedFlag
     *     The unincorporatedFlag
     */
    @JsonProperty("unincorporatedFlag")
    public void setUnincorporatedFlag(Object unincorporatedFlag) {
        this.unincorporatedFlag = unincorporatedFlag;
    }

    public CsgLegacyDetail withUnincorporatedFlag(Object unincorporatedFlag) {
        this.unincorporatedFlag = unincorporatedFlag;
        return this;
    }

    /**
     *
     * @return
     *     The demographicCode
     */
    @JsonProperty("demographicCode")
    public String getDemographicCode() {
        return demographicCode;
    }

    /**
     *
     * @param demographicCode
     *     The demographicCode
     */
    @JsonProperty("demographicCode")
    public void setDemographicCode(String demographicCode) {
        this.demographicCode = demographicCode;
    }

    public CsgLegacyDetail withDemographicCode(String demographicCode) {
        this.demographicCode = demographicCode;
        return this;
    }

    /**
     *
     * @return
     *     The locationCountyID
     */
    @JsonProperty("locationCountyID")
    public Object getLocationCountyID() {
        return locationCountyID;
    }

    /**
     *
     * @param locationCountyID
     *     The locationCountyID
     */
    @JsonProperty("locationCountyID")
    public void setLocationCountyID(Object locationCountyID) {
        this.locationCountyID = locationCountyID;
    }

    public CsgLegacyDetail withLocationCountyID(Object locationCountyID) {
        this.locationCountyID = locationCountyID;
        return this;
    }

    /**
     *
     * @return
     *     The dropType
     */
    @JsonProperty("dropType")
    public Object getDropType() {
        return dropType;
    }

    /**
     *
     * @param dropType
     *     The dropType
     */
    @JsonProperty("dropType")
    public void setDropType(Object dropType) {
        this.dropType = dropType;
    }

    public CsgLegacyDetail withDropType(Object dropType) {
        this.dropType = dropType;
        return this;
    }

    /**
     *
     * @return
     *     The bridgerAddress
     */
    @JsonProperty("bridgerAddress")
    public BridgerAddress getBridgerAddress() {
        return bridgerAddress;
    }

    /**
     *
     * @param bridgerAddress
     *     The bridgerAddress
     */
    @JsonProperty("bridgerAddress")
    public void setBridgerAddress(BridgerAddress bridgerAddress) {
        this.bridgerAddress = bridgerAddress;
    }

    public CsgLegacyDetail withBridgerAddress(BridgerAddress bridgerAddress) {
        this.bridgerAddress = bridgerAddress;
        return this;
    }

    /**
     *
     * @return
     *     The dropSite
     */
    @JsonProperty("dropSite")
    public String getDropSite() {
        return dropSite;
    }

    /**
     *
     * @param dropSite
     *     The dropSite
     */
    @JsonProperty("dropSite")
    public void setDropSite(String dropSite) {
        this.dropSite = dropSite;
    }

    public CsgLegacyDetail withDropSite(String dropSite) {
        this.dropSite = dropSite;
        return this;
    }

    /**
     *
     * @return
     *     The powerSupply
     */
    @JsonProperty("powerSupply")
    public Object getPowerSupply() {
        return powerSupply;
    }

    /**
     *
     * @param powerSupply
     *     The powerSupply
     */
    @JsonProperty("powerSupply")
    public void setPowerSupply(Object powerSupply) {
        this.powerSupply = powerSupply;
    }

    public CsgLegacyDetail withPowerSupply(Object powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    /**
     *
     * @return
     *     The timezone
     */
    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     *
     * @param timezone
     *     The timezone
     */
    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public CsgLegacyDetail withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     *
     * @return
     *     The lastCallStatus
     */
    @JsonProperty("lastCallStatus")
    public Object getLastCallStatus() {
        return lastCallStatus;
    }

    /**
     *
     * @param lastCallStatus
     *     The lastCallStatus
     */
    @JsonProperty("lastCallStatus")
    public void setLastCallStatus(Object lastCallStatus) {
        this.lastCallStatus = lastCallStatus;
    }

    public CsgLegacyDetail withLastCallStatus(Object lastCallStatus) {
        this.lastCallStatus = lastCallStatus;
        return this;
    }

    /**
     *
     * @return
     *     The hookupType
     */
    @JsonProperty("hookupType")
    public String getHookupType() {
        return hookupType;
    }

    /**
     *
     * @param hookupType
     *     The hookupType
     */
    @JsonProperty("hookupType")
    public void setHookupType(String hookupType) {
        this.hookupType = hookupType;
    }

    public CsgLegacyDetail withHookupType(String hookupType) {
        this.hookupType = hookupType;
        return this;
    }

    /**
     *
     * @return
     *     The ground
     */
    @JsonProperty("ground")
    public Object getGround() {
        return ground;
    }

    /**
     *
     * @param ground
     *     The ground
     */
    @JsonProperty("ground")
    public void setGround(Object ground) {
        this.ground = ground;
    }

    public CsgLegacyDetail withGround(Object ground) {
        this.ground = ground;
        return this;
    }

    /**
     *
     * @return
     *     The pedestal
     */
    @JsonProperty("pedestal")
    public Object getPedestal() {
        return pedestal;
    }

    /**
     *
     * @param pedestal
     *     The pedestal
     */
    @JsonProperty("pedestal")
    public void setPedestal(Object pedestal) {
        this.pedestal = pedestal;
    }

    public CsgLegacyDetail withPedestal(Object pedestal) {
        this.pedestal = pedestal;
        return this;
    }

    /**
     *
     * @return
     *     The serviceArea
     */
    @JsonProperty("serviceArea")
    public Object getServiceArea() {
        return serviceArea;
    }

    /**
     *
     * @param serviceArea
     *     The serviceArea
     */
    @JsonProperty("serviceArea")
    public void setServiceArea(Object serviceArea) {
        this.serviceArea = serviceArea;
    }

    public CsgLegacyDetail withServiceArea(Object serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    /**
     *
     * @return
     *     The salesArea
     */
    @JsonProperty("salesArea")
    public String getSalesArea() {
        return salesArea;
    }

    /**
     *
     * @param salesArea
     *     The salesArea
     */
    @JsonProperty("salesArea")
    public void setSalesArea(String salesArea) {
        this.salesArea = salesArea;
    }

    public CsgLegacyDetail withSalesArea(String salesArea) {
        this.salesArea = salesArea;
        return this;
    }

    /**
     *
     * @return
     *     The poleOwner
     */
    @JsonProperty("poleOwner")
    public Object getPoleOwner() {
        return poleOwner;
    }

    /**
     *
     * @param poleOwner
     *     The poleOwner
     */
    @JsonProperty("poleOwner")
    public void setPoleOwner(Object poleOwner) {
        this.poleOwner = poleOwner;
    }

    public CsgLegacyDetail withPoleOwner(Object poleOwner) {
        this.poleOwner = poleOwner;
        return this;
    }

    /**
     *
     * @return
     *     The poleNumber
     */
    @JsonProperty("poleNumber")
    public Object getPoleNumber() {
        return poleNumber;
    }

    /**
     *
     * @param poleNumber
     *     The poleNumber
     */
    @JsonProperty("poleNumber")
    public void setPoleNumber(Object poleNumber) {
        this.poleNumber = poleNumber;
    }

    public CsgLegacyDetail withPoleNumber(Object poleNumber) {
        this.poleNumber = poleNumber;
        return this;
    }

    /**
     *
     * @return
     *     The lobs
     */
    @JsonProperty("lobs")
    public List<Lob> getLobs() {
        return lobs;
    }

    /**
     *
     * @param lobs
     *     The lobs
     */
    @JsonProperty("lobs")
    public void setLobs(List<Lob> lobs) {
        this.lobs = lobs;
    }

    public CsgLegacyDetail withLobs(List<Lob> lobs) {
        this.lobs = lobs;
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

    public CsgLegacyDetail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(houseKey).append(locationType).append(system).append(principle).append(agent).append(customerType).append(dwellCodeDesc).append(hub).append(rightOfEntryPermission).append(technicianArea).append(locationStatus).append(mapCode).append(suppressCSGAddrStandardization).append(lineTags).append(cell).append(lastCallDate).append(houseMisc).append(houseComments).append(dropLength).append(amplifier).append(unincorporatedFlag).append(demographicCode).append(locationCountyID).append(dropType).append(bridgerAddress).append(dropSite).append(powerSupply).append(timezone).append(lastCallStatus).append(hookupType).append(ground).append(pedestal).append(serviceArea).append(salesArea).append(poleOwner).append(poleNumber).append(lobs).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CsgLegacyDetail) == false) {
            return false;
        }
        CsgLegacyDetail rhs = ((CsgLegacyDetail) other);
        return new EqualsBuilder().append(houseKey, rhs.houseKey).append(locationType, rhs.locationType).append(system, rhs.system).append(principle, rhs.principle).append(agent, rhs.agent).append(customerType, rhs.customerType).append(dwellCodeDesc, rhs.dwellCodeDesc).append(hub, rhs.hub).append(rightOfEntryPermission, rhs.rightOfEntryPermission).append(technicianArea, rhs.technicianArea).append(locationStatus, rhs.locationStatus).append(mapCode, rhs.mapCode).append(suppressCSGAddrStandardization, rhs.suppressCSGAddrStandardization).append(lineTags, rhs.lineTags).append(cell, rhs.cell).append(lastCallDate, rhs.lastCallDate).append(houseMisc, rhs.houseMisc).append(houseComments, rhs.houseComments).append(dropLength, rhs.dropLength).append(amplifier, rhs.amplifier).append(unincorporatedFlag, rhs.unincorporatedFlag).append(demographicCode, rhs.demographicCode).append(locationCountyID, rhs.locationCountyID).append(dropType, rhs.dropType).append(bridgerAddress, rhs.bridgerAddress).append(dropSite, rhs.dropSite).append(powerSupply, rhs.powerSupply).append(timezone, rhs.timezone).append(lastCallStatus, rhs.lastCallStatus).append(hookupType, rhs.hookupType).append(ground, rhs.ground).append(pedestal, rhs.pedestal).append(serviceArea, rhs.serviceArea).append(salesArea, rhs.salesArea).append(poleOwner, rhs.poleOwner).append(poleNumber, rhs.poleNumber).append(lobs, rhs.lobs).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
