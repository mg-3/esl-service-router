
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardizeAddressRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="StandardizeAddressRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedAddresses" type="{http://xml.comcast.com/location/types}ArrayOfStandardizeAddressRequestedAddrType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardizeAddressRequestType", propOrder = {
        "requestedAddresses"
})
public class StandardizeAddressRequestType {

    @XmlElement(required = true)
    protected ArrayOfStandardizeAddressRequestedAddrType requestedAddresses;

    /**
     * Gets the value of the requestedAddresses property.
     *
     * @return possible object is
     * {@link ArrayOfStandardizeAddressRequestedAddrType }
     */
    public ArrayOfStandardizeAddressRequestedAddrType getRequestedAddresses() {
        return requestedAddresses;
    }

    /**
     * Sets the value of the requestedAddresses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfStandardizeAddressRequestedAddrType }
     */
    public void setRequestedAddresses(ArrayOfStandardizeAddressRequestedAddrType value) {
        this.requestedAddresses = value;
    }

}
