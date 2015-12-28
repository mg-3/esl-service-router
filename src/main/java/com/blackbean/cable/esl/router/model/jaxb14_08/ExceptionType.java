
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ExceptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messages" type="{http://xml.comcast.com/types}MessagesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionType", namespace = "http://xml.comcast.com/types", propOrder = {
        "messages"
})
public class ExceptionType {

    @XmlElement(required = true, nillable = true)
    protected MessagesType messages;

    /**
     * Gets the value of the messages property.
     *
     * @return possible object is
     * {@link MessagesType }
     */
    public MessagesType getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     *
     * @param value allowed object is
     *              {@link MessagesType }
     */
    public void setMessages(MessagesType value) {
        this.messages = value;
    }

}
