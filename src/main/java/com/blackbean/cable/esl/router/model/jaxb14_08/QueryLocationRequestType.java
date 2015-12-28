
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLocationRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryLocationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressSearch" type="{http://xml.comcast.com/location/types}QueryLocationAddressSearchType" minOccurs="0"/>
 *         &lt;element name="legacyIDSearch" type="{http://xml.comcast.com/location/types}LegacyLocationIDCriteriaType" minOccurs="0"/>
 *         &lt;element name="geospatialSearch" type="{http://xml.comcast.com/location/types}GeospatialSearchCriteriaType" minOccurs="0"/>
 *         &lt;element name="resultSpec" type="{http://xml.comcast.com/location/types}QueryResultSpecType" minOccurs="0"/>
 *         &lt;element name="showDuplicateAddresses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLocationRequestType", propOrder = {
        "addressSearch",
        "legacyIDSearch",
        "geospatialSearch",
        "resultSpec",
        "showDuplicateAddresses"
})
public class QueryLocationRequestType {

    protected QueryLocationAddressSearchType addressSearch;
    protected LegacyLocationIDCriteriaType legacyIDSearch;
    protected GeospatialSearchCriteriaType geospatialSearch;
    protected QueryResultSpecType resultSpec;
    protected Boolean showDuplicateAddresses;

    /**
     * Gets the value of the addressSearch property.
     *
     * @return possible object is
     * {@link QueryLocationAddressSearchType }
     */
    public QueryLocationAddressSearchType getAddressSearch() {
        return addressSearch;
    }

    /**
     * Sets the value of the addressSearch property.
     *
     * @param value allowed object is
     *              {@link QueryLocationAddressSearchType }
     */
    public void setAddressSearch(QueryLocationAddressSearchType value) {
        this.addressSearch = value;
    }

    /**
     * Gets the value of the legacyIDSearch property.
     *
     * @return possible object is
     * {@link LegacyLocationIDCriteriaType }
     */
    public LegacyLocationIDCriteriaType getLegacyIDSearch() {
        return legacyIDSearch;
    }

    /**
     * Sets the value of the legacyIDSearch property.
     *
     * @param value allowed object is
     *              {@link LegacyLocationIDCriteriaType }
     */
    public void setLegacyIDSearch(LegacyLocationIDCriteriaType value) {
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

    /**
     * Gets the value of the showDuplicateAddresses property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isShowDuplicateAddresses() {
        return showDuplicateAddresses;
    }

    /**
     * Sets the value of the showDuplicateAddresses property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setShowDuplicateAddresses(Boolean value) {
        this.showDuplicateAddresses = value;
    }

}
