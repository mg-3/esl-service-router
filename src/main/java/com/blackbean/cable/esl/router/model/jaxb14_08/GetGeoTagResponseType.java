
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for GetGeoTagResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetGeoTagResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationTelephony" type="{http://xml.blackbean.com/location/types}LocationTelephonyType" minOccurs="0"/>
 *         &lt;element name="LocationGeography" type="{http://xml.blackbean.com/location/types}LocationGeographyType" minOccurs="0"/>
 *         &lt;element name="RateCenterCertification" type="{http://xml.blackbean.com/location/types}E911RateCenterCertificationType"/>
 *         &lt;element name="RateCenterServiceable" type="{http://xml.blackbean.com/location/types}E911RateCenterServiceableType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGeoTagResponseType", propOrder = {
        "locationTelephony",
        "locationGeography",
        "rateCenterCertification",
        "rateCenterServiceable"
})
public class GetGeoTagResponseType {

    @XmlElement(name = "LocationTelephony")
    protected LocationTelephonyType locationTelephony;
    @XmlElement(name = "LocationGeography")
    protected LocationGeographyType locationGeography;
    @XmlElement(name = "RateCenterCertification", required = true)
    @XmlSchemaType(name = "string")
    protected E911RateCenterCertificationType rateCenterCertification;
    @XmlElement(name = "RateCenterServiceable", required = true)
    protected E911RateCenterServiceableType rateCenterServiceable;

    /**
     * Gets the value of the locationTelephony property.
     *
     * @return possible object is
     * {@link LocationTelephonyType }
     */
    public LocationTelephonyType getLocationTelephony() {
        return locationTelephony;
    }

    /**
     * Sets the value of the locationTelephony property.
     *
     * @param value allowed object is
     *              {@link LocationTelephonyType }
     */
    public void setLocationTelephony(LocationTelephonyType value) {
        this.locationTelephony = value;
    }

    /**
     * Gets the value of the locationGeography property.
     *
     * @return possible object is
     * {@link LocationGeographyType }
     */
    public LocationGeographyType getLocationGeography() {
        return locationGeography;
    }

    /**
     * Sets the value of the locationGeography property.
     *
     * @param value allowed object is
     *              {@link LocationGeographyType }
     */
    public void setLocationGeography(LocationGeographyType value) {
        this.locationGeography = value;
    }

    /**
     * Gets the value of the rateCenterCertification property.
     *
     * @return possible object is
     * {@link E911RateCenterCertificationType }
     */
    public E911RateCenterCertificationType getRateCenterCertification() {
        return rateCenterCertification;
    }

    /**
     * Sets the value of the rateCenterCertification property.
     *
     * @param value allowed object is
     *              {@link E911RateCenterCertificationType }
     */
    public void setRateCenterCertification(E911RateCenterCertificationType value) {
        this.rateCenterCertification = value;
    }

    /**
     * Gets the value of the rateCenterServiceable property.
     *
     * @return possible object is
     * {@link E911RateCenterServiceableType }
     */
    public E911RateCenterServiceableType getRateCenterServiceable() {
        return rateCenterServiceable;
    }

    /**
     * Sets the value of the rateCenterServiceable property.
     *
     * @param value allowed object is
     *              {@link E911RateCenterServiceableType }
     */
    public void setRateCenterServiceable(E911RateCenterServiceableType value) {
        this.rateCenterServiceable = value;
    }

}
