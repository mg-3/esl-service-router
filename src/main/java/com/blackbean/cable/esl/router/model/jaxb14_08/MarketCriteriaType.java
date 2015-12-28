
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketCriteriaType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="MarketCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="legacyMarketID" type="{http://xml.comcast.com/location/types}LegacyMarketIDCriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketCriteriaType", propOrder = {
        "marketID",
        "legacyMarketID"
})
public class MarketCriteriaType {

    protected Long marketID;
    protected LegacyMarketIDCriteriaType legacyMarketID;

    /**
     * Gets the value of the marketID property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getMarketID() {
        return marketID;
    }

    /**
     * Sets the value of the marketID property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setMarketID(Long value) {
        this.marketID = value;
    }

    /**
     * Gets the value of the legacyMarketID property.
     *
     * @return possible object is
     * {@link LegacyMarketIDCriteriaType }
     */
    public LegacyMarketIDCriteriaType getLegacyMarketID() {
        return legacyMarketID;
    }

    /**
     * Sets the value of the legacyMarketID property.
     *
     * @param value allowed object is
     *              {@link LegacyMarketIDCriteriaType }
     */
    public void setLegacyMarketID(LegacyMarketIDCriteriaType value) {
        this.legacyMarketID = value;
    }

}
