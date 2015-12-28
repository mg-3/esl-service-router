
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMarketRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddMarketRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketDetailResult" type="{http://xml.comcast.com/location/types}AddMarketRequestMarketType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMarketRequestType", propOrder = {
        "market"
})
public class AddMarketRequestType {

    @XmlElement(name = "MarketDetailResult", required = true)
    protected AddMarketRequestMarketType market;

    /**
     * Gets the value of the market property.
     *
     * @return possible object is
     * {@link AddMarketRequestMarketType }
     */
    public AddMarketRequestMarketType getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     *
     * @param value allowed object is
     *              {@link AddMarketRequestMarketType }
     */
    public void setMarket(AddMarketRequestMarketType value) {
        this.market = value;
    }

}
