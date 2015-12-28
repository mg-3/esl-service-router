
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="MarketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="marketName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="glCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketCapabilities" type="{http://xml.blackbean.com/location/types}MarketCapabilitiesType"/>
 *         &lt;element name="marketHierarchy" type="{http://xml.blackbean.com/location/types}MarketHierarchyResponseType"/>
 *         &lt;element name="legacyMarketID" type="{http://xml.blackbean.com/location/types}LegacyMarketIDType" minOccurs="0"/>
 *         &lt;element name="legacyMarketType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketType", propOrder = {
        "marketID",
        "marketName",
        "glCode",
        "marketCapabilities",
        "marketHierarchy",
        "legacyMarketID",
        "legacyMarketType"
})
public class MarketType {

    protected long marketID;
    @XmlElement(required = true)
    protected String marketName;
    protected String glCode;
    @XmlElement(required = true)
    protected MarketCapabilitiesType marketCapabilities;
    @XmlElement(required = true)
    protected MarketHierarchyResponseType marketHierarchy;
    protected LegacyMarketIDType legacyMarketID;
    @XmlElement(required = true)
    protected String legacyMarketType;

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
     * Gets the value of the marketHierarchy property.
     *
     * @return possible object is
     * {@link MarketHierarchyResponseType }
     */
    public MarketHierarchyResponseType getMarketHierarchy() {
        return marketHierarchy;
    }

    /**
     * Sets the value of the marketHierarchy property.
     *
     * @param value allowed object is
     *              {@link MarketHierarchyResponseType }
     */
    public void setMarketHierarchy(MarketHierarchyResponseType value) {
        this.marketHierarchy = value;
    }

    /**
     * Gets the value of the legacyMarketID property.
     *
     * @return possible object is
     * {@link LegacyMarketIDType }
     */
    public LegacyMarketIDType getLegacyMarketID() {
        return legacyMarketID;
    }

    /**
     * Sets the value of the legacyMarketID property.
     *
     * @param value allowed object is
     *              {@link LegacyMarketIDType }
     */
    public void setLegacyMarketID(LegacyMarketIDType value) {
        this.legacyMarketID = value;
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

}
