
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
 *         &lt;element name="QueryMarketByBoundary" type="{http://xml.blackbean.com/location/types}QueryMarketByBoundaryRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryMarketByBoundary"
})
@XmlRootElement(name = "queryMarketByBoundary", namespace = "http://xml.blackbean.com/location/services")
public class QueryMarketByBoundary {

    @XmlElementRef(name = "QueryMarketByBoundary", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryMarketByBoundaryRequestType> queryMarketByBoundary;

    /**
     * Gets the value of the queryMarketByBoundary property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryMarketByBoundaryRequestType }{@code >}
     */
    public JAXBElement<QueryMarketByBoundaryRequestType> getQueryMarketByBoundary() {
        return queryMarketByBoundary;
    }

    /**
     * Sets the value of the queryMarketByBoundary property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryMarketByBoundaryRequestType }{@code >}
     */
    public void setQueryMarketByBoundary(JAXBElement<QueryMarketByBoundaryRequestType> value) {
        this.queryMarketByBoundary = value;
    }

}
