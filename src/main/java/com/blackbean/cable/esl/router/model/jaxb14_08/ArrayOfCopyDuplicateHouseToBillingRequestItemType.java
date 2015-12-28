
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfCopyDuplicateHouseToBillingRequestItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfCopyDuplicateHouseToBillingRequestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="copyDuplicateHouseToBillingRequestItemType" type="{http://xml.blackbean.com/location/types}CopyDuplicateHouseToBillingRequestItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCopyDuplicateHouseToBillingRequestItemType", propOrder = {
        "copyDuplicateHouseToBillingRequestItemType"
})
public class ArrayOfCopyDuplicateHouseToBillingRequestItemType {

    protected List<CopyDuplicateHouseToBillingRequestItemType> copyDuplicateHouseToBillingRequestItemType;

    /**
     * Gets the value of the copyDuplicateHouseToBillingRequestItemType property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyDuplicateHouseToBillingRequestItemType property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyDuplicateHouseToBillingRequestItemType().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CopyDuplicateHouseToBillingRequestItemType }
     */
    public List<CopyDuplicateHouseToBillingRequestItemType> getCopyDuplicateHouseToBillingRequestItemType() {
        if (copyDuplicateHouseToBillingRequestItemType == null) {
            copyDuplicateHouseToBillingRequestItemType = new ArrayList<CopyDuplicateHouseToBillingRequestItemType>();
        }
        return this.copyDuplicateHouseToBillingRequestItemType;
    }

}
