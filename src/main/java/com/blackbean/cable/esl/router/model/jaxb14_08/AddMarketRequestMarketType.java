
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMarketRequestMarketType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddMarketRequestMarketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="financialSystemMarketName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consumerFriendlyMarketName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketCapabilities" type="{http://xml.blackbean.com/location/types}MarketCapabilitiesType"/>
 *         &lt;element name="parentMarketId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="legacyMarketDetails" type="{http://xml.blackbean.com/location/types}AddModifyMarketLegacyMarketDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMarketRequestMarketType", propOrder = {
        "financialSystemMarketName",
        "consumerFriendlyMarketName",
        "marketCapabilities",
        "parentMarketId",
        "legacyMarketDetails"
})
public class AddMarketRequestMarketType {

    @XmlElement(required = true)
    protected String financialSystemMarketName;
    @XmlElement(required = true)
    protected String consumerFriendlyMarketName;
    @XmlElement(required = true)
    protected MarketCapabilitiesType marketCapabilities;
    protected long parentMarketId;
    protected AddModifyMarketLegacyMarketDetailsType legacyMarketDetails;

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
     */
    public long getParentMarketId() {
        return parentMarketId;
    }

    /**
     * Sets the value of the parentMarketId property.
     */
    public void setParentMarketId(long value) {
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
