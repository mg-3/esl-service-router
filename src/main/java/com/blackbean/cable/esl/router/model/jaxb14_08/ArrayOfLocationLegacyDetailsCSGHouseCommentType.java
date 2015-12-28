
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfLocationLegacyDetailsCSGHouseCommentType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfLocationLegacyDetailsCSGHouseCommentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationLegacyDetailsCSGHouseCommentType" type="{http://xml.blackbean.com/location/types}LocationLegacyDetailsCSGHouseCommentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLocationLegacyDetailsCSGHouseCommentType", propOrder = {
        "locationLegacyDetailsCSGHouseCommentType"
})
public class ArrayOfLocationLegacyDetailsCSGHouseCommentType {

    protected List<LocationLegacyDetailsCSGHouseCommentType> locationLegacyDetailsCSGHouseCommentType;

    /**
     * Gets the value of the locationLegacyDetailsCSGHouseCommentType property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationLegacyDetailsCSGHouseCommentType property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationLegacyDetailsCSGHouseCommentType().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationLegacyDetailsCSGHouseCommentType }
     */
    public List<LocationLegacyDetailsCSGHouseCommentType> getLocationLegacyDetailsCSGHouseCommentType() {
        if (locationLegacyDetailsCSGHouseCommentType == null) {
            locationLegacyDetailsCSGHouseCommentType = new ArrayList<LocationLegacyDetailsCSGHouseCommentType>();
        }
        return this.locationLegacyDetailsCSGHouseCommentType;
    }

}
