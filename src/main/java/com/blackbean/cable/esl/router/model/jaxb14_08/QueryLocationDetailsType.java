
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for QueryLocationDetailsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryLocationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LegacyLocationIDs" type="{http://xml.comcast.com/location/types}ArrayOfLegacyLocationIDType" minOccurs="0"/>
 *         &lt;element name="locationStatus" type="{http://xml.comcast.com/location/types}LocationStatusType"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="locationPostalAddress" type="{http://xml.comcast.com/location/types}PostalAddressType"/>
 *         &lt;element name="locationAlternateAddress" type="{http://xml.comcast.com/location/types}ArrayOfAlternatePostalAddressType" minOccurs="0"/>
 *         &lt;element name="LocationGeography" type="{http://xml.comcast.com/location/types}LocationGeographyType" minOccurs="0"/>
 *         &lt;element name="LocationTelephony" type="{http://xml.comcast.com/location/types}LocationTelephonyType" minOccurs="0"/>
 *         &lt;element name="E911Availability" type="{http://xml.comcast.com/location/types}E911AvailabilityType" minOccurs="0"/>
 *         &lt;element name="marketID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="marketName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legacyMarketId" type="{http://xml.comcast.com/location/types}LegacyMarketIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLocationDetailsType", propOrder = {
        "locationID",
        "legacyLocationIDs",
        "locationStatus",
        "longitude",
        "latitude",
        "locationPostalAddress",
        "locationAlternateAddress",
        "locationGeography",
        "locationTelephony",
        "e911Availability",
        "marketID",
        "marketName",
        "legacyMarketId"
})
public class QueryLocationDetailsType {

    protected long locationID;
    @XmlElement(name = "LegacyLocationIDs")
    protected ArrayOfLegacyLocationIDType legacyLocationIDs;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LocationStatusType locationStatus;
    @XmlElement(required = true)
    protected BigDecimal longitude;
    @XmlElement(required = true)
    protected BigDecimal latitude;
    @XmlElement(required = true)
    protected PostalAddressType locationPostalAddress;
    protected ArrayOfAlternatePostalAddressType locationAlternateAddress;
    @XmlElement(name = "LocationGeography")
    protected LocationGeographyType locationGeography;
    @XmlElement(name = "LocationTelephony")
    protected LocationTelephonyType locationTelephony;
    @XmlElement(name = "E911Availability")
    protected E911AvailabilityType e911Availability;
    protected long marketID;
    @XmlElement(required = true)
    protected String marketName;
    protected LegacyMarketIDType legacyMarketId;

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
     * Gets the value of the marketName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMarketName() {
        return marketName;
    }

    /**
     * Sets the value of the marketName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMarketName(String value) {
        this.marketName = value;
    }

    /**
     * Gets the value of the legacyMarketId property.
     *
     * @return possible object is
     * {@link LegacyMarketIDType }
     */
    public LegacyMarketIDType getLegacyMarketId() {
        return legacyMarketId;
    }

    /**
     * Sets the value of the legacyMarketId property.
     *
     * @param value allowed object is
     *              {@link LegacyMarketIDType }
     */
    public void setLegacyMarketId(LegacyMarketIDType value) {
        this.legacyMarketId = value;
    }

}
