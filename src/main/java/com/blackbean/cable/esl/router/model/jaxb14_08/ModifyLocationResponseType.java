
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyLocationResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ModifyLocationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModifyLocationResponses" type="{http://xml.blackbean.com/location/types}ArrayOfModifyLocationResponseItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyLocationResponseType", propOrder = {
        "modifyLocationResponses"
})
public class ModifyLocationResponseType {

    @XmlElement(name = "ModifyLocationResponses")
    protected ArrayOfModifyLocationResponseItemType modifyLocationResponses;

    /**
     * Gets the value of the modifyLocationResponses property.
     *
     * @return possible object is
     * {@link ArrayOfModifyLocationResponseItemType }
     */
    public ArrayOfModifyLocationResponseItemType getModifyLocationResponses() {
        return modifyLocationResponses;
    }

    /**
     * Sets the value of the modifyLocationResponses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfModifyLocationResponseItemType }
     */
    public void setModifyLocationResponses(ArrayOfModifyLocationResponseItemType value) {
        this.modifyLocationResponses = value;
    }

}
