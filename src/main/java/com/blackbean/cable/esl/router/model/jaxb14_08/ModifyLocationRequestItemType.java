
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyLocationRequestItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ModifyLocationRequestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ModificationRequestDetails" type="{http://xml.comcast.com/location/types}ArrayOfModifyLocationRequestDetailsType"/>
 *         &lt;element name="AddressVerificationDetails" type="{http://xml.comcast.com/location/types}AddressVerificationDetailsType" minOccurs="0"/>
 *         &lt;element name="IncludeLocationDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CopyLocationToBillingWhenComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyLocationRequestItemType", propOrder = {
        "requestRefNum",
        "locationID",
        "modificationRequestDetails",
        "addressVerificationDetails",
        "includeLocationDetails",
        "copyLocationToBillingWhenComplete"
})
public class ModifyLocationRequestItemType {

    @XmlElement(name = "RequestRefNum")
    protected int requestRefNum;
    @XmlElement(name = "LocationID")
    protected long locationID;
    @XmlElement(name = "ModificationRequestDetails", required = true)
    protected ArrayOfModifyLocationRequestDetailsType modificationRequestDetails;
    @XmlElement(name = "AddressVerificationDetails")
    protected AddressVerificationDetailsType addressVerificationDetails;
    @XmlElement(name = "IncludeLocationDetails")
    protected Boolean includeLocationDetails;
    @XmlElement(name = "CopyLocationToBillingWhenComplete")
    protected Boolean copyLocationToBillingWhenComplete;

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
     * Gets the value of the locationID property.
     */
    public long getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     */
    public void setLocationID(long value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the modificationRequestDetails property.
     *
     * @return possible object is
     * {@link ArrayOfModifyLocationRequestDetailsType }
     */
    public ArrayOfModifyLocationRequestDetailsType getModificationRequestDetails() {
        return modificationRequestDetails;
    }

    /**
     * Sets the value of the modificationRequestDetails property.
     *
     * @param value allowed object is
     *              {@link ArrayOfModifyLocationRequestDetailsType }
     */
    public void setModificationRequestDetails(ArrayOfModifyLocationRequestDetailsType value) {
        this.modificationRequestDetails = value;
    }

    /**
     * Gets the value of the addressVerificationDetails property.
     *
     * @return possible object is
     * {@link AddressVerificationDetailsType }
     */
    public AddressVerificationDetailsType getAddressVerificationDetails() {
        return addressVerificationDetails;
    }

    /**
     * Sets the value of the addressVerificationDetails property.
     *
     * @param value allowed object is
     *              {@link AddressVerificationDetailsType }
     */
    public void setAddressVerificationDetails(AddressVerificationDetailsType value) {
        this.addressVerificationDetails = value;
    }

    /**
     * Gets the value of the includeLocationDetails property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIncludeLocationDetails() {
        return includeLocationDetails;
    }

    /**
     * Sets the value of the includeLocationDetails property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIncludeLocationDetails(Boolean value) {
        this.includeLocationDetails = value;
    }

    /**
     * Gets the value of the copyLocationToBillingWhenComplete property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isCopyLocationToBillingWhenComplete() {
        return copyLocationToBillingWhenComplete;
    }

    /**
     * Sets the value of the copyLocationToBillingWhenComplete property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setCopyLocationToBillingWhenComplete(Boolean value) {
        this.copyLocationToBillingWhenComplete = value;
    }

}
