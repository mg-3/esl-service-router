
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLocationByRuleRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryLocationByRuleRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressSearch" type="{http://xml.comcast.com/location/types}AddressCriteriaByRulesType" minOccurs="0"/>
 *         &lt;element name="applyConsumerRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLocationByRuleRequestType", propOrder = {
        "addressSearch",
        "applyConsumerRule"
})
public class QueryLocationByRuleRequestType {

    @XmlElementRef(name = "addressSearch", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressCriteriaByRulesType> addressSearch;
    protected String applyConsumerRule;

    /**
     * Gets the value of the addressSearch property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AddressCriteriaByRulesType }{@code >}
     */
    public JAXBElement<AddressCriteriaByRulesType> getAddressSearch() {
        return addressSearch;
    }

    /**
     * Sets the value of the addressSearch property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AddressCriteriaByRulesType }{@code >}
     */
    public void setAddressSearch(JAXBElement<AddressCriteriaByRulesType> value) {
        this.addressSearch = value;
    }

    /**
     * Gets the value of the applyConsumerRule property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getApplyConsumerRule() {
        return applyConsumerRule;
    }

    /**
     * Sets the value of the applyConsumerRule property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setApplyConsumerRule(String value) {
        this.applyConsumerRule = value;
    }

}
