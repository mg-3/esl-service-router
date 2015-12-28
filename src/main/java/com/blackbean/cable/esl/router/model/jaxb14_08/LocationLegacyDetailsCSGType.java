
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LocationLegacyDetailsCSGType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationLegacyDetailsCSGType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="houseKey" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="14"/>
 *               &lt;pattern value="[0-9]{14}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="locationType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dwellingCodeDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="houseMisc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="locationCountyID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="salesArea" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="serviceArea" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="technicianArea" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mapCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="demographicCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="timeZone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *               &lt;pattern value="\d|0\d|1[0|1|2]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="unincorporatedFlag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dropType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dropSite" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="hookupType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="rightOfEntryPermission" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="poleOwner" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="poleNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="amplifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="powerSupply" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pedestal" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ground" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="hub" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cell" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dropLength" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lineOfBusiness" type="{http://xml.comcast.com/location/types}ArrayOfLocationLegacyDetailsCSGLineOfBusinessType" minOccurs="0"/>
 *         &lt;element name="bridgerAddress" type="{http://xml.comcast.com/location/types}LocationLegacyDetailsCSGBridgerType" minOccurs="0"/>
 *         &lt;element name="houseComments" type="{http://xml.comcast.com/location/types}LocationLegacyDetailsCSGHouseCommentsType" minOccurs="0"/>
 *         &lt;element name="lineTag" type="{http://xml.comcast.com/location/types}LocationLegacyDetailsCSGLineTagsType" minOccurs="0"/>
 *         &lt;element name="customFields" type="{http://xml.comcast.com/location/types}LocationLegacyDetailsCSGCustomFieldsType" minOccurs="0"/>
 *         &lt;element name="addressLine2Override" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="26"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="houseUsageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastCallDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastCallStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suppressCSGAddrStandardization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationLegacyDetailsCSGType", propOrder = {
        "houseKey",
        "locationType",
        "dwellingCodeDescr",
        "customerType",
        "locationStatus",
        "houseMisc",
        "locationCountyID",
        "salesArea",
        "serviceArea",
        "technicianArea",
        "mapCode",
        "demographicCode",
        "timeZone",
        "unincorporatedFlag",
        "dropType",
        "dropSite",
        "hookupType",
        "rightOfEntryPermission",
        "poleOwner",
        "poleNumber",
        "amplifier",
        "powerSupply",
        "pedestal",
        "ground",
        "hub",
        "cell",
        "dropLength",
        "lineOfBusiness",
        "bridgerAddress",
        "houseComments",
        "lineTag",
        "customFields",
        "addressLine2Override",
        "houseUsageCode",
        "lastCallDate",
        "lastCallStatus",
        "suppressCSGAddrStandardization"
})
public class LocationLegacyDetailsCSGType {

    protected String houseKey;
    @XmlElementRef(name = "locationType", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationType;
    @XmlElementRef(name = "dwellingCodeDescr", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dwellingCodeDescr;
    @XmlElementRef(name = "customerType", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerType;
    @XmlElementRef(name = "locationStatus", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationStatus;
    @XmlElementRef(name = "houseMisc", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseMisc;
    @XmlElementRef(name = "locationCountyID", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationCountyID;
    @XmlElementRef(name = "salesArea", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesArea;
    @XmlElementRef(name = "serviceArea", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceArea;
    @XmlElementRef(name = "technicianArea", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> technicianArea;
    @XmlElementRef(name = "mapCode", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapCode;
    @XmlElementRef(name = "demographicCode", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> demographicCode;
    @XmlElementRef(name = "timeZone", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeZone;
    @XmlElementRef(name = "unincorporatedFlag", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unincorporatedFlag;
    @XmlElementRef(name = "dropType", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dropType;
    @XmlElementRef(name = "dropSite", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dropSite;
    @XmlElementRef(name = "hookupType", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hookupType;
    @XmlElementRef(name = "rightOfEntryPermission", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rightOfEntryPermission;
    @XmlElementRef(name = "poleOwner", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poleOwner;
    @XmlElementRef(name = "poleNumber", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poleNumber;
    @XmlElementRef(name = "amplifier", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> amplifier;
    @XmlElementRef(name = "powerSupply", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> powerSupply;
    @XmlElementRef(name = "pedestal", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pedestal;
    @XmlElementRef(name = "ground", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ground;
    @XmlElementRef(name = "hub", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hub;
    @XmlElementRef(name = "cell", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cell;
    @XmlElementRef(name = "dropLength", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dropLength;
    protected ArrayOfLocationLegacyDetailsCSGLineOfBusinessType lineOfBusiness;
    @XmlElementRef(name = "bridgerAddress", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<LocationLegacyDetailsCSGBridgerType> bridgerAddress;
    @XmlElementRef(name = "houseComments", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<LocationLegacyDetailsCSGHouseCommentsType> houseComments;
    @XmlElementRef(name = "lineTag", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<LocationLegacyDetailsCSGLineTagsType> lineTag;
    protected LocationLegacyDetailsCSGCustomFieldsType customFields;
    @XmlElementRef(name = "addressLine2Override", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine2Override;
    @XmlElementRef(name = "houseUsageCode", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseUsageCode;
    @XmlElementRef(name = "lastCallDate", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastCallDate;
    @XmlElementRef(name = "lastCallStatus", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastCallStatus;
    protected Boolean suppressCSGAddrStandardization;

    /**
     * Gets the value of the houseKey property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHouseKey() {
        return houseKey;
    }

    /**
     * Sets the value of the houseKey property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHouseKey(String value) {
        this.houseKey = value;
    }

    /**
     * Gets the value of the locationType property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setLocationType(JAXBElement<String> value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the dwellingCodeDescr property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDwellingCodeDescr() {
        return dwellingCodeDescr;
    }

    /**
     * Sets the value of the dwellingCodeDescr property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDwellingCodeDescr(JAXBElement<String> value) {
        this.dwellingCodeDescr = value;
    }

    /**
     * Gets the value of the customerType property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setCustomerType(JAXBElement<String> value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the locationStatus property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getLocationStatus() {
        return locationStatus;
    }

    /**
     * Sets the value of the locationStatus property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setLocationStatus(JAXBElement<String> value) {
        this.locationStatus = value;
    }

    /**
     * Gets the value of the houseMisc property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHouseMisc() {
        return houseMisc;
    }

    /**
     * Sets the value of the houseMisc property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHouseMisc(JAXBElement<String> value) {
        this.houseMisc = value;
    }

    /**
     * Gets the value of the locationCountyID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getLocationCountyID() {
        return locationCountyID;
    }

    /**
     * Sets the value of the locationCountyID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setLocationCountyID(JAXBElement<String> value) {
        this.locationCountyID = value;
    }

    /**
     * Gets the value of the salesArea property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getSalesArea() {
        return salesArea;
    }

    /**
     * Sets the value of the salesArea property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setSalesArea(JAXBElement<String> value) {
        this.salesArea = value;
    }

    /**
     * Gets the value of the serviceArea property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getServiceArea() {
        return serviceArea;
    }

    /**
     * Sets the value of the serviceArea property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setServiceArea(JAXBElement<String> value) {
        this.serviceArea = value;
    }

    /**
     * Gets the value of the technicianArea property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getTechnicianArea() {
        return technicianArea;
    }

    /**
     * Sets the value of the technicianArea property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setTechnicianArea(JAXBElement<String> value) {
        this.technicianArea = value;
    }

    /**
     * Gets the value of the mapCode property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getMapCode() {
        return mapCode;
    }

    /**
     * Sets the value of the mapCode property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setMapCode(JAXBElement<String> value) {
        this.mapCode = value;
    }

    /**
     * Gets the value of the demographicCode property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDemographicCode() {
        return demographicCode;
    }

    /**
     * Sets the value of the demographicCode property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDemographicCode(JAXBElement<String> value) {
        this.demographicCode = value;
    }

    /**
     * Gets the value of the timeZone property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setTimeZone(JAXBElement<String> value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the unincorporatedFlag property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getUnincorporatedFlag() {
        return unincorporatedFlag;
    }

    /**
     * Sets the value of the unincorporatedFlag property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setUnincorporatedFlag(JAXBElement<String> value) {
        this.unincorporatedFlag = value;
    }

    /**
     * Gets the value of the dropType property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDropType() {
        return dropType;
    }

    /**
     * Sets the value of the dropType property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDropType(JAXBElement<String> value) {
        this.dropType = value;
    }

    /**
     * Gets the value of the dropSite property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDropSite() {
        return dropSite;
    }

    /**
     * Sets the value of the dropSite property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDropSite(JAXBElement<String> value) {
        this.dropSite = value;
    }

    /**
     * Gets the value of the hookupType property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHookupType() {
        return hookupType;
    }

    /**
     * Sets the value of the hookupType property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHookupType(JAXBElement<String> value) {
        this.hookupType = value;
    }

    /**
     * Gets the value of the rightOfEntryPermission property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getRightOfEntryPermission() {
        return rightOfEntryPermission;
    }

    /**
     * Sets the value of the rightOfEntryPermission property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setRightOfEntryPermission(JAXBElement<String> value) {
        this.rightOfEntryPermission = value;
    }

    /**
     * Gets the value of the poleOwner property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getPoleOwner() {
        return poleOwner;
    }

    /**
     * Sets the value of the poleOwner property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setPoleOwner(JAXBElement<String> value) {
        this.poleOwner = value;
    }

    /**
     * Gets the value of the poleNumber property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getPoleNumber() {
        return poleNumber;
    }

    /**
     * Sets the value of the poleNumber property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setPoleNumber(JAXBElement<String> value) {
        this.poleNumber = value;
    }

    /**
     * Gets the value of the amplifier property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getAmplifier() {
        return amplifier;
    }

    /**
     * Sets the value of the amplifier property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setAmplifier(JAXBElement<String> value) {
        this.amplifier = value;
    }

    /**
     * Gets the value of the powerSupply property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getPowerSupply() {
        return powerSupply;
    }

    /**
     * Sets the value of the powerSupply property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setPowerSupply(JAXBElement<String> value) {
        this.powerSupply = value;
    }

    /**
     * Gets the value of the pedestal property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getPedestal() {
        return pedestal;
    }

    /**
     * Sets the value of the pedestal property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setPedestal(JAXBElement<String> value) {
        this.pedestal = value;
    }

    /**
     * Gets the value of the ground property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getGround() {
        return ground;
    }

    /**
     * Sets the value of the ground property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setGround(JAXBElement<String> value) {
        this.ground = value;
    }

    /**
     * Gets the value of the hub property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHub() {
        return hub;
    }

    /**
     * Sets the value of the hub property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHub(JAXBElement<String> value) {
        this.hub = value;
    }

    /**
     * Gets the value of the cell property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getCell() {
        return cell;
    }

    /**
     * Sets the value of the cell property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setCell(JAXBElement<String> value) {
        this.cell = value;
    }

    /**
     * Gets the value of the dropLength property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDropLength() {
        return dropLength;
    }

    /**
     * Sets the value of the dropLength property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDropLength(JAXBElement<String> value) {
        this.dropLength = value;
    }

    /**
     * Gets the value of the lineOfBusiness property.
     *
     * @return possible object is
     * {@link ArrayOfLocationLegacyDetailsCSGLineOfBusinessType }
     */
    public ArrayOfLocationLegacyDetailsCSGLineOfBusinessType getLineOfBusiness() {
        return lineOfBusiness;
    }

    /**
     * Sets the value of the lineOfBusiness property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationLegacyDetailsCSGLineOfBusinessType }
     */
    public void setLineOfBusiness(ArrayOfLocationLegacyDetailsCSGLineOfBusinessType value) {
        this.lineOfBusiness = value;
    }

    /**
     * Gets the value of the bridgerAddress property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link LocationLegacyDetailsCSGBridgerType }{@code >}
     */
    public JAXBElement<LocationLegacyDetailsCSGBridgerType> getBridgerAddress() {
        return bridgerAddress;
    }

    /**
     * Sets the value of the bridgerAddress property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link LocationLegacyDetailsCSGBridgerType }{@code >}
     */
    public void setBridgerAddress(JAXBElement<LocationLegacyDetailsCSGBridgerType> value) {
        this.bridgerAddress = value;
    }

    /**
     * Gets the value of the houseComments property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link LocationLegacyDetailsCSGHouseCommentsType }{@code >}
     */
    public JAXBElement<LocationLegacyDetailsCSGHouseCommentsType> getHouseComments() {
        return houseComments;
    }

    /**
     * Sets the value of the houseComments property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link LocationLegacyDetailsCSGHouseCommentsType }{@code >}
     */
    public void setHouseComments(JAXBElement<LocationLegacyDetailsCSGHouseCommentsType> value) {
        this.houseComments = value;
    }

    /**
     * Gets the value of the lineTag property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link LocationLegacyDetailsCSGLineTagsType }{@code >}
     */
    public JAXBElement<LocationLegacyDetailsCSGLineTagsType> getLineTag() {
        return lineTag;
    }

    /**
     * Sets the value of the lineTag property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link LocationLegacyDetailsCSGLineTagsType }{@code >}
     */
    public void setLineTag(JAXBElement<LocationLegacyDetailsCSGLineTagsType> value) {
        this.lineTag = value;
    }

    /**
     * Gets the value of the customFields property.
     *
     * @return possible object is
     * {@link LocationLegacyDetailsCSGCustomFieldsType }
     */
    public LocationLegacyDetailsCSGCustomFieldsType getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     *
     * @param value allowed object is
     *              {@link LocationLegacyDetailsCSGCustomFieldsType }
     */
    public void setCustomFields(LocationLegacyDetailsCSGCustomFieldsType value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the addressLine2Override property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getAddressLine2Override() {
        return addressLine2Override;
    }

    /**
     * Sets the value of the addressLine2Override property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setAddressLine2Override(JAXBElement<String> value) {
        this.addressLine2Override = value;
    }

    /**
     * Gets the value of the houseUsageCode property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHouseUsageCode() {
        return houseUsageCode;
    }

    /**
     * Sets the value of the houseUsageCode property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHouseUsageCode(JAXBElement<String> value) {
        this.houseUsageCode = value;
    }

    /**
     * Gets the value of the lastCallDate property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public JAXBElement<XMLGregorianCalendar> getLastCallDate() {
        return lastCallDate;
    }

    /**
     * Sets the value of the lastCallDate property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public void setLastCallDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastCallDate = value;
    }

    /**
     * Gets the value of the lastCallStatus property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getLastCallStatus() {
        return lastCallStatus;
    }

    /**
     * Sets the value of the lastCallStatus property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setLastCallStatus(JAXBElement<String> value) {
        this.lastCallStatus = value;
    }

    /**
     * Gets the value of the suppressCSGAddrStandardization property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSuppressCSGAddrStandardization() {
        return suppressCSGAddrStandardization;
    }

    /**
     * Sets the value of the suppressCSGAddrStandardization property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSuppressCSGAddrStandardization(Boolean value) {
        this.suppressCSGAddrStandardization = value;
    }

}
