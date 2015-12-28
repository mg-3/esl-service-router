
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfQueryOrderByType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfQueryOrderByType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryOrderByType" type="{http://xml.blackbean.com/location/types}QueryOrderByType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQueryOrderByType", propOrder = {
        "queryOrderByType"
})
public class ArrayOfQueryOrderByType {

    protected List<QueryOrderByType> queryOrderByType;

    /**
     * Gets the value of the queryOrderByType property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryOrderByType property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryOrderByType().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryOrderByType }
     */
    public List<QueryOrderByType> getQueryOrderByType() {
        if (queryOrderByType == null) {
            queryOrderByType = new ArrayList<QueryOrderByType>();
        }
        return this.queryOrderByType;
    }

}
