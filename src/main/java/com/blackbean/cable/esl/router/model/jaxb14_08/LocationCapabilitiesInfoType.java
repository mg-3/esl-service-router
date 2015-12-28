
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCapabilitiesInfoType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationCapabilitiesInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationCapabilityExceptions" type="{http://xml.blackbean.com/location/types}CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="locationCapabilities" type="{http://xml.blackbean.com/location/types}CapabilitiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCapabilitiesInfoType", propOrder = {
        "locationCapabilityExceptions",
        "locationCapabilities"
})
public class LocationCapabilitiesInfoType {

    protected CapabilitiesType locationCapabilityExceptions;
    protected CapabilitiesType locationCapabilities;

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

}
