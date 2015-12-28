
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfStandardizeAddressXfinityResponseItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfStandardizeAddressXfinityResponseItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="standardizeAddressXfinityResponseItemType" type="{http://xml.blackbean.com/location/types}StandardizeAddressXfinityResponseItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStandardizeAddressXfinityResponseItemType", propOrder = {
        "standardizeAddressXfinityResponseItemType"
})
public class ArrayOfStandardizeAddressXfinityResponseItemType {

    protected List<StandardizeAddressXfinityResponseItemType> standardizeAddressXfinityResponseItemType;

    /**
     * Gets the value of the standardizeAddressXfinityResponseItemType property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardizeAddressXfinityResponseItemType property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardizeAddressXfinityResponseItemType().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardizeAddressXfinityResponseItemType }
     */
    public List<StandardizeAddressXfinityResponseItemType> getStandardizeAddressXfinityResponseItemType() {
        if (standardizeAddressXfinityResponseItemType == null) {
            standardizeAddressXfinityResponseItemType = new ArrayList<StandardizeAddressXfinityResponseItemType>();
        }
        return this.standardizeAddressXfinityResponseItemType;
    }

}
