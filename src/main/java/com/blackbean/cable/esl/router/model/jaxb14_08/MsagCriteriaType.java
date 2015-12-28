
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsagCriteriaType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="MsagCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msagPreDir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msagStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msagStreetSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msagPostDir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msagCommunity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lowRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oddEven" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elocMsagSourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsagCriteriaType", propOrder = {
        "msagPreDir",
        "msagStreetName",
        "msagStreetSuffix",
        "msagPostDir",
        "msagCommunity",
        "stateCode",
        "tarCode",
        "exchange",
        "lowRange",
        "highRange",
        "oddEven",
        "elocMsagSourceName",
        "esn",
        "houseNumber"
})
public class MsagCriteriaType {

    protected String msagPreDir;
    protected String msagStreetName;
    protected String msagStreetSuffix;
    protected String msagPostDir;
    protected String msagCommunity;
    protected String stateCode;
    protected String tarCode;
    protected String exchange;
    protected String lowRange;
    protected String highRange;
    protected String oddEven;
    protected String elocMsagSourceName;
    protected String esn;
    protected String houseNumber;

    /**
     * Gets the value of the msagPreDir property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMsagPreDir() {
        return msagPreDir;
    }

    /**
     * Sets the value of the msagPreDir property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMsagPreDir(String value) {
        this.msagPreDir = value;
    }

    /**
     * Gets the value of the msagStreetName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMsagStreetName() {
        return msagStreetName;
    }

    /**
     * Sets the value of the msagStreetName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMsagStreetName(String value) {
        this.msagStreetName = value;
    }

    /**
     * Gets the value of the msagStreetSuffix property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMsagStreetSuffix() {
        return msagStreetSuffix;
    }

    /**
     * Sets the value of the msagStreetSuffix property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMsagStreetSuffix(String value) {
        this.msagStreetSuffix = value;
    }

    /**
     * Gets the value of the msagPostDir property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMsagPostDir() {
        return msagPostDir;
    }

    /**
     * Sets the value of the msagPostDir property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMsagPostDir(String value) {
        this.msagPostDir = value;
    }

    /**
     * Gets the value of the msagCommunity property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMsagCommunity() {
        return msagCommunity;
    }

    /**
     * Sets the value of the msagCommunity property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMsagCommunity(String value) {
        this.msagCommunity = value;
    }

    /**
     * Gets the value of the stateCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the tarCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTarCode() {
        return tarCode;
    }

    /**
     * Sets the value of the tarCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTarCode(String value) {
        this.tarCode = value;
    }

    /**
     * Gets the value of the exchange property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExchange(String value) {
        this.exchange = value;
    }

    /**
     * Gets the value of the lowRange property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLowRange() {
        return lowRange;
    }

    /**
     * Sets the value of the lowRange property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLowRange(String value) {
        this.lowRange = value;
    }

    /**
     * Gets the value of the highRange property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHighRange() {
        return highRange;
    }

    /**
     * Sets the value of the highRange property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHighRange(String value) {
        this.highRange = value;
    }

    /**
     * Gets the value of the oddEven property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOddEven() {
        return oddEven;
    }

    /**
     * Sets the value of the oddEven property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOddEven(String value) {
        this.oddEven = value;
    }

    /**
     * Gets the value of the elocMsagSourceName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getElocMsagSourceName() {
        return elocMsagSourceName;
    }

    /**
     * Sets the value of the elocMsagSourceName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setElocMsagSourceName(String value) {
        this.elocMsagSourceName = value;
    }

    /**
     * Gets the value of the esn property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEsn() {
        return esn;
    }

    /**
     * Sets the value of the esn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEsn(String value) {
        this.esn = value;
    }

    /**
     * Gets the value of the houseNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

}
