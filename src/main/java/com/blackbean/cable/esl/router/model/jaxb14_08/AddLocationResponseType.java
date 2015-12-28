
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLocationResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddLocationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddLocationResponses" type="{http://xml.blackbean.com/location/types}ArrayOfAddLocationResponseItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLocationResponseType", propOrder = {
        "addLocationResponses"
})
public class AddLocationResponseType {

    @XmlElement(name = "AddLocationResponses")
    protected ArrayOfAddLocationResponseItemType addLocationResponses;

    /**
     * Gets the value of the addLocationResponses property.
     *
     * @return possible object is
     * {@link ArrayOfAddLocationResponseItemType }
     */
    public ArrayOfAddLocationResponseItemType getAddLocationResponses() {
        return addLocationResponses;
    }

    /**
     * Sets the value of the addLocationResponses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfAddLocationResponseItemType }
     */
    public void setAddLocationResponses(ArrayOfAddLocationResponseItemType value) {
        this.addLocationResponses = value;
    }

}
