
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseStatusType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ResponseStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResponseMessage" type="{http://xml.comcast.com/location/types}ArrayOfResponseMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseStatusType", propOrder = {
        "returnCode",
        "responseMessage"
})
public class ResponseStatusType {

    @XmlElement(name = "ReturnCode", required = true)
    protected String returnCode;
    @XmlElement(name = "ResponseMessage")
    protected ArrayOfResponseMessageType responseMessage;

    /**
     * Gets the value of the returnCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the responseMessage property.
     *
     * @return possible object is
     * {@link ArrayOfResponseMessageType }
     */
    public ArrayOfResponseMessageType getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     *
     * @param value allowed object is
     *              {@link ArrayOfResponseMessageType }
     */
    public void setResponseMessage(ArrayOfResponseMessageType value) {
        this.responseMessage = value;
    }

}
