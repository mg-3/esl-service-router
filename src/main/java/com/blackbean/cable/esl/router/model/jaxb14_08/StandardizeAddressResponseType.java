
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardizeAddressResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="StandardizeAddressResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="standardizeAddresses" type="{http://xml.blackbean.com/location/types}ArrayOfStandardizeAddressResponseItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardizeAddressResponseType", propOrder = {
        "standardizeAddresses"
})
public class StandardizeAddressResponseType {

    @XmlElement(required = true)
    protected ArrayOfStandardizeAddressResponseItemType standardizeAddresses;

    /**
     * Gets the value of the standardizeAddresses property.
     *
     * @return possible object is
     * {@link ArrayOfStandardizeAddressResponseItemType }
     */
    public ArrayOfStandardizeAddressResponseItemType getStandardizeAddresses() {
        return standardizeAddresses;
    }

    /**
     * Sets the value of the standardizeAddresses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfStandardizeAddressResponseItemType }
     */
    public void setStandardizeAddresses(ArrayOfStandardizeAddressResponseItemType value) {
        this.standardizeAddresses = value;
    }

}
