
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="standardizeAddressByRuleReturn" type="{http://xml.blackbean.com/location/types}StandardizeAddressResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "standardizeAddressByRuleReturn"
})
@XmlRootElement(name = "standardizeAddressByRuleResponse", namespace = "http://xml.blackbean.com/location/services")
public class StandardizeAddressByRuleResponse {

    @XmlElementRef(name = "standardizeAddressByRuleReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardizeAddressResponseType> standardizeAddressByRuleReturn;

    /**
     * Gets the value of the standardizeAddressByRuleReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link StandardizeAddressResponseType }{@code >}
     */
    public JAXBElement<StandardizeAddressResponseType> getStandardizeAddressByRuleReturn() {
        return standardizeAddressByRuleReturn;
    }

    /**
     * Sets the value of the standardizeAddressByRuleReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link StandardizeAddressResponseType }{@code >}
     */
    public void setStandardizeAddressByRuleReturn(JAXBElement<StandardizeAddressResponseType> value) {
        this.standardizeAddressByRuleReturn = value;
    }

}
