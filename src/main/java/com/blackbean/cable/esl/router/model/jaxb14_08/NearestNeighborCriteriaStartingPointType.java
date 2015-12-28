
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NearestNeighborCriteriaStartingPointType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="NearestNeighborCriteriaStartingPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="legacyLocationID" type="{http://xml.blackbean.com/location/types}LegacyLocationIDCriteriaType" minOccurs="0"/>
 *         &lt;element name="geographicCoordinates" type="{http://xml.blackbean.com/location/types}GeographicCoordinatePointType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NearestNeighborCriteriaStartingPointType", propOrder = {
        "locationID",
        "legacyLocationID",
        "geographicCoordinates"
})
public class NearestNeighborCriteriaStartingPointType {

    protected Long locationID;
    protected LegacyLocationIDCriteriaType legacyLocationID;
    protected GeographicCoordinatePointType geographicCoordinates;

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
     * Gets the value of the legacyLocationID property.
     *
     * @return possible object is
     * {@link LegacyLocationIDCriteriaType }
     */
    public LegacyLocationIDCriteriaType getLegacyLocationID() {
        return legacyLocationID;
    }

    /**
     * Sets the value of the legacyLocationID property.
     *
     * @param value allowed object is
     *              {@link LegacyLocationIDCriteriaType }
     */
    public void setLegacyLocationID(LegacyLocationIDCriteriaType value) {
        this.legacyLocationID = value;
    }

    /**
     * Gets the value of the geographicCoordinates property.
     *
     * @return possible object is
     * {@link GeographicCoordinatePointType }
     */
    public GeographicCoordinatePointType getGeographicCoordinates() {
        return geographicCoordinates;
    }

    /**
     * Sets the value of the geographicCoordinates property.
     *
     * @param value allowed object is
     *              {@link GeographicCoordinatePointType }
     */
    public void setGeographicCoordinates(GeographicCoordinatePointType value) {
        this.geographicCoordinates = value;
    }

}
