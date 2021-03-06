
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
 *         &lt;element name="QueryMarketHierarchy" type="{http://xml.blackbean.com/location/types}QueryMarketHierarchyRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryMarketHierarchy"
})
@XmlRootElement(name = "queryMarketHierarchy", namespace = "http://xml.blackbean.com/location/services")
public class QueryMarketHierarchy {

    @XmlElementRef(name = "QueryMarketHierarchy", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryMarketHierarchyRequestType> queryMarketHierarchy;

    /**
     * Gets the value of the queryMarketHierarchy property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryMarketHierarchyRequestType }{@code >}
     */
    public JAXBElement<QueryMarketHierarchyRequestType> getQueryMarketHierarchy() {
        return queryMarketHierarchy;
    }

    /**
     * Sets the value of the queryMarketHierarchy property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryMarketHierarchyRequestType }{@code >}
     */
    public void setQueryMarketHierarchy(JAXBElement<QueryMarketHierarchyRequestType> value) {
        this.queryMarketHierarchy = value;
    }

}
