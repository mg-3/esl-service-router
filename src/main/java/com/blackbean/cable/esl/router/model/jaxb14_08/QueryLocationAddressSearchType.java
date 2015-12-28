
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLocationAddressSearchType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryLocationAddressSearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressCriteria" type="{http://xml.comcast.com/location/types}AddressCriteriaType"/>
 *         &lt;element name="marketCriteria" type="{http://xml.comcast.com/location/types}MarketCriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLocationAddressSearchType", propOrder = {
        "addressCriteria",
        "marketCriteria"
})
public class QueryLocationAddressSearchType {

    @XmlElement(required = true)
    protected AddressCriteriaType addressCriteria;
    protected MarketCriteriaType marketCriteria;

    /**
     * Gets the value of the addressCriteria property.
     *
     * @return possible object is
     * {@link AddressCriteriaType }
     */
    public AddressCriteriaType getAddressCriteria() {
        return addressCriteria;
    }

    /**
     * Sets the value of the addressCriteria property.
     *
     * @param value allowed object is
     *              {@link AddressCriteriaType }
     */
    public void setAddressCriteria(AddressCriteriaType value) {
        this.addressCriteria = value;
    }

    /**
     * Gets the value of the marketCriteria property.
     *
     * @return possible object is
     * {@link MarketCriteriaType }
     */
    public MarketCriteriaType getMarketCriteria() {
        return marketCriteria;
    }

    /**
     * Sets the value of the marketCriteria property.
     *
     * @param value allowed object is
     *              {@link MarketCriteriaType }
     */
    public void setMarketCriteria(MarketCriteriaType value) {
        this.marketCriteria = value;
    }

}
