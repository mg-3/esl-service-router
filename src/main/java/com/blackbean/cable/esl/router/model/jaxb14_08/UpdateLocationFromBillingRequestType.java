
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLocationFromBillingRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="UpdateLocationFromBillingRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdateLocationFromBillingRequests" type="{http://xml.comcast.com/location/types}ArrayOfUpdateLocationFromBillingRequestItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLocationFromBillingRequestType", propOrder = {
        "updateLocationFromBillingRequests"
})
public class UpdateLocationFromBillingRequestType {

    @XmlElement(name = "UpdateLocationFromBillingRequests", required = true)
    protected ArrayOfUpdateLocationFromBillingRequestItemType updateLocationFromBillingRequests;

    /**
     * Gets the value of the updateLocationFromBillingRequests property.
     *
     * @return possible object is
     * {@link ArrayOfUpdateLocationFromBillingRequestItemType }
     */
    public ArrayOfUpdateLocationFromBillingRequestItemType getUpdateLocationFromBillingRequests() {
        return updateLocationFromBillingRequests;
    }

    /**
     * Sets the value of the updateLocationFromBillingRequests property.
     *
     * @param value allowed object is
     *              {@link ArrayOfUpdateLocationFromBillingRequestItemType }
     */
    public void setUpdateLocationFromBillingRequests(ArrayOfUpdateLocationFromBillingRequestItemType value) {
        this.updateLocationFromBillingRequests = value;
    }

}
