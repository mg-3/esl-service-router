
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLocationQueueResponseItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddLocationQueueResponseItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LocationQueueID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="marketID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="responseStatus" type="{http://xml.comcast.com/location/types}ResponseStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLocationQueueResponseItemType", propOrder = {
        "requestRefNum",
        "locationQueueID",
        "marketID",
        "responseStatus"
})
public class AddLocationQueueResponseItemType {

    @XmlElement(name = "RequestRefNum")
    protected int requestRefNum;
    @XmlElement(name = "LocationQueueID")
    protected Long locationQueueID;
    protected Long marketID;
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
     * Gets the value of the locationQueueID property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getLocationQueueID() {
        return locationQueueID;
    }

    /**
     * Sets the value of the locationQueueID property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setLocationQueueID(Long value) {
        this.locationQueueID = value;
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
