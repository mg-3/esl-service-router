
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for BusinessServiceabilityRequestItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="BusinessServiceabilityRequestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ASOGAddress" type="{http://xml.comcast.com/location/types}ASOGAddressType" minOccurs="0"/>
 *         &lt;element name="USPSAddress" type="{http://xml.comcast.com/location/types}USPSAddressInputType" minOccurs="0"/>
 *         &lt;element name="Transport" type="{http://xml.comcast.com/location/types}TransportType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessServiceabilityRequestItemType", propOrder = {
        "asogAddress",
        "uspsAddress",
        "transport"
})
public class BusinessServiceabilityRequestItemType {

    @XmlElement(name = "ASOGAddress")
    protected ASOGAddressType asogAddress;
    @XmlElement(name = "USPSAddress")
    protected USPSAddressInputType uspsAddress;
    @XmlElement(name = "Transport")
    @XmlSchemaType(name = "string")
    protected TransportType transport;

    /**
     * Gets the value of the asogAddress property.
     *
     * @return possible object is
     * {@link ASOGAddressType }
     */
    public ASOGAddressType getASOGAddress() {
        return asogAddress;
    }

    /**
     * Sets the value of the asogAddress property.
     *
     * @param value allowed object is
     *              {@link ASOGAddressType }
     */
    public void setASOGAddress(ASOGAddressType value) {
        this.asogAddress = value;
    }

    /**
     * Gets the value of the uspsAddress property.
     *
     * @return possible object is
     * {@link USPSAddressInputType }
     */
    public USPSAddressInputType getUSPSAddress() {
        return uspsAddress;
    }

    /**
     * Sets the value of the uspsAddress property.
     *
     * @param value allowed object is
     *              {@link USPSAddressInputType }
     */
    public void setUSPSAddress(USPSAddressInputType value) {
        this.uspsAddress = value;
    }

    /**
     * Gets the value of the transport property.
     *
     * @return possible object is
     * {@link TransportType }
     */
    public TransportType getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     *
     * @param value allowed object is
     *              {@link TransportType }
     */
    public void setTransport(TransportType value) {
        this.transport = value;
    }

}
