
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateMsagPriorityResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="UpdateMsagPriorityResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="msagDataId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="responseStatus" type="{http://xml.blackbean.com/location/types}ResponseStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMsagPriorityResponseType", propOrder = {
        "addressId",
        "msagDataId",
        "responseStatus"
})
public class UpdateMsagPriorityResponseType {

    protected long addressId;
    protected long msagDataId;
    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;

    /**
     * Gets the value of the addressId property.
     */
    public long getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     */
    public void setAddressId(long value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the msagDataId property.
     */
    public long getMsagDataId() {
        return msagDataId;
    }

    /**
     * Sets the value of the msagDataId property.
     */
    public void setMsagDataId(long value) {
        this.msagDataId = value;
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
