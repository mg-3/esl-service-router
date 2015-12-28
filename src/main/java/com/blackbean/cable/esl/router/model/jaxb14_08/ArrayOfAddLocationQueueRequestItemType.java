
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfAddLocationQueueRequestItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfAddLocationQueueRequestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addLocationQueueRequestItemType" type="{http://xml.comcast.com/location/types}AddLocationQueueRequestItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAddLocationQueueRequestItemType", propOrder = {
        "addLocationQueueRequestItemType"
})
public class ArrayOfAddLocationQueueRequestItemType {

    protected List<AddLocationQueueRequestItemType> addLocationQueueRequestItemType;

    /**
     * Gets the value of the addLocationQueueRequestItemType property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addLocationQueueRequestItemType property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddLocationQueueRequestItemType().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddLocationQueueRequestItemType }
     */
    public List<AddLocationQueueRequestItemType> getAddLocationQueueRequestItemType() {
        if (addLocationQueueRequestItemType == null) {
            addLocationQueueRequestItemType = new ArrayList<AddLocationQueueRequestItemType>();
        }
        return this.addLocationQueueRequestItemType;
    }

}
