
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteLocationFromBillingResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="DeleteLocationFromBillingResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeleteLocationFromBillingResponses" type="{http://xml.comcast.com/location/types}ArrayOfLocationMultiResponseMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteLocationFromBillingResponseType", propOrder = {
        "deleteLocationFromBillingResponses"
})
public class DeleteLocationFromBillingResponseType {

    @XmlElement(name = "DeleteLocationFromBillingResponses")
    protected ArrayOfLocationMultiResponseMessageType deleteLocationFromBillingResponses;

    /**
     * Gets the value of the deleteLocationFromBillingResponses property.
     *
     * @return possible object is
     * {@link ArrayOfLocationMultiResponseMessageType }
     */
    public ArrayOfLocationMultiResponseMessageType getDeleteLocationFromBillingResponses() {
        return deleteLocationFromBillingResponses;
    }

    /**
     * Sets the value of the deleteLocationFromBillingResponses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationMultiResponseMessageType }
     */
    public void setDeleteLocationFromBillingResponses(ArrayOfLocationMultiResponseMessageType value) {
        this.deleteLocationFromBillingResponses = value;
    }

}
