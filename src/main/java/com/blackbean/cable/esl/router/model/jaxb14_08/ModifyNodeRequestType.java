
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyNodeRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ModifyNodeRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModifyNodeRequests" type="{http://xml.blackbean.com/location/types}ArrayOfModifyNodeRequestItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyNodeRequestType", propOrder = {
        "modifyNodeRequests"
})
public class ModifyNodeRequestType {

    @XmlElement(name = "ModifyNodeRequests", required = true)
    protected ArrayOfModifyNodeRequestItemType modifyNodeRequests;

    /**
     * Gets the value of the modifyNodeRequests property.
     *
     * @return possible object is
     * {@link ArrayOfModifyNodeRequestItemType }
     */
    public ArrayOfModifyNodeRequestItemType getModifyNodeRequests() {
        return modifyNodeRequests;
    }

    /**
     * Sets the value of the modifyNodeRequests property.
     *
     * @param value allowed object is
     *              {@link ArrayOfModifyNodeRequestItemType }
     */
    public void setModifyNodeRequests(ArrayOfModifyNodeRequestItemType value) {
        this.modifyNodeRequests = value;
    }

}
