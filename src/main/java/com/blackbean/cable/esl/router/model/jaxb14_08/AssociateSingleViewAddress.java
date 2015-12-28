
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
 *         &lt;element name="AssociateSingleViewAddress" type="{http://xml.comcast.com/location/types}AssociateSingleViewAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "associateSingleViewAddress"
})
@XmlRootElement(name = "associateSingleViewAddress", namespace = "http://xml.comcast.com/location/services")
public class AssociateSingleViewAddress {

    @XmlElementRef(name = "AssociateSingleViewAddress", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<AssociateSingleViewAddressType> associateSingleViewAddress;

    /**
     * Gets the value of the associateSingleViewAddress property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AssociateSingleViewAddressType }{@code >}
     */
    public JAXBElement<AssociateSingleViewAddressType> getAssociateSingleViewAddress() {
        return associateSingleViewAddress;
    }

    /**
     * Sets the value of the associateSingleViewAddress property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AssociateSingleViewAddressType }{@code >}
     */
    public void setAssociateSingleViewAddress(JAXBElement<AssociateSingleViewAddressType> value) {
        this.associateSingleViewAddress = value;
    }

}
