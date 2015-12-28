
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfCSGDetailsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfCSGDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cSGDetailsType" type="{http://xml.blackbean.com/location/types}CSGDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCSGDetailsType", propOrder = {
        "csgDetailsType"
})
public class ArrayOfCSGDetailsType {

    @XmlElement(name = "cSGDetailsType")
    protected List<CSGDetailsType> csgDetailsType;

    /**
     * Gets the value of the csgDetailsType property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the csgDetailsType property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCSGDetailsType().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CSGDetailsType }
     */
    public List<CSGDetailsType> getCSGDetailsType() {
        if (csgDetailsType == null) {
            csgDetailsType = new ArrayList<CSGDetailsType>();
        }
        return this.csgDetailsType;
    }

}
