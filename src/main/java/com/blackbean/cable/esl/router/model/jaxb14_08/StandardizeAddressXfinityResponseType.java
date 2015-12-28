
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardizeAddressXfinityResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="StandardizeAddressXfinityResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresses" type="{http://xml.blackbean.com/location/types}ArrayOfStandardizeAddressXfinityResponseItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardizeAddressXfinityResponseType", propOrder = {
        "addresses"
})
public class StandardizeAddressXfinityResponseType {

    @XmlElementRef(name = "addresses", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStandardizeAddressXfinityResponseItemType> addresses;

    /**
     * Gets the value of the addresses property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfStandardizeAddressXfinityResponseItemType }{@code >}
     */
    public JAXBElement<ArrayOfStandardizeAddressXfinityResponseItemType> getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfStandardizeAddressXfinityResponseItemType }{@code >}
     */
    public void setAddresses(JAXBElement<ArrayOfStandardizeAddressXfinityResponseItemType> value) {
        this.addresses = value;
    }

}
