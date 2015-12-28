
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMarketHierarchyResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryMarketHierarchyResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hierarchyPaths" type="{http://xml.comcast.com/location/types}ArrayOfMarketHierarchyPathsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMarketHierarchyResponseType", propOrder = {
        "hierarchyPaths"
})
public class QueryMarketHierarchyResponseType {

    protected ArrayOfMarketHierarchyPathsType hierarchyPaths;

    /**
     * Gets the value of the hierarchyPaths property.
     *
     * @return possible object is
     * {@link ArrayOfMarketHierarchyPathsType }
     */
    public ArrayOfMarketHierarchyPathsType getHierarchyPaths() {
        return hierarchyPaths;
    }

    /**
     * Sets the value of the hierarchyPaths property.
     *
     * @param value allowed object is
     *              {@link ArrayOfMarketHierarchyPathsType }
     */
    public void setHierarchyPaths(ArrayOfMarketHierarchyPathsType value) {
        this.hierarchyPaths = value;
    }

}
