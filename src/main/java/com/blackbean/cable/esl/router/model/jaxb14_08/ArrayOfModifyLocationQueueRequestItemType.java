
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfModifyLocationQueueRequestItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfModifyLocationQueueRequestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modifyLocationQueueRequestItemType" type="{http://xml.blackbean.com/location/types}ModifyLocationQueueRequestItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfModifyLocationQueueRequestItemType", propOrder = {
        "modifyLocationQueueRequestItemType"
})
public class ArrayOfModifyLocationQueueRequestItemType {

    protected List<ModifyLocationQueueRequestItemType> modifyLocationQueueRequestItemType;

    /**
     * Gets the value of the modifyLocationQueueRequestItemType property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifyLocationQueueRequestItemType property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifyLocationQueueRequestItemType().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModifyLocationQueueRequestItemType }
     */
    public List<ModifyLocationQueueRequestItemType> getModifyLocationQueueRequestItemType() {
        if (modifyLocationQueueRequestItemType == null) {
            modifyLocationQueueRequestItemType = new ArrayList<ModifyLocationQueueRequestItemType>();
        }
        return this.modifyLocationQueueRequestItemType;
    }

}
