
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLocationFromBillerRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetLocationFromBillerRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legacyIDSearch" type="{http://xml.blackbean.com/location/types}LegacyLocationIDCriteriaType" minOccurs="0"/>
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLocationFromBillerRequestType", propOrder = {
        "legacyIDSearch",
        "locationID"
})
public class GetLocationFromBillerRequestType {

    protected LegacyLocationIDCriteriaType legacyIDSearch;
    protected Long locationID;

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

}
