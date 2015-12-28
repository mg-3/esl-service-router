
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ASOGAddressType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ASOGAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SASF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NCON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AAI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LV1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LV3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SASD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AFT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SANO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SASN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASOGAddressType", propOrder = {
        "sass",
        "sasf",
        "sath",
        "ncon",
        "lv2",
        "sapr",
        "ld2",
        "aai",
        "lv1",
        "lv3",
        "ld3",
        "sasd",
        "city",
        "aft",
        "ld1",
        "sano",
        "state",
        "sasn",
        "zipcode"
})
public class ASOGAddressType {

    @XmlElement(name = "SASS")
    protected String sass;
    @XmlElement(name = "SASF")
    protected String sasf;
    @XmlElement(name = "SATH")
    protected String sath;
    @XmlElement(name = "NCON")
    protected String ncon;
    @XmlElement(name = "LV2")
    protected String lv2;
    @XmlElement(name = "SAPR")
    protected String sapr;
    @XmlElement(name = "LD2")
    protected String ld2;
    @XmlElement(name = "AAI")
    protected String aai;
    @XmlElement(name = "LV1")
    protected String lv1;
    @XmlElement(name = "LV3")
    protected String lv3;
    @XmlElement(name = "LD3")
    protected String ld3;
    @XmlElement(name = "SASD")
    protected String sasd;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "AFT")
    protected String aft;
    @XmlElement(name = "LD1")
    protected String ld1;
    @XmlElement(name = "SANO")
    protected String sano;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "SASN")
    protected String sasn;
    @XmlElement(name = "Zipcode")
    protected String zipcode;

    /**
     * Gets the value of the sass property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSASS() {
        return sass;
    }

    /**
     * Sets the value of the sass property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSASS(String value) {
        this.sass = value;
    }

    /**
     * Gets the value of the sasf property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSASF() {
        return sasf;
    }

    /**
     * Sets the value of the sasf property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSASF(String value) {
        this.sasf = value;
    }

    /**
     * Gets the value of the sath property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSATH() {
        return sath;
    }

    /**
     * Sets the value of the sath property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSATH(String value) {
        this.sath = value;
    }

    /**
     * Gets the value of the ncon property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNCON() {
        return ncon;
    }

    /**
     * Sets the value of the ncon property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNCON(String value) {
        this.ncon = value;
    }

    /**
     * Gets the value of the lv2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLV2() {
        return lv2;
    }

    /**
     * Sets the value of the lv2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLV2(String value) {
        this.lv2 = value;
    }

    /**
     * Gets the value of the sapr property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSAPR() {
        return sapr;
    }

    /**
     * Sets the value of the sapr property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSAPR(String value) {
        this.sapr = value;
    }

    /**
     * Gets the value of the ld2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLD2() {
        return ld2;
    }

    /**
     * Sets the value of the ld2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLD2(String value) {
        this.ld2 = value;
    }

    /**
     * Gets the value of the aai property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAAI() {
        return aai;
    }

    /**
     * Sets the value of the aai property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAAI(String value) {
        this.aai = value;
    }

    /**
     * Gets the value of the lv1 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLV1() {
        return lv1;
    }

    /**
     * Sets the value of the lv1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLV1(String value) {
        this.lv1 = value;
    }

    /**
     * Gets the value of the lv3 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLV3() {
        return lv3;
    }

    /**
     * Sets the value of the lv3 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLV3(String value) {
        this.lv3 = value;
    }

    /**
     * Gets the value of the ld3 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLD3() {
        return ld3;
    }

    /**
     * Sets the value of the ld3 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLD3(String value) {
        this.ld3 = value;
    }

    /**
     * Gets the value of the sasd property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSASD() {
        return sasd;
    }

    /**
     * Sets the value of the sasd property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSASD(String value) {
        this.sasd = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the aft property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAFT() {
        return aft;
    }

    /**
     * Sets the value of the aft property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAFT(String value) {
        this.aft = value;
    }

    /**
     * Gets the value of the ld1 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLD1() {
        return ld1;
    }

    /**
     * Sets the value of the ld1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLD1(String value) {
        this.ld1 = value;
    }

    /**
     * Gets the value of the sano property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSANO() {
        return sano;
    }

    /**
     * Sets the value of the sano property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSANO(String value) {
        this.sano = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the sasn property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSASN() {
        return sasn;
    }

    /**
     * Sets the value of the sasn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSASN(String value) {
        this.sasn = value;
    }

    /**
     * Gets the value of the zipcode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setZipcode(String value) {
        this.zipcode = value;
    }

}
