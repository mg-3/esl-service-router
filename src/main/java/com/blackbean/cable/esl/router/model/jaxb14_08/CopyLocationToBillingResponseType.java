
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CopyLocationToBillingResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="CopyLocationToBillingResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CopyLocationToBillingResponses" type="{http://xml.blackbean.com/location/types}ArrayOfCopyLocationToBillingResponseItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyLocationToBillingResponseType", propOrder = {
        "copyLocationToBillingResponses"
})
public class CopyLocationToBillingResponseType {

    @XmlElement(name = "CopyLocationToBillingResponses")
    protected ArrayOfCopyLocationToBillingResponseItemType copyLocationToBillingResponses;

    /**
     * Gets the value of the copyLocationToBillingResponses property.
     *
     * @return possible object is
     * {@link ArrayOfCopyLocationToBillingResponseItemType }
     */
    public ArrayOfCopyLocationToBillingResponseItemType getCopyLocationToBillingResponses() {
        return copyLocationToBillingResponses;
    }

    /**
     * Sets the value of the copyLocationToBillingResponses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfCopyLocationToBillingResponseItemType }
     */
    public void setCopyLocationToBillingResponses(ArrayOfCopyLocationToBillingResponseItemType value) {
        this.copyLocationToBillingResponses = value;
    }

}
