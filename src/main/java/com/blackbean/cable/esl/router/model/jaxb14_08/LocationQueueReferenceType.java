
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LocationQueueReferenceType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationQueueReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationQueueID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RequestedPriority" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="5"/>
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QueueStatus" type="{http://xml.blackbean.com/location/types}LocationQueueStatusType"/>
 *         &lt;element name="SubmitterInfo" type="{http://xml.blackbean.com/location/types}LocationQueueContactInfoType"/>
 *         &lt;element name="LocationQueueAddress" type="{http://xml.blackbean.com/location/types}LocationQueueAddressType"/>
 *         &lt;element name="LeadID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NeedByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="marketID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationQueueReferenceType", propOrder = {
        "locationQueueID",
        "requestedPriority",
        "queueStatus",
        "submitterInfo",
        "locationQueueAddress",
        "leadID",
        "needByDate",
        "createdDate",
        "locationID",
        "marketID"
})
public class LocationQueueReferenceType {

    @XmlElement(name = "LocationQueueID")
    protected long locationQueueID;
    @XmlElementRef(name = "RequestedPriority", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> requestedPriority;
    @XmlElement(name = "QueueStatus", required = true)
    @XmlSchemaType(name = "string")
    protected LocationQueueStatusType queueStatus;
    @XmlElement(name = "SubmitterInfo", required = true)
    protected LocationQueueContactInfoType submitterInfo;
    @XmlElement(name = "LocationQueueAddress", required = true)
    protected LocationQueueAddressType locationQueueAddress;
    @XmlElement(name = "LeadID")
    protected String leadID;
    @XmlElement(name = "NeedByDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar needByDate;
    @XmlElement(name = "CreatedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected long locationID;
    protected Long marketID;

    /**
     * Gets the value of the locationQueueID property.
     */
    public long getLocationQueueID() {
        return locationQueueID;
    }

    /**
     * Sets the value of the locationQueueID property.
     */
    public void setLocationQueueID(long value) {
        this.locationQueueID = value;
    }

    /**
     * Gets the value of the requestedPriority property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    public JAXBElement<Integer> getRequestedPriority() {
        return requestedPriority;
    }

    /**
     * Sets the value of the requestedPriority property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    public void setRequestedPriority(JAXBElement<Integer> value) {
        this.requestedPriority = value;
    }

    /**
     * Gets the value of the queueStatus property.
     *
     * @return possible object is
     * {@link LocationQueueStatusType }
     */
    public LocationQueueStatusType getQueueStatus() {
        return queueStatus;
    }

    /**
     * Sets the value of the queueStatus property.
     *
     * @param value allowed object is
     *              {@link LocationQueueStatusType }
     */
    public void setQueueStatus(LocationQueueStatusType value) {
        this.queueStatus = value;
    }

    /**
     * Gets the value of the submitterInfo property.
     *
     * @return possible object is
     * {@link LocationQueueContactInfoType }
     */
    public LocationQueueContactInfoType getSubmitterInfo() {
        return submitterInfo;
    }

    /**
     * Sets the value of the submitterInfo property.
     *
     * @param value allowed object is
     *              {@link LocationQueueContactInfoType }
     */
    public void setSubmitterInfo(LocationQueueContactInfoType value) {
        this.submitterInfo = value;
    }

    /**
     * Gets the value of the locationQueueAddress property.
     *
     * @return possible object is
     * {@link LocationQueueAddressType }
     */
    public LocationQueueAddressType getLocationQueueAddress() {
        return locationQueueAddress;
    }

    /**
     * Sets the value of the locationQueueAddress property.
     *
     * @param value allowed object is
     *              {@link LocationQueueAddressType }
     */
    public void setLocationQueueAddress(LocationQueueAddressType value) {
        this.locationQueueAddress = value;
    }

    /**
     * Gets the value of the leadID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLeadID() {
        return leadID;
    }

    /**
     * Sets the value of the leadID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLeadID(String value) {
        this.leadID = value;
    }

    /**
     * Gets the value of the needByDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getNeedByDate() {
        return needByDate;
    }

    /**
     * Sets the value of the needByDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setNeedByDate(XMLGregorianCalendar value) {
        this.needByDate = value;
    }

    /**
     * Gets the value of the createdDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
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
     * Gets the value of the marketID property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getMarketID() {
        return marketID;
    }

    /**
     * Sets the value of the marketID property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setMarketID(Long value) {
        this.marketID = value;
    }

}
