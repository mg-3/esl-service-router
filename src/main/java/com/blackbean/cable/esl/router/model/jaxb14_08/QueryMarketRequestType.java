
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMarketRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryMarketRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressSearch" type="{http://xml.comcast.com/location/types}QueryMarketAddressSearchType" minOccurs="0"/>
 *         &lt;element name="LegacyIDSearch" type="{http://xml.comcast.com/location/types}LegacyMarketIDCriteriaType" minOccurs="0"/>
 *         &lt;element name="geospatialSearch" type="{http://xml.comcast.com/location/types}GeospatialSearchCriteriaType" minOccurs="0"/>
 *         &lt;element name="resultSpec" type="{http://xml.comcast.com/location/types}QueryResultSpecType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMarketRequestType", propOrder = {
        "addressSearch",
        "legacyIDSearch",
        "geospatialSearch",
        "resultSpec"
})
public class QueryMarketRequestType {

    protected QueryMarketAddressSearchType addressSearch;
    @XmlElement(name = "LegacyIDSearch")
    protected LegacyMarketIDCriteriaType legacyIDSearch;
    protected GeospatialSearchCriteriaType geospatialSearch;
    protected QueryResultSpecType resultSpec;

    /**
     * Gets the value of the addressSearch property.
     *
     * @return possible object is
     * {@link QueryMarketAddressSearchType }
     */
    public QueryMarketAddressSearchType getAddressSearch() {
        return addressSearch;
    }

    /**
     * Sets the value of the addressSearch property.
     *
     * @param value allowed object is
     *              {@link QueryMarketAddressSearchType }
     */
    public void setAddressSearch(QueryMarketAddressSearchType value) {
        this.addressSearch = value;
    }

    /**
     * Gets the value of the legacyIDSearch property.
     *
     * @return possible object is
     * {@link LegacyMarketIDCriteriaType }
     */
    public LegacyMarketIDCriteriaType getLegacyIDSearch() {
        return legacyIDSearch;
    }

    /**
     * Sets the value of the legacyIDSearch property.
     *
     * @param value allowed object is
     *              {@link LegacyMarketIDCriteriaType }
     */
    public void setLegacyIDSearch(LegacyMarketIDCriteriaType value) {
        this.legacyIDSearch = value;
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
