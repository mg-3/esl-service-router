
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLocationQueueRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddLocationQueueRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddLocationQueueRequests" type="{http://xml.comcast.com/location/types}ArrayOfAddLocationQueueRequestItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLocationQueueRequestType", propOrder = {
        "addLocationQueueRequests"
})
public class AddLocationQueueRequestType {

    @XmlElement(name = "AddLocationQueueRequests", required = true)
    protected ArrayOfAddLocationQueueRequestItemType addLocationQueueRequests;

    /**
     * Gets the value of the addLocationQueueRequests property.
     *
     * @return possible object is
     * {@link ArrayOfAddLocationQueueRequestItemType }
     */
    public ArrayOfAddLocationQueueRequestItemType getAddLocationQueueRequests() {
        return addLocationQueueRequests;
    }

    /**
     * Sets the value of the addLocationQueueRequests property.
     *
     * @param value allowed object is
     *              {@link ArrayOfAddLocationQueueRequestItemType }
     */
    public void setAddLocationQueueRequests(ArrayOfAddLocationQueueRequestItemType value) {
        this.addLocationQueueRequests = value;
    }

}
