
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for LocationReferenceType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="locationStatus" type="{http://xml.comcast.com/location/types}LocationStatusType"/>
 *         &lt;element name="streetAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="streetAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;pattern value="[A-Z]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="zipCode" type="{http://xml.comcast.com/location/types}ZipCodeType"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="exactMatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="marketID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="marketName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legacyMarketId" type="{http://xml.comcast.com/location/types}LegacyMarketIDType" minOccurs="0"/>
 *         &lt;element name="legacyLocationIDs" type="{http://xml.comcast.com/location/types}ArrayOfLegacyLocationIDType" minOccurs="0"/>
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fraudIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="channelMapGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationReferenceType", propOrder = {
        "locationID",
        "locationStatus",
        "streetAddress1",
        "streetAddress2",
        "city",
        "state",
        "zipCode",
        "latitude",
        "longitude",
        "exactMatch",
        "marketID",
        "marketName",
        "legacyMarketId",
        "legacyLocationIDs",
        "distance",
        "fraudIndicator",
        "channelMapGroup"
})
public class LocationReferenceType {

    protected long locationID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LocationStatusType locationStatus;
    @XmlElement(required = true)
    protected String streetAddress1;
    @XmlElement(required = true)
    protected String streetAddress2;
    @XmlElement(required = true)
    protected String city;
    @XmlElementRef(name = "state", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElement(required = true)
    protected ZipCodeType zipCode;
    @XmlElement(required = true)
    protected BigDecimal latitude;
    @XmlElement(required = true)
    protected BigDecimal longitude;
    protected boolean exactMatch;
    protected Long marketID;
    protected String marketName;
    protected LegacyMarketIDType legacyMarketId;
    protected ArrayOfLegacyLocationIDType legacyLocationIDs;
    protected Integer distance;
    @XmlElement(required = true)
    protected String fraudIndicator;
    protected String channelMapGroup;

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
     * Gets the value of the streetAddress1 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStreetAddress1() {
        return streetAddress1;
    }

    /**
     * Sets the value of the streetAddress1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStreetAddress1(String value) {
        this.streetAddress1 = value;
    }

    /**
     * Gets the value of the streetAddress2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStreetAddress2() {
        return streetAddress2;
    }

    /**
     * Sets the value of the streetAddress2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStreetAddress2(String value) {
        this.streetAddress2 = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Gets the value of the zipCode property.
     *
     * @return possible object is
     * {@link ZipCodeType }
     */
    public ZipCodeType getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     *
     * @param value allowed object is
     *              {@link ZipCodeType }
     */
    public void setZipCode(ZipCodeType value) {
        this.zipCode = value;
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
     * Gets the value of the exactMatch property.
     */
    public boolean isExactMatch() {
        return exactMatch;
    }

    /**
     * Sets the value of the exactMatch property.
     */
    public void setExactMatch(boolean value) {
        this.exactMatch = value;
    }

    /**
     * Gets the value of the marketID property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getMarketID() {
        return marketID;
    }

    /**
     * Sets the value of the marketID property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setMarketID(Long value) {
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
     * Gets the value of the distance property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setDistance(Integer value) {
        this.distance = value;
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

    /**
     * Gets the value of the channelMapGroup property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getChannelMapGroup() {
        return channelMapGroup;
    }

    /**
     * Sets the value of the channelMapGroup property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setChannelMapGroup(String value) {
        this.channelMapGroup = value;
    }

}
