
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteLocationResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="DeleteLocationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeleteLocationResponses" type="{http://xml.blackbean.com/location/types}ArrayOfLocationMultiResponseMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteLocationResponseType", propOrder = {
        "deleteLocationResponses"
})
public class DeleteLocationResponseType {

    @XmlElement(name = "DeleteLocationResponses")
    protected ArrayOfLocationMultiResponseMessageType deleteLocationResponses;

    /**
     * Gets the value of the deleteLocationResponses property.
     *
     * @return possible object is
     * {@link ArrayOfLocationMultiResponseMessageType }
     */
    public ArrayOfLocationMultiResponseMessageType getDeleteLocationResponses() {
        return deleteLocationResponses;
    }

    /**
     * Sets the value of the deleteLocationResponses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationMultiResponseMessageType }
     */
    public void setDeleteLocationResponses(ArrayOfLocationMultiResponseMessageType value) {
        this.deleteLocationResponses = value;
    }

}
