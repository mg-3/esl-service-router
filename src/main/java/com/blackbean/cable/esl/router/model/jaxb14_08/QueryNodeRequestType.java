
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryNodeRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryNodeRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nodeSearch" type="{http://xml.blackbean.com/location/types}QueryNodeDefaultSearchCriteriaType" minOccurs="0"/>
 *         &lt;element name="geospatialSearch" type="{http://xml.blackbean.com/location/types}GeospatialSearchCriteriaType" minOccurs="0"/>
 *         &lt;element name="resultSpec" type="{http://xml.blackbean.com/location/types}QueryResultSpecType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryNodeRequestType", propOrder = {
        "nodeSearch",
        "geospatialSearch",
        "resultSpec"
})
public class QueryNodeRequestType {

    protected QueryNodeDefaultSearchCriteriaType nodeSearch;
    protected GeospatialSearchCriteriaType geospatialSearch;
    protected QueryResultSpecType resultSpec;

    /**
     * Gets the value of the nodeSearch property.
     *
     * @return possible object is
     * {@link QueryNodeDefaultSearchCriteriaType }
     */
    public QueryNodeDefaultSearchCriteriaType getNodeSearch() {
        return nodeSearch;
    }

    /**
     * Sets the value of the nodeSearch property.
     *
     * @param value allowed object is
     *              {@link QueryNodeDefaultSearchCriteriaType }
     */
    public void setNodeSearch(QueryNodeDefaultSearchCriteriaType value) {
        this.nodeSearch = value;
    }

    /**
     * Gets the value of the geospatialSearch property.
     *
     * @return possible object is
     * {@link GeospatialSearchCriteriaType }
     */
    public GeospatialSearchCriteriaType getGeospatialSearch() {
        return geospatialSearch;
    }

    /**
     * Sets the value of the geospatialSearch property.
     *
     * @param value allowed object is
     *              {@link GeospatialSearchCriteriaType }
     */
    public void setGeospatialSearch(GeospatialSearchCriteriaType value) {
        this.geospatialSearch = value;
    }

    /**
     * Gets the value of the resultSpec property.
     *
     * @return possible object is
     * {@link QueryResultSpecType }
     */
    public QueryResultSpecType getResultSpec() {
        return resultSpec;
    }

    /**
     * Sets the value of the resultSpec property.
     *
     * @param value allowed object is
     *              {@link QueryResultSpecType }
     */
    public void setResultSpec(QueryResultSpecType value) {
        this.resultSpec = value;
    }

}
