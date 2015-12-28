
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationLegacyDetailsCSGBridgerType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationLegacyDetailsCSGBridgerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bridgerBidirectional" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bridgerGateControl" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bridgerPrivate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationLegacyDetailsCSGBridgerType", propOrder = {
        "bridgerBidirectional",
        "bridgerGateControl",
        "bridgerPrivate"
})
public class LocationLegacyDetailsCSGBridgerType {

    @XmlElementRef(name = "bridgerBidirectional", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bridgerBidirectional;
    @XmlElementRef(name = "bridgerGateControl", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bridgerGateControl;
    @XmlElementRef(name = "bridgerPrivate", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bridgerPrivate;

    /**
     * Gets the value of the bridgerBidirectional property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getBridgerBidirectional() {
        return bridgerBidirectional;
    }

    /**
     * Sets the value of the bridgerBidirectional property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setBridgerBidirectional(JAXBElement<String> value) {
        this.bridgerBidirectional = value;
    }

    /**
     * Gets the value of the bridgerGateControl property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getBridgerGateControl() {
        return bridgerGateControl;
    }

    /**
     * Sets the value of the bridgerGateControl property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setBridgerGateControl(JAXBElement<String> value) {
        this.bridgerGateControl = value;
    }

    /**
     * Gets the value of the bridgerPrivate property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getBridgerPrivate() {
        return bridgerPrivate;
    }

    /**
     * Sets the value of the bridgerPrivate property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setBridgerPrivate(JAXBElement<String> value) {
        this.bridgerPrivate = value;
    }

}
