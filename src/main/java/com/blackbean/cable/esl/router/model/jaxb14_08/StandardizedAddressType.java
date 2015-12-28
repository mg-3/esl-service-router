
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardizedAddressType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="StandardizedAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="closeMatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="postalAddress" type="{http://xml.blackbean.com/location/types}PostalAddressType"/>
 *         &lt;element name="geocodingResults" type="{http://xml.blackbean.com/location/types}GeocodingResultsType" minOccurs="0"/>
 *         &lt;element name="e911Availability" type="{http://xml.blackbean.com/location/types}E911AvailabilityType" minOccurs="0"/>
 *         &lt;element name="LocationGeography" type="{http://xml.blackbean.com/location/types}LocationGeographyType" minOccurs="0"/>
 *         &lt;element name="LocationTelephony" type="{http://xml.blackbean.com/location/types}LocationTelephonyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardizedAddressType", propOrder = {
        "resultSequence",
        "closeMatch",
        "postalAddress",
        "geocodingResults",
        "e911Availability",
        "locationGeography",
        "locationTelephony"
})
public class StandardizedAddressType {

    protected int resultSequence;
    protected boolean closeMatch;
    @XmlElement(required = true)
    protected PostalAddressType postalAddress;
    protected GeocodingResultsType geocodingResults;
    protected E911AvailabilityType e911Availability;
    @XmlElement(name = "LocationGeography")
    protected LocationGeographyType locationGeography;
    @XmlElement(name = "LocationTelephony")
    protected LocationTelephonyType locationTelephony;

    /**
     * Gets the value of the resultSequence property.
     */
    public int getResultSequence() {
        return resultSequence;
    }

    /**
     * Sets the value of the resultSequence property.
     */
    public void setResultSequence(int value) {
        this.resultSequence = value;
    }

    /**
     * Gets the value of the closeMatch property.
     */
    public boolean isCloseMatch() {
        return closeMatch;
    }

    /**
     * Sets the value of the closeMatch property.
     */
    public void setCloseMatch(boolean value) {
        this.closeMatch = value;
    }

    /**
     * Gets the value of the postalAddress property.
     *
     * @return possible object is
     * {@link PostalAddressType }
     */
    public PostalAddressType getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     *
     * @param value allowed object is
     *              {@link PostalAddressType }
     */
    public void setPostalAddress(PostalAddressType value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the geocodingResults property.
     *
     * @return possible object is
     * {@link GeocodingResultsType }
     */
    public GeocodingResultsType getGeocodingResults() {
        return geocodingResults;
    }

    /**
     * Sets the value of the geocodingResults property.
     *
     * @param value allowed object is
     *              {@link GeocodingResultsType }
     */
    public void setGeocodingResults(GeocodingResultsType value) {
        this.geocodingResults = value;
    }

    /**
     * Gets the value of the e911Availability property.
     *
     * @return possible object is
     * {@link E911AvailabilityType }
     */
    public E911AvailabilityType getE911Availability() {
        return e911Availability;
    }

    /**
     * Sets the value of the e911Availability property.
     *
     * @param value allowed object is
     *              {@link E911AvailabilityType }
     */
    public void setE911Availability(E911AvailabilityType value) {
        this.e911Availability = value;
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

}
