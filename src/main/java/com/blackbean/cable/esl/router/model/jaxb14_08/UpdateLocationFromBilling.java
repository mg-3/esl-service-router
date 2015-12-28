
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
 *         &lt;element name="UpdateLocationFromBilling" type="{http://xml.comcast.com/location/types}UpdateLocationFromBillingRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "updateLocationFromBilling"
})
@XmlRootElement(name = "updateLocationFromBilling", namespace = "http://xml.comcast.com/location/services")
public class UpdateLocationFromBilling {

    @XmlElementRef(name = "UpdateLocationFromBilling", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateLocationFromBillingRequestType> updateLocationFromBilling;

    /**
     * Gets the value of the updateLocationFromBilling property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link UpdateLocationFromBillingRequestType }{@code >}
     */
    public JAXBElement<UpdateLocationFromBillingRequestType> getUpdateLocationFromBilling() {
        return updateLocationFromBilling;
    }

    /**
     * Sets the value of the updateLocationFromBilling property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link UpdateLocationFromBillingRequestType }{@code >}
     */
    public void setUpdateLocationFromBilling(JAXBElement<UpdateLocationFromBillingRequestType> value) {
        this.updateLocationFromBilling = value;
    }

}
