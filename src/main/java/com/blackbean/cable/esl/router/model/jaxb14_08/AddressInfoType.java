
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AddressInfoType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddressInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="postalAddress" type="{http://xml.comcast.com/location/types}PostalAddressType"/>
 *         &lt;element name="alternateAddress" type="{http://xml.comcast.com/location/types}ArrayOfAlternatePostalAddressType"/>
 *         &lt;element name="locationStatus" type="{http://xml.comcast.com/location/types}LocationStatusType"/>
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fraudIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StructureUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StructureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timezone" type="{http://xml.comcast.com/location/types}TimeZoneType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressInfoType", propOrder = {
        "postalAddress",
        "alternateAddress",
        "locationStatus",
        "locationID",
        "fraudIndicator",
        "structureUse",
        "structureType",
        "timezone"
})
public class AddressInfoType {

    @XmlElement(required = true)
    protected PostalAddressType postalAddress;
    @XmlElement(required = true)
    protected ArrayOfAlternatePostalAddressType alternateAddress;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LocationStatusType locationStatus;
    protected long locationID;
    @XmlElement(required = true)
    protected String fraudIndicator;
    @XmlElementRef(name = "StructureUse", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> structureUse;
    @XmlElementRef(name = "StructureType", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> structureType;
    protected TimeZoneType timezone;

    /**
     * Gets the value of the postalAddress property.
     *
     * @return possible object is
     * {@link PostalAddressType }
     */
    public PostalAddressType getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     *
     * @param value allowed object is
     *              {@link PostalAddressType }
     */
    public void setPostalAddress(PostalAddressType value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the alternateAddress property.
     *
     * @return possible object is
     * {@link ArrayOfAlternatePostalAddressType }
     */
    public ArrayOfAlternatePostalAddressType getAlternateAddress() {
        return alternateAddress;
    }

    /**
     * Sets the value of the alternateAddress property.
     *
     * @param value allowed object is
     *              {@link ArrayOfAlternatePostalAddressType }
     */
    public void setAlternateAddress(ArrayOfAlternatePostalAddressType value) {
        this.alternateAddress = value;
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
     * Gets the value of the timezone property.
     *
     * @return possible object is
     * {@link TimeZoneType }
     */
    public TimeZoneType getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     *
     * @param value allowed object is
     *              {@link TimeZoneType }
     */
    public void setTimezone(TimeZoneType value) {
        this.timezone = value;
    }

}
