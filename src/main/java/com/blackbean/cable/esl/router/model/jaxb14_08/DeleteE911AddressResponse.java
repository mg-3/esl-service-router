
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteE911AddressReturn" type="{http://xml.comcast.com/location/types}DeleteE911AddressResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deleteE911AddressReturn"
})
@XmlRootElement(name = "deleteE911AddressResponse", namespace = "http://xml.comcast.com/location/services")
public class DeleteE911AddressResponse {

    @XmlElementRef(name = "deleteE911AddressReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<DeleteE911AddressResponseType> deleteE911AddressReturn;

    /**
     * Gets the value of the deleteE911AddressReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DeleteE911AddressResponseType }{@code >}
     */
    public JAXBElement<DeleteE911AddressResponseType> getDeleteE911AddressReturn() {
        return deleteE911AddressReturn;
    }

    /**
     * Sets the value of the deleteE911AddressReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DeleteE911AddressResponseType }{@code >}
     */
    public void setDeleteE911AddressReturn(JAXBElement<DeleteE911AddressResponseType> value) {
        this.deleteE911AddressReturn = value;
    }

}
