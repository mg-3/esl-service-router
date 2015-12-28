
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
 *         &lt;element name="associateSingleViewAddressReturn" type="{http://xml.blackbean.com/location/types}ResponseStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "associateSingleViewAddressReturn"
})
@XmlRootElement(name = "associateSingleViewAddressResponse", namespace = "http://xml.blackbean.com/location/services")
public class AssociateSingleViewAddressResponse {

    @XmlElementRef(name = "associateSingleViewAddressReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseStatusType> associateSingleViewAddressReturn;

    /**
     * Gets the value of the associateSingleViewAddressReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ResponseStatusType }{@code >}
     */
    public JAXBElement<ResponseStatusType> getAssociateSingleViewAddressReturn() {
        return associateSingleViewAddressReturn;
    }

    /**
     * Sets the value of the associateSingleViewAddressReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ResponseStatusType }{@code >}
     */
    public void setAssociateSingleViewAddressReturn(JAXBElement<ResponseStatusType> value) {
        this.associateSingleViewAddressReturn = value;
    }

}
