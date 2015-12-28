
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryResultSpecType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryResultSpecType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startRow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="orderBy" type="{http://xml.blackbean.com/location/types}ArrayOfQueryOrderByType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResultSpecType", propOrder = {
        "maxRows",
        "startRow",
        "distance",
        "orderBy"
})
public class QueryResultSpecType {

    protected int maxRows;
    protected int startRow;
    protected Integer distance;
    protected ArrayOfQueryOrderByType orderBy;

    /**
     * Gets the value of the maxRows property.
     */
    public int getMaxRows() {
        return maxRows;
    }

    /**
     * Sets the value of the maxRows property.
     */
    public void setMaxRows(int value) {
        this.maxRows = value;
    }

    /**
     * Gets the value of the startRow property.
     */
    public int getStartRow() {
        return startRow;
    }

    /**
     * Sets the value of the startRow property.
     */
    public void setStartRow(int value) {
        this.startRow = value;
    }

    /**
     * Gets the value of the distance property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setDistance(Integer value) {
        this.distance = value;
    }

    /**
     * Gets the value of the orderBy property.
     *
     * @return possible object is
     * {@link ArrayOfQueryOrderByType }
     */
    public ArrayOfQueryOrderByType getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     *
     * @param value allowed object is
     *              {@link ArrayOfQueryOrderByType }
     */
    public void setOrderBy(ArrayOfQueryOrderByType value) {
        this.orderBy = value;
    }

}
