
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MDUUnitsResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="MDUUnitsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unit" type="{http://xml.comcast.com/location/types}ArrayOfMDUUnitValuesResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDUUnitsResponseType", propOrder = {
        "unit"
})
public class MDUUnitsResponseType {

    @XmlElement(required = true)
    protected ArrayOfMDUUnitValuesResponseType unit;

    /**
     * Gets the value of the unit property.
     *
     * @return possible object is
     * {@link ArrayOfMDUUnitValuesResponseType }
     */
    public ArrayOfMDUUnitValuesResponseType getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     *
     * @param value allowed object is
     *              {@link ArrayOfMDUUnitValuesResponseType }
     */
    public void setUnit(ArrayOfMDUUnitValuesResponseType value) {
        this.unit = value;
    }

}
