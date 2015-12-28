
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
 *         &lt;element name="UpdateMsagPriority" type="{http://xml.blackbean.com/location/types}UpdateMsagPriorityRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "updateMsagPriority"
})
@XmlRootElement(name = "updateMsagPriority", namespace = "http://xml.blackbean.com/location/services")
public class UpdateMsagPriority {

    @XmlElementRef(name = "UpdateMsagPriority", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateMsagPriorityRequestType> updateMsagPriority;

    /**
     * Gets the value of the updateMsagPriority property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link UpdateMsagPriorityRequestType }{@code >}
     */
    public JAXBElement<UpdateMsagPriorityRequestType> getUpdateMsagPriority() {
        return updateMsagPriority;
    }

    /**
     * Sets the value of the updateMsagPriority property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link UpdateMsagPriorityRequestType }{@code >}
     */
    public void setUpdateMsagPriority(JAXBElement<UpdateMsagPriorityRequestType> value) {
        this.updateMsagPriority = value;
    }

}
