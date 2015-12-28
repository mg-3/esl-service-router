
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfLocationQueueReferenceType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfLocationQueueReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationQueueReferenceType" type="{http://xml.comcast.com/location/types}LocationQueueReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLocationQueueReferenceType", propOrder = {
        "locationQueueReferenceType"
})
public class ArrayOfLocationQueueReferenceType {

    protected List<LocationQueueReferenceType> locationQueueReferenceType;

    /**
     * Gets the value of the locationQueueReferenceType property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationQueueReferenceType property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationQueueReferenceType().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationQueueReferenceType }
     */
    public List<LocationQueueReferenceType> getLocationQueueReferenceType() {
        if (locationQueueReferenceType == null) {
            locationQueueReferenceType = new ArrayList<LocationQueueReferenceType>();
        }
        return this.locationQueueReferenceType;
    }

}
