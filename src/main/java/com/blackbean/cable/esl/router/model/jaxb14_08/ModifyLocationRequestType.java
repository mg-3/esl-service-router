
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyLocationRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ModifyLocationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModifyLocationRequests" type="{http://xml.comcast.com/location/types}ArrayOfModifyLocationRequestItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyLocationRequestType", propOrder = {
        "modifyLocationRequests"
})
public class ModifyLocationRequestType {

    @XmlElement(name = "ModifyLocationRequests", required = true)
    protected ArrayOfModifyLocationRequestItemType modifyLocationRequests;

    /**
     * Gets the value of the modifyLocationRequests property.
     *
     * @return possible object is
     * {@link ArrayOfModifyLocationRequestItemType }
     */
    public ArrayOfModifyLocationRequestItemType getModifyLocationRequests() {
        return modifyLocationRequests;
    }

    /**
     * Sets the value of the modifyLocationRequests property.
     *
     * @param value allowed object is
     *              {@link ArrayOfModifyLocationRequestItemType }
     */
    public void setModifyLocationRequests(ArrayOfModifyLocationRequestItemType value) {
        this.modifyLocationRequests = value;
    }

}
