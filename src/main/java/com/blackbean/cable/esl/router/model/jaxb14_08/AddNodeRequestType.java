
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddNodeRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddNodeRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddNodeRequests" type="{http://xml.blackbean.com/location/types}ArrayOfAddNodeRequestItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddNodeRequestType", propOrder = {
        "addNodeRequests"
})
public class AddNodeRequestType {

    @XmlElement(name = "AddNodeRequests", required = true)
    protected ArrayOfAddNodeRequestItemType addNodeRequests;

    /**
     * Gets the value of the addNodeRequests property.
     *
     * @return possible object is
     * {@link ArrayOfAddNodeRequestItemType }
     */
    public ArrayOfAddNodeRequestItemType getAddNodeRequests() {
        return addNodeRequests;
    }

    /**
     * Sets the value of the addNodeRequests property.
     *
     * @param value allowed object is
     *              {@link ArrayOfAddNodeRequestItemType }
     */
    public void setAddNodeRequests(ArrayOfAddNodeRequestItemType value) {
        this.addNodeRequests = value;
    }

}
