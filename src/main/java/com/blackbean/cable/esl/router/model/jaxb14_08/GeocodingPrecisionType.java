
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for GeocodingPrecisionType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GeocodingPrecisionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchMethod" type="{http://xml.blackbean.com/location/types}GeocodingResultMatchCategoryType"/>
 *         &lt;element name="GeocodingPointLocation" type="{http://xml.blackbean.com/location/types}GeocodingResultPointLocationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodingPrecisionType", propOrder = {
        "matchMethod",
        "geocodingPointLocation"
})
public class GeocodingPrecisionType {

    @XmlElement(name = "MatchMethod", required = true)
    @XmlSchemaType(name = "string")
    protected GeocodingResultMatchCategoryType matchMethod;
    @XmlElement(name = "GeocodingPointLocation", required = true)
    @XmlSchemaType(name = "string")
    protected GeocodingResultPointLocationType geocodingPointLocation;

    /**
     * Gets the value of the matchMethod property.
     *
     * @return possible object is
     * {@link GeocodingResultMatchCategoryType }
     */
    public GeocodingResultMatchCategoryType getMatchMethod() {
        return matchMethod;
    }

    /**
     * Sets the value of the matchMethod property.
     *
     * @param value allowed object is
     *              {@link GeocodingResultMatchCategoryType }
     */
    public void setMatchMethod(GeocodingResultMatchCategoryType value) {
        this.matchMethod = value;
    }

    /**
     * Gets the value of the geocodingPointLocation property.
     *
     * @return possible object is
     * {@link GeocodingResultPointLocationType }
     */
    public GeocodingResultPointLocationType getGeocodingPointLocation() {
        return geocodingPointLocation;
    }

    /**
     * Sets the value of the geocodingPointLocation property.
     *
     * @param value allowed object is
     *              {@link GeocodingResultPointLocationType }
     */
    public void setGeocodingPointLocation(GeocodingResultPointLocationType value) {
        this.geocodingPointLocation = value;
    }

}
