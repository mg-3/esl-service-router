
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardizeAddressXfinityResponseItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="StandardizeAddressXfinityResponseItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="standardizedAddresses" type="{http://xml.blackbean.com/location/types}ArrayOfStandardizedAddressXfinityType" minOccurs="0"/>
 *         &lt;element name="responseStatus" type="{http://xml.blackbean.com/location/types}ResponseStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardizeAddressXfinityResponseItemType", propOrder = {
        "requestRefNum",
        "standardizedAddresses",
        "responseStatus"
})
public class StandardizeAddressXfinityResponseItemType {

    protected int requestRefNum;
    @XmlElementRef(name = "standardizedAddresses", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStandardizedAddressXfinityType> standardizedAddresses;
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
     * Gets the value of the standardizedAddresses property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfStandardizedAddressXfinityType }{@code >}
     */
    public JAXBElement<ArrayOfStandardizedAddressXfinityType> getStandardizedAddresses() {
        return standardizedAddresses;
    }

    /**
     * Sets the value of the standardizedAddresses property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfStandardizedAddressXfinityType }{@code >}
     */
    public void setStandardizedAddresses(JAXBElement<ArrayOfStandardizedAddressXfinityType> value) {
        this.standardizedAddresses = value;
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
