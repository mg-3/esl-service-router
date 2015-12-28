
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AddressCriteriaType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddressCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;pattern value="[A-Z]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="zip" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{5}([\-]?\d{4})?"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="standardizeStreetAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="wildcardStreetAddressMatch" type="{http://xml.blackbean.com/location/types}QueryLocationWildcardAddressMatchType" minOccurs="0"/>
 *         &lt;element name="wildcardUnitNumberMatch" type="{http://xml.blackbean.com/location/types}QueryLocationWildcardUnitNumberMatchType" minOccurs="0"/>
 *         &lt;element name="queryMarketOnAddressNotFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="getLocationOnSingleAddressFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="locationStatus" type="{http://xml.blackbean.com/location/types}LocationStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressCriteriaType", propOrder = {
        "streetName",
        "streetAddress",
        "houseNumber",
        "unitNumber",
        "city",
        "state",
        "zip",
        "standardizeStreetAddress",
        "wildcardStreetAddressMatch",
        "wildcardUnitNumberMatch",
        "queryMarketOnAddressNotFound",
        "getLocationOnSingleAddressFound",
        "locationStatus"
})
public class AddressCriteriaType {

    @XmlElementRef(name = "streetName", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetName;
    protected String streetAddress;
    protected String houseNumber;
    protected String unitNumber;
    protected String city;
    protected String state;
    protected String zip;
    protected Boolean standardizeStreetAddress;
    @XmlSchemaType(name = "string")
    protected QueryLocationWildcardAddressMatchType wildcardStreetAddressMatch;
    @XmlSchemaType(name = "string")
    protected QueryLocationWildcardUnitNumberMatchType wildcardUnitNumberMatch;
    protected Boolean queryMarketOnAddressNotFound;
    protected Boolean getLocationOnSingleAddressFound;
    @XmlSchemaType(name = "string")
    protected LocationStatusType locationStatus;

    /**
     * Gets the value of the streetName property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setStreetName(JAXBElement<String> value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetAddress property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStreetAddress(String value) {
        this.streetAddress = value;
    }

    /**
     * Gets the value of the houseNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the unitNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitNumber() {
        return unitNumber;
    }

    /**
     * Sets the value of the unitNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitNumber(String value) {
        this.unitNumber = value;
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
     * {@link String }
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the standardizeStreetAddress property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isStandardizeStreetAddress() {
        return standardizeStreetAddress;
    }

    /**
     * Sets the value of the standardizeStreetAddress property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setStandardizeStreetAddress(Boolean value) {
        this.standardizeStreetAddress = value;
    }

    /**
     * Gets the value of the wildcardStreetAddressMatch property.
     *
     * @return possible object is
     * {@link QueryLocationWildcardAddressMatchType }
     */
    public QueryLocationWildcardAddressMatchType getWildcardStreetAddressMatch() {
        return wildcardStreetAddressMatch;
    }

    /**
     * Sets the value of the wildcardStreetAddressMatch property.
     *
     * @param value allowed object is
     *              {@link QueryLocationWildcardAddressMatchType }
     */
    public void setWildcardStreetAddressMatch(QueryLocationWildcardAddressMatchType value) {
        this.wildcardStreetAddressMatch = value;
    }

    /**
     * Gets the value of the wildcardUnitNumberMatch property.
     *
     * @return possible object is
     * {@link QueryLocationWildcardUnitNumberMatchType }
     */
    public QueryLocationWildcardUnitNumberMatchType getWildcardUnitNumberMatch() {
        return wildcardUnitNumberMatch;
    }

    /**
     * Sets the value of the wildcardUnitNumberMatch property.
     *
     * @param value allowed object is
     *              {@link QueryLocationWildcardUnitNumberMatchType }
     */
    public void setWildcardUnitNumberMatch(QueryLocationWildcardUnitNumberMatchType value) {
        this.wildcardUnitNumberMatch = value;
    }

    /**
     * Gets the value of the queryMarketOnAddressNotFound property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isQueryMarketOnAddressNotFound() {
        return queryMarketOnAddressNotFound;
    }

    /**
     * Sets the value of the queryMarketOnAddressNotFound property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setQueryMarketOnAddressNotFound(Boolean value) {
        this.queryMarketOnAddressNotFound = value;
    }

    /**
     * Gets the value of the getLocationOnSingleAddressFound property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isGetLocationOnSingleAddressFound() {
        return getLocationOnSingleAddressFound;
    }

    /**
     * Sets the value of the getLocationOnSingleAddressFound property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setGetLocationOnSingleAddressFound(Boolean value) {
        this.getLocationOnSingleAddressFound = value;
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

}
