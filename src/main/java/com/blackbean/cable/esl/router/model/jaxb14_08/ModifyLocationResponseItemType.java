
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ModifyLocationResponseItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ModifyLocationResponseItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LocationStatus" type="{http://xml.comcast.com/location/types}LocationStatusType" minOccurs="0"/>
 *         &lt;element name="AddressStandardizationMatchStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CopyLocationToBillingResponse" type="{http://xml.comcast.com/location/types}CopyLocationToBillingResponseItemType" minOccurs="0"/>
 *         &lt;element name="responseStatus" type="{http://xml.comcast.com/location/types}ResponseStatusType"/>
 *         &lt;element name="Location" type="{http://xml.comcast.com/location/types}LocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyLocationResponseItemType", propOrder = {
        "requestRefNum",
        "locationStatus",
        "addressStandardizationMatchStatus",
        "copyLocationToBillingResponse",
        "responseStatus",
        "location"
})
public class ModifyLocationResponseItemType {

    @XmlElement(name = "RequestRefNum")
    protected int requestRefNum;
    @XmlElement(name = "LocationStatus")
    @XmlSchemaType(name = "string")
    protected LocationStatusType locationStatus;
    @XmlElement(name = "AddressStandardizationMatchStatus")
    protected String addressStandardizationMatchStatus;
    @XmlElement(name = "CopyLocationToBillingResponse")
    protected CopyLocationToBillingResponseItemType copyLocationToBillingResponse;
    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;
    @XmlElement(name = "Location")
    protected LocationType location;

    /**
     * Gets the value of the requestRefNum property.
     */
    public int getRequestRefNum() {
        return requestRefNum;
    }

    /**
     * Sets the value of the requestRefNum property.
     */
    public void setRequestRefNum(int value) {
        this.requestRefNum = value;
    }

    /**
     * Gets the value of the locationStatus property.
     *
     * @return possible object is
     * {@link LocationStatusType }
     */
    public LocationStatusType getLocationStatus() {
        return locationStatus;
    }

    /**
     * Sets the value of the locationStatus property.
     *
     * @param value allowed object is
     *              {@link LocationStatusType }
     */
    public void setLocationStatus(LocationStatusType value) {
        this.locationStatus = value;
    }

    /**
     * Gets the value of the addressStandardizationMatchStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAddressStandardizationMatchStatus() {
        return addressStandardizationMatchStatus;
    }

    /**
     * Sets the value of the addressStandardizationMatchStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAddressStandardizationMatchStatus(String value) {
        this.addressStandardizationMatchStatus = value;
    }

    /**
     * Gets the value of the copyLocationToBillingResponse property.
     *
     * @return possible object is
     * {@link CopyLocationToBillingResponseItemType }
     */
    public CopyLocationToBillingResponseItemType getCopyLocationToBillingResponse() {
        return copyLocationToBillingResponse;
    }

    /**
     * Sets the value of the copyLocationToBillingResponse property.
     *
     * @param value allowed object is
     *              {@link CopyLocationToBillingResponseItemType }
     */
    public void setCopyLocationToBillingResponse(CopyLocationToBillingResponseItemType value) {
        this.copyLocationToBillingResponse = value;
    }

    /**
     * Gets the value of the responseStatus property.
     *
     * @return possible object is
     * {@link ResponseStatusType }
     */
    public ResponseStatusType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     *
     * @param value allowed object is
     *              {@link ResponseStatusType }
     */
    public void setResponseStatus(ResponseStatusType value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the location property.
     *
     * @return possible object is
     * {@link LocationType }
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value allowed object is
     *              {@link LocationType }
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

}
