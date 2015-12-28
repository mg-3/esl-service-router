
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
 *         &lt;element name="queryMarketHierarchyReturn" type="{http://xml.blackbean.com/location/types}QueryMarketHierarchyResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryMarketHierarchyReturn"
})
@XmlRootElement(name = "queryMarketHierarchyResponse", namespace = "http://xml.blackbean.com/location/services")
public class QueryMarketHierarchyResponse {

    @XmlElementRef(name = "queryMarketHierarchyReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryMarketHierarchyResponseType> queryMarketHierarchyReturn;

    /**
     * Gets the value of the queryMarketHierarchyReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryMarketHierarchyResponseType }{@code >}
     */
    public JAXBElement<QueryMarketHierarchyResponseType> getQueryMarketHierarchyReturn() {
        return queryMarketHierarchyReturn;
    }

    /**
     * Sets the value of the queryMarketHierarchyReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryMarketHierarchyResponseType }{@code >}
     */
    public void setQueryMarketHierarchyReturn(JAXBElement<QueryMarketHierarchyResponseType> value) {
        this.queryMarketHierarchyReturn = value;
    }

}
