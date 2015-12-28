
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardizedAddressXfinityType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="StandardizedAddressXfinityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geocodedAddress" type="{http://xml.comcast.com/location/types}GeocodedAddressType" minOccurs="0"/>
 *         &lt;element name="geography" type="{http://xml.comcast.com/location/types}GeographyType" minOccurs="0"/>
 *         &lt;element name="telephony" type="{http://xml.comcast.com/location/types}TelephonyType" minOccurs="0"/>
 *         &lt;element name="msag" type="{http://xml.comcast.com/location/types}ArrayOfMsagDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardizedAddressXfinityType", propOrder = {
        "geocodedAddress",
        "geography",
        "telephony",
        "msag"
})
public class StandardizedAddressXfinityType {

    @XmlElementRef(name = "geocodedAddress", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<GeocodedAddressType> geocodedAddress;
    @XmlElementRef(name = "geography", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<GeographyType> geography;
    @XmlElementRef(name = "telephony", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<TelephonyType> telephony;
    @XmlElementRef(name = "msag", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMsagDataType> msag;

    /**
     * Gets the value of the geocodedAddress property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GeocodedAddressType }{@code >}
     */
    public JAXBElement<GeocodedAddressType> getGeocodedAddress() {
        return geocodedAddress;
    }

    /**
     * Sets the value of the geocodedAddress property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GeocodedAddressType }{@code >}
     */
    public void setGeocodedAddress(JAXBElement<GeocodedAddressType> value) {
        this.geocodedAddress = value;
    }

    /**
     * Gets the value of the geography property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GeographyType }{@code >}
     */
    public JAXBElement<GeographyType> getGeography() {
        return geography;
    }

    /**
     * Sets the value of the geography property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GeographyType }{@code >}
     */
    public void setGeography(JAXBElement<GeographyType> value) {
        this.geography = value;
    }

    /**
     * Gets the value of the telephony property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link TelephonyType }{@code >}
     */
    public JAXBElement<TelephonyType> getTelephony() {
        return telephony;
    }

    /**
     * Sets the value of the telephony property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link TelephonyType }{@code >}
     */
    public void setTelephony(JAXBElement<TelephonyType> value) {
        this.telephony = value;
    }

    /**
     * Gets the value of the msag property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfMsagDataType }{@code >}
     */
    public JAXBElement<ArrayOfMsagDataType> getMsag() {
        return msag;
    }

    /**
     * Sets the value of the msag property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfMsagDataType }{@code >}
     */
    public void setMsag(JAXBElement<ArrayOfMsagDataType> value) {
        this.msag = value;
    }

}
