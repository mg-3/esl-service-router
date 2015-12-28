
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerifyLocationRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="VerifyLocationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VerifyLocationRequests" type="{http://xml.comcast.com/location/types}ArrayOfVerifyLocationRequestItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyLocationRequestType", propOrder = {
        "verifyLocationRequests"
})
public class VerifyLocationRequestType {

    @XmlElement(name = "VerifyLocationRequests", required = true)
    protected ArrayOfVerifyLocationRequestItemType verifyLocationRequests;

    /**
     * Gets the value of the verifyLocationRequests property.
     *
     * @return possible object is
     * {@link ArrayOfVerifyLocationRequestItemType }
     */
    public ArrayOfVerifyLocationRequestItemType getVerifyLocationRequests() {
        return verifyLocationRequests;
    }

    /**
     * Sets the value of the verifyLocationRequests property.
     *
     * @param value allowed object is
     *              {@link ArrayOfVerifyLocationRequestItemType }
     */
    public void setVerifyLocationRequests(ArrayOfVerifyLocationRequestItemType value) {
        this.verifyLocationRequests = value;
    }

}
