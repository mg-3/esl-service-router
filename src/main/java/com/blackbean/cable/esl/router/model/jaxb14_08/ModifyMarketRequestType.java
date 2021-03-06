
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyMarketRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ModifyMarketRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketDetailResult" type="{http://xml.blackbean.com/location/types}ModifyMarketRequestMarketType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyMarketRequestType", propOrder = {
        "market"
})
public class ModifyMarketRequestType {

    @XmlElement(name = "MarketDetailResult", required = true)
    protected ModifyMarketRequestMarketType market;

    /**
     * Gets the value of the market property.
     *
     * @return possible object is
     * {@link ModifyMarketRequestMarketType }
     */
    public ModifyMarketRequestMarketType getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     *
     * @param value allowed object is
     *              {@link ModifyMarketRequestMarketType }
     */
    public void setMarket(ModifyMarketRequestMarketType value) {
        this.market = value;
    }

}
