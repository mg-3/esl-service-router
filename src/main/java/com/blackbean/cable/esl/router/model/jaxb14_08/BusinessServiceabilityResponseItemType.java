
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for BusinessServiceabilityResponseItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="BusinessServiceabilityResponseItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StandardizeAddress" type="{http://xml.comcast.com/location/types}GeocodedAddressType" minOccurs="0"/>
 *         &lt;element name="Serviceability" type="{http://xml.comcast.com/location/types}ArrayOfBusinessServiceabilityType" minOccurs="0"/>
 *         &lt;element name="ResponseStatus" type="{http://xml.comcast.com/location/types}ResponseStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessServiceabilityResponseItemType", propOrder = {
        "standardizeAddress",
        "serviceability",
        "responseStatus"
})
public class BusinessServiceabilityResponseItemType {

    @XmlElementRef(name = "StandardizeAddress", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<GeocodedAddressType> standardizeAddress;
    @XmlElement(name = "Serviceability")
    protected ArrayOfBusinessServiceabilityType serviceability;
    @XmlElement(name = "ResponseStatus", required = true)
    protected ResponseStatusType responseStatus;

    /**
     * Gets the value of the standardizeAddress property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GeocodedAddressType }{@code >}
     */
    public JAXBElement<GeocodedAddressType> getStandardizeAddress() {
        return standardizeAddress;
    }

    /**
     * Sets the value of the standardizeAddress property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GeocodedAddressType }{@code >}
     */
    public void setStandardizeAddress(JAXBElement<GeocodedAddressType> value) {
        this.standardizeAddress = value;
    }

    /**
     * Gets the value of the serviceability property.
     *
     * @return possible object is
     * {@link ArrayOfBusinessServiceabilityType }
     */
    public ArrayOfBusinessServiceabilityType getServiceability() {
        return serviceability;
    }

    /**
     * Sets the value of the serviceability property.
     *
     * @param value allowed object is
     *              {@link ArrayOfBusinessServiceabilityType }
     */
    public void setServiceability(ArrayOfBusinessServiceabilityType value) {
        this.serviceability = value;
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
