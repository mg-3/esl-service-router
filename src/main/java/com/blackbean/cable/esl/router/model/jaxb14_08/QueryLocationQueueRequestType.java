
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QueryLocationQueueRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryLocationQueueRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressCriteria" type="{http://xml.comcast.com/location/types}LocationQueueAddressCriteriaType" minOccurs="0"/>
 *         &lt;element name="marketCriteria" type="{http://xml.comcast.com/location/types}ArrayOfMarketCriteriaType" minOccurs="0"/>
 *         &lt;element name="QueueStatus" type="{http://xml.comcast.com/location/types}LocationQueueStatusType" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://xml.comcast.com/location/types}LocationQueueOrigType" minOccurs="0"/>
 *         &lt;element name="CreateDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NeedByDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NeedByDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="resultsSpec" type="{http://xml.comcast.com/location/types}QueryResultSpecType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLocationQueueRequestType", propOrder = {
        "addressCriteria",
        "marketCriteria",
        "queueStatus",
        "organization",
        "createDateFrom",
        "createDateTo",
        "needByDateFrom",
        "needByDateTo",
        "resultsSpec"
})
public class QueryLocationQueueRequestType {

    protected LocationQueueAddressCriteriaType addressCriteria;
    protected ArrayOfMarketCriteriaType marketCriteria;
    @XmlElement(name = "QueueStatus")
    @XmlSchemaType(name = "string")
    protected LocationQueueStatusType queueStatus;
    @XmlSchemaType(name = "string")
    protected LocationQueueOrigType organization;
    @XmlElement(name = "CreateDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateFrom;
    @XmlElement(name = "CreateDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTo;
    @XmlElement(name = "NeedByDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar needByDateFrom;
    @XmlElement(name = "NeedByDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar needByDateTo;
    protected QueryResultSpecType resultsSpec;

    /**
     * Gets the value of the addressCriteria property.
     *
     * @return possible object is
     * {@link LocationQueueAddressCriteriaType }
     */
    public LocationQueueAddressCriteriaType getAddressCriteria() {
        return addressCriteria;
    }

    /**
     * Sets the value of the addressCriteria property.
     *
     * @param value allowed object is
     *              {@link LocationQueueAddressCriteriaType }
     */
    public void setAddressCriteria(LocationQueueAddressCriteriaType value) {
        this.addressCriteria = value;
    }

    /**
     * Gets the value of the marketCriteria property.
     *
     * @return possible object is
     * {@link ArrayOfMarketCriteriaType }
     */
    public ArrayOfMarketCriteriaType getMarketCriteria() {
        return marketCriteria;
    }

    /**
     * Sets the value of the marketCriteria property.
     *
     * @param value allowed object is
     *              {@link ArrayOfMarketCriteriaType }
     */
    public void setMarketCriteria(ArrayOfMarketCriteriaType value) {
        this.marketCriteria = value;
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
     * Gets the value of the organization property.
     *
     * @return possible object is
     * {@link LocationQueueOrigType }
     */
    public LocationQueueOrigType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     *
     * @param value allowed object is
     *              {@link LocationQueueOrigType }
     */
    public void setOrganization(LocationQueueOrigType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the createDateFrom property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCreateDateFrom() {
        return createDateFrom;
    }

    /**
     * Sets the value of the createDateFrom property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCreateDateFrom(XMLGregorianCalendar value) {
        this.createDateFrom = value;
    }

    /**
     * Gets the value of the createDateTo property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCreateDateTo() {
        return createDateTo;
    }

    /**
     * Sets the value of the createDateTo property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCreateDateTo(XMLGregorianCalendar value) {
        this.createDateTo = value;
    }

    /**
     * Gets the value of the needByDateFrom property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getNeedByDateFrom() {
        return needByDateFrom;
    }

    /**
     * Sets the value of the needByDateFrom property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setNeedByDateFrom(XMLGregorianCalendar value) {
        this.needByDateFrom = value;
    }

    /**
     * Gets the value of the needByDateTo property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getNeedByDateTo() {
        return needByDateTo;
    }

    /**
     * Sets the value of the needByDateTo property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setNeedByDateTo(XMLGregorianCalendar value) {
        this.needByDateTo = value;
    }

    /**
     * Gets the value of the resultsSpec property.
     *
     * @return possible object is
     * {@link QueryResultSpecType }
     */
    public QueryResultSpecType getResultsSpec() {
        return resultsSpec;
    }

    /**
     * Sets the value of the resultsSpec property.
     *
     * @param value allowed object is
     *              {@link QueryResultSpecType }
     */
    public void setResultsSpec(QueryResultSpecType value) {
        this.resultsSpec = value;
    }

}
