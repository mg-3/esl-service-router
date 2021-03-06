
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
 *         &lt;element name="standardizeAddressXfinityReturn" type="{http://xml.blackbean.com/location/types}StandardizeAddressXfinityResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "standardizeAddressXfinityReturn"
})
@XmlRootElement(name = "standardizeAddressXfinityResponse", namespace = "http://xml.blackbean.com/location/services")
public class StandardizeAddressXfinityResponse {

    @XmlElementRef(name = "standardizeAddressXfinityReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardizeAddressXfinityResponseType> standardizeAddressXfinityReturn;

    /**
     * Gets the value of the standardizeAddressXfinityReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link StandardizeAddressXfinityResponseType }{@code >}
     */
    public JAXBElement<StandardizeAddressXfinityResponseType> getStandardizeAddressXfinityReturn() {
        return standardizeAddressXfinityReturn;
    }

    /**
     * Sets the value of the standardizeAddressXfinityReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link StandardizeAddressXfinityResponseType }{@code >}
     */
    public void setStandardizeAddressXfinityReturn(JAXBElement<StandardizeAddressXfinityResponseType> value) {
        this.standardizeAddressXfinityReturn = value;
    }

}
