
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLocationQueueResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddLocationQueueResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddLocationQueueResponses" type="{http://xml.blackbean.com/location/types}ArrayOfAddLocationQueueResponseItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLocationQueueResponseType", propOrder = {
        "addLocationQueueResponses"
})
public class AddLocationQueueResponseType {

    @XmlElement(name = "AddLocationQueueResponses")
    protected ArrayOfAddLocationQueueResponseItemType addLocationQueueResponses;

    /**
     * Gets the value of the addLocationQueueResponses property.
     *
     * @return possible object is
     * {@link ArrayOfAddLocationQueueResponseItemType }
     */
    public ArrayOfAddLocationQueueResponseItemType getAddLocationQueueResponses() {
        return addLocationQueueResponses;
    }

    /**
     * Sets the value of the addLocationQueueResponses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfAddLocationQueueResponseItemType }
     */
    public void setAddLocationQueueResponses(ArrayOfAddLocationQueueResponseItemType value) {
        this.addLocationQueueResponses = value;
    }

}
