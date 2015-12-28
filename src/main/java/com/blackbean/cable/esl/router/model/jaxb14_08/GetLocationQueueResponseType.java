
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLocationQueueResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetLocationQueueResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationQueue" type="{http://xml.blackbean.com/location/types}GetLocationQueueReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLocationQueueResponseType", propOrder = {
        "locationQueue"
})
public class GetLocationQueueResponseType {

    @XmlElement(required = true)
    protected GetLocationQueueReferenceType locationQueue;

    /**
     * Gets the value of the locationQueue property.
     *
     * @return possible object is
     * {@link GetLocationQueueReferenceType }
     */
    public GetLocationQueueReferenceType getLocationQueue() {
        return locationQueue;
    }

    /**
     * Sets the value of the locationQueue property.
     *
     * @param value allowed object is
     *              {@link GetLocationQueueReferenceType }
     */
    public void setLocationQueue(GetLocationQueueReferenceType value) {
        this.locationQueue = value;
    }

}
