
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketHierarchyNodeType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="MarketHierarchyNodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="marketName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legacyMarketID" type="{http://xml.blackbean.com/location/types}LegacyMarketIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketHierarchyNodeType", propOrder = {
        "marketID",
        "marketName",
        "legacyMarketID"
})
public class MarketHierarchyNodeType {

    protected long marketID;
    @XmlElement(required = true)
    protected String marketName;
    protected LegacyMarketIDType legacyMarketID;

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

}
