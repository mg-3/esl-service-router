
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LocationLegacyDetailsDSTType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationLegacyDetailsDSTType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="houseNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *               &lt;pattern value="[0-9]{6}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="franchiseTaxArea" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *               &lt;pattern value="\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="managementArea" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="customerNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dual" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="constructionArea" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dwellingTypeCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dwellingCodeDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dupHouse" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dualHouse" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="networkInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="networkID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="houseComment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="350"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="complex" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="controlArea" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="info" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="map" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mkt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ovug" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="drop" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="salesRoute" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="auxX1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="auxX2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="auxX3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="auxY1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="auxY2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="auxY3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="auxY6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="auxY7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="testFiberNode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lineTag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="hotTap" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *               &lt;pattern value="[0-1]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Serviceability" type="{http://xml.blackbean.com/location/types}LocationDSTServicabilityTypes" minOccurs="0"/>
 *         &lt;element name="serviceStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
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
@XmlType(name = "LocationLegacyDetailsDSTType", propOrder = {
        "houseNumber",
        "franchiseTaxArea",
        "managementArea",
        "customerNumber",
        "dual",
        "constructionArea",
        "dwellingTypeCode",
        "dwellingCodeDescr",
        "customerType",
        "dupHouse",
        "dualHouse",
        "networkInfo",
        "networkID",
        "houseComment",
        "complex",
        "controlArea",
        "info",
        "map",
        "mkt",
        "ovug",
        "drop",
        "salesRoute",
        "auxX1",
        "auxX2",
        "auxX3",
        "auxY1",
        "auxY2",
        "auxY3",
        "auxY6",
        "auxY7",
        "testFiberNode",
        "lineTag",
        "hotTap",
        "serviceability",
        "serviceStatus"
})
public class LocationLegacyDetailsDSTType {

    @XmlElementRef(name = "houseNumber", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumber;
    protected String franchiseTaxArea;
    protected String managementArea;
    @XmlElementRef(name = "customerNumber", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerNumber;
    @XmlElementRef(name = "dual", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dual;
    @XmlElementRef(name = "constructionArea", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> constructionArea;
    @XmlElementRef(name = "dwellingTypeCode", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dwellingTypeCode;
    @XmlElementRef(name = "dwellingCodeDescr", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dwellingCodeDescr;
    @XmlElementRef(name = "customerType", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerType;
    @XmlElementRef(name = "dupHouse", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dupHouse;
    @XmlElementRef(name = "dualHouse", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dualHouse;
    @XmlElementRef(name = "networkInfo", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkInfo;
    @XmlElementRef(name = "networkID", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkID;
    @XmlElementRef(name = "houseComment", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseComment;
    @XmlElementRef(name = "complex", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complex;
    @XmlElementRef(name = "controlArea", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> controlArea;
    @XmlElementRef(name = "info", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> info;
    @XmlElementRef(name = "map", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> map;
    @XmlElementRef(name = "mkt", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mkt;
    protected String ovug;
    @XmlElementRef(name = "drop", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> drop;
    @XmlElementRef(name = "salesRoute", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesRoute;
    @XmlElementRef(name = "auxX1", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> auxX1;
    @XmlElementRef(name = "auxX2", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> auxX2;
    @XmlElementRef(name = "auxX3", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> auxX3;
    @XmlElementRef(name = "auxY1", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> auxY1;
    @XmlElementRef(name = "auxY2", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> auxY2;
    @XmlElementRef(name = "auxY3", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> auxY3;
    @XmlElementRef(name = "auxY6", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> auxY6;
    @XmlElementRef(name = "auxY7", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> auxY7;
    protected String testFiberNode;
    protected String lineTag;
    protected String hotTap;
    @XmlElement(name = "Serviceability")
    protected LocationDSTServicabilityTypes serviceability;
    protected String serviceStatus;

    /**
     * Gets the value of the houseNumber property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHouseNumber(JAXBElement<String> value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the franchiseTaxArea property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFranchiseTaxArea() {
        return franchiseTaxArea;
    }

    /**
     * Sets the value of the franchiseTaxArea property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFranchiseTaxArea(String value) {
        this.franchiseTaxArea = value;
    }

    /**
     * Gets the value of the managementArea property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getManagementArea() {
        return managementArea;
    }

    /**
     * Sets the value of the managementArea property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setManagementArea(String value) {
        this.managementArea = value;
    }

    /**
     * Gets the value of the customerNumber property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setCustomerNumber(JAXBElement<String> value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the dual property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDual() {
        return dual;
    }

    /**
     * Sets the value of the dual property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDual(JAXBElement<String> value) {
        this.dual = value;
    }

    /**
     * Gets the value of the constructionArea property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getConstructionArea() {
        return constructionArea;
    }

    /**
     * Sets the value of the constructionArea property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setConstructionArea(JAXBElement<String> value) {
        this.constructionArea = value;
    }

    /**
     * Gets the value of the dwellingTypeCode property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDwellingTypeCode() {
        return dwellingTypeCode;
    }

    /**
     * Sets the value of the dwellingTypeCode property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDwellingTypeCode(JAXBElement<String> value) {
        this.dwellingTypeCode = value;
    }

    /**
     * Gets the value of the dwellingCodeDescr property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDwellingCodeDescr() {
        return dwellingCodeDescr;
    }

    /**
     * Sets the value of the dwellingCodeDescr property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDwellingCodeDescr(JAXBElement<String> value) {
        this.dwellingCodeDescr = value;
    }

    /**
     * Gets the value of the customerType property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setCustomerType(JAXBElement<String> value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the dupHouse property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDupHouse() {
        return dupHouse;
    }

    /**
     * Sets the value of the dupHouse property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDupHouse(JAXBElement<String> value) {
        this.dupHouse = value;
    }

    /**
     * Gets the value of the dualHouse property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDualHouse() {
        return dualHouse;
    }

    /**
     * Sets the value of the dualHouse property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDualHouse(JAXBElement<String> value) {
        this.dualHouse = value;
    }

    /**
     * Gets the value of the networkInfo property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getNetworkInfo() {
        return networkInfo;
    }

    /**
     * Sets the value of the networkInfo property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setNetworkInfo(JAXBElement<String> value) {
        this.networkInfo = value;
    }

    /**
     * Gets the value of the networkID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getNetworkID() {
        return networkID;
    }

    /**
     * Sets the value of the networkID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setNetworkID(JAXBElement<String> value) {
        this.networkID = value;
    }

    /**
     * Gets the value of the houseComment property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHouseComment() {
        return houseComment;
    }

    /**
     * Sets the value of the houseComment property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHouseComment(JAXBElement<String> value) {
        this.houseComment = value;
    }

    /**
     * Gets the value of the complex property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getComplex() {
        return complex;
    }

    /**
     * Sets the value of the complex property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setComplex(JAXBElement<String> value) {
        this.complex = value;
    }

    /**
     * Gets the value of the controlArea property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getControlArea() {
        return controlArea;
    }

    /**
     * Sets the value of the controlArea property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setControlArea(JAXBElement<String> value) {
        this.controlArea = value;
    }

    /**
     * Gets the value of the info property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setInfo(JAXBElement<String> value) {
        this.info = value;
    }

    /**
     * Gets the value of the map property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setMap(JAXBElement<String> value) {
        this.map = value;
    }

    /**
     * Gets the value of the mkt property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getMkt() {
        return mkt;
    }

    /**
     * Sets the value of the mkt property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setMkt(JAXBElement<String> value) {
        this.mkt = value;
    }

    /**
     * Gets the value of the ovug property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOvug() {
        return ovug;
    }

    /**
     * Sets the value of the ovug property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOvug(String value) {
        this.ovug = value;
    }

    /**
     * Gets the value of the drop property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDrop() {
        return drop;
    }

    /**
     * Sets the value of the drop property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDrop(JAXBElement<String> value) {
        this.drop = value;
    }

    /**
     * Gets the value of the salesRoute property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getSalesRoute() {
        return salesRoute;
    }

    /**
     * Sets the value of the salesRoute property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setSalesRoute(JAXBElement<String> value) {
        this.salesRoute = value;
    }

    /**
     * Gets the value of the auxX1 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getAuxX1() {
        return auxX1;
    }

    /**
     * Sets the value of the auxX1 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setAuxX1(JAXBElement<String> value) {
        this.auxX1 = value;
    }

    /**
     * Gets the value of the auxX2 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getAuxX2() {
        return auxX2;
    }

    /**
     * Sets the value of the auxX2 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setAuxX2(JAXBElement<String> value) {
        this.auxX2 = value;
    }

    /**
     * Gets the value of the auxX3 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getAuxX3() {
        return auxX3;
    }

    /**
     * Sets the value of the auxX3 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setAuxX3(JAXBElement<String> value) {
        this.auxX3 = value;
    }

    /**
     * Gets the value of the auxY1 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getAuxY1() {
        return auxY1;
    }

    /**
     * Sets the value of the auxY1 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setAuxY1(JAXBElement<String> value) {
        this.auxY1 = value;
    }

    /**
     * Gets the value of the auxY2 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getAuxY2() {
        return auxY2;
    }

    /**
     * Sets the value of the auxY2 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setAuxY2(JAXBElement<String> value) {
        this.auxY2 = value;
    }

    /**
     * Gets the value of the auxY3 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getAuxY3() {
        return auxY3;
    }

    /**
     * Sets the value of the auxY3 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setAuxY3(JAXBElement<String> value) {
        this.auxY3 = value;
    }

    /**
     * Gets the value of the auxY6 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getAuxY6() {
        return auxY6;
    }

    /**
     * Sets the value of the auxY6 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setAuxY6(JAXBElement<String> value) {
        this.auxY6 = value;
    }

    /**
     * Gets the value of the auxY7 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getAuxY7() {
        return auxY7;
    }

    /**
     * Sets the value of the auxY7 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setAuxY7(JAXBElement<String> value) {
        this.auxY7 = value;
    }

    /**
     * Gets the value of the testFiberNode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTestFiberNode() {
        return testFiberNode;
    }

    /**
     * Sets the value of the testFiberNode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTestFiberNode(String value) {
        this.testFiberNode = value;
    }

    /**
     * Gets the value of the lineTag property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLineTag() {
        return lineTag;
    }

    /**
     * Sets the value of the lineTag property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLineTag(String value) {
        this.lineTag = value;
    }

    /**
     * Gets the value of the hotTap property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotTap() {
        return hotTap;
    }

    /**
     * Sets the value of the hotTap property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotTap(String value) {
        this.hotTap = value;
    }

    /**
     * Gets the value of the serviceability property.
     *
     * @return possible object is
     * {@link LocationDSTServicabilityTypes }
     */
    public LocationDSTServicabilityTypes getServiceability() {
        return serviceability;
    }

    /**
     * Sets the value of the serviceability property.
     *
     * @param value allowed object is
     *              {@link LocationDSTServicabilityTypes }
     */
    public void setServiceability(LocationDSTServicabilityTypes value) {
        this.serviceability = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

}
