
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for DeleteLocationRequestItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="DeleteLocationRequestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeletionReason" type="{http://xml.blackbean.com/location/types}ReasonType" minOccurs="0"/>
 *         &lt;element name="DeletionOptions" type="{http://xml.blackbean.com/location/types}DeleteLocationOptionsSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteLocationRequestItemType", propOrder = {
        "requestRefNum",
        "locationID",
        "deletionReason",
        "deletionOptions"
})
public class DeleteLocationRequestItemType {

    @XmlElement(name = "RequestRefNum")
    protected int requestRefNum;
    @XmlElement(name = "LocationID")
    protected long locationID;
    @XmlElement(name = "DeletionReason")
    protected ReasonType deletionReason;
    @XmlElement(name = "DeletionOptions")
    @XmlSchemaType(name = "string")
    protected DeleteLocationOptionsSimpleType deletionOptions;

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

    /**
     * Gets the value of the deletionOptions property.
     *
     * @return possible object is
     * {@link DeleteLocationOptionsSimpleType }
     */
    public DeleteLocationOptionsSimpleType getDeletionOptions() {
        return deletionOptions;
    }

    /**
     * Sets the value of the deletionOptions property.
     *
     * @param value allowed object is
     *              {@link DeleteLocationOptionsSimpleType }
     */
    public void setDeletionOptions(DeleteLocationOptionsSimpleType value) {
        this.deletionOptions = value;
    }

}
