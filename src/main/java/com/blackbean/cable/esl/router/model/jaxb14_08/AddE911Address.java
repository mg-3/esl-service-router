
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
 *         &lt;element name="AddE911Address" type="{http://xml.blackbean.com/location/types}AddE911AddressRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "addE911Address"
})
@XmlRootElement(name = "addE911Address", namespace = "http://xml.blackbean.com/location/services")
public class AddE911Address {

    @XmlElementRef(name = "AddE911Address", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<AddE911AddressRequestType> addE911Address;

    /**
     * Gets the value of the addE911Address property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AddE911AddressRequestType }{@code >}
     */
    public JAXBElement<AddE911AddressRequestType> getAddE911Address() {
        return addE911Address;
    }

    /**
     * Sets the value of the addE911Address property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AddE911AddressRequestType }{@code >}
     */
    public void setAddE911Address(JAXBElement<AddE911AddressRequestType> value) {
        this.addE911Address = value;
    }

}
