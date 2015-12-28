
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LocationDetailsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StructureUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StructureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationGeography" type="{http://xml.comcast.com/location/types}LocationGeographyType" minOccurs="0"/>
 *         &lt;element name="LocationTelephony" type="{http://xml.comcast.com/location/types}LocationTelephonyType" minOccurs="0"/>
 *         &lt;element name="LocationNetworkConnectivity" type="{http://xml.comcast.com/location/types}LocationNetworkConnectivityType" minOccurs="0"/>
 *         &lt;element name="AddressGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="E911Availability" type="{http://xml.comcast.com/location/types}E911AvailabilityType" minOccurs="0"/>
 *         &lt;element name="AddressStandardizationMatchStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeocodingPrecision" type="{http://xml.comcast.com/location/types}GeocodingPrecisionType" minOccurs="0"/>
 *         &lt;element name="LegacyLocationIDs" type="{http://xml.comcast.com/location/types}ArrayOfLegacyLocationIDType" minOccurs="0"/>
 *         &lt;element name="LocationLegacyDetails" type="{http://xml.comcast.com/location/types}LocationLegacyDetailsType" minOccurs="0"/>
 *         &lt;element name="LocationCustomFields" type="{http://xml.comcast.com/location/types}ArrayOfLocationCustomFieldsType" minOccurs="0"/>
 *         &lt;element name="LocationComments" type="{http://xml.comcast.com/location/types}ArrayOfLocationCommentsType" minOccurs="0"/>
 *         &lt;element name="LocationTimezone" type="{http://xml.comcast.com/location/types}TimeZoneType" minOccurs="0"/>
 *         &lt;element name="standardDwellingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationDetailsType", propOrder = {
        "structureUse",
        "structureType",
        "locationGeography",
        "locationTelephony",
        "locationNetworkConnectivity",
        "addressGroupID",
        "e911Availability",
        "addressStandardizationMatchStatus",
        "geocodingPrecision",
        "legacyLocationIDs",
        "locationLegacyDetails",
        "locationCustomFields",
        "locationComments",
        "locationTimezone",
        "standardDwellingCode"
})
public class LocationDetailsType {

    @XmlElementRef(name = "StructureUse", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> structureUse;
    @XmlElementRef(name = "StructureType", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> structureType;
    @XmlElement(name = "LocationGeography")
    protected LocationGeographyType locationGeography;
    @XmlElement(name = "LocationTelephony")
    protected LocationTelephonyType locationTelephony;
    @XmlElement(name = "LocationNetworkConnectivity")
    protected LocationNetworkConnectivityType locationNetworkConnectivity;
    @XmlElementRef(name = "AddressGroupID", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressGroupID;
    @XmlElement(name = "E911Availability")
    protected E911AvailabilityType e911Availability;
    @XmlElement(name = "AddressStandardizationMatchStatus")
    protected String addressStandardizationMatchStatus;
    @XmlElement(name = "GeocodingPrecision")
    protected GeocodingPrecisionType geocodingPrecision;
    @XmlElement(name = "LegacyLocationIDs")
    protected ArrayOfLegacyLocationIDType legacyLocationIDs;
    @XmlElement(name = "LocationLegacyDetails")
    protected LocationLegacyDetailsType locationLegacyDetails;
    @XmlElement(name = "LocationCustomFields")
    protected ArrayOfLocationCustomFieldsType locationCustomFields;
    @XmlElement(name = "LocationComments")
    protected ArrayOfLocationCommentsType locationComments;
    @XmlElement(name = "LocationTimezone")
    protected TimeZoneType locationTimezone;
    protected String standardDwellingCode;

    /**
     * Gets the value of the structureUse property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getStructureUse() {
        return structureUse;
    }

    /**
     * Sets the value of the structureUse property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setStructureUse(JAXBElement<String> value) {
        this.structureUse = value;
    }

    /**
     * Gets the value of the structureType property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getStructureType() {
        return structureType;
    }

    /**
     * Sets the value of the structureType property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setStructureType(JAXBElement<String> value) {
        this.structureType = value;
    }

    /**
     * Gets the value of the locationGeography property.
     *
     * @return possible object is
     * {@link LocationGeographyType }
     */
    public LocationGeographyType getLocationGeography() {
        return locationGeography;
    }

    /**
     * Sets the value of the locationGeography property.
     *
     * @param value allowed object is
     *              {@link LocationGeographyType }
     */
    public void setLocationGeography(LocationGeographyType value) {
        this.locationGeography = value;
    }

    /**
     * Gets the value of the locationTelephony property.
     *
     * @return possible object is
     * {@link LocationTelephonyType }
     */
    public LocationTelephonyType getLocationTelephony() {
        return locationTelephony;
    }

    /**
     * Sets the value of the locationTelephony property.
     *
     * @param value allowed object is
     *              {@link LocationTelephonyType }
     */
    public void setLocationTelephony(LocationTelephonyType value) {
        this.locationTelephony = value;
    }

    /**
     * Gets the value of the locationNetworkConnectivity property.
     *
     * @return possible object is
     * {@link LocationNetworkConnectivityType }
     */
    public LocationNetworkConnectivityType getLocationNetworkConnectivity() {
        return locationNetworkConnectivity;
    }

    /**
     * Sets the value of the locationNetworkConnectivity property.
     *
     * @param value allowed object is
     *              {@link LocationNetworkConnectivityType }
     */
    public void setLocationNetworkConnectivity(LocationNetworkConnectivityType value) {
        this.locationNetworkConnectivity = value;
    }

    /**
     * Gets the value of the addressGroupID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getAddressGroupID() {
        return addressGroupID;
    }

    /**
     * Sets the value of the addressGroupID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setAddressGroupID(JAXBElement<String> value) {
        this.addressGroupID = value;
    }

    /**
     * Gets the value of the e911Availability property.
     *
     * @return possible object is
     * {@link E911AvailabilityType }
     */
    public E911AvailabilityType getE911Availability() {
        return e911Availability;
    }

    /**
     * Sets the value of the e911Availability property.
     *
     * @param value allowed object is
     *              {@link E911AvailabilityType }
     */
    public void setE911Availability(E911AvailabilityType value) {
        this.e911Availability = value;
    }

    /**
     * Gets the value of the addressStandardizationMatchStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAddressStandardizationMatchStatus() {
        return addressStandardizationMatchStatus;
    }

    /**
     * Sets the value of the addressStandardizationMatchStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAddressStandardizationMatchStatus(String value) {
        this.addressStandardizationMatchStatus = value;
    }

    /**
     * Gets the value of the geocodingPrecision property.
     *
     * @return possible object is
     * {@link GeocodingPrecisionType }
     */
    public GeocodingPrecisionType getGeocodingPrecision() {
        return geocodingPrecision;
    }

    /**
     * Sets the value of the geocodingPrecision property.
     *
     * @param value allowed object is
     *              {@link GeocodingPrecisionType }
     */
    public void setGeocodingPrecision(GeocodingPrecisionType value) {
        this.geocodingPrecision = value;
    }

    /**
     * Gets the value of the legacyLocationIDs property.
     *
     * @return possible object is
     * {@link ArrayOfLegacyLocationIDType }
     */
    public ArrayOfLegacyLocationIDType getLegacyLocationIDs() {
        return legacyLocationIDs;
    }

    /**
     * Sets the value of the legacyLocationIDs property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLegacyLocationIDType }
     */
    public void setLegacyLocationIDs(ArrayOfLegacyLocationIDType value) {
        this.legacyLocationIDs = value;
    }

    /**
     * Gets the value of the locationLegacyDetails property.
     *
     * @return possible object is
     * {@link LocationLegacyDetailsType }
     */
    public LocationLegacyDetailsType getLocationLegacyDetails() {
        return locationLegacyDetails;
    }

    /**
     * Sets the value of the locationLegacyDetails property.
     *
     * @param value allowed object is
     *              {@link LocationLegacyDetailsType }
     */
    public void setLocationLegacyDetails(LocationLegacyDetailsType value) {
        this.locationLegacyDetails = value;
    }

    /**
     * Gets the value of the locationCustomFields property.
     *
     * @return possible object is
     * {@link ArrayOfLocationCustomFieldsType }
     */
    public ArrayOfLocationCustomFieldsType getLocationCustomFields() {
        return locationCustomFields;
    }

    /**
     * Sets the value of the locationCustomFields property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationCustomFieldsType }
     */
    public void setLocationCustomFields(ArrayOfLocationCustomFieldsType value) {
        this.locationCustomFields = value;
    }

    /**
     * Gets the value of the locationComments property.
     *
     * @return possible object is
     * {@link ArrayOfLocationCommentsType }
     */
    public ArrayOfLocationCommentsType getLocationComments() {
        return locationComments;
    }

    /**
     * Sets the value of the locationComments property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationCommentsType }
     */
    public void setLocationComments(ArrayOfLocationCommentsType value) {
        this.locationComments = value;
    }

    /**
     * Gets the value of the locationTimezone property.
     *
     * @return possible object is
     * {@link TimeZoneType }
     */
    public TimeZoneType getLocationTimezone() {
        return locationTimezone;
    }

    /**
     * Sets the value of the locationTimezone property.
     *
     * @param value allowed object is
     *              {@link TimeZoneType }
     */
    public void setLocationTimezone(TimeZoneType value) {
        this.locationTimezone = value;
    }

    /**
     * Gets the value of the standardDwellingCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStandardDwellingCode() {
        return standardDwellingCode;
    }

    /**
     * Sets the value of the standardDwellingCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStandardDwellingCode(String value) {
        this.standardDwellingCode = value;
    }

}
