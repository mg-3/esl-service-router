
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLocationFromBillerResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetLocationFromBillerResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationCapabilities" type="{http://xml.blackbean.com/location/types}CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="locationCapabilityExceptions" type="{http://xml.blackbean.com/location/types}CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="billerInformation" type="{http://xml.blackbean.com/location/types}BillerInformationType" minOccurs="0"/>
 *         &lt;element name="ResponseStatus" type="{http://xml.blackbean.com/location/types}ResponseStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLocationFromBillerResponseType", propOrder = {
        "locationCapabilities",
        "locationCapabilityExceptions",
        "billerInformation",
        "responseStatus"
})
public class GetLocationFromBillerResponseType {

    protected CapabilitiesType locationCapabilities;
    protected CapabilitiesType locationCapabilityExceptions;
    protected BillerInformationType billerInformation;
    @XmlElement(name = "ResponseStatus", required = true)
    protected ResponseStatusType responseStatus;

    /**
     * Gets the value of the locationCapabilities property.
     *
     * @return possible object is
     * {@link CapabilitiesType }
     */
    public CapabilitiesType getLocationCapabilities() {
        return locationCapabilities;
    }

    /**
     * Sets the value of the locationCapabilities property.
     *
     * @param value allowed object is
     *              {@link CapabilitiesType }
     */
    public void setLocationCapabilities(CapabilitiesType value) {
        this.locationCapabilities = value;
    }

    /**
     * Gets the value of the locationCapabilityExceptions property.
     *
     * @return possible object is
     * {@link CapabilitiesType }
     */
    public CapabilitiesType getLocationCapabilityExceptions() {
        return locationCapabilityExceptions;
    }

    /**
     * Sets the value of the locationCapabilityExceptions property.
     *
     * @param value allowed object is
     *              {@link CapabilitiesType }
     */
    public void setLocationCapabilityExceptions(CapabilitiesType value) {
        this.locationCapabilityExceptions = value;
    }

    /**
     * Gets the value of the billerInformation property.
     *
     * @return possible object is
     * {@link BillerInformationType }
     */
    public BillerInformationType getBillerInformation() {
        return billerInformation;
    }

    /**
     * Sets the value of the billerInformation property.
     *
     * @param value allowed object is
     *              {@link BillerInformationType }
     */
    public void setBillerInformation(BillerInformationType value) {
        this.billerInformation = value;
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
