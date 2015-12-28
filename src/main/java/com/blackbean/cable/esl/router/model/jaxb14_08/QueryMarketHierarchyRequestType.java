
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMarketHierarchyRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryMarketHierarchyRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketHierarchyCriteria" type="{http://xml.comcast.com/location/types}QueryMarketHierarchyRequestItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMarketHierarchyRequestType", propOrder = {
        "marketHierarchyCriteria"
})
public class QueryMarketHierarchyRequestType {

    @XmlElement(required = true)
    protected QueryMarketHierarchyRequestItemType marketHierarchyCriteria;

    /**
     * Gets the value of the marketHierarchyCriteria property.
     *
     * @return possible object is
     * {@link QueryMarketHierarchyRequestItemType }
     */
    public QueryMarketHierarchyRequestItemType getMarketHierarchyCriteria() {
        return marketHierarchyCriteria;
    }

    /**
     * Sets the value of the marketHierarchyCriteria property.
     *
     * @param value allowed object is
     *              {@link QueryMarketHierarchyRequestItemType }
     */
    public void setMarketHierarchyCriteria(QueryMarketHierarchyRequestItemType value) {
        this.marketHierarchyCriteria = value;
    }

}
