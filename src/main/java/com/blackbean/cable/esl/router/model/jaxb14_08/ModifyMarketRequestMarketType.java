
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyMarketRequestMarketType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ModifyMarketRequestMarketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="financialSystemMarketName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consumerFriendlyMarketName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketCapabilities" type="{http://xml.comcast.com/location/types}MarketCapabilitiesType" minOccurs="0"/>
 *         &lt;element name="parentMarketId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="legacyMarketDetails" type="{http://xml.comcast.com/location/types}AddModifyMarketLegacyMarketDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyMarketRequestMarketType", propOrder = {
        "marketID",
        "financialSystemMarketName",
        "consumerFriendlyMarketName",
        "marketCapabilities",
        "parentMarketId",
        "legacyMarketDetails"
})
public class ModifyMarketRequestMarketType {

    protected long marketID;
    protected String financialSystemMarketName;
    protected String consumerFriendlyMarketName;
    protected MarketCapabilitiesType marketCapabilities;
    protected Long parentMarketId;
    protected AddModifyMarketLegacyMarketDetailsType legacyMarketDetails;

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
     * Gets the value of the financialSystemMarketName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFinancialSystemMarketName() {
        return financialSystemMarketName;
    }

    /**
     * Sets the value of the financialSystemMarketName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFinancialSystemMarketName(String value) {
        this.financialSystemMarketName = value;
    }

    /**
     * Gets the value of the consumerFriendlyMarketName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getConsumerFriendlyMarketName() {
        return consumerFriendlyMarketName;
    }

    /**
     * Sets the value of the consumerFriendlyMarketName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setConsumerFriendlyMarketName(String value) {
        this.consumerFriendlyMarketName = value;
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
     * Gets the value of the parentMarketId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getParentMarketId() {
        return parentMarketId;
    }

    /**
     * Sets the value of the parentMarketId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setParentMarketId(Long value) {
        this.parentMarketId = value;
    }

    /**
     * Gets the value of the legacyMarketDetails property.
     *
     * @return possible object is
     * {@link AddModifyMarketLegacyMarketDetailsType }
     */
    public AddModifyMarketLegacyMarketDetailsType getLegacyMarketDetails() {
        return legacyMarketDetails;
    }

    /**
     * Sets the value of the legacyMarketDetails property.
     *
     * @param value allowed object is
     *              {@link AddModifyMarketLegacyMarketDetailsType }
     */
    public void setLegacyMarketDetails(AddModifyMarketLegacyMarketDetailsType value) {
        this.legacyMarketDetails = value;
    }

}
