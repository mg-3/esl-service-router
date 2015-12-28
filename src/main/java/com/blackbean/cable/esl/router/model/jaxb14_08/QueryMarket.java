
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
 *         &lt;element name="QueryMarket" type="{http://xml.blackbean.com/location/types}QueryMarketRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryMarket"
})
@XmlRootElement(name = "queryMarket", namespace = "http://xml.blackbean.com/location/services")
public class QueryMarket {

    @XmlElementRef(name = "QueryMarket", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryMarketRequestType> queryMarket;

    /**
     * Gets the value of the queryMarket property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryMarketRequestType }{@code >}
     */
    public JAXBElement<QueryMarketRequestType> getQueryMarket() {
        return queryMarket;
    }

    /**
     * Sets the value of the queryMarket property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryMarketRequestType }{@code >}
     */
    public void setQueryMarket(JAXBElement<QueryMarketRequestType> value) {
        this.queryMarket = value;
    }

}
