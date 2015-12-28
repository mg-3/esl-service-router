
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
 *         &lt;element name="DeleteE911Address" type="{http://xml.comcast.com/location/types}DeleteE911AddressRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deleteE911Address"
})
@XmlRootElement(name = "deleteE911Address", namespace = "http://xml.comcast.com/location/services")
public class DeleteE911Address {

    @XmlElementRef(name = "DeleteE911Address", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<DeleteE911AddressRequestType> deleteE911Address;

    /**
     * Gets the value of the deleteE911Address property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DeleteE911AddressRequestType }{@code >}
     */
    public JAXBElement<DeleteE911AddressRequestType> getDeleteE911Address() {
        return deleteE911Address;
    }

    /**
     * Sets the value of the deleteE911Address property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DeleteE911AddressRequestType }{@code >}
     */
    public void setDeleteE911Address(JAXBElement<DeleteE911AddressRequestType> value) {
        this.deleteE911Address = value;
    }

}
