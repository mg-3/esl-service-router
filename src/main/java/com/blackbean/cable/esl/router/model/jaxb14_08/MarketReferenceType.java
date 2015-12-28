
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MarketReferenceType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="MarketReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="marketName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketCapabilities" type="{http://xml.comcast.com/location/types}MarketCapabilitiesType"/>
 *         &lt;element name="legacyMarketID" type="{http://xml.comcast.com/location/types}LegacyMarketIDType" minOccurs="0"/>
 *         &lt;element name="parentMarketID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="glCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legacyMarketType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seasonalSuspend" type="{http://xml.comcast.com/location/types}SeasonalSuspendType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketReferenceType", propOrder = {
        "marketID",
        "marketName",
        "marketCapabilities",
        "legacyMarketID",
        "parentMarketID",
        "glCode",
        "legacyMarketType",
        "seasonalSuspend"
})
public class MarketReferenceType {

    protected long marketID;
    @XmlElement(required = true)
    protected String marketName;
    @XmlElement(required = true)
    protected MarketCapabilitiesType marketCapabilities;
    @XmlElementRef(name = "legacyMarketID", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<LegacyMarketIDType> legacyMarketID;
    protected long parentMarketID;
    protected String glCode;
    @XmlElement(required = true)
    protected String legacyMarketType;
    protected SeasonalSuspendType seasonalSuspend;

    /**
     * Gets the value of the marketID property.
     */
    public long getMarketID() {
        return marketID;
    }

    /**
     * Sets the value of the marketID property.
     */
    public void setMarketID(long value) {
        this.marketID = value;
    }

    /**
     * Gets the value of the marketName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMarketName() {
        return marketName;
    }

    /**
     * Sets the value of the marketName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMarketName(String value) {
        this.marketName = value;
    }

    /**
     * Gets the value of the marketCapabilities property.
     *
     * @return possible object is
     * {@link MarketCapabilitiesType }
     */
    public MarketCapabilitiesType getMarketCapabilities() {
        return marketCapabilities;
    }

    /**
     * Sets the value of the marketCapabilities property.
     *
     * @param value allowed object is
     *              {@link MarketCapabilitiesType }
     */
    public void setMarketCapabilities(MarketCapabilitiesType value) {
        this.marketCapabilities = value;
    }

    /**
     * Gets the value of the legacyMarketID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link LegacyMarketIDType }{@code >}
     */
    public JAXBElement<LegacyMarketIDType> getLegacyMarketID() {
        return legacyMarketID;
    }

    /**
     * Sets the value of the legacyMarketID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link LegacyMarketIDType }{@code >}
     */
    public void setLegacyMarketID(JAXBElement<LegacyMarketIDType> value) {
        this.legacyMarketID = value;
    }

    /**
     * Gets the value of the parentMarketID property.
     */
    public long getParentMarketID() {
        return parentMarketID;
    }

    /**
     * Sets the value of the parentMarketID property.
     */
    public void setParentMarketID(long value) {
        this.parentMarketID = value;
    }

    /**
     * Gets the value of the glCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGlCode() {
        return glCode;
    }

    /**
     * Sets the value of the glCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGlCode(String value) {
        this.glCode = value;
    }

    /**
     * Gets the value of the legacyMarketType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLegacyMarketType() {
        return legacyMarketType;
    }

    /**
     * Sets the value of the legacyMarketType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLegacyMarketType(String value) {
        this.legacyMarketType = value;
    }

    /**
     * Gets the value of the seasonalSuspend property.
     *
     * @return possible object is
     * {@link SeasonalSuspendType }
     */
    public SeasonalSuspendType getSeasonalSuspend() {
        return seasonalSuspend;
    }

    /**
     * Sets the value of the seasonalSuspend property.
     *
     * @param value allowed object is
     *              {@link SeasonalSuspendType }
     */
    public void setSeasonalSuspend(SeasonalSuspendType value) {
        this.seasonalSuspend = value;
    }

}
