
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MarketHierarchyResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="MarketHierarchyResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hierarchyID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hierarchyLevel" type="{http://xml.blackbean.com/location/types}ArrayOfMarketHierarchyLevelResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketHierarchyResponseType", propOrder = {
        "hierarchyID",
        "hierarchyLevel"
})
public class MarketHierarchyResponseType {

    @XmlElementRef(name = "hierarchyID", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hierarchyID;
    @XmlElement(required = true)
    protected ArrayOfMarketHierarchyLevelResponseType hierarchyLevel;

    /**
     * Gets the value of the hierarchyID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    public JAXBElement<Integer> getHierarchyID() {
        return hierarchyID;
    }

    /**
     * Sets the value of the hierarchyID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    public void setHierarchyID(JAXBElement<Integer> value) {
        this.hierarchyID = value;
    }

    /**
     * Gets the value of the hierarchyLevel property.
     *
     * @return possible object is
     * {@link ArrayOfMarketHierarchyLevelResponseType }
     */
    public ArrayOfMarketHierarchyLevelResponseType getHierarchyLevel() {
        return hierarchyLevel;
    }

    /**
     * Sets the value of the hierarchyLevel property.
     *
     * @param value allowed object is
     *              {@link ArrayOfMarketHierarchyLevelResponseType }
     */
    public void setHierarchyLevel(ArrayOfMarketHierarchyLevelResponseType value) {
        this.hierarchyLevel = value;
    }

}
