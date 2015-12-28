
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationLegacyDetailsCSGHouseCommentsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationLegacyDetailsCSGHouseCommentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="houseComment" type="{http://xml.blackbean.com/location/types}ArrayOfLocationLegacyDetailsCSGHouseCommentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationLegacyDetailsCSGHouseCommentsType", propOrder = {
        "houseComment"
})
public class LocationLegacyDetailsCSGHouseCommentsType {

    protected ArrayOfLocationLegacyDetailsCSGHouseCommentType houseComment;

    /**
     * Gets the value of the houseComment property.
     *
     * @return possible object is
     * {@link ArrayOfLocationLegacyDetailsCSGHouseCommentType }
     */
    public ArrayOfLocationLegacyDetailsCSGHouseCommentType getHouseComment() {
        return houseComment;
    }

    /**
     * Sets the value of the houseComment property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationLegacyDetailsCSGHouseCommentType }
     */
    public void setHouseComment(ArrayOfLocationLegacyDetailsCSGHouseCommentType value) {
        this.houseComment = value;
    }

}
