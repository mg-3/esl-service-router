
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
 *         &lt;element name="AddLocationQueue" type="{http://xml.comcast.com/location/types}AddLocationQueueRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "addLocationQueue"
})
@XmlRootElement(name = "addLocationQueue", namespace = "http://xml.comcast.com/location/services")
public class AddLocationQueue {

    @XmlElementRef(name = "AddLocationQueue", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<AddLocationQueueRequestType> addLocationQueue;

    /**
     * Gets the value of the addLocationQueue property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AddLocationQueueRequestType }{@code >}
     */
    public JAXBElement<AddLocationQueueRequestType> getAddLocationQueue() {
        return addLocationQueue;
    }

    /**
     * Sets the value of the addLocationQueue property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AddLocationQueueRequestType }{@code >}
     */
    public void setAddLocationQueue(JAXBElement<AddLocationQueueRequestType> value) {
        this.addLocationQueue = value;
    }

}
