
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLocationInBillingRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="UpdateLocationInBillingRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdateLocationInBillingRequests" type="{http://xml.blackbean.com/location/types}ArrayOfUpdateLocationInBillingRequestItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLocationInBillingRequestType", propOrder = {
        "updateLocationInBillingRequests"
})
public class UpdateLocationInBillingRequestType {

    @XmlElement(name = "UpdateLocationInBillingRequests", required = true)
    protected ArrayOfUpdateLocationInBillingRequestItemType updateLocationInBillingRequests;

    /**
     * Gets the value of the updateLocationInBillingRequests property.
     *
     * @return possible object is
     * {@link ArrayOfUpdateLocationInBillingRequestItemType }
     */
    public ArrayOfUpdateLocationInBillingRequestItemType getUpdateLocationInBillingRequests() {
        return updateLocationInBillingRequests;
    }

    /**
     * Sets the value of the updateLocationInBillingRequests property.
     *
     * @param value allowed object is
     *              {@link ArrayOfUpdateLocationInBillingRequestItemType }
     */
    public void setUpdateLocationInBillingRequests(ArrayOfUpdateLocationInBillingRequestItemType value) {
        this.updateLocationInBillingRequests = value;
    }

}
