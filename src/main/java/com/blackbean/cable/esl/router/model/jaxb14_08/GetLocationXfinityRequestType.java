
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLocationXfinityRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetLocationXfinityRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="legacyIDSearch" type="{http://xml.blackbean.com/location/types}LegacyLocationIDCriteriaType" minOccurs="0"/>
 *         &lt;element name="requestedResults" type="{http://xml.blackbean.com/location/types}GetLocationXfinityRequestedResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLocationXfinityRequestType", propOrder = {
        "locationID",
        "legacyIDSearch",
        "requestedResults"
})
public class GetLocationXfinityRequestType {

    protected Long locationID;
    protected LegacyLocationIDCriteriaType legacyIDSearch;
    protected GetLocationXfinityRequestedResultsType requestedResults;

    /**
     * Gets the value of the locationID property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setLocationID(Long value) {
        this.locationID = value;
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
     * Gets the value of the requestedResults property.
     *
     * @return possible object is
     * {@link GetLocationXfinityRequestedResultsType }
     */
    public GetLocationXfinityRequestedResultsType getRequestedResults() {
        return requestedResults;
    }

    /**
     * Sets the value of the requestedResults property.
     *
     * @param value allowed object is
     *              {@link GetLocationXfinityRequestedResultsType }
     */
    public void setRequestedResults(GetLocationXfinityRequestedResultsType value) {
        this.requestedResults = value;
    }

}
