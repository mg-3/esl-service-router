
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
 *         &lt;element name="GetLocationQueue" type="{http://xml.comcast.com/location/types}GetLocationQueueRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getLocationQueue"
})
@XmlRootElement(name = "getLocationQueue", namespace = "http://xml.comcast.com/location/services")
public class GetLocationQueue {

    @XmlElementRef(name = "GetLocationQueue", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetLocationQueueRequestType> getLocationQueue;

    /**
     * Gets the value of the getLocationQueue property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetLocationQueueRequestType }{@code >}
     */
    public JAXBElement<GetLocationQueueRequestType> getGetLocationQueue() {
        return getLocationQueue;
    }

    /**
     * Sets the value of the getLocationQueue property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetLocationQueueRequestType }{@code >}
     */
    public void setGetLocationQueue(JAXBElement<GetLocationQueueRequestType> value) {
        this.getLocationQueue = value;
    }

}