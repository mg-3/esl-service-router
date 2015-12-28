
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyHomeSecurityResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ModifyHomeSecurityResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HomeSecurity" type="{http://xml.blackbean.com/location/types}HomeSecurityType"/>
 *         &lt;element name="responseStatus" type="{http://xml.blackbean.com/location/types}ResponseStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyHomeSecurityResponseType", propOrder = {
        "homeSecurity",
        "responseStatus"
})
public class ModifyHomeSecurityResponseType {

    @XmlElement(name = "HomeSecurity", required = true)
    protected HomeSecurityType homeSecurity;
    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;

    /**
     * Gets the value of the homeSecurity property.
     *
     * @return possible object is
     * {@link HomeSecurityType }
     */
    public HomeSecurityType getHomeSecurity() {
        return homeSecurity;
    }

    /**
     * Sets the value of the homeSecurity property.
     *
     * @param value allowed object is
     *              {@link HomeSecurityType }
     */
    public void setHomeSecurity(HomeSecurityType value) {
        this.homeSecurity = value;
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
