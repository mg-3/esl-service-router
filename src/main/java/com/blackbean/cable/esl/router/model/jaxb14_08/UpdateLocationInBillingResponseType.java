
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLocationInBillingResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="UpdateLocationInBillingResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdateLocationInBillingResponse" type="{http://xml.comcast.com/location/types}ArrayOfLocationMultiResponseMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLocationInBillingResponseType", propOrder = {
        "updateLocationInBillingResponse"
})
public class UpdateLocationInBillingResponseType {

    @XmlElement(name = "UpdateLocationInBillingResponse")
    protected ArrayOfLocationMultiResponseMessageType updateLocationInBillingResponse;

    /**
     * Gets the value of the updateLocationInBillingResponse property.
     *
     * @return possible object is
     * {@link ArrayOfLocationMultiResponseMessageType }
     */
    public ArrayOfLocationMultiResponseMessageType getUpdateLocationInBillingResponse() {
        return updateLocationInBillingResponse;
    }

    /**
     * Sets the value of the updateLocationInBillingResponse property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationMultiResponseMessageType }
     */
    public void setUpdateLocationInBillingResponse(ArrayOfLocationMultiResponseMessageType value) {
        this.updateLocationInBillingResponse = value;
    }

}
