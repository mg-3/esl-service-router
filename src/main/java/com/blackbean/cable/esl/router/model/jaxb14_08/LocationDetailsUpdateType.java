
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LocationDetailsUpdateType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationDetailsUpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationGeography" type="{http://xml.blackbean.com/location/types}LocationGeographyType" minOccurs="0"/>
 *         &lt;element name="LocationTelephony" type="{http://xml.blackbean.com/location/types}LocationTelephonyType" minOccurs="0"/>
 *         &lt;element name="LocationNetworkConnectivity" type="{http://xml.blackbean.com/location/types}LocationNetworkConnectivityType" minOccurs="0"/>
 *         &lt;element name="AddressGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegacyLocationIDs" type="{http://xml.blackbean.com/location/types}ArrayOfLegacyLocationIDType" minOccurs="0"/>
 *         &lt;element name="LocationLegacyDetails" type="{http://xml.blackbean.com/location/types}LocationLegacyDetailsType" minOccurs="0"/>
 *         &lt;element name="LocationCustomFields" type="{http://xml.blackbean.com/location/types}ArrayOfLocationCustomFieldsType" minOccurs="0"/>
 *         &lt;element name="LocationComments" type="{http://xml.blackbean.com/location/types}ArrayOfLocationCommentsType" minOccurs="0"/>
 *         &lt;element name="UpdateLocationFromBillingBeforeModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationDetailsUpdateType", propOrder = {
        "locationGeography",
        "locationTelephony",
        "locationNetworkConnectivity",
        "addressGroupID",
        "legacyLocationIDs",
        "locationLegacyDetails",
        "locationCustomFields",
        "locationComments",
        "updateLocationFromBillingBeforeModify"
})
public class LocationDetailsUpdateType {

    @XmlElement(name = "LocationGeography")
    protected LocationGeographyType locationGeography;
    @XmlElement(name = "LocationTelephony")
    protected LocationTelephonyType locationTelephony;
    @XmlElement(name = "LocationNetworkConnectivity")
    protected LocationNetworkConnectivityType locationNetworkConnectivity;
    @XmlElementRef(name = "AddressGroupID", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressGroupID;
    @XmlElement(name = "LegacyLocationIDs")
    protected ArrayOfLegacyLocationIDType legacyLocationIDs;
    @XmlElement(name = "LocationLegacyDetails")
    protected LocationLegacyDetailsType locationLegacyDetails;
    @XmlElement(name = "LocationCustomFields")
    protected ArrayOfLocationCustomFieldsType locationCustomFields;
    @XmlElementRef(name = "LocationComments", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLocationCommentsType> locationComments;
    @XmlElement(name = "UpdateLocationFromBillingBeforeModify")
    protected Boolean updateLocationFromBillingBeforeModify;

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

    /**
     * Gets the value of the locationNetworkConnectivity property.
     *
     * @return possible object is
     * {@link LocationNetworkConnectivityType }
     */
    public LocationNetworkConnectivityType getLocationNetworkConnectivity() {
        return locationNetworkConnectivity;
    }

    /**
     * Sets the value of the locationNetworkConnectivity property.
     *
     * @param value allowed object is
     *              {@link LocationNetworkConnectivityType }
     */
    public void setLocationNetworkConnectivity(LocationNetworkConnectivityType value) {
        this.locationNetworkConnectivity = value;
    }

    /**
     * Gets the value of the addressGroupID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getAddressGroupID() {
        return addressGroupID;
    }

    /**
     * Sets the value of the addressGroupID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setAddressGroupID(JAXBElement<String> value) {
        this.addressGroupID = value;
    }

    /**
     * Gets the value of the legacyLocationIDs property.
     *
     * @return possible object is
     * {@link ArrayOfLegacyLocationIDType }
     */
    public ArrayOfLegacyLocationIDType getLegacyLocationIDs() {
        return legacyLocationIDs;
    }

    /**
     * Sets the value of the legacyLocationIDs property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLegacyLocationIDType }
     */
    public void setLegacyLocationIDs(ArrayOfLegacyLocationIDType value) {
        this.legacyLocationIDs = value;
    }

    /**
     * Gets the value of the locationLegacyDetails property.
     *
     * @return possible object is
     * {@link LocationLegacyDetailsType }
     */
    public LocationLegacyDetailsType getLocationLegacyDetails() {
        return locationLegacyDetails;
    }

    /**
     * Sets the value of the locationLegacyDetails property.
     *
     * @param value allowed object is
     *              {@link LocationLegacyDetailsType }
     */
    public void setLocationLegacyDetails(LocationLegacyDetailsType value) {
        this.locationLegacyDetails = value;
    }

    /**
     * Gets the value of the locationCustomFields property.
     *
     * @return possible object is
     * {@link ArrayOfLocationCustomFieldsType }
     */
    public ArrayOfLocationCustomFieldsType getLocationCustomFields() {
        return locationCustomFields;
    }

    /**
     * Sets the value of the locationCustomFields property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationCustomFieldsType }
     */
    public void setLocationCustomFields(ArrayOfLocationCustomFieldsType value) {
        this.locationCustomFields = value;
    }

    /**
     * Gets the value of the locationComments property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfLocationCommentsType }{@code >}
     */
    public JAXBElement<ArrayOfLocationCommentsType> getLocationComments() {
        return locationComments;
    }

    /**
     * Sets the value of the locationComments property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfLocationCommentsType }{@code >}
     */
    public void setLocationComments(JAXBElement<ArrayOfLocationCommentsType> value) {
        this.locationComments = value;
    }

    /**
     * Gets the value of the updateLocationFromBillingBeforeModify property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isUpdateLocationFromBillingBeforeModify() {
        return updateLocationFromBillingBeforeModify;
    }

    /**
     * Sets the value of the updateLocationFromBillingBeforeModify property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setUpdateLocationFromBillingBeforeModify(Boolean value) {
        this.updateLocationFromBillingBeforeModify = value;
    }

}
