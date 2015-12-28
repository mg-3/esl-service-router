
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LocationLegacyDetailsCSGLineOfBusinessType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationLegacyDetailsCSGLineOfBusinessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lobType" type="{http://xml.blackbean.com/location/types}LOBTypesType" minOccurs="0"/>
 *         &lt;element name="lobServiceStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="projectServiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="installedOutlets" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *               &lt;pattern value="\d|\d\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="node" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="headend" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="router" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="networkInterfaceUnit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lobSwitch" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tapStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="disableLOBServiceability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationLegacyDetailsCSGLineOfBusinessType", propOrder = {
        "lobType",
        "lobServiceStatus",
        "projectServiceDate",
        "installedOutlets",
        "node",
        "headend",
        "router",
        "networkInterfaceUnit",
        "lobSwitch",
        "tapStatus",
        "disableLOBServiceability"
})
public class LocationLegacyDetailsCSGLineOfBusinessType {

    @XmlElementRef(name = "lobType", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<LOBTypesType> lobType;
    @XmlElementRef(name = "lobServiceStatus", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lobServiceStatus;
    @XmlElementRef(name = "projectServiceDate", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> projectServiceDate;
    @XmlElementRef(name = "installedOutlets", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> installedOutlets;
    @XmlElementRef(name = "node", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> node;
    @XmlElementRef(name = "headend", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> headend;
    @XmlElementRef(name = "router", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> router;
    @XmlElementRef(name = "networkInterfaceUnit", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkInterfaceUnit;
    @XmlElementRef(name = "lobSwitch", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lobSwitch;
    @XmlElementRef(name = "tapStatus", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tapStatus;
    @XmlElementRef(name = "disableLOBServiceability", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> disableLOBServiceability;

    /**
     * Gets the value of the lobType property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link LOBTypesType }{@code >}
     */
    public JAXBElement<LOBTypesType> getLobType() {
        return lobType;
    }

    /**
     * Sets the value of the lobType property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link LOBTypesType }{@code >}
     */
    public void setLobType(JAXBElement<LOBTypesType> value) {
        this.lobType = value;
    }

    /**
     * Gets the value of the lobServiceStatus property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getLobServiceStatus() {
        return lobServiceStatus;
    }

    /**
     * Sets the value of the lobServiceStatus property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setLobServiceStatus(JAXBElement<String> value) {
        this.lobServiceStatus = value;
    }

    /**
     * Gets the value of the projectServiceDate property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public JAXBElement<XMLGregorianCalendar> getProjectServiceDate() {
        return projectServiceDate;
    }

    /**
     * Sets the value of the projectServiceDate property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public void setProjectServiceDate(JAXBElement<XMLGregorianCalendar> value) {
        this.projectServiceDate = value;
    }

    /**
     * Gets the value of the installedOutlets property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getInstalledOutlets() {
        return installedOutlets;
    }

    /**
     * Sets the value of the installedOutlets property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setInstalledOutlets(JAXBElement<String> value) {
        this.installedOutlets = value;
    }

    /**
     * Gets the value of the node property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setNode(JAXBElement<String> value) {
        this.node = value;
    }

    /**
     * Gets the value of the headend property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHeadend() {
        return headend;
    }

    /**
     * Sets the value of the headend property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHeadend(JAXBElement<String> value) {
        this.headend = value;
    }

    /**
     * Gets the value of the router property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getRouter() {
        return router;
    }

    /**
     * Sets the value of the router property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setRouter(JAXBElement<String> value) {
        this.router = value;
    }

    /**
     * Gets the value of the networkInterfaceUnit property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getNetworkInterfaceUnit() {
        return networkInterfaceUnit;
    }

    /**
     * Sets the value of the networkInterfaceUnit property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setNetworkInterfaceUnit(JAXBElement<String> value) {
        this.networkInterfaceUnit = value;
    }

    /**
     * Gets the value of the lobSwitch property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getLobSwitch() {
        return lobSwitch;
    }

    /**
     * Sets the value of the lobSwitch property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setLobSwitch(JAXBElement<String> value) {
        this.lobSwitch = value;
    }

    /**
     * Gets the value of the tapStatus property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getTapStatus() {
        return tapStatus;
    }

    /**
     * Sets the value of the tapStatus property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setTapStatus(JAXBElement<String> value) {
        this.tapStatus = value;
    }

    /**
     * Gets the value of the disableLOBServiceability property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public JAXBElement<Boolean> getDisableLOBServiceability() {
        return disableLOBServiceability;
    }

    /**
     * Sets the value of the disableLOBServiceability property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public void setDisableLOBServiceability(JAXBElement<Boolean> value) {
        this.disableLOBServiceability = value;
    }

}
