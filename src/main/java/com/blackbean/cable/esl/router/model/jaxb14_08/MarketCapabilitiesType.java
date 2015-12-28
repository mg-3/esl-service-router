
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketCapabilitiesType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="MarketCapabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capabilityName" type="{http://xml.blackbean.com/location/types}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketCapabilitiesType", propOrder = {
        "capabilityName"
})
public class MarketCapabilitiesType {

    protected ArrayOfString capabilityName;

    /**
     * Gets the value of the capabilityName property.
     *
     * @return possible object is
     * {@link ArrayOfString }
     */
    public ArrayOfString getCapabilityName() {
        return capabilityName;
    }

    /**
     * Sets the value of the capabilityName property.
     *
     * @param value allowed object is
     *              {@link ArrayOfString }
     */
    public void setCapabilityName(ArrayOfString value) {
        this.capabilityName = value;
    }

}
