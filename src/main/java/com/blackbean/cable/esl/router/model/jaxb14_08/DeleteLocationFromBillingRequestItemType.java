
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteLocationFromBillingRequestItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="DeleteLocationFromBillingRequestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="legacyLocationID" type="{http://xml.comcast.com/location/types}LegacyLocationIDType" minOccurs="0"/>
 *         &lt;element name="DeletionReason" type="{http://xml.comcast.com/location/types}ReasonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteLocationFromBillingRequestItemType", propOrder = {
        "requestRefNum",
        "locationID",
        "legacyLocationID",
        "deletionReason"
})
public class DeleteLocationFromBillingRequestItemType {

    @XmlElement(name = "RequestRefNum")
    protected int requestRefNum;
    @XmlElement(name = "LocationID")
    protected long locationID;
    protected LegacyLocationIDType legacyLocationID;
    @XmlElement(name = "DeletionReason")
    protected ReasonType deletionReason;

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
     * Gets the value of the legacyLocationID property.
     *
     * @return possible object is
     * {@link LegacyLocationIDType }
     */
    public LegacyLocationIDType getLegacyLocationID() {
        return legacyLocationID;
    }

    /**
     * Sets the value of the legacyLocationID property.
     *
     * @param value allowed object is
     *              {@link LegacyLocationIDType }
     */
    public void setLegacyLocationID(LegacyLocationIDType value) {
        this.legacyLocationID = value;
    }

    /**
     * Gets the value of the deletionReason property.
     *
     * @return possible object is
     * {@link ReasonType }
     */
    public ReasonType getDeletionReason() {
        return deletionReason;
    }

    /**
     * Sets the value of the deletionReason property.
     *
     * @param value allowed object is
     *              {@link ReasonType }
     */
    public void setDeletionReason(ReasonType value) {
        this.deletionReason = value;
    }

}
