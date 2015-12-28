
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLocationInBillingRequestItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="UpdateLocationInBillingRequestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UpdateType" type="{http://xml.blackbean.com/location/types}ArrayOfLocationUpdateTypeSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLocationInBillingRequestItemType", propOrder = {
        "requestRefNum",
        "locationID",
        "updateType"
})
public class UpdateLocationInBillingRequestItemType {

    @XmlElement(name = "RequestRefNum")
    protected int requestRefNum;
    @XmlElement(name = "LocationID")
    protected long locationID;
    @XmlElement(name = "UpdateType")
    protected ArrayOfLocationUpdateTypeSimpleType updateType;

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
     * Gets the value of the updateType property.
     *
     * @return possible object is
     * {@link ArrayOfLocationUpdateTypeSimpleType }
     */
    public ArrayOfLocationUpdateTypeSimpleType getUpdateType() {
        return updateType;
    }

    /**
     * Sets the value of the updateType property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationUpdateTypeSimpleType }
     */
    public void setUpdateType(ArrayOfLocationUpdateTypeSimpleType value) {
        this.updateType = value;
    }

}
