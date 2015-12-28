
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CopyDuplicateHouseToBillingRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="CopyDuplicateHouseToBillingRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CopyDuplicateHouseToBillingRequests" type="{http://xml.blackbean.com/location/types}ArrayOfCopyDuplicateHouseToBillingRequestItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyDuplicateHouseToBillingRequestType", propOrder = {
        "copyDuplicateHouseToBillingRequests"
})
public class CopyDuplicateHouseToBillingRequestType {

    @XmlElement(name = "CopyDuplicateHouseToBillingRequests", required = true)
    protected ArrayOfCopyDuplicateHouseToBillingRequestItemType copyDuplicateHouseToBillingRequests;

    /**
     * Gets the value of the copyDuplicateHouseToBillingRequests property.
     *
     * @return possible object is
     * {@link ArrayOfCopyDuplicateHouseToBillingRequestItemType }
     */
    public ArrayOfCopyDuplicateHouseToBillingRequestItemType getCopyDuplicateHouseToBillingRequests() {
        return copyDuplicateHouseToBillingRequests;
    }

    /**
     * Sets the value of the copyDuplicateHouseToBillingRequests property.
     *
     * @param value allowed object is
     *              {@link ArrayOfCopyDuplicateHouseToBillingRequestItemType }
     */
    public void setCopyDuplicateHouseToBillingRequests(ArrayOfCopyDuplicateHouseToBillingRequestItemType value) {
        this.copyDuplicateHouseToBillingRequests = value;
    }

}
