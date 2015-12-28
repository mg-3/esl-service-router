
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGeoTagRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetGeoTagRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeographicCoordinates" type="{http://xml.comcast.com/location/types}GetGeoTagRequestCoordinateType" minOccurs="0"/>
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGeoTagRequestType", propOrder = {
        "geographicCoordinates",
        "locationID"
})
public class GetGeoTagRequestType {

    @XmlElement(name = "GeographicCoordinates")
    protected GetGeoTagRequestCoordinateType geographicCoordinates;
    protected Long locationID;

    /**
     * Gets the value of the geographicCoordinates property.
     *
     * @return possible object is
     * {@link GetGeoTagRequestCoordinateType }
     */
    public GetGeoTagRequestCoordinateType getGeographicCoordinates() {
        return geographicCoordinates;
    }

    /**
     * Sets the value of the geographicCoordinates property.
     *
     * @param value allowed object is
     *              {@link GetGeoTagRequestCoordinateType }
     */
    public void setGeographicCoordinates(GetGeoTagRequestCoordinateType value) {
        this.geographicCoordinates = value;
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
