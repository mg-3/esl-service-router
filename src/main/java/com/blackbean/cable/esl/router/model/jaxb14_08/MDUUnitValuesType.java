
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MDUUnitValuesType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="MDUUnitValuesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://xml.blackbean.com/location/types}ArrayOfMDUUnitValueSingleType" minOccurs="0"/>
 *         &lt;element name="valueRange" type="{http://xml.blackbean.com/location/types}ArrayOfMDUUnitValueRangeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDUUnitValuesType", propOrder = {
        "value",
        "valueRange"
})
public class MDUUnitValuesType {

    protected ArrayOfMDUUnitValueSingleType value;
    protected ArrayOfMDUUnitValueRangeType valueRange;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     * {@link ArrayOfMDUUnitValueSingleType }
     */
    public ArrayOfMDUUnitValueSingleType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link ArrayOfMDUUnitValueSingleType }
     */
    public void setValue(ArrayOfMDUUnitValueSingleType value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueRange property.
     *
     * @return possible object is
     * {@link ArrayOfMDUUnitValueRangeType }
     */
    public ArrayOfMDUUnitValueRangeType getValueRange() {
        return valueRange;
    }

    /**
     * Sets the value of the valueRange property.
     *
     * @param value allowed object is
     *              {@link ArrayOfMDUUnitValueRangeType }
     */
    public void setValueRange(ArrayOfMDUUnitValueRangeType value) {
        this.valueRange = value;
    }

}
