
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CopyDuplicateHouseToBillingResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="CopyDuplicateHouseToBillingResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CopyDuplicateHouseToBillingResponses" type="{http://xml.blackbean.com/location/types}ArrayOfCopyDuplicateHouseToBillingResponseItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyDuplicateHouseToBillingResponseType", propOrder = {
        "copyDuplicateHouseToBillingResponses"
})
public class CopyDuplicateHouseToBillingResponseType {

    @XmlElement(name = "CopyDuplicateHouseToBillingResponses", required = true)
    protected ArrayOfCopyDuplicateHouseToBillingResponseItemType copyDuplicateHouseToBillingResponses;

    /**
     * Gets the value of the copyDuplicateHouseToBillingResponses property.
     *
     * @return possible object is
     * {@link ArrayOfCopyDuplicateHouseToBillingResponseItemType }
     */
    public ArrayOfCopyDuplicateHouseToBillingResponseItemType getCopyDuplicateHouseToBillingResponses() {
        return copyDuplicateHouseToBillingResponses;
    }

    /**
     * Sets the value of the copyDuplicateHouseToBillingResponses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfCopyDuplicateHouseToBillingResponseItemType }
     */
    public void setCopyDuplicateHouseToBillingResponses(ArrayOfCopyDuplicateHouseToBillingResponseItemType value) {
        this.copyDuplicateHouseToBillingResponses = value;
    }

}
