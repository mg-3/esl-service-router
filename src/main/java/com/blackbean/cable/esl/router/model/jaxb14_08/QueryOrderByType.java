
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for QueryOrderByType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryOrderByType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderField" type="{http://xml.comcast.com/location/types}QuerySortFieldsType"/>
 *         &lt;element name="ordering" type="{http://xml.comcast.com/location/types}SortOrderType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryOrderByType", propOrder = {
        "orderField",
        "ordering"
})
public class QueryOrderByType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected QuerySortFieldsType orderField;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SortOrderType ordering;

    /**
     * Gets the value of the orderField property.
     *
     * @return possible object is
     * {@link QuerySortFieldsType }
     */
    public QuerySortFieldsType getOrderField() {
        return orderField;
    }

    /**
     * Sets the value of the orderField property.
     *
     * @param value allowed object is
     *              {@link QuerySortFieldsType }
     */
    public void setOrderField(QuerySortFieldsType value) {
        this.orderField = value;
    }

    /**
     * Gets the value of the ordering property.
     *
     * @return possible object is
     * {@link SortOrderType }
     */
    public SortOrderType getOrdering() {
        return ordering;
    }

    /**
     * Sets the value of the ordering property.
     *
     * @param value allowed object is
     *              {@link SortOrderType }
     */
    public void setOrdering(SortOrderType value) {
        this.ordering = value;
    }

}
