
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfVerifyLocationRequestItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfVerifyLocationRequestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="verifyLocationRequestItemType" type="{http://xml.comcast.com/location/types}VerifyLocationRequestItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVerifyLocationRequestItemType", propOrder = {
        "verifyLocationRequestItemType"
})
public class ArrayOfVerifyLocationRequestItemType {

    protected List<VerifyLocationRequestItemType> verifyLocationRequestItemType;

    /**
     * Gets the value of the verifyLocationRequestItemType property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verifyLocationRequestItemType property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerifyLocationRequestItemType().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerifyLocationRequestItemType }
     */
    public List<VerifyLocationRequestItemType> getVerifyLocationRequestItemType() {
        if (verifyLocationRequestItemType == null) {
            verifyLocationRequestItemType = new ArrayList<VerifyLocationRequestItemType>();
        }
        return this.verifyLocationRequestItemType;
    }

}
