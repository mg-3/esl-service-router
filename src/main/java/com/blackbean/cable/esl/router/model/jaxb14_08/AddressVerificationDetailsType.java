
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AddressVerificationDetailsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddressVerificationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationGeographyVerification" type="{http://xml.blackbean.com/location/types}LocationGeographyType" minOccurs="0"/>
 *         &lt;element name="LocationTelephonyVerification" type="{http://xml.blackbean.com/location/types}LocationTelephonyType" minOccurs="0"/>
 *         &lt;element name="AlternateAddressStatus" type="{http://xml.blackbean.com/location/types}AlternateAddressStatusType"/>
 *         &lt;element name="LocationGeographicCoordinatesVerification" type="{http://xml.blackbean.com/location/types}GeographicCoordinatePointType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressVerificationDetailsType", propOrder = {
        "locationGeographyVerification",
        "locationTelephonyVerification",
        "alternateAddressStatus",
        "locationGeographicCoordinatesVerification"
})
public class AddressVerificationDetailsType {

    @XmlElement(name = "LocationGeographyVerification")
    protected LocationGeographyType locationGeographyVerification;
    @XmlElement(name = "LocationTelephonyVerification")
    protected LocationTelephonyType locationTelephonyVerification;
    @XmlElement(name = "AlternateAddressStatus", required = true)
    @XmlSchemaType(name = "string")
    protected AlternateAddressStatusType alternateAddressStatus;
    @XmlElement(name = "LocationGeographicCoordinatesVerification")
    protected GeographicCoordinatePointType locationGeographicCoordinatesVerification;

    /**
     * Gets the value of the locationGeographyVerification property.
     *
     * @return possible object is
     * {@link LocationGeographyType }
     */
    public LocationGeographyType getLocationGeographyVerification() {
        return locationGeographyVerification;
    }

    /**
     * Sets the value of the locationGeographyVerification property.
     *
     * @param value allowed object is
     *              {@link LocationGeographyType }
     */
    public void setLocationGeographyVerification(LocationGeographyType value) {
        this.locationGeographyVerification = value;
    }

    /**
     * Gets the value of the locationTelephonyVerification property.
     *
     * @return possible object is
     * {@link LocationTelephonyType }
     */
    public LocationTelephonyType getLocationTelephonyVerification() {
        return locationTelephonyVerification;
    }

    /**
     * Sets the value of the locationTelephonyVerification property.
     *
     * @param value allowed object is
     *              {@link LocationTelephonyType }
     */
    public void setLocationTelephonyVerification(LocationTelephonyType value) {
        this.locationTelephonyVerification = value;
    }

    /**
     * Gets the value of the alternateAddressStatus property.
     *
     * @return possible object is
     * {@link AlternateAddressStatusType }
     */
    public AlternateAddressStatusType getAlternateAddressStatus() {
        return alternateAddressStatus;
    }

    /**
     * Sets the value of the alternateAddressStatus property.
     *
     * @param value allowed object is
     *              {@link AlternateAddressStatusType }
     */
    public void setAlternateAddressStatus(AlternateAddressStatusType value) {
        this.alternateAddressStatus = value;
    }

    /**
     * Gets the value of the locationGeographicCoordinatesVerification property.
     *
     * @return possible object is
     * {@link GeographicCoordinatePointType }
     */
    public GeographicCoordinatePointType getLocationGeographicCoordinatesVerification() {
        return locationGeographicCoordinatesVerification;
    }

    /**
     * Sets the value of the locationGeographicCoordinatesVerification property.
     *
     * @param value allowed object is
     *              {@link GeographicCoordinatePointType }
     */
    public void setLocationGeographicCoordinatesVerification(GeographicCoordinatePointType value) {
        this.locationGeographicCoordinatesVerification = value;
    }

}
