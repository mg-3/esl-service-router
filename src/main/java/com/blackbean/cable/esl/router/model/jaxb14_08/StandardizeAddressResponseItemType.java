
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardizeAddressResponseItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="StandardizeAddressResponseItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="standardizedAddress" type="{http://xml.comcast.com/location/types}ArrayOfStandardizedAddressType"/>
 *         &lt;element name="ResponseStatus" type="{http://xml.comcast.com/location/types}ResponseStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardizeAddressResponseItemType", propOrder = {
        "requestRefNum",
        "standardizedAddress",
        "responseStatus"
})
public class StandardizeAddressResponseItemType {

    @XmlElement(name = "RequestRefNum")
    protected Integer requestRefNum;
    @XmlElement(required = true)
    protected ArrayOfStandardizedAddressType standardizedAddress;
    @XmlElement(name = "ResponseStatus")
    protected ResponseStatusType responseStatus;

    /**
     * Gets the value of the requestRefNum property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRequestRefNum() {
        return requestRefNum;
    }

    /**
     * Sets the value of the requestRefNum property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setRequestRefNum(Integer value) {
        this.requestRefNum = value;
    }

    /**
     * Gets the value of the standardizedAddress property.
     *
     * @return possible object is
     * {@link ArrayOfStandardizedAddressType }
     */
    public ArrayOfStandardizedAddressType getStandardizedAddress() {
        return standardizedAddress;
    }

    /**
     * Sets the value of the standardizedAddress property.
     *
     * @param value allowed object is
     *              {@link ArrayOfStandardizedAddressType }
     */
    public void setStandardizedAddress(ArrayOfStandardizedAddressType value) {
        this.standardizedAddress = value;
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
