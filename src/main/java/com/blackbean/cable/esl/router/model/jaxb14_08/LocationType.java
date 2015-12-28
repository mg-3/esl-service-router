
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for LocationType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="locationStatus" type="{http://xml.blackbean.com/location/types}LocationStatusType"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="locationPostalAddress" type="{http://xml.blackbean.com/location/types}PostalAddressType"/>
 *         &lt;element name="locationAlternateAddress" type="{http://xml.blackbean.com/location/types}ArrayOfAlternatePostalAddressType"/>
 *         &lt;element name="locationMarketReference" type="{http://xml.blackbean.com/location/types}MarketReferenceType" minOccurs="0"/>
 *         &lt;element name="locationDetails" type="{http://xml.blackbean.com/location/types}LocationDetailsType" minOccurs="0"/>
 *         &lt;element name="locationCapabilities" type="{http://xml.blackbean.com/location/types}CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="locationCapabilityExceptions" type="{http://xml.blackbean.com/location/types}CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="HomeSecurity" type="{http://xml.blackbean.com/location/types}HomeSecurityType" minOccurs="0"/>
 *         &lt;element name="fraudIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
        "locationID",
        "locationStatus",
        "latitude",
        "longitude",
        "locationPostalAddress",
        "locationAlternateAddress",
        "locationMarketReference",
        "locationDetails",
        "locationCapabilities",
        "locationCapabilityExceptions",
        "homeSecurity",
        "fraudIndicator"
})
public class LocationType {

    protected long locationID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LocationStatusType locationStatus;
    @XmlElement(required = true)
    protected BigDecimal latitude;
    @XmlElement(required = true)
    protected BigDecimal longitude;
    @XmlElement(required = true)
    protected PostalAddressType locationPostalAddress;
    @XmlElement(required = true)
    protected ArrayOfAlternatePostalAddressType locationAlternateAddress;
    protected MarketReferenceType locationMarketReference;
    protected LocationDetailsType locationDetails;
    protected CapabilitiesType locationCapabilities;
    protected CapabilitiesType locationCapabilityExceptions;
    @XmlElement(name = "HomeSecurity")
    protected HomeSecurityType homeSecurity;
    @XmlElement(required = true)
    protected String fraudIndicator;

    /**
     * Gets the value of the locationID property.
     */
    public long getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     */
    public void setLocationID(long value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the locationStatus property.
     *
     * @return possible object is
     * {@link LocationStatusType }
     */
    public LocationStatusType getLocationStatus() {
        return locationStatus;
    }

    /**
     * Sets the value of the locationStatus property.
     *
     * @param value allowed object is
     *              {@link LocationStatusType }
     */
    public void setLocationStatus(LocationStatusType value) {
        this.locationStatus = value;
    }

    /**
     * Gets the value of the latitude property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
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
     * Gets the value of the locationAlternateAddress property.
     *
     * @return possible object is
     * {@link ArrayOfAlternatePostalAddressType }
     */
    public ArrayOfAlternatePostalAddressType getLocationAlternateAddress() {
        return locationAlternateAddress;
    }

    /**
     * Sets the value of the locationAlternateAddress property.
     *
     * @param value allowed object is
     *              {@link ArrayOfAlternatePostalAddressType }
     */
    public void setLocationAlternateAddress(ArrayOfAlternatePostalAddressType value) {
        this.locationAlternateAddress = value;
    }

    /**
     * Gets the value of the locationMarketReference property.
     *
     * @return possible object is
     * {@link MarketReferenceType }
     */
    public MarketReferenceType getLocationMarketReference() {
        return locationMarketReference;
    }

    /**
     * Sets the value of the locationMarketReference property.
     *
     * @param value allowed object is
     *              {@link MarketReferenceType }
     */
    public void setLocationMarketReference(MarketReferenceType value) {
        this.locationMarketReference = value;
    }

    /**
     * Gets the value of the locationDetails property.
     *
     * @return possible object is
     * {@link LocationDetailsType }
     */
    public LocationDetailsType getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     *
     * @param value allowed object is
     *              {@link LocationDetailsType }
     */
    public void setLocationDetails(LocationDetailsType value) {
        this.locationDetails = value;
    }

    /**
     * Gets the value of the locationCapabilities property.
     *
     * @return possible object is
     * {@link CapabilitiesType }
     */
    public CapabilitiesType getLocationCapabilities() {
        return locationCapabilities;
    }

    /**
     * Sets the value of the locationCapabilities property.
     *
     * @param value allowed object is
     *              {@link CapabilitiesType }
     */
    public void setLocationCapabilities(CapabilitiesType value) {
        this.locationCapabilities = value;
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
     * Gets the value of the homeSecurity property.
     *
     * @return possible object is
     * {@link HomeSecurityType }
     */
    public HomeSecurityType getHomeSecurity() {
        return homeSecurity;
    }

    /**
     * Sets the value of the homeSecurity property.
     *
     * @param value allowed object is
     *              {@link HomeSecurityType }
     */
    public void setHomeSecurity(HomeSecurityType value) {
        this.homeSecurity = value;
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
