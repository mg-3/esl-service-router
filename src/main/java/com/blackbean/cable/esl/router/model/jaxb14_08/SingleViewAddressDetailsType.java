
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SingleViewAddressDetailsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="SingleViewAddressDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singleViewID" type="{http://xml.blackbean.com/location/types}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleViewAddressDetailsType", propOrder = {
        "singleViewID"
})
public class SingleViewAddressDetailsType {

    @XmlElementRef(name = "singleViewID", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfString> singleViewID;

    /**
     * Gets the value of the singleViewID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     */
    public JAXBElement<ArrayOfString> getSingleViewID() {
        return singleViewID;
    }

    /**
     * Sets the value of the singleViewID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     */
    public void setSingleViewID(JAXBElement<ArrayOfString> value) {
        this.singleViewID = value;
    }

}
