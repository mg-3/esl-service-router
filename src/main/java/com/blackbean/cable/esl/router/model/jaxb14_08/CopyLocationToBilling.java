
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
 *         &lt;element name="CopyLocationToBilling" type="{http://xml.blackbean.com/location/types}CopyLocationToBillingRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "copyLocationToBilling"
})
@XmlRootElement(name = "copyLocationToBilling", namespace = "http://xml.blackbean.com/location/services")
public class CopyLocationToBilling {

    @XmlElementRef(name = "CopyLocationToBilling", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<CopyLocationToBillingRequestType> copyLocationToBilling;

    /**
     * Gets the value of the copyLocationToBilling property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link CopyLocationToBillingRequestType }{@code >}
     */
    public JAXBElement<CopyLocationToBillingRequestType> getCopyLocationToBilling() {
        return copyLocationToBilling;
    }

    /**
     * Sets the value of the copyLocationToBilling property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link CopyLocationToBillingRequestType }{@code >}
     */
    public void setCopyLocationToBilling(JAXBElement<CopyLocationToBillingRequestType> value) {
        this.copyLocationToBilling = value;
    }

}
