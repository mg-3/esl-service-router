
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketHierarchyPathsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="MarketHierarchyPathsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hierarchyPath" type="{http://xml.blackbean.com/location/types}MarketHierarchyResponseType"/>
 *         &lt;element name="hierarchyNode" type="{http://xml.blackbean.com/location/types}ArrayOfMarketHierarchyNodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketHierarchyPathsType", propOrder = {
        "hierarchyPath",
        "hierarchyNode"
})
public class MarketHierarchyPathsType {

    @XmlElement(required = true)
    protected MarketHierarchyResponseType hierarchyPath;
    protected ArrayOfMarketHierarchyNodeType hierarchyNode;

    /**
     * Gets the value of the hierarchyPath property.
     *
     * @return possible object is
     * {@link MarketHierarchyResponseType }
     */
    public MarketHierarchyResponseType getHierarchyPath() {
        return hierarchyPath;
    }

    /**
     * Sets the value of the hierarchyPath property.
     *
     * @param value allowed object is
     *              {@link MarketHierarchyResponseType }
     */
    public void setHierarchyPath(MarketHierarchyResponseType value) {
        this.hierarchyPath = value;
    }

    /**
     * Gets the value of the hierarchyNode property.
     *
     * @return possible object is
     * {@link ArrayOfMarketHierarchyNodeType }
     */
    public ArrayOfMarketHierarchyNodeType getHierarchyNode() {
        return hierarchyNode;
    }

    /**
     * Sets the value of the hierarchyNode property.
     *
     * @param value allowed object is
     *              {@link ArrayOfMarketHierarchyNodeType }
     */
    public void setHierarchyNode(ArrayOfMarketHierarchyNodeType value) {
        this.hierarchyNode = value;
    }

}
