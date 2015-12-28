
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for BusinessServiceabilityType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="BusinessServiceabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceabilityFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Transport" type="{http://xml.blackbean.com/location/types}TransportType" minOccurs="0"/>
 *         &lt;element name="SupportedProducts" type="{http://xml.blackbean.com/location/types}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{http://xml.blackbean.com/location/types}BusinessServiceabilityAttributesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessServiceabilityType", propOrder = {
        "serviceabilityFlag",
        "transport",
        "supportedProducts",
        "attributes"
})
public class BusinessServiceabilityType {

    @XmlElement(name = "ServiceabilityFlag")
    protected boolean serviceabilityFlag;
    @XmlElementRef(name = "Transport", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<TransportType> transport;
    @XmlElementRef(name = "SupportedProducts", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfString> supportedProducts;
    @XmlElementRef(name = "Attributes", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<BusinessServiceabilityAttributesType> attributes;

    /**
     * Gets the value of the serviceabilityFlag property.
     */
    public boolean isServiceabilityFlag() {
        return serviceabilityFlag;
    }

    /**
     * Sets the value of the serviceabilityFlag property.
     */
    public void setServiceabilityFlag(boolean value) {
        this.serviceabilityFlag = value;
    }

    /**
     * Gets the value of the transport property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link TransportType }{@code >}
     */
    public JAXBElement<TransportType> getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link TransportType }{@code >}
     */
    public void setTransport(JAXBElement<TransportType> value) {
        this.transport = value;
    }

    /**
     * Gets the value of the supportedProducts property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     */
    public JAXBElement<ArrayOfString> getSupportedProducts() {
        return supportedProducts;
    }

    /**
     * Sets the value of the supportedProducts property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     */
    public void setSupportedProducts(JAXBElement<ArrayOfString> value) {
        this.supportedProducts = value;
    }

    /**
     * Gets the value of the attributes property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BusinessServiceabilityAttributesType }{@code >}
     */
    public JAXBElement<BusinessServiceabilityAttributesType> getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BusinessServiceabilityAttributesType }{@code >}
     */
    public void setAttributes(JAXBElement<BusinessServiceabilityAttributesType> value) {
        this.attributes = value;
    }

}
