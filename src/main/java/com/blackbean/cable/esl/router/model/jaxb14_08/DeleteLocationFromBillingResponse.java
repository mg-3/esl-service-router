
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
 *         &lt;element name="deleteLocationFromBillingReturn" type="{http://xml.comcast.com/location/types}DeleteLocationFromBillingResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deleteLocationFromBillingReturn"
})
@XmlRootElement(name = "deleteLocationFromBillingResponse", namespace = "http://xml.comcast.com/location/services")
public class DeleteLocationFromBillingResponse {

    @XmlElementRef(name = "deleteLocationFromBillingReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<DeleteLocationFromBillingResponseType> deleteLocationFromBillingReturn;

    /**
     * Gets the value of the deleteLocationFromBillingReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DeleteLocationFromBillingResponseType }{@code >}
     */
    public JAXBElement<DeleteLocationFromBillingResponseType> getDeleteLocationFromBillingReturn() {
        return deleteLocationFromBillingReturn;
    }

    /**
     * Sets the value of the deleteLocationFromBillingReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DeleteLocationFromBillingResponseType }{@code >}
     */
    public void setDeleteLocationFromBillingReturn(JAXBElement<DeleteLocationFromBillingResponseType> value) {
        this.deleteLocationFromBillingReturn = value;
    }

}
