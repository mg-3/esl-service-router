
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for E911RateCenterServiceableType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="E911RateCenterServiceableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceable" type="{http://xml.blackbean.com/location/types}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "E911RateCenterServiceableType", propOrder = {
        "serviceable"
})
public class E911RateCenterServiceableType {

    protected ArrayOfString serviceable;

    /**
     * Gets the value of the serviceable property.
     *
     * @return possible object is
     * {@link ArrayOfString }
     */
    public ArrayOfString getServiceable() {
        return serviceable;
    }

    /**
     * Sets the value of the serviceable property.
     *
     * @param value allowed object is
     *              {@link ArrayOfString }
     */
    public void setServiceable(ArrayOfString value) {
        this.serviceable = value;
    }

}
