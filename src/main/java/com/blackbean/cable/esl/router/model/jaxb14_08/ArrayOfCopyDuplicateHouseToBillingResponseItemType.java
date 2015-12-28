
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfCopyDuplicateHouseToBillingResponseItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfCopyDuplicateHouseToBillingResponseItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="copyDuplicateHouseToBillingResponseItemType" type="{http://xml.blackbean.com/location/types}CopyDuplicateHouseToBillingResponseItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCopyDuplicateHouseToBillingResponseItemType", propOrder = {
        "copyDuplicateHouseToBillingResponseItemType"
})
public class ArrayOfCopyDuplicateHouseToBillingResponseItemType {

    protected List<CopyDuplicateHouseToBillingResponseItemType> copyDuplicateHouseToBillingResponseItemType;

    /**
     * Gets the value of the copyDuplicateHouseToBillingResponseItemType property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyDuplicateHouseToBillingResponseItemType property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyDuplicateHouseToBillingResponseItemType().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CopyDuplicateHouseToBillingResponseItemType }
     */
    public List<CopyDuplicateHouseToBillingResponseItemType> getCopyDuplicateHouseToBillingResponseItemType() {
        if (copyDuplicateHouseToBillingResponseItemType == null) {
            copyDuplicateHouseToBillingResponseItemType = new ArrayList<CopyDuplicateHouseToBillingResponseItemType>();
        }
        return this.copyDuplicateHouseToBillingResponseItemType;
    }

}
