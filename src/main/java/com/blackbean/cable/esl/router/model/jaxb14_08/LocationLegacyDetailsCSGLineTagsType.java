
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationLegacyDetailsCSGLineTagsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationLegacyDetailsCSGLineTagsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lineTag" type="{http://xml.comcast.com/location/types}ArrayOfLocationLegacyDetailsCSGLineTagType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationLegacyDetailsCSGLineTagsType", propOrder = {
        "lineTag"
})
public class LocationLegacyDetailsCSGLineTagsType {

    protected ArrayOfLocationLegacyDetailsCSGLineTagType lineTag;

    /**
     * Gets the value of the lineTag property.
     *
     * @return possible object is
     * {@link ArrayOfLocationLegacyDetailsCSGLineTagType }
     */
    public ArrayOfLocationLegacyDetailsCSGLineTagType getLineTag() {
        return lineTag;
    }

    /**
     * Sets the value of the lineTag property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationLegacyDetailsCSGLineTagType }
     */
    public void setLineTag(ArrayOfLocationLegacyDetailsCSGLineTagType value) {
        this.lineTag = value;
    }

}
