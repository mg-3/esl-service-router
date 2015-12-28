
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LocationNetworkConnectivityType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationNetworkConnectivityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fiberNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="headendID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropLocation" type="{http://xml.blackbean.com/location/types}DropLocationType" minOccurs="0"/>
 *         &lt;element name="headendType" type="{http://xml.blackbean.com/location/types}HeadendVideoControllerSimpleType" minOccurs="0"/>
 *         &lt;element name="headendNetworkAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationNetworkConnectivityType", propOrder = {
        "fiberNodeName",
        "headendID",
        "dropLocation",
        "headendType",
        "headendNetworkAddress"
})
public class LocationNetworkConnectivityType {

    @XmlElementRef(name = "fiberNodeName", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fiberNodeName;
    @XmlElementRef(name = "headendID", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> headendID;
    @XmlElementRef(name = "dropLocation", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<DropLocationType> dropLocation;
    @XmlSchemaType(name = "string")
    protected HeadendVideoControllerSimpleType headendType;
    @XmlElementRef(name = "headendNetworkAddress", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> headendNetworkAddress;

    /**
     * Gets the value of the fiberNodeName property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getFiberNodeName() {
        return fiberNodeName;
    }

    /**
     * Sets the value of the fiberNodeName property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setFiberNodeName(JAXBElement<String> value) {
        this.fiberNodeName = value;
    }

    /**
     * Gets the value of the headendID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHeadendID() {
        return headendID;
    }

    /**
     * Sets the value of the headendID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHeadendID(JAXBElement<String> value) {
        this.headendID = value;
    }

    /**
     * Gets the value of the dropLocation property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DropLocationType }{@code >}
     */
    public JAXBElement<DropLocationType> getDropLocation() {
        return dropLocation;
    }

    /**
     * Sets the value of the dropLocation property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DropLocationType }{@code >}
     */
    public void setDropLocation(JAXBElement<DropLocationType> value) {
        this.dropLocation = value;
    }

    /**
     * Gets the value of the headendType property.
     *
     * @return possible object is
     * {@link HeadendVideoControllerSimpleType }
     */
    public HeadendVideoControllerSimpleType getHeadendType() {
        return headendType;
    }

    /**
     * Sets the value of the headendType property.
     *
     * @param value allowed object is
     *              {@link HeadendVideoControllerSimpleType }
     */
    public void setHeadendType(HeadendVideoControllerSimpleType value) {
        this.headendType = value;
    }

    /**
     * Gets the value of the headendNetworkAddress property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHeadendNetworkAddress() {
        return headendNetworkAddress;
    }

    /**
     * Sets the value of the headendNetworkAddress property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHeadendNetworkAddress(JAXBElement<String> value) {
        this.headendNetworkAddress = value;
    }

}
