
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBillingSystemFormattedAddressResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetBillingSystemFormattedAddressResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingSystemFormattedAddresses" type="{http://xml.blackbean.com/location/types}ArrayOfBillingSystemFormattedAddressesType" minOccurs="0"/>
 *         &lt;element name="responseStatus" type="{http://xml.blackbean.com/location/types}ResponseStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBillingSystemFormattedAddressResponseType", propOrder = {
        "billingSystemFormattedAddresses",
        "responseStatus"
})
public class GetBillingSystemFormattedAddressResponseType {

    protected ArrayOfBillingSystemFormattedAddressesType billingSystemFormattedAddresses;
    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;

    /**
     * Gets the value of the billingSystemFormattedAddresses property.
     *
     * @return possible object is
     * {@link ArrayOfBillingSystemFormattedAddressesType }
     */
    public ArrayOfBillingSystemFormattedAddressesType getBillingSystemFormattedAddresses() {
        return billingSystemFormattedAddresses;
    }

    /**
     * Sets the value of the billingSystemFormattedAddresses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfBillingSystemFormattedAddressesType }
     */
    public void setBillingSystemFormattedAddresses(ArrayOfBillingSystemFormattedAddressesType value) {
        this.billingSystemFormattedAddresses = value;
    }

    /**
     * Gets the value of the responseStatus property.
     *
     * @return possible object is
     * {@link ResponseStatusType }
     */
    public ResponseStatusType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     *
     * @param value allowed object is
     *              {@link ResponseStatusType }
     */
    public void setResponseStatus(ResponseStatusType value) {
        this.responseStatus = value;
    }

}
