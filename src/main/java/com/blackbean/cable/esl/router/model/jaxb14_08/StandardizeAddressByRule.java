
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
 *         &lt;element name="StandardizeAddressByRule" type="{http://xml.comcast.com/location/types}StandardizeAddressByRuleRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "standardizeAddressByRule"
})
@XmlRootElement(name = "standardizeAddressByRule", namespace = "http://xml.comcast.com/location/services")
public class StandardizeAddressByRule {

    @XmlElementRef(name = "StandardizeAddressByRule", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardizeAddressByRuleRequestType> standardizeAddressByRule;

    /**
     * Gets the value of the standardizeAddressByRule property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link StandardizeAddressByRuleRequestType }{@code >}
     */
    public JAXBElement<StandardizeAddressByRuleRequestType> getStandardizeAddressByRule() {
        return standardizeAddressByRule;
    }

    /**
     * Sets the value of the standardizeAddressByRule property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link StandardizeAddressByRuleRequestType }{@code >}
     */
    public void setStandardizeAddressByRule(JAXBElement<StandardizeAddressByRuleRequestType> value) {
        this.standardizeAddressByRule = value;
    }

}
