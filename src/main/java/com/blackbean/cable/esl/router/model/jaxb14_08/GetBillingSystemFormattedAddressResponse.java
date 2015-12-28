
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
 *         &lt;element name="getBillingSystemFormattedAddressReturn" type="{http://xml.blackbean.com/location/types}GetBillingSystemFormattedAddressResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getBillingSystemFormattedAddressReturn"
})
@XmlRootElement(name = "getBillingSystemFormattedAddressResponse", namespace = "http://xml.blackbean.com/location/services")
public class GetBillingSystemFormattedAddressResponse {

    @XmlElementRef(name = "getBillingSystemFormattedAddressReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetBillingSystemFormattedAddressResponseType> getBillingSystemFormattedAddressReturn;

    /**
     * Gets the value of the getBillingSystemFormattedAddressReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetBillingSystemFormattedAddressResponseType }{@code >}
     */
    public JAXBElement<GetBillingSystemFormattedAddressResponseType> getGetBillingSystemFormattedAddressReturn() {
        return getBillingSystemFormattedAddressReturn;
    }

    /**
     * Sets the value of the getBillingSystemFormattedAddressReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetBillingSystemFormattedAddressResponseType }{@code >}
     */
    public void setGetBillingSystemFormattedAddressReturn(JAXBElement<GetBillingSystemFormattedAddressResponseType> value) {
        this.getBillingSystemFormattedAddressReturn = value;
    }

}
