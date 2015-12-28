
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for QueryMarketByBoundaryRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryMarketByBoundaryRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stateCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;pattern value="[A-Z]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateCenterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ILECName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PSAPId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VertexCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FIPSCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MinorCivilDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnLevel4MarketsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMarketByBoundaryRequestType", propOrder = {
        "stateCode",
        "countyName",
        "rateCenterName",
        "ilecName",
        "lata",
        "psapId",
        "vertexCode",
        "fipsCode",
        "minorCivilDivision",
        "placeName",
        "returnLevel4MarketsOnly"
})
public class QueryMarketByBoundaryRequestType {

    @XmlElementRef(name = "stateCode", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateCode;
    @XmlElement(name = "CountyName")
    protected String countyName;
    @XmlElement(name = "RateCenterName")
    protected String rateCenterName;
    @XmlElement(name = "ILECName")
    protected String ilecName;
    @XmlElement(name = "LATA")
    protected String lata;
    @XmlElement(name = "PSAPId")
    protected String psapId;
    @XmlElement(name = "VertexCode")
    protected String vertexCode;
    @XmlElement(name = "FIPSCode")
    protected String fipsCode;
    @XmlElement(name = "MinorCivilDivision")
    protected String minorCivilDivision;
    @XmlElement(name = "PlaceName")
    protected String placeName;
    protected Boolean returnLevel4MarketsOnly;

    /**
     * Gets the value of the stateCode property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setStateCode(JAXBElement<String> value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the countyName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * Sets the value of the countyName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCountyName(String value) {
        this.countyName = value;
    }

    /**
     * Gets the value of the rateCenterName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRateCenterName() {
        return rateCenterName;
    }

    /**
     * Sets the value of the rateCenterName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRateCenterName(String value) {
        this.rateCenterName = value;
    }

    /**
     * Gets the value of the ilecName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getILECName() {
        return ilecName;
    }

    /**
     * Sets the value of the ilecName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setILECName(String value) {
        this.ilecName = value;
    }

    /**
     * Gets the value of the lata property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLATA() {
        return lata;
    }

    /**
     * Sets the value of the lata property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLATA(String value) {
        this.lata = value;
    }

    /**
     * Gets the value of the psapId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPSAPId() {
        return psapId;
    }

    /**
     * Sets the value of the psapId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPSAPId(String value) {
        this.psapId = value;
    }

    /**
     * Gets the value of the vertexCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVertexCode() {
        return vertexCode;
    }

    /**
     * Sets the value of the vertexCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVertexCode(String value) {
        this.vertexCode = value;
    }

    /**
     * Gets the value of the fipsCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFIPSCode() {
        return fipsCode;
    }

    /**
     * Sets the value of the fipsCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFIPSCode(String value) {
        this.fipsCode = value;
    }

    /**
     * Gets the value of the minorCivilDivision property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMinorCivilDivision() {
        return minorCivilDivision;
    }

    /**
     * Sets the value of the minorCivilDivision property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMinorCivilDivision(String value) {
        this.minorCivilDivision = value;
    }

    /**
     * Gets the value of the placeName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPlaceName(String value) {
        this.placeName = value;
    }

    /**
     * Gets the value of the returnLevel4MarketsOnly property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isReturnLevel4MarketsOnly() {
        return returnLevel4MarketsOnly;
    }

    /**
     * Sets the value of the returnLevel4MarketsOnly property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setReturnLevel4MarketsOnly(Boolean value) {
        this.returnLevel4MarketsOnly = value;
    }

}
