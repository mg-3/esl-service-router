
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HomeSecurityType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="HomeSecurityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecurityContact" type="{http://xml.comcast.com/location/types}HomeSecurityContactNumbersType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HomeSecurityType", propOrder = {
        "securityContact"
})
public class HomeSecurityType {

    @XmlElement(name = "SecurityContact", required = true)
    protected HomeSecurityContactNumbersType securityContact;

    /**
     * Gets the value of the securityContact property.
     *
     * @return possible object is
     * {@link HomeSecurityContactNumbersType }
     */
    public HomeSecurityContactNumbersType getSecurityContact() {
        return securityContact;
    }

    /**
     * Sets the value of the securityContact property.
     *
     * @param value allowed object is
     *              {@link HomeSecurityContactNumbersType }
     */
    public void setSecurityContact(HomeSecurityContactNumbersType value) {
        this.securityContact = value;
    }

}
