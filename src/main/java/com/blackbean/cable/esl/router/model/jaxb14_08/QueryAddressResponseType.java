
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAddressResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryAddressResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationReference" type="{http://xml.comcast.com/location/types}LocationReferenceType" minOccurs="0"/>
 *         &lt;element name="e911AddressInfo" type="{http://xml.comcast.com/location/types}E911AddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAddressResponseType", propOrder = {
        "locationReference",
        "e911AddressInfo"
})
public class QueryAddressResponseType {

    protected LocationReferenceType locationReference;
    protected E911AddressType e911AddressInfo;

    /**
     * Gets the value of the locationReference property.
     *
     * @return possible object is
     * {@link LocationReferenceType }
     */
    public LocationReferenceType getLocationReference() {
        return locationReference;
    }

    /**
     * Sets the value of the locationReference property.
     *
     * @param value allowed object is
     *              {@link LocationReferenceType }
     */
    public void setLocationReference(LocationReferenceType value) {
        this.locationReference = value;
    }

    /**
     * Gets the value of the e911AddressInfo property.
     *
     * @return possible object is
     * {@link E911AddressType }
     */
    public E911AddressType getE911AddressInfo() {
        return e911AddressInfo;
    }

    /**
     * Sets the value of the e911AddressInfo property.
     *
     * @param value allowed object is
     *              {@link E911AddressType }
     */
    public void setE911AddressInfo(E911AddressType value) {
        this.e911AddressInfo = value;
    }

}
