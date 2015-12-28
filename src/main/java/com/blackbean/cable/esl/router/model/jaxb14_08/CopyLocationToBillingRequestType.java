
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CopyLocationToBillingRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="CopyLocationToBillingRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CopyLocationToBillingRequests" type="{http://xml.blackbean.com/location/types}ArrayOfCopyLocationToBillingRequestItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyLocationToBillingRequestType", propOrder = {
        "copyLocationToBillingRequests"
})
public class CopyLocationToBillingRequestType {

    @XmlElement(name = "CopyLocationToBillingRequests", required = true)
    protected ArrayOfCopyLocationToBillingRequestItemType copyLocationToBillingRequests;

    /**
     * Gets the value of the copyLocationToBillingRequests property.
     *
     * @return possible object is
     * {@link ArrayOfCopyLocationToBillingRequestItemType }
     */
    public ArrayOfCopyLocationToBillingRequestItemType getCopyLocationToBillingRequests() {
        return copyLocationToBillingRequests;
    }

    /**
     * Sets the value of the copyLocationToBillingRequests property.
     *
     * @param value allowed object is
     *              {@link ArrayOfCopyLocationToBillingRequestItemType }
     */
    public void setCopyLocationToBillingRequests(ArrayOfCopyLocationToBillingRequestItemType value) {
        this.copyLocationToBillingRequests = value;
    }

}
