
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
 *         &lt;element name="GetBillingSystemFormattedAddress" type="{http://xml.comcast.com/location/types}GetBillingSystemFormattedAddressRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getBillingSystemFormattedAddress"
})
@XmlRootElement(name = "getBillingSystemFormattedAddress", namespace = "http://xml.comcast.com/location/services")
public class GetBillingSystemFormattedAddress {

    @XmlElementRef(name = "GetBillingSystemFormattedAddress", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetBillingSystemFormattedAddressRequestType> getBillingSystemFormattedAddress;

    /**
     * Gets the value of the getBillingSystemFormattedAddress property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetBillingSystemFormattedAddressRequestType }{@code >}
     */
    public JAXBElement<GetBillingSystemFormattedAddressRequestType> getGetBillingSystemFormattedAddress() {
        return getBillingSystemFormattedAddress;
    }

    /**
     * Sets the value of the getBillingSystemFormattedAddress property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetBillingSystemFormattedAddressRequestType }{@code >}
     */
    public void setGetBillingSystemFormattedAddress(JAXBElement<GetBillingSystemFormattedAddressRequestType> value) {
        this.getBillingSystemFormattedAddress = value;
    }

}
