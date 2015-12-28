
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfMarketCriteriaType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayOfMarketCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketCriteriaType" type="{http://xml.comcast.com/location/types}MarketCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMarketCriteriaType", propOrder = {
        "marketCriteriaType"
})
public class ArrayOfMarketCriteriaType {

    protected List<MarketCriteriaType> marketCriteriaType;

    /**
     * Gets the value of the marketCriteriaType property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketCriteriaType property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketCriteriaType().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketCriteriaType }
     */
    public List<MarketCriteriaType> getMarketCriteriaType() {
        if (marketCriteriaType == null) {
            marketCriteriaType = new ArrayList<MarketCriteriaType>();
        }
        return this.marketCriteriaType;
    }

}