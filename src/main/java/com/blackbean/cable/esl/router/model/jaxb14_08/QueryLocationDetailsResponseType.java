
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLocationDetailsResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryLocationDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://xml.blackbean.com/location/types}ArrayOfQueryLocationDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLocationDetailsResponseType", propOrder = {
        "location"
})
public class QueryLocationDetailsResponseType {

    @XmlElement(required = true)
    protected ArrayOfQueryLocationDetailsType location;

    /**
     * Gets the value of the location property.
     *
     * @return possible object is
     * {@link ArrayOfQueryLocationDetailsType }
     */
    public ArrayOfQueryLocationDetailsType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value allowed object is
     *              {@link ArrayOfQueryLocationDetailsType }
     */
    public void setLocation(ArrayOfQueryLocationDetailsType value) {
        this.location = value;
    }

}
