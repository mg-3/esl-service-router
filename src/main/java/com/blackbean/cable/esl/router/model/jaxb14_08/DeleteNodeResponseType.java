
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteNodeResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="DeleteNodeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeleteNodeResponses" type="{http://xml.blackbean.com/location/types}ArrayOfLocationMultiResponseMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteNodeResponseType", propOrder = {
        "deleteNodeResponses"
})
public class DeleteNodeResponseType {

    @XmlElement(name = "DeleteNodeResponses")
    protected ArrayOfLocationMultiResponseMessageType deleteNodeResponses;

    /**
     * Gets the value of the deleteNodeResponses property.
     *
     * @return possible object is
     * {@link ArrayOfLocationMultiResponseMessageType }
     */
    public ArrayOfLocationMultiResponseMessageType getDeleteNodeResponses() {
        return deleteNodeResponses;
    }

    /**
     * Sets the value of the deleteNodeResponses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationMultiResponseMessageType }
     */
    public void setDeleteNodeResponses(ArrayOfLocationMultiResponseMessageType value) {
        this.deleteNodeResponses = value;
    }

}
