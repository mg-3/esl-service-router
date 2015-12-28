
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingSystemFormattedAddressesDDPType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="BillingSystemFormattedAddressesDDPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APTN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Directional" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Fractional" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LegacyLocationID" type="{http://xml.comcast.com/location/types}LegacyLocationIDType" minOccurs="0"/>
 *         &lt;element name="StreetName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StreetNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZipCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZipPlus4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
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
@XmlType(name = "BillingSystemFormattedAddressesDDPType", propOrder = {
        "apt",
        "aptn",
        "directional",
        "fractional",
        "legacyLocationID",
        "streetName",
        "streetNumber",
        "zipCode",
        "zipPlus4"
})
public class BillingSystemFormattedAddressesDDPType {

    @XmlElement(name = "APT")
    protected String apt;
    @XmlElement(name = "APTN")
    protected String aptn;
    @XmlElement(name = "Directional")
    protected String directional;
    @XmlElement(name = "Fractional")
    protected String fractional;
    @XmlElement(name = "LegacyLocationID")
    protected LegacyLocationIDType legacyLocationID;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "StreetNumber")
    protected String streetNumber;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "ZipPlus4")
    protected String zipPlus4;

    /**
     * Gets the value of the apt property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAPT() {
        return apt;
    }

    /**
     * Sets the value of the apt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAPT(String value) {
        this.apt = value;
    }

    /**
     * Gets the value of the aptn property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAPTN() {
        return aptn;
    }

    /**
     * Sets the value of the aptn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAPTN(String value) {
        this.aptn = value;
    }

    /**
     * Gets the value of the directional property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDirectional() {
        return directional;
    }

    /**
     * Sets the value of the directional property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDirectional(String value) {
        this.directional = value;
    }

    /**
     * Gets the value of the fractional property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFractional() {
        return fractional;
    }

    /**
     * Sets the value of the fractional property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFractional(String value) {
        this.fractional = value;
    }

    /**
     * Gets the value of the legacyLocationID property.
     *
     * @return possible object is
     * {@link LegacyLocationIDType }
     */
    public LegacyLocationIDType getLegacyLocationID() {
        return legacyLocationID;
    }

    /**
     * Sets the value of the legacyLocationID property.
     *
     * @param value allowed object is
     *              {@link LegacyLocationIDType }
     */
    public void setLegacyLocationID(LegacyLocationIDType value) {
        this.legacyLocationID = value;
    }

    /**
     * Gets the value of the streetName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Sets the value of the streetNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStreetNumber(String value) {
        this.streetNumber = value;
    }

    /**
     * Gets the value of the zipCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the zipPlus4 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getZipPlus4() {
        return zipPlus4;
    }

    /**
     * Sets the value of the zipPlus4 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setZipPlus4(String value) {
        this.zipPlus4 = value;
    }

}
