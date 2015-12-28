
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLocationQueueRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetLocationQueueRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationQueueID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="standardizeStreetAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLocationQueueRequestType", propOrder = {
        "locationQueueID",
        "standardizeStreetAddress"
})
public class GetLocationQueueRequestType {

    @XmlElement(name = "LocationQueueID")
    protected long locationQueueID;
    protected Boolean standardizeStreetAddress;

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
     * Gets the value of the standardizeStreetAddress property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isStandardizeStreetAddress() {
        return standardizeStreetAddress;
    }

    /**
     * Sets the value of the standardizeStreetAddress property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setStandardizeStreetAddress(Boolean value) {
        this.standardizeStreetAddress = value;
    }

}
