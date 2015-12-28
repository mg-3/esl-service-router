
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfModifyNodeRequestItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfModifyNodeRequestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modifyNodeRequestItemType" type="{http://xml.comcast.com/location/types}ModifyNodeRequestItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfModifyNodeRequestItemType", propOrder = {
        "modifyNodeRequestItemType"
})
public class ArrayOfModifyNodeRequestItemType {

    protected List<ModifyNodeRequestItemType> modifyNodeRequestItemType;

    /**
     * Gets the value of the modifyNodeRequestItemType property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifyNodeRequestItemType property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifyNodeRequestItemType().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModifyNodeRequestItemType }
     */
    public List<ModifyNodeRequestItemType> getModifyNodeRequestItemType() {
        if (modifyNodeRequestItemType == null) {
            modifyNodeRequestItemType = new ArrayList<ModifyNodeRequestItemType>();
        }
        return this.modifyNodeRequestItemType;
    }

}
