
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLocationResponseItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddLocationResponseItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="location" type="{http://xml.blackbean.com/location/types}LocationType" minOccurs="0"/>
 *         &lt;element name="MultiDwellingUnitDetails" type="{http://xml.blackbean.com/location/types}MultiDwellingUnitDetailsResponseType" minOccurs="0"/>
 *         &lt;element name="CopyLocationToBillingResponse" type="{http://xml.blackbean.com/location/types}CopyLocationToBillingResponseItemType" minOccurs="0"/>
 *         &lt;element name="responseStatus" type="{http://xml.blackbean.com/location/types}ResponseStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLocationResponseItemType", propOrder = {
        "requestRefNum",
        "location",
        "multiDwellingUnitDetails",
        "copyLocationToBillingResponse",
        "responseStatus"
})
public class AddLocationResponseItemType {

    @XmlElement(name = "RequestRefNum")
    protected int requestRefNum;
    protected LocationType location;
    @XmlElement(name = "MultiDwellingUnitDetails")
    protected MultiDwellingUnitDetailsResponseType multiDwellingUnitDetails;
    @XmlElement(name = "CopyLocationToBillingResponse")
    protected CopyLocationToBillingResponseItemType copyLocationToBillingResponse;
    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;

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

    /**
     * Gets the value of the multiDwellingUnitDetails property.
     *
     * @return possible object is
     * {@link MultiDwellingUnitDetailsResponseType }
     */
    public MultiDwellingUnitDetailsResponseType getMultiDwellingUnitDetails() {
        return multiDwellingUnitDetails;
    }

    /**
     * Sets the value of the multiDwellingUnitDetails property.
     *
     * @param value allowed object is
     *              {@link MultiDwellingUnitDetailsResponseType }
     */
    public void setMultiDwellingUnitDetails(MultiDwellingUnitDetailsResponseType value) {
        this.multiDwellingUnitDetails = value;
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

}
