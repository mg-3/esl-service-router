
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddE911AddressRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddE911AddressRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="e911Address" type="{http://xml.comcast.com/location/types}E911AddressType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddE911AddressRequestType", propOrder = {
        "locationID",
        "e911Address"
})
public class AddE911AddressRequestType {

    protected long locationID;
    @XmlElement(required = true)
    protected E911AddressType e911Address;

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
     * Gets the value of the e911Address property.
     *
     * @return possible object is
     * {@link E911AddressType }
     */
    public E911AddressType getE911Address() {
        return e911Address;
    }

    /**
     * Sets the value of the e911Address property.
     *
     * @param value allowed object is
     *              {@link E911AddressType }
     */
    public void setE911Address(E911AddressType value) {
        this.e911Address = value;
    }

}
