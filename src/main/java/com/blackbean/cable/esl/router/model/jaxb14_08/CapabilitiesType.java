
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilitiesType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="CapabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capability" type="{http://xml.comcast.com/location/types}ArrayOfCapabilityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesType", propOrder = {
        "capability"
})
public class CapabilitiesType {

    protected ArrayOfCapabilityType capability;

    /**
     * Gets the value of the capability property.
     *
     * @return possible object is
     * {@link ArrayOfCapabilityType }
     */
    public ArrayOfCapabilityType getCapability() {
        return capability;
    }

    /**
     * Sets the value of the capability property.
     *
     * @param value allowed object is
     *              {@link ArrayOfCapabilityType }
     */
    public void setCapability(ArrayOfCapabilityType value) {
        this.capability = value;
    }

}
