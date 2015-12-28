
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfBusinessServiceabilityType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfBusinessServiceabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessServiceabilityType" type="{http://xml.comcast.com/location/types}BusinessServiceabilityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBusinessServiceabilityType", propOrder = {
        "businessServiceabilityType"
})
public class ArrayOfBusinessServiceabilityType {

    protected List<BusinessServiceabilityType> businessServiceabilityType;

    /**
     * Gets the value of the businessServiceabilityType property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessServiceabilityType property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessServiceabilityType().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessServiceabilityType }
     */
    public List<BusinessServiceabilityType> getBusinessServiceabilityType() {
        if (businessServiceabilityType == null) {
            businessServiceabilityType = new ArrayList<BusinessServiceabilityType>();
        }
        return this.businessServiceabilityType;
    }

}
