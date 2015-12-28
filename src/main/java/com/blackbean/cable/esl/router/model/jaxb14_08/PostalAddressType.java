
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for PostalAddressType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="PostalAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="houseNumberPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="houseNumberSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetPreDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="streetSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetPostDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitTypes" type="{http://xml.blackbean.com/location/types}ArrayOfUnitTypesType" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;pattern value="[A-Z]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="zipCode" type="{http://xml.blackbean.com/location/types}ZipCodeType"/>
 *         &lt;element name="country" type="{http://xml.blackbean.com/location/types}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="dwellingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddressType", propOrder = {
        "houseNumberPrefix",
        "houseNumber",
        "houseNumberSuffix",
        "streetPreDirection",
        "streetName",
        "streetSuffix",
        "streetPostDirection",
        "unitTypes",
        "city",
        "state",
        "zipCode",
        "country",
        "dwellingCode"
})
public class PostalAddressType {

    @XmlElementRef(name = "houseNumberPrefix", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumberPrefix;
    @XmlElementRef(name = "houseNumber", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumber;
    @XmlElementRef(name = "houseNumberSuffix", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumberSuffix;
    @XmlElementRef(name = "streetPreDirection", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetPreDirection;
    @XmlElement(required = true)
    protected String streetName;
    @XmlElementRef(name = "streetSuffix", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetSuffix;
    @XmlElementRef(name = "streetPostDirection", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetPostDirection;
    @XmlElementRef(name = "unitTypes", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUnitTypesType> unitTypes;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(required = true)
    protected ZipCodeType zipCode;
    @XmlElementRef(name = "country", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<CountryCodeType> country;
    @XmlElementRef(name = "dwellingCode", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dwellingCode;

    /**
     * Gets the value of the houseNumberPrefix property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHouseNumberPrefix() {
        return houseNumberPrefix;
    }

    /**
     * Sets the value of the houseNumberPrefix property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHouseNumberPrefix(JAXBElement<String> value) {
        this.houseNumberPrefix = value;
    }

    /**
     * Gets the value of the houseNumber property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHouseNumber(JAXBElement<String> value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the houseNumberSuffix property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHouseNumberSuffix() {
        return houseNumberSuffix;
    }

    /**
     * Sets the value of the houseNumberSuffix property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHouseNumberSuffix(JAXBElement<String> value) {
        this.houseNumberSuffix = value;
    }

    /**
     * Gets the value of the streetPreDirection property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getStreetPreDirection() {
        return streetPreDirection;
    }

    /**
     * Sets the value of the streetPreDirection property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setStreetPreDirection(JAXBElement<String> value) {
        this.streetPreDirection = value;
    }

    /**
     * Gets the value of the streetName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetSuffix property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * Sets the value of the streetSuffix property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setStreetSuffix(JAXBElement<String> value) {
        this.streetSuffix = value;
    }

    /**
     * Gets the value of the streetPostDirection property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getStreetPostDirection() {
        return streetPostDirection;
    }

    /**
     * Sets the value of the streetPostDirection property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setStreetPostDirection(JAXBElement<String> value) {
        this.streetPostDirection = value;
    }

    /**
     * Gets the value of the unitTypes property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfUnitTypesType }{@code >}
     */
    public JAXBElement<ArrayOfUnitTypesType> getUnitTypes() {
        return unitTypes;
    }

    /**
     * Sets the value of the unitTypes property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfUnitTypesType }{@code >}
     */
    public void setUnitTypes(JAXBElement<ArrayOfUnitTypesType> value) {
        this.unitTypes = value;
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
     * Gets the value of the country property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}
     */
    public JAXBElement<CountryCodeType> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}
     */
    public void setCountry(JAXBElement<CountryCodeType> value) {
        this.country = value;
    }

    /**
     * Gets the value of the dwellingCode property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDwellingCode() {
        return dwellingCode;
    }

    /**
     * Sets the value of the dwellingCode property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDwellingCode(JAXBElement<String> value) {
        this.dwellingCode = value;
    }

}
