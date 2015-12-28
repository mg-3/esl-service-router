
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
 *         &lt;element name="standardizeAddressReturn" type="{http://xml.blackbean.com/location/types}StandardizeAddressResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "standardizeAddressReturn"
})
@XmlRootElement(name = "standardizeAddressResponse", namespace = "http://xml.blackbean.com/location/services")
public class StandardizeAddressResponse {

    @XmlElementRef(name = "standardizeAddressReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardizeAddressResponseType> standardizeAddressReturn;

    /**
     * Gets the value of the standardizeAddressReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link StandardizeAddressResponseType }{@code >}
     */
    public JAXBElement<StandardizeAddressResponseType> getStandardizeAddressReturn() {
        return standardizeAddressReturn;
    }

    /**
     * Sets the value of the standardizeAddressReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link StandardizeAddressResponseType }{@code >}
     */
    public void setStandardizeAddressReturn(JAXBElement<StandardizeAddressResponseType> value) {
        this.standardizeAddressReturn = value;
    }

}
