
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ModifyLocationRequestDetailsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ModifyLocationRequestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModificationRequestType" type="{http://xml.comcast.com/location/types}ModificationRequestType"/>
 *         &lt;element name="LocationPostalAddress" type="{http://xml.comcast.com/location/types}PostalAddressUpdateType" minOccurs="0"/>
 *         &lt;element name="AlternatePostalAddress" type="{http://xml.comcast.com/location/types}PostalAddressUpdateType" minOccurs="0"/>
 *         &lt;element name="MarketID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LocationCapabilityExceptions" type="{http://xml.comcast.com/location/types}CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="LocationDetails" type="{http://xml.comcast.com/location/types}LocationDetailsUpdateType" minOccurs="0"/>
 *         &lt;element name="GeographicCoordinates" type="{http://xml.comcast.com/location/types}GeographicCoordinateMeasurementType" minOccurs="0"/>
 *         &lt;element name="LocationHouseAssociation" type="{http://xml.comcast.com/location/types}ModifyLocationHouseAssociationType" minOccurs="0"/>
 *         &lt;element name="fraudIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationServiceability" type="{http://xml.comcast.com/location/types}LocationServiceabilityUpdateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyLocationRequestDetailsType", propOrder = {
        "modificationRequestType",
        "locationPostalAddress",
        "alternatePostalAddress",
        "marketID",
        "locationCapabilityExceptions",
        "locationDetails",
        "geographicCoordinates",
        "locationHouseAssociation",
        "fraudIndicator",
        "locationServiceability"
})
public class ModifyLocationRequestDetailsType {

    @XmlElement(name = "ModificationRequestType", required = true)
    @XmlSchemaType(name = "string")
    protected ModificationRequestType modificationRequestType;
    @XmlElementRef(name = "LocationPostalAddress", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<PostalAddressUpdateType> locationPostalAddress;
    @XmlElement(name = "AlternatePostalAddress")
    protected PostalAddressUpdateType alternatePostalAddress;
    @XmlElementRef(name = "MarketID", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> marketID;
    @XmlElement(name = "LocationCapabilityExceptions")
    protected CapabilitiesType locationCapabilityExceptions;
    @XmlElement(name = "LocationDetails")
    protected LocationDetailsUpdateType locationDetails;
    @XmlElement(name = "GeographicCoordinates")
    protected GeographicCoordinateMeasurementType geographicCoordinates;
    @XmlElement(name = "LocationHouseAssociation")
    protected ModifyLocationHouseAssociationType locationHouseAssociation;
    protected String fraudIndicator;
    @XmlElement(name = "LocationServiceability")
    protected LocationServiceabilityUpdateType locationServiceability;

    /**
     * Gets the value of the modificationRequestType property.
     *
     * @return possible object is
     * {@link ModificationRequestType }
     */
    public ModificationRequestType getModificationRequestType() {
        return modificationRequestType;
    }

    /**
     * Sets the value of the modificationRequestType property.
     *
     * @param value allowed object is
     *              {@link ModificationRequestType }
     */
    public void setModificationRequestType(ModificationRequestType value) {
        this.modificationRequestType = value;
    }

    /**
     * Gets the value of the locationPostalAddress property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link PostalAddressUpdateType }{@code >}
     */
    public JAXBElement<PostalAddressUpdateType> getLocationPostalAddress() {
        return locationPostalAddress;
    }

    /**
     * Sets the value of the locationPostalAddress property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link PostalAddressUpdateType }{@code >}
     */
    public void setLocationPostalAddress(JAXBElement<PostalAddressUpdateType> value) {
        this.locationPostalAddress = value;
    }

    /**
     * Gets the value of the alternatePostalAddress property.
     *
     * @return possible object is
     * {@link PostalAddressUpdateType }
     */
    public PostalAddressUpdateType getAlternatePostalAddress() {
        return alternatePostalAddress;
    }

    /**
     * Sets the value of the alternatePostalAddress property.
     *
     * @param value allowed object is
     *              {@link PostalAddressUpdateType }
     */
    public void setAlternatePostalAddress(PostalAddressUpdateType value) {
        this.alternatePostalAddress = value;
    }

    /**
     * Gets the value of the marketID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    public JAXBElement<Long> getMarketID() {
        return marketID;
    }

    /**
     * Sets the value of the marketID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    public void setMarketID(JAXBElement<Long> value) {
        this.marketID = value;
    }

    /**
     * Gets the value of the locationCapabilityExceptions property.
     *
     * @return possible object is
     * {@link CapabilitiesType }
     */
    public CapabilitiesType getLocationCapabilityExceptions() {
        return locationCapabilityExceptions;
    }

    /**
     * Sets the value of the locationCapabilityExceptions property.
     *
     * @param value allowed object is
     *              {@link CapabilitiesType }
     */
    public void setLocationCapabilityExceptions(CapabilitiesType value) {
        this.locationCapabilityExceptions = value;
    }

    /**
     * Gets the value of the locationDetails property.
     *
     * @return possible object is
     * {@link LocationDetailsUpdateType }
     */
    public LocationDetailsUpdateType getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     *
     * @param value allowed object is
     *              {@link LocationDetailsUpdateType }
     */
    public void setLocationDetails(LocationDetailsUpdateType value) {
        this.locationDetails = value;
    }

    /**
     * Gets the value of the geographicCoordinates property.
     *
     * @return possible object is
     * {@link GeographicCoordinateMeasurementType }
     */
    public GeographicCoordinateMeasurementType getGeographicCoordinates() {
        return geographicCoordinates;
    }

    /**
     * Sets the value of the geographicCoordinates property.
     *
     * @param value allowed object is
     *              {@link GeographicCoordinateMeasurementType }
     */
    public void setGeographicCoordinates(GeographicCoordinateMeasurementType value) {
        this.geographicCoordinates = value;
    }

    /**
     * Gets the value of the locationHouseAssociation property.
     *
     * @return possible object is
     * {@link ModifyLocationHouseAssociationType }
     */
    public ModifyLocationHouseAssociationType getLocationHouseAssociation() {
        return locationHouseAssociation;
    }

    /**
     * Sets the value of the locationHouseAssociation property.
     *
     * @param value allowed object is
     *              {@link ModifyLocationHouseAssociationType }
     */
    public void setLocationHouseAssociation(ModifyLocationHouseAssociationType value) {
        this.locationHouseAssociation = value;
    }

    /**
     * Gets the value of the fraudIndicator property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFraudIndicator() {
        return fraudIndicator;
    }

    /**
     * Sets the value of the fraudIndicator property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFraudIndicator(String value) {
        this.fraudIndicator = value;
    }

    /**
     * Gets the value of the locationServiceability property.
     *
     * @return possible object is
     * {@link LocationServiceabilityUpdateType }
     */
    public LocationServiceabilityUpdateType getLocationServiceability() {
        return locationServiceability;
    }

    /**
     * Sets the value of the locationServiceability property.
     *
     * @param value allowed object is
     *              {@link LocationServiceabilityUpdateType }
     */
    public void setLocationServiceability(LocationServiceabilityUpdateType value) {
        this.locationServiceability = value;
    }

}
