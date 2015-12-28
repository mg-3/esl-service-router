
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMarketResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetMarketResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="market" type="{http://xml.comcast.com/location/types}MarketType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMarketResponseType", propOrder = {
        "market"
})
public class GetMarketResponseType {

    @XmlElement(required = true)
    protected MarketType market;

    /**
     * Gets the value of the market property.
     *
     * @return possible object is
     * {@link MarketType }
     */
    public MarketType getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     *
     * @param value allowed object is
     *              {@link MarketType }
     */
    public void setMarket(MarketType value) {
        this.market = value;
    }

}
