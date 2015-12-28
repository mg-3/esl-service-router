
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MsagDataType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="MsagDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MsagDataId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="matchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msagPreDir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msagStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msagPostDir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msagStreetSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msagCommunity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msagStateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msagExchange" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="extractDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lowRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oddEven" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msagMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msagInitials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="elocMsagSourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsagDataType", propOrder = {
        "msagDataId",
        "matchType",
        "msagPreDir",
        "msagStreetName",
        "msagPostDir",
        "msagStreetSuffix",
        "msagCommunity",
        "msagStateCode",
        "esn",
        "msagExchange",
        "tarCode",
        "priority",
        "extractDate",
        "lowRange",
        "highRange",
        "oddEven",
        "esnId",
        "msagMatch",
        "msagInitials",
        "lastUpdateDate",
        "elocMsagSourceName"
})
public class MsagDataType {

    @XmlElement(name = "MsagDataId")
    protected Long msagDataId;
    protected String matchType;
    protected String msagPreDir;
    protected String msagStreetName;
    protected String msagPostDir;
    protected String msagStreetSuffix;
    protected String msagCommunity;
    protected String msagStateCode;
    protected String esn;
    protected String msagExchange;
    protected String tarCode;
    protected Long priority;
    protected String extractDate;
    protected String lowRange;
    protected String highRange;
    protected String oddEven;
    protected String esnId;
    protected String msagMatch;
    protected String msagInitials;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    protected String elocMsagSourceName;

    /**
     * Gets the value of the msagDataId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getMsagDataId() {
        return msagDataId;
    }

    /**
     * Sets the value of the msagDataId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setMsagDataId(Long value) {
        this.msagDataId = value;
    }

    /**
     * Gets the value of the matchType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     * Sets the value of the matchType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMatchType(String value) {
        this.matchType = value;
    }

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
     * Gets the value of the msagStateCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMsagStateCode() {
        return msagStateCode;
    }

    /**
     * Sets the value of the msagStateCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMsagStateCode(String value) {
        this.msagStateCode = value;
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
     * Gets the value of the msagExchange property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMsagExchange() {
        return msagExchange;
    }

    /**
     * Sets the value of the msagExchange property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMsagExchange(String value) {
        this.msagExchange = value;
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
     * Gets the value of the priority property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setPriority(Long value) {
        this.priority = value;
    }

    /**
     * Gets the value of the extractDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExtractDate() {
        return extractDate;
    }

    /**
     * Sets the value of the extractDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExtractDate(String value) {
        this.extractDate = value;
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
     * Gets the value of the esnId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEsnId() {
        return esnId;
    }

    /**
     * Sets the value of the esnId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEsnId(String value) {
        this.esnId = value;
    }

    /**
     * Gets the value of the msagMatch property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMsagMatch() {
        return msagMatch;
    }

    /**
     * Sets the value of the msagMatch property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMsagMatch(String value) {
        this.msagMatch = value;
    }

    /**
     * Gets the value of the msagInitials property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMsagInitials() {
        return msagInitials;
    }

    /**
     * Sets the value of the msagInitials property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMsagInitials(String value) {
        this.msagInitials = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
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

}
