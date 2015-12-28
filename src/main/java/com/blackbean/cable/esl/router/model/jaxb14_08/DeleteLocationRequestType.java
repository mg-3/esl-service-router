
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteLocationRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="DeleteLocationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeleteLocationRequests" type="{http://xml.blackbean.com/location/types}ArrayOfDeleteLocationRequestItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteLocationRequestType", propOrder = {
        "deleteLocationRequests"
})
public class DeleteLocationRequestType {

    @XmlElement(name = "DeleteLocationRequests", required = true)
    protected ArrayOfDeleteLocationRequestItemType deleteLocationRequests;

    /**
     * Gets the value of the deleteLocationRequests property.
     *
     * @return possible object is
     * {@link ArrayOfDeleteLocationRequestItemType }
     */
    public ArrayOfDeleteLocationRequestItemType getDeleteLocationRequests() {
        return deleteLocationRequests;
    }

    /**
     * Sets the value of the deleteLocationRequests property.
     *
     * @param value allowed object is
     *              {@link ArrayOfDeleteLocationRequestItemType }
     */
    public void setDeleteLocationRequests(ArrayOfDeleteLocationRequestItemType value) {
        this.deleteLocationRequests = value;
    }

}
