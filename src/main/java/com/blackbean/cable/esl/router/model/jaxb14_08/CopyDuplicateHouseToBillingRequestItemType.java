
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CopyDuplicateHouseToBillingRequestItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="CopyDuplicateHouseToBillingRequestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TemplateHouseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationLegacyDetails" type="{http://xml.comcast.com/location/types}LocationLegacyDetailsType"/>
 *         &lt;element name="DuplicateHousePurpose" type="{http://xml.comcast.com/location/types}DuplicateHouseUsageSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyDuplicateHouseToBillingRequestItemType", propOrder = {
        "requestRefNum",
        "locationID",
        "templateHouseNumber",
        "locationLegacyDetails",
        "duplicateHousePurpose"
})
public class CopyDuplicateHouseToBillingRequestItemType {

    @XmlElement(name = "RequestRefNum")
    protected int requestRefNum;
    @XmlElement(name = "LocationID")
    protected long locationID;
    @XmlElementRef(name = "TemplateHouseNumber", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> templateHouseNumber;
    @XmlElement(name = "LocationLegacyDetails", required = true)
    protected LocationLegacyDetailsType locationLegacyDetails;
    @XmlElement(name = "DuplicateHousePurpose")
    @XmlSchemaType(name = "string")
    protected DuplicateHouseUsageSimpleType duplicateHousePurpose;

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
     * Gets the value of the templateHouseNumber property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getTemplateHouseNumber() {
        return templateHouseNumber;
    }

    /**
     * Sets the value of the templateHouseNumber property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setTemplateHouseNumber(JAXBElement<String> value) {
        this.templateHouseNumber = value;
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
     * Gets the value of the duplicateHousePurpose property.
     *
     * @return possible object is
     * {@link DuplicateHouseUsageSimpleType }
     */
    public DuplicateHouseUsageSimpleType getDuplicateHousePurpose() {
        return duplicateHousePurpose;
    }

    /**
     * Sets the value of the duplicateHousePurpose property.
     *
     * @param value allowed object is
     *              {@link DuplicateHouseUsageSimpleType }
     */
    public void setDuplicateHousePurpose(DuplicateHouseUsageSimpleType value) {
        this.duplicateHousePurpose = value;
    }

}
