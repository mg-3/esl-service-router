
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
 *         &lt;element name="UpdateLocationInBilling" type="{http://xml.blackbean.com/location/types}UpdateLocationInBillingRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "updateLocationInBilling"
})
@XmlRootElement(name = "updateLocationInBilling", namespace = "http://xml.blackbean.com/location/services")
public class UpdateLocationInBilling {

    @XmlElementRef(name = "UpdateLocationInBilling", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateLocationInBillingRequestType> updateLocationInBilling;

    /**
     * Gets the value of the updateLocationInBilling property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link UpdateLocationInBillingRequestType }{@code >}
     */
    public JAXBElement<UpdateLocationInBillingRequestType> getUpdateLocationInBilling() {
        return updateLocationInBilling;
    }

    /**
     * Sets the value of the updateLocationInBilling property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link UpdateLocationInBillingRequestType }{@code >}
     */
    public void setUpdateLocationInBilling(JAXBElement<UpdateLocationInBillingRequestType> value) {
        this.updateLocationInBilling = value;
    }

}
