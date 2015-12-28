
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLocationRequestItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddLocationRequestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MarketID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LocationPostalAddress" type="{http://xml.blackbean.com/location/types}PostalAddressType"/>
 *         &lt;element name="MultiDwellingUnitDetails" type="{http://xml.blackbean.com/location/types}MultiDwellingUnitDetailsType" minOccurs="0"/>
 *         &lt;element name="LocationNetworkConnectivity" type="{http://xml.blackbean.com/location/types}LocationNetworkConnectivityType" minOccurs="0"/>
 *         &lt;element name="LocationLegacyDetails" type="{http://xml.blackbean.com/location/types}LocationLegacyDetailsType" minOccurs="0"/>
 *         &lt;element name="LocationCapabilityExceptions" type="{http://xml.blackbean.com/location/types}CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="LocationCustomFields" type="{http://xml.blackbean.com/location/types}ArrayOfLocationCustomFieldsType" minOccurs="0"/>
 *         &lt;element name="LocationTelephony" type="{http://xml.blackbean.com/location/types}LocationTelephonyType" minOccurs="0"/>
 *         &lt;element name="LocationGeographicCoordinates" type="{http://xml.blackbean.com/location/types}GeographicCoordinateMeasurementType" minOccurs="0"/>
 *         &lt;element name="LocationGeography" type="{http://xml.blackbean.com/location/types}LocationGeographyType" minOccurs="0"/>
 *         &lt;element name="CopyLocationToBillingWhenComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AddressVerificationDetails" type="{http://xml.blackbean.com/location/types}AddressVerificationDetailsType" minOccurs="0"/>
 *         &lt;element name="fraudIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLocationRequestItemType", propOrder = {
        "requestRefNum",
        "marketID",
        "locationPostalAddress",
        "multiDwellingUnitDetails",
        "locationNetworkConnectivity",
        "locationLegacyDetails",
        "locationCapabilityExceptions",
        "locationCustomFields",
        "locationTelephony",
        "locationGeographicCoordinates",
        "locationGeography",
        "copyLocationToBillingWhenComplete",
        "addressVerificationDetails",
        "fraudIndicator"
})
public class AddLocationRequestItemType {

    @XmlElement(name = "RequestRefNum")
    protected int requestRefNum;
    @XmlElement(name = "MarketID")
    protected long marketID;
    @XmlElement(name = "LocationPostalAddress", required = true)
    protected PostalAddressType locationPostalAddress;
    @XmlElement(name = "MultiDwellingUnitDetails")
    protected MultiDwellingUnitDetailsType multiDwellingUnitDetails;
    @XmlElement(name = "LocationNetworkConnectivity")
    protected LocationNetworkConnectivityType locationNetworkConnectivity;
    @XmlElement(name = "LocationLegacyDetails")
    protected LocationLegacyDetailsType locationLegacyDetails;
    @XmlElement(name = "LocationCapabilityExceptions")
    protected CapabilitiesType locationCapabilityExceptions;
    @XmlElement(name = "LocationCustomFields")
    protected ArrayOfLocationCustomFieldsType locationCustomFields;
    @XmlElement(name = "LocationTelephony")
    protected LocationTelephonyType locationTelephony;
    @XmlElement(name = "LocationGeographicCoordinates")
    protected GeographicCoordinateMeasurementType locationGeographicCoordinates;
    @XmlElement(name = "LocationGeography")
    protected LocationGeographyType locationGeography;
    @XmlElement(name = "CopyLocationToBillingWhenComplete")
    protected Boolean copyLocationToBillingWhenComplete;
    @XmlElement(name = "AddressVerificationDetails")
    protected AddressVerificationDetailsType addressVerificationDetails;
    protected String fraudIndicator;

    /**
     * Gets the value of the requestRefNum property.
     */
    public int getRequestRefNum() {
        return requestRefNum;
    }

    /**
     * Sets the value of the requestRefNum property.
     */
    public void setRequestRefNum(int value) {
        this.requestRefNum = value;
    }

    /**
     * Gets the value of the marketID property.
     */
    public long getMarketID() {
        return marketID;
    }

    /**
     * Sets the value of the marketID property.
     */
    public void setMarketID(long value) {
        this.marketID = value;
    }

    /**
     * Gets the value of the locationPostalAddress property.
     *
     * @return possible object is
     * {@link PostalAddressType }
     */
    public PostalAddressType getLocationPostalAddress() {
        return locationPostalAddress;
    }

    /**
     * Sets the value of the locationPostalAddress property.
     *
     * @param value allowed object is
     *              {@link PostalAddressType }
     */
    public void setLocationPostalAddress(PostalAddressType value) {
        this.locationPostalAddress = value;
    }

    /**
     * Gets the value of the multiDwellingUnitDetails property.
     *
     * @return possible object is
     * {@link MultiDwellingUnitDetailsType }
     */
    public MultiDwellingUnitDetailsType getMultiDwellingUnitDetails() {
        return multiDwellingUnitDetails;
    }

    /**
     * Sets the value of the multiDwellingUnitDetails property.
     *
     * @param value allowed object is
     *              {@link MultiDwellingUnitDetailsType }
     */
    public void setMultiDwellingUnitDetails(MultiDwellingUnitDetailsType value) {
        this.multiDwellingUnitDetails = value;
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
     * Gets the value of the locationCapabilityExceptions property.
     *
     * @return possible object is
     * {@link CapabilitiesType }
     */
    public CapabilitiesType getLocationCapabilityExceptions() {
        return locationCapabilityExceptions;
    }

    /**
     * Sets the value of the locationCapabilityExceptions property.
     *
     * @param value allowed object is
     *              {@link CapabilitiesType }
     */
    public void setLocationCapabilityExceptions(CapabilitiesType value) {
        this.locationCapabilityExceptions = value;
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
     * Gets the value of the locationGeographicCoordinates property.
     *
     * @return possible object is
     * {@link GeographicCoordinateMeasurementType }
     */
    public GeographicCoordinateMeasurementType getLocationGeographicCoordinates() {
        return locationGeographicCoordinates;
    }

    /**
     * Sets the value of the locationGeographicCoordinates property.
     *
     * @param value allowed object is
     *              {@link GeographicCoordinateMeasurementType }
     */
    public void setLocationGeographicCoordinates(GeographicCoordinateMeasurementType value) {
        this.locationGeographicCoordinates = value;
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
     * Gets the value of the copyLocationToBillingWhenComplete property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isCopyLocationToBillingWhenComplete() {
        return copyLocationToBillingWhenComplete;
    }

    /**
     * Sets the value of the copyLocationToBillingWhenComplete property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setCopyLocationToBillingWhenComplete(Boolean value) {
        this.copyLocationToBillingWhenComplete = value;
    }

    /**
     * Gets the value of the addressVerificationDetails property.
     *
     * @return possible object is
     * {@link AddressVerificationDetailsType }
     */
    public AddressVerificationDetailsType getAddressVerificationDetails() {
        return addressVerificationDetails;
    }

    /**
     * Sets the value of the addressVerificationDetails property.
     *
     * @param value allowed object is
     *              {@link AddressVerificationDetailsType }
     */
    public void setAddressVerificationDetails(AddressVerificationDetailsType value) {
        this.addressVerificationDetails = value;
    }

    /**
     * Gets the value of the fraudIndicator property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFraudIndicator() {
        return fraudIndicator;
    }

    /**
     * Sets the value of the fraudIndicator property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFraudIndicator(String value) {
        this.fraudIndicator = value;
    }

}
