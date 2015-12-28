
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLocationDetailsRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryLocationDetailsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressSearch" type="{http://xml.blackbean.com/location/types}QueryLocationAddressSearchType" minOccurs="0"/>
 *         &lt;element name="legacyIDSearch" type="{http://xml.blackbean.com/location/types}LegacyLocationIDCriteriaType" minOccurs="0"/>
 *         &lt;element name="resultSpec" type="{http://xml.blackbean.com/location/types}QueryResultSpecType" minOccurs="0"/>
 *         &lt;element name="showDuplicateAddresses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLocationDetailsRequestType", propOrder = {
        "addressSearch",
        "legacyIDSearch",
        "resultSpec",
        "showDuplicateAddresses"
})
public class QueryLocationDetailsRequestType {

    protected QueryLocationAddressSearchType addressSearch;
    protected LegacyLocationIDCriteriaType legacyIDSearch;
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
