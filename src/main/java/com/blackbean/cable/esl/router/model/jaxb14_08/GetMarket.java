
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetMarket" type="{http://xml.blackbean.com/location/types}GetMarketRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getMarket"
})
@XmlRootElement(name = "getMarketDetailResult", namespace = "http://xml.blackbean.com/location/services")
public class GetMarket {

    @XmlElementRef(name = "GetMarket", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetMarketRequestType> getMarket;

    /**
     * Gets the value of the getMarketDetailResult property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetMarketRequestType }{@code >}
     */
    public JAXBElement<GetMarketRequestType> getGetMarket() {
        return getMarket;
    }

    /**
     * Sets the value of the getMarketDetailResult property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetMarketRequestType }{@code >}
     */
    public void setGetMarket(JAXBElement<GetMarketRequestType> value) {
        this.getMarket = value;
    }

}
