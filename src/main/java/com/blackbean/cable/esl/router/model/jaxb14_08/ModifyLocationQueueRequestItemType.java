
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ModifyLocationQueueRequestItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ModifyLocationQueueRequestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationQueueID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QueueStatus" type="{http://xml.blackbean.com/location/types}LocationQueueStatusType" minOccurs="0"/>
 *         &lt;element name="RequestedPriority" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="5"/>
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LeadID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NeedByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Comments" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubmitterInfo" type="{http://xml.blackbean.com/location/types}LocationQueueModifyContactInfoType" minOccurs="0"/>
 *         &lt;element name="MarketContact" type="{http://xml.blackbean.com/location/types}LocationQueueModifyContactInfoType" minOccurs="0"/>
 *         &lt;element name="LocationQueueAddress" type="{http://xml.blackbean.com/location/types}ModifyLocationQueueAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyLocationQueueRequestItemType", propOrder = {
        "locationQueueID",
        "requestRefNum",
        "queueStatus",
        "requestedPriority",
        "leadID",
        "marketID",
        "needByDate",
        "comments",
        "submitterInfo",
        "marketContact",
        "locationQueueAddress"
})
public class ModifyLocationQueueRequestItemType {

    @XmlElement(name = "LocationQueueID")
    protected long locationQueueID;
    @XmlElement(name = "RequestRefNum")
    protected int requestRefNum;
    @XmlElement(name = "QueueStatus")
    @XmlSchemaType(name = "string")
    protected LocationQueueStatusType queueStatus;
    @XmlElement(name = "RequestedPriority")
    protected Integer requestedPriority;
    @XmlElementRef(name = "LeadID", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leadID;
    @XmlElementRef(name = "marketID", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> marketID;
    @XmlElementRef(name = "NeedByDate", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> needByDate;
    @XmlElementRef(name = "Comments", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comments;
    @XmlElement(name = "SubmitterInfo")
    protected LocationQueueModifyContactInfoType submitterInfo;
    @XmlElement(name = "MarketContact")
    protected LocationQueueModifyContactInfoType marketContact;
    @XmlElementRef(name = "LocationQueueAddress", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ModifyLocationQueueAddressType> locationQueueAddress;

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
     * Gets the value of the requestedPriority property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRequestedPriority() {
        return requestedPriority;
    }

    /**
     * Sets the value of the requestedPriority property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setRequestedPriority(Integer value) {
        this.requestedPriority = value;
    }

    /**
     * Gets the value of the leadID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getLeadID() {
        return leadID;
    }

    /**
     * Sets the value of the leadID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setLeadID(JAXBElement<String> value) {
        this.leadID = value;
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
     * Gets the value of the needByDate property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public JAXBElement<XMLGregorianCalendar> getNeedByDate() {
        return needByDate;
    }

    /**
     * Sets the value of the needByDate property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public void setNeedByDate(JAXBElement<XMLGregorianCalendar> value) {
        this.needByDate = value;
    }

    /**
     * Gets the value of the comments property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setComments(JAXBElement<String> value) {
        this.comments = value;
    }

    /**
     * Gets the value of the submitterInfo property.
     *
     * @return possible object is
     * {@link LocationQueueModifyContactInfoType }
     */
    public LocationQueueModifyContactInfoType getSubmitterInfo() {
        return submitterInfo;
    }

    /**
     * Sets the value of the submitterInfo property.
     *
     * @param value allowed object is
     *              {@link LocationQueueModifyContactInfoType }
     */
    public void setSubmitterInfo(LocationQueueModifyContactInfoType value) {
        this.submitterInfo = value;
    }

    /**
     * Gets the value of the marketContact property.
     *
     * @return possible object is
     * {@link LocationQueueModifyContactInfoType }
     */
    public LocationQueueModifyContactInfoType getMarketContact() {
        return marketContact;
    }

    /**
     * Sets the value of the marketContact property.
     *
     * @param value allowed object is
     *              {@link LocationQueueModifyContactInfoType }
     */
    public void setMarketContact(LocationQueueModifyContactInfoType value) {
        this.marketContact = value;
    }

    /**
     * Gets the value of the locationQueueAddress property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ModifyLocationQueueAddressType }{@code >}
     */
    public JAXBElement<ModifyLocationQueueAddressType> getLocationQueueAddress() {
        return locationQueueAddress;
    }

    /**
     * Sets the value of the locationQueueAddress property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ModifyLocationQueueAddressType }{@code >}
     */
    public void setLocationQueueAddress(JAXBElement<ModifyLocationQueueAddressType> value) {
        this.locationQueueAddress = value;
    }

}
