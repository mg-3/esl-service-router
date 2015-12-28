
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationLegacyDetailsCSGCustomFieldsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationLegacyDetailsCSGCustomFieldsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="field" type="{http://xml.comcast.com/location/types}ArrayOfLocationLegacyDetailsCSGCustomFieldType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationLegacyDetailsCSGCustomFieldsType", propOrder = {
        "field"
})
public class LocationLegacyDetailsCSGCustomFieldsType {

    @XmlElement(required = true)
    protected ArrayOfLocationLegacyDetailsCSGCustomFieldType field;

    /**
     * Gets the value of the field property.
     *
     * @return possible object is
     * {@link ArrayOfLocationLegacyDetailsCSGCustomFieldType }
     */
    public ArrayOfLocationLegacyDetailsCSGCustomFieldType getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationLegacyDetailsCSGCustomFieldType }
     */
    public void setField(ArrayOfLocationLegacyDetailsCSGCustomFieldType value) {
        this.field = value;
    }

}
