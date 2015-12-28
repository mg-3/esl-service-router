
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
 *         &lt;element name="queryMarketByBoundaryReturn" type="{http://xml.comcast.com/location/types}QueryMarketByBoundaryResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryMarketByBoundaryReturn"
})
@XmlRootElement(name = "queryMarketByBoundaryResponse", namespace = "http://xml.comcast.com/location/services")
public class QueryMarketByBoundaryResponse {

    @XmlElementRef(name = "queryMarketByBoundaryReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryMarketByBoundaryResponseType> queryMarketByBoundaryReturn;

    /**
     * Gets the value of the queryMarketByBoundaryReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryMarketByBoundaryResponseType }{@code >}
     */
    public JAXBElement<QueryMarketByBoundaryResponseType> getQueryMarketByBoundaryReturn() {
        return queryMarketByBoundaryReturn;
    }

    /**
     * Sets the value of the queryMarketByBoundaryReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryMarketByBoundaryResponseType }{@code >}
     */
    public void setQueryMarketByBoundaryReturn(JAXBElement<QueryMarketByBoundaryResponseType> value) {
        this.queryMarketByBoundaryReturn = value;
    }

}
