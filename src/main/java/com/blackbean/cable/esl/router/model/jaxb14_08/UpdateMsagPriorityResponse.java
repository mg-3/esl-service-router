
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
 *         &lt;element name="updateMsagPriorityReturn" type="{http://xml.comcast.com/location/types}UpdateMsagPriorityResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "updateMsagPriorityReturn"
})
@XmlRootElement(name = "updateMsagPriorityResponse", namespace = "http://xml.comcast.com/location/services")
public class UpdateMsagPriorityResponse {

    @XmlElementRef(name = "updateMsagPriorityReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateMsagPriorityResponseType> updateMsagPriorityReturn;

    /**
     * Gets the value of the updateMsagPriorityReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link UpdateMsagPriorityResponseType }{@code >}
     */
    public JAXBElement<UpdateMsagPriorityResponseType> getUpdateMsagPriorityReturn() {
        return updateMsagPriorityReturn;
    }

    /**
     * Sets the value of the updateMsagPriorityReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link UpdateMsagPriorityResponseType }{@code >}
     */
    public void setUpdateMsagPriorityReturn(JAXBElement<UpdateMsagPriorityResponseType> value) {
        this.updateMsagPriorityReturn = value;
    }

}
