
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfModifyLocationQueueResponseItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfModifyLocationQueueResponseItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modifyLocationQueueResponseItemType" type="{http://xml.comcast.com/location/types}ModifyLocationQueueResponseItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfModifyLocationQueueResponseItemType", propOrder = {
        "modifyLocationQueueResponseItemType"
})
public class ArrayOfModifyLocationQueueResponseItemType {

    protected List<ModifyLocationQueueResponseItemType> modifyLocationQueueResponseItemType;

    /**
     * Gets the value of the modifyLocationQueueResponseItemType property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifyLocationQueueResponseItemType property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifyLocationQueueResponseItemType().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModifyLocationQueueResponseItemType }
     */
    public List<ModifyLocationQueueResponseItemType> getModifyLocationQueueResponseItemType() {
        if (modifyLocationQueueResponseItemType == null) {
            modifyLocationQueueResponseItemType = new ArrayList<ModifyLocationQueueResponseItemType>();
        }
        return this.modifyLocationQueueResponseItemType;
    }

}
