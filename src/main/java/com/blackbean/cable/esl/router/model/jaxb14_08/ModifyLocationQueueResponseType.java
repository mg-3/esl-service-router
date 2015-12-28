
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyLocationQueueResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ModifyLocationQueueResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModifyLocationQueueResponses" type="{http://xml.blackbean.com/location/types}ArrayOfModifyLocationQueueResponseItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyLocationQueueResponseType", propOrder = {
        "modifyLocationQueueResponses"
})
public class ModifyLocationQueueResponseType {

    @XmlElement(name = "ModifyLocationQueueResponses")
    protected ArrayOfModifyLocationQueueResponseItemType modifyLocationQueueResponses;

    /**
     * Gets the value of the modifyLocationQueueResponses property.
     *
     * @return possible object is
     * {@link ArrayOfModifyLocationQueueResponseItemType }
     */
    public ArrayOfModifyLocationQueueResponseItemType getModifyLocationQueueResponses() {
        return modifyLocationQueueResponses;
    }

    /**
     * Sets the value of the modifyLocationQueueResponses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfModifyLocationQueueResponseItemType }
     */
    public void setModifyLocationQueueResponses(ArrayOfModifyLocationQueueResponseItemType value) {
        this.modifyLocationQueueResponses = value;
    }

}
