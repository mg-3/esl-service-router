
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyNodeResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ModifyNodeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModifyNodeResponses" type="{http://xml.comcast.com/location/types}ArrayOfModifyNodeResponseItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyNodeResponseType", propOrder = {
        "modifyNodeResponses"
})
public class ModifyNodeResponseType {

    @XmlElement(name = "ModifyNodeResponses")
    protected ArrayOfModifyNodeResponseItemType modifyNodeResponses;

    /**
     * Gets the value of the modifyNodeResponses property.
     *
     * @return possible object is
     * {@link ArrayOfModifyNodeResponseItemType }
     */
    public ArrayOfModifyNodeResponseItemType getModifyNodeResponses() {
        return modifyNodeResponses;
    }

    /**
     * Sets the value of the modifyNodeResponses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfModifyNodeResponseItemType }
     */
    public void setModifyNodeResponses(ArrayOfModifyNodeResponseItemType value) {
        this.modifyNodeResponses = value;
    }

}
