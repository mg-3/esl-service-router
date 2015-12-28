
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
 *         &lt;element name="updateLocationInBillingReturn" type="{http://xml.blackbean.com/location/types}UpdateLocationInBillingResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "updateLocationInBillingReturn"
})
@XmlRootElement(name = "updateLocationInBillingResponse", namespace = "http://xml.blackbean.com/location/services")
public class UpdateLocationInBillingResponse {

    @XmlElementRef(name = "updateLocationInBillingReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateLocationInBillingResponseType> updateLocationInBillingReturn;

    /**
     * Gets the value of the updateLocationInBillingReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link UpdateLocationInBillingResponseType }{@code >}
     */
    public JAXBElement<UpdateLocationInBillingResponseType> getUpdateLocationInBillingReturn() {
        return updateLocationInBillingReturn;
    }

    /**
     * Sets the value of the updateLocationInBillingReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link UpdateLocationInBillingResponseType }{@code >}
     */
    public void setUpdateLocationInBillingReturn(JAXBElement<UpdateLocationInBillingResponseType> value) {
        this.updateLocationInBillingReturn = value;
    }

}
