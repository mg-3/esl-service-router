
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
 *         &lt;element name="DeleteLocationFromBilling" type="{http://xml.comcast.com/location/types}DeleteLocationFromBillingRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deleteLocationFromBilling"
})
@XmlRootElement(name = "deleteLocationFromBilling", namespace = "http://xml.comcast.com/location/services")
public class DeleteLocationFromBilling {

    @XmlElementRef(name = "DeleteLocationFromBilling", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<DeleteLocationFromBillingRequestType> deleteLocationFromBilling;

    /**
     * Gets the value of the deleteLocationFromBilling property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DeleteLocationFromBillingRequestType }{@code >}
     */
    public JAXBElement<DeleteLocationFromBillingRequestType> getDeleteLocationFromBilling() {
        return deleteLocationFromBilling;
    }

    /**
     * Sets the value of the deleteLocationFromBilling property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DeleteLocationFromBillingRequestType }{@code >}
     */
    public void setDeleteLocationFromBilling(JAXBElement<DeleteLocationFromBillingRequestType> value) {
        this.deleteLocationFromBilling = value;
    }

}
