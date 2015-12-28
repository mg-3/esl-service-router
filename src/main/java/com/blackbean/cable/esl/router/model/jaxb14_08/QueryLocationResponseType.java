
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLocationResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryLocationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationReference" type="{http://xml.blackbean.com/location/types}ArrayOfLocationReferenceType" minOccurs="0"/>
 *         &lt;element name="marketReference" type="{http://xml.blackbean.com/location/types}ArrayOfMarketReferenceType" minOccurs="0"/>
 *         &lt;element name="location" type="{http://xml.blackbean.com/location/types}LocationType" minOccurs="0"/>
 *         &lt;element name="standardizedAddress" type="{http://xml.blackbean.com/location/types}PostalAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLocationResponseType", propOrder = {
        "locationReference",
        "marketReference",
        "location",
        "standardizedAddress"
})
public class QueryLocationResponseType {

    @XmlElementRef(name = "locationReference", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLocationReferenceType> locationReference;
    @XmlElementRef(name = "marketReference", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMarketReferenceType> marketReference;
    @XmlElementRef(name = "location", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<LocationType> location;
    protected PostalAddressType standardizedAddress;

    /**
     * Gets the value of the locationReference property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfLocationReferenceType }{@code >}
     */
    public JAXBElement<ArrayOfLocationReferenceType> getLocationReference() {
        return locationReference;
    }

    /**
     * Sets the value of the locationReference property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfLocationReferenceType }{@code >}
     */
    public void setLocationReference(JAXBElement<ArrayOfLocationReferenceType> value) {
        this.locationReference = value;
    }

    /**
     * Gets the value of the marketReference property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfMarketReferenceType }{@code >}
     */
    public JAXBElement<ArrayOfMarketReferenceType> getMarketReference() {
        return marketReference;
    }

    /**
     * Sets the value of the marketReference property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfMarketReferenceType }{@code >}
     */
    public void setMarketReference(JAXBElement<ArrayOfMarketReferenceType> value) {
        this.marketReference = value;
    }

    /**
     * Gets the value of the location property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link LocationType }{@code >}
     */
    public JAXBElement<LocationType> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link LocationType }{@code >}
     */
    public void setLocation(JAXBElement<LocationType> value) {
        this.location = value;
    }

    /**
     * Gets the value of the standardizedAddress property.
     *
     * @return possible object is
     * {@link PostalAddressType }
     */
    public PostalAddressType getStandardizedAddress() {
        return standardizedAddress;
    }

    /**
     * Sets the value of the standardizedAddress property.
     *
     * @param value allowed object is
     *              {@link PostalAddressType }
     */
    public void setStandardizedAddress(PostalAddressType value) {
        this.standardizedAddress = value;
    }

}
