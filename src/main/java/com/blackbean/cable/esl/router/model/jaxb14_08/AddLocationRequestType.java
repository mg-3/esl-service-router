
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLocationRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddLocationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddLocationRequests" type="{http://xml.blackbean.com/location/types}ArrayOfAddLocationRequestItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLocationRequestType", propOrder = {
        "addLocationRequests"
})
public class AddLocationRequestType {

    @XmlElement(name = "AddLocationRequests", required = true)
    protected ArrayOfAddLocationRequestItemType addLocationRequests;

    /**
     * Gets the value of the addLocationRequests property.
     *
     * @return possible object is
     * {@link ArrayOfAddLocationRequestItemType }
     */
    public ArrayOfAddLocationRequestItemType getAddLocationRequests() {
        return addLocationRequests;
    }

    /**
     * Sets the value of the addLocationRequests property.
     *
     * @param value allowed object is
     *              {@link ArrayOfAddLocationRequestItemType }
     */
    public void setAddLocationRequests(ArrayOfAddLocationRequestItemType value) {
        this.addLocationRequests = value;
    }

}
