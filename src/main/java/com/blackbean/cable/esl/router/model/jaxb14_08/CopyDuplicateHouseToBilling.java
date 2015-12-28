
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CopyDuplicateHouseToBilling" type="{http://xml.blackbean.com/location/types}CopyDuplicateHouseToBillingRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "copyDuplicateHouseToBilling"
})
@XmlRootElement(name = "copyDuplicateHouseToBilling", namespace = "http://xml.blackbean.com/location/services")
public class CopyDuplicateHouseToBilling {

    @XmlElementRef(name = "CopyDuplicateHouseToBilling", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<CopyDuplicateHouseToBillingRequestType> copyDuplicateHouseToBilling;

    /**
     * Gets the value of the copyDuplicateHouseToBilling property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link CopyDuplicateHouseToBillingRequestType }{@code >}
     */
    public JAXBElement<CopyDuplicateHouseToBillingRequestType> getCopyDuplicateHouseToBilling() {
        return copyDuplicateHouseToBilling;
    }

    /**
     * Sets the value of the copyDuplicateHouseToBilling property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link CopyDuplicateHouseToBillingRequestType }{@code >}
     */
    public void setCopyDuplicateHouseToBilling(JAXBElement<CopyDuplicateHouseToBillingRequestType> value) {
        this.copyDuplicateHouseToBilling = value;
    }

}
