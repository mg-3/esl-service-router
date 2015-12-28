
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for StandardizeAddressByRuleRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="StandardizeAddressByRuleRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedAddresses" type="{http://xml.comcast.com/location/types}StandardizeAddressRequestedAddrType"/>
 *         &lt;element name="applyConsumerRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardizeAddressByRuleRequestType", propOrder = {
        "requestedAddresses",
        "applyConsumerRule"
})
public class StandardizeAddressByRuleRequestType {

    @XmlElement(required = true)
    protected StandardizeAddressRequestedAddrType requestedAddresses;
    @XmlElementRef(name = "applyConsumerRule", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applyConsumerRule;

    /**
     * Gets the value of the requestedAddresses property.
     *
     * @return possible object is
     * {@link StandardizeAddressRequestedAddrType }
     */
    public StandardizeAddressRequestedAddrType getRequestedAddresses() {
        return requestedAddresses;
    }

    /**
     * Sets the value of the requestedAddresses property.
     *
     * @param value allowed object is
     *              {@link StandardizeAddressRequestedAddrType }
     */
    public void setRequestedAddresses(StandardizeAddressRequestedAddrType value) {
        this.requestedAddresses = value;
    }

    /**
     * Gets the value of the applyConsumerRule property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getApplyConsumerRule() {
        return applyConsumerRule;
    }

    /**
     * Sets the value of the applyConsumerRule property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setApplyConsumerRule(JAXBElement<String> value) {
        this.applyConsumerRule = value;
    }

}
