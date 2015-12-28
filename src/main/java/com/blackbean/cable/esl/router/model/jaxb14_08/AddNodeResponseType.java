
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddNodeResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddNodeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddNodeResponses" type="{http://xml.comcast.com/location/types}ArrayOfAddNodeResponseItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddNodeResponseType", propOrder = {
        "addNodeResponses"
})
public class AddNodeResponseType {

    @XmlElement(name = "AddNodeResponses")
    protected ArrayOfAddNodeResponseItemType addNodeResponses;

    /**
     * Gets the value of the addNodeResponses property.
     *
     * @return possible object is
     * {@link ArrayOfAddNodeResponseItemType }
     */
    public ArrayOfAddNodeResponseItemType getAddNodeResponses() {
        return addNodeResponses;
    }

    /**
     * Sets the value of the addNodeResponses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfAddNodeResponseItemType }
     */
    public void setAddNodeResponses(ArrayOfAddNodeResponseItemType value) {
        this.addNodeResponses = value;
    }

}
