
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerifyLocationResponseItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="VerifyLocationResponseItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="responseStatus" type="{http://xml.comcast.com/location/types}ResponseStatusType"/>
 *         &lt;element name="CopyLocationToBillingResponse" type="{http://xml.comcast.com/location/types}CopyLocationToBillingResponseItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyLocationResponseItemType", propOrder = {
        "requestRefNum",
        "responseStatus",
        "copyLocationToBillingResponse"
})
public class VerifyLocationResponseItemType {

    @XmlElement(name = "RequestRefNum")
    protected int requestRefNum;
    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;
    @XmlElement(name = "CopyLocationToBillingResponse")
    protected CopyLocationToBillingResponseItemType copyLocationToBillingResponse;

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

    /**
     * Gets the value of the copyLocationToBillingResponse property.
     *
     * @return possible object is
     * {@link CopyLocationToBillingResponseItemType }
     */
    public CopyLocationToBillingResponseItemType getCopyLocationToBillingResponse() {
        return copyLocationToBillingResponse;
    }

    /**
     * Sets the value of the copyLocationToBillingResponse property.
     *
     * @param value allowed object is
     *              {@link CopyLocationToBillingResponseItemType }
     */
    public void setCopyLocationToBillingResponse(CopyLocationToBillingResponseItemType value) {
        this.copyLocationToBillingResponse = value;
    }

}
