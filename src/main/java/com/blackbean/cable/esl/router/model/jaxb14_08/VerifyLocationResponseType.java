
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerifyLocationResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="VerifyLocationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VerifyLocationResponses" type="{http://xml.comcast.com/location/types}ArrayOfVerifyLocationResponseItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyLocationResponseType", propOrder = {
        "verifyLocationResponses"
})
public class VerifyLocationResponseType {

    @XmlElement(name = "VerifyLocationResponses")
    protected ArrayOfVerifyLocationResponseItemType verifyLocationResponses;

    /**
     * Gets the value of the verifyLocationResponses property.
     *
     * @return possible object is
     * {@link ArrayOfVerifyLocationResponseItemType }
     */
    public ArrayOfVerifyLocationResponseItemType getVerifyLocationResponses() {
        return verifyLocationResponses;
    }

    /**
     * Sets the value of the verifyLocationResponses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfVerifyLocationResponseItemType }
     */
    public void setVerifyLocationResponses(ArrayOfVerifyLocationResponseItemType value) {
        this.verifyLocationResponses = value;
    }

}
