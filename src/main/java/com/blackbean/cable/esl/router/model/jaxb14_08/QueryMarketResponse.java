
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
 *         &lt;element name="queryMarketReturn" type="{http://xml.blackbean.com/location/types}QueryMarketResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryMarketReturn"
})
@XmlRootElement(name = "queryMarketResponse", namespace = "http://xml.blackbean.com/location/services")
public class QueryMarketResponse {

    @XmlElementRef(name = "queryMarketReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryMarketResponseType> queryMarketReturn;

    /**
     * Gets the value of the queryMarketReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryMarketResponseType }{@code >}
     */
    public JAXBElement<QueryMarketResponseType> getQueryMarketReturn() {
        return queryMarketReturn;
    }

    /**
     * Sets the value of the queryMarketReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryMarketResponseType }{@code >}
     */
    public void setQueryMarketReturn(JAXBElement<QueryMarketResponseType> value) {
        this.queryMarketReturn = value;
    }

}
