
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AddLocationQueueAddressType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddLocationQueueAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="streetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="zip">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{5}([\-]?\d{4})?"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="country" type="{http://xml.blackbean.com/location/types}CountryCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLocationQueueAddressType", propOrder = {
        "streetAddress",
        "unitTypes",
        "city",
        "state",
        "zip",
        "country"
})
public class AddLocationQueueAddressType {

    @XmlElement(required = true)
    protected String streetAddress;
    @XmlElementRef(name = "unitTypes", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUnitTypesType> unitTypes;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(required = true)
    protected String zip;
    @XmlElementRef(name = "country", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<CountryCodeType> country;

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

}
