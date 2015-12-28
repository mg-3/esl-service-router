
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
 *         &lt;element name="ModifyLocationQueue" type="{http://xml.comcast.com/location/types}ModifyLocationQueueRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "modifyLocationQueue"
})
@XmlRootElement(name = "modifyLocationQueue", namespace = "http://xml.comcast.com/location/services")
public class ModifyLocationQueue {

    @XmlElementRef(name = "ModifyLocationQueue", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ModifyLocationQueueRequestType> modifyLocationQueue;

    /**
     * Gets the value of the modifyLocationQueue property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ModifyLocationQueueRequestType }{@code >}
     */
    public JAXBElement<ModifyLocationQueueRequestType> getModifyLocationQueue() {
        return modifyLocationQueue;
    }

    /**
     * Sets the value of the modifyLocationQueue property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ModifyLocationQueueRequestType }{@code >}
     */
    public void setModifyLocationQueue(JAXBElement<ModifyLocationQueueRequestType> value) {
        this.modifyLocationQueue = value;
    }

}
