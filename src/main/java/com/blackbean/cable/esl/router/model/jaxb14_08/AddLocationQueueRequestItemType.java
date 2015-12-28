
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AddLocationQueueRequestItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddLocationQueueRequestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LocationQueueAddress" type="{http://xml.comcast.com/location/types}AddLocationQueueAddressType"/>
 *         &lt;element name="RequestedPriority">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="5"/>
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubmitterInfo" type="{http://xml.comcast.com/location/types}LocationQueueContactInfoType"/>
 *         &lt;element name="marketID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LeadID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NeedByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Comments" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLocationQueueRequestItemType", propOrder = {
        "requestRefNum",
        "locationQueueAddress",
        "requestedPriority",
        "submitterInfo",
        "marketID",
        "leadID",
        "needByDate",
        "comments"
})
public class AddLocationQueueRequestItemType {

    @XmlElement(name = "RequestRefNum")
    protected int requestRefNum;
    @XmlElement(name = "LocationQueueAddress", required = true)
    protected AddLocationQueueAddressType locationQueueAddress;
    @XmlElement(name = "RequestedPriority")
    protected int requestedPriority;
    @XmlElement(name = "SubmitterInfo", required = true)
    protected LocationQueueContactInfoType submitterInfo;
    protected Long marketID;
    @XmlElement(name = "LeadID")
    protected String leadID;
    @XmlElement(name = "NeedByDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar needByDate;
    @XmlElement(name = "Comments")
    protected String comments;

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
     * Gets the value of the locationQueueAddress property.
     *
     * @return possible object is
     * {@link AddLocationQueueAddressType }
     */
    public AddLocationQueueAddressType getLocationQueueAddress() {
        return locationQueueAddress;
    }

    /**
     * Sets the value of the locationQueueAddress property.
     *
     * @param value allowed object is
     *              {@link AddLocationQueueAddressType }
     */
    public void setLocationQueueAddress(AddLocationQueueAddressType value) {
        this.locationQueueAddress = value;
    }

    /**
     * Gets the value of the requestedPriority property.
     */
    public int getRequestedPriority() {
        return requestedPriority;
    }

    /**
     * Sets the value of the requestedPriority property.
     */
    public void setRequestedPriority(int value) {
        this.requestedPriority = value;
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
     * Gets the value of the comments property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
