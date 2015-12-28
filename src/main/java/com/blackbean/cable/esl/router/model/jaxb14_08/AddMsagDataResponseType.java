
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMsagDataResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddMsagDataResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MsagDataId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ResponseStatus" type="{http://xml.blackbean.com/location/types}ResponseStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMsagDataResponseType", propOrder = {
        "requestRefNum",
        "msagDataId",
        "addressId",
        "responseStatus"
})
public class AddMsagDataResponseType {

    @XmlElement(name = "RequestRefNum")
    protected int requestRefNum;
    @XmlElement(name = "MsagDataId")
    protected long msagDataId;
    @XmlElement(name = "AddressId")
    protected Long addressId;
    @XmlElement(name = "ResponseStatus", required = true)
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
     * Gets the value of the addressId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setAddressId(Long value) {
        this.addressId = value;
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
