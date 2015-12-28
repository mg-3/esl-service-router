
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyLocationQueueRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ModifyLocationQueueRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModifyLocationQueueRequests" type="{http://xml.blackbean.com/location/types}ArrayOfModifyLocationQueueRequestItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyLocationQueueRequestType", propOrder = {
        "modifyLocationQueueRequests"
})
public class ModifyLocationQueueRequestType {

    @XmlElementRef(name = "ModifyLocationQueueRequests", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfModifyLocationQueueRequestItemType> modifyLocationQueueRequests;

    /**
     * Gets the value of the modifyLocationQueueRequests property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfModifyLocationQueueRequestItemType }{@code >}
     */
    public JAXBElement<ArrayOfModifyLocationQueueRequestItemType> getModifyLocationQueueRequests() {
        return modifyLocationQueueRequests;
    }

    /**
     * Sets the value of the modifyLocationQueueRequests property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfModifyLocationQueueRequestItemType }{@code >}
     */
    public void setModifyLocationQueueRequests(JAXBElement<ArrayOfModifyLocationQueueRequestItemType> value) {
        this.modifyLocationQueueRequests = value;
    }

}
