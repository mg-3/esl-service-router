
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
 *         &lt;element name="addE911AddressReturn" type="{http://xml.comcast.com/location/types}AddE911AddressResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "addE911AddressReturn"
})
@XmlRootElement(name = "addE911AddressResponse", namespace = "http://xml.comcast.com/location/services")
public class AddE911AddressResponse {

    @XmlElementRef(name = "addE911AddressReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<AddE911AddressResponseType> addE911AddressReturn;

    /**
     * Gets the value of the addE911AddressReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AddE911AddressResponseType }{@code >}
     */
    public JAXBElement<AddE911AddressResponseType> getAddE911AddressReturn() {
        return addE911AddressReturn;
    }

    /**
     * Sets the value of the addE911AddressReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AddE911AddressResponseType }{@code >}
     */
    public void setAddE911AddressReturn(JAXBElement<AddE911AddressResponseType> value) {
        this.addE911AddressReturn = value;
    }

}
