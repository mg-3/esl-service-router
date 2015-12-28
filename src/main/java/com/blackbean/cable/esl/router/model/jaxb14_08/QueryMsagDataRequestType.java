
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMsagDataRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryMsagDataRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MSagCriteria" type="{http://xml.comcast.com/location/types}MsagCriteriaType" minOccurs="0"/>
 *         &lt;element name="resultSpec" type="{http://xml.comcast.com/location/types}QueryResultSpecType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMsagDataRequestType", propOrder = {
        "addressID",
        "mSagCriteria",
        "resultSpec"
})
public class QueryMsagDataRequestType {

    @XmlElement(name = "AddressID")
    protected Long addressID;
    @XmlElement(name = "MSagCriteria")
    protected MsagCriteriaType mSagCriteria;
    protected QueryResultSpecType resultSpec;

    /**
     * Gets the value of the addressID property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getAddressID() {
        return addressID;
    }

    /**
     * Sets the value of the addressID property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setAddressID(Long value) {
        this.addressID = value;
    }

    /**
     * Gets the value of the mSagCriteria property.
     *
     * @return possible object is
     * {@link MsagCriteriaType }
     */
    public MsagCriteriaType getMSagCriteria() {
        return mSagCriteria;
    }

    /**
     * Sets the value of the mSagCriteria property.
     *
     * @param value allowed object is
     *              {@link MsagCriteriaType }
     */
    public void setMSagCriteria(MsagCriteriaType value) {
        this.mSagCriteria = value;
    }

    /**
     * Gets the value of the resultSpec property.
     *
     * @return possible object is
     * {@link QueryResultSpecType }
     */
    public QueryResultSpecType getResultSpec() {
        return resultSpec;
    }

    /**
     * Sets the value of the resultSpec property.
     *
     * @param value allowed object is
     *              {@link QueryResultSpecType }
     */
    public void setResultSpec(QueryResultSpecType value) {
        this.resultSpec = value;
    }

}
