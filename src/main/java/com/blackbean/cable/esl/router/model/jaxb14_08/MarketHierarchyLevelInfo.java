
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketHierarchyLevelInfo complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="MarketHierarchyLevelInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketHierarchy" type="{http://xml.comcast.com/location/types}ArrayOfMarketHierarchyLevelResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketHierarchyLevelInfo", propOrder = {
        "marketHierarchy"
})
public class MarketHierarchyLevelInfo {

    @XmlElementRef(name = "marketHierarchy", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMarketHierarchyLevelResponseType> marketHierarchy;

    /**
     * Gets the value of the marketHierarchy property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfMarketHierarchyLevelResponseType }{@code >}
     */
    public JAXBElement<ArrayOfMarketHierarchyLevelResponseType> getMarketHierarchy() {
        return marketHierarchy;
    }

    /**
     * Sets the value of the marketHierarchy property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfMarketHierarchyLevelResponseType }{@code >}
     */
    public void setMarketHierarchy(JAXBElement<ArrayOfMarketHierarchyLevelResponseType> value) {
        this.marketHierarchy = value;
    }

}
