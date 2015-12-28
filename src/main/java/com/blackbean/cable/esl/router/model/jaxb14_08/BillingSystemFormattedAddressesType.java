
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingSystemFormattedAddressesType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="BillingSystemFormattedAddressesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="csgFormattedAddress" type="{http://xml.blackbean.com/location/types}BillingSystemFormattedAddressesCSGType" minOccurs="0"/>
 *         &lt;element name="ddpFormattedAddress" type="{http://xml.blackbean.com/location/types}BillingSystemFormattedAddressesDDPType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingSystemFormattedAddressesType", propOrder = {
        "csgFormattedAddress",
        "ddpFormattedAddress"
})
public class BillingSystemFormattedAddressesType {

    @XmlElementRef(name = "csgFormattedAddress", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<BillingSystemFormattedAddressesCSGType> csgFormattedAddress;
    @XmlElementRef(name = "ddpFormattedAddress", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<BillingSystemFormattedAddressesDDPType> ddpFormattedAddress;

    /**
     * Gets the value of the csgFormattedAddress property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BillingSystemFormattedAddressesCSGType }{@code >}
     */
    public JAXBElement<BillingSystemFormattedAddressesCSGType> getCsgFormattedAddress() {
        return csgFormattedAddress;
    }

    /**
     * Sets the value of the csgFormattedAddress property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BillingSystemFormattedAddressesCSGType }{@code >}
     */
    public void setCsgFormattedAddress(JAXBElement<BillingSystemFormattedAddressesCSGType> value) {
        this.csgFormattedAddress = value;
    }

    /**
     * Gets the value of the ddpFormattedAddress property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BillingSystemFormattedAddressesDDPType }{@code >}
     */
    public JAXBElement<BillingSystemFormattedAddressesDDPType> getDdpFormattedAddress() {
        return ddpFormattedAddress;
    }

    /**
     * Sets the value of the ddpFormattedAddress property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BillingSystemFormattedAddressesDDPType }{@code >}
     */
    public void setDdpFormattedAddress(JAXBElement<BillingSystemFormattedAddressesDDPType> value) {
        this.ddpFormattedAddress = value;
    }

}
