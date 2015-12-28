
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteLocationFromBillingRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="DeleteLocationFromBillingRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeleteLocationFromBillingRequest" type="{http://xml.comcast.com/location/types}ArrayOfDeleteLocationFromBillingRequestItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteLocationFromBillingRequestType", propOrder = {
        "deleteLocationFromBillingRequest"
})
public class DeleteLocationFromBillingRequestType {

    @XmlElement(name = "DeleteLocationFromBillingRequest", required = true)
    protected ArrayOfDeleteLocationFromBillingRequestItemType deleteLocationFromBillingRequest;

    /**
     * Gets the value of the deleteLocationFromBillingRequest property.
     *
     * @return possible object is
     * {@link ArrayOfDeleteLocationFromBillingRequestItemType }
     */
    public ArrayOfDeleteLocationFromBillingRequestItemType getDeleteLocationFromBillingRequest() {
        return deleteLocationFromBillingRequest;
    }

    /**
     * Sets the value of the deleteLocationFromBillingRequest property.
     *
     * @param value allowed object is
     *              {@link ArrayOfDeleteLocationFromBillingRequestItemType }
     */
    public void setDeleteLocationFromBillingRequest(ArrayOfDeleteLocationFromBillingRequestItemType value) {
        this.deleteLocationFromBillingRequest = value;
    }

}
