
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
 *         &lt;element name="StandardizeAddressXfinity" type="{http://xml.blackbean.com/location/types}StandardizeAddressXfinityRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "standardizeAddressXfinity"
})
@XmlRootElement(name = "standardizeAddressXfinity", namespace = "http://xml.blackbean.com/location/services")
public class StandardizeAddressXfinity {

    @XmlElementRef(name = "StandardizeAddressXfinity", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardizeAddressXfinityRequestType> standardizeAddressXfinity;

    /**
     * Gets the value of the standardizeAddressXfinity property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link StandardizeAddressXfinityRequestType }{@code >}
     */
    public JAXBElement<StandardizeAddressXfinityRequestType> getStandardizeAddressXfinity() {
        return standardizeAddressXfinity;
    }

    /**
     * Sets the value of the standardizeAddressXfinity property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link StandardizeAddressXfinityRequestType }{@code >}
     */
    public void setStandardizeAddressXfinity(JAXBElement<StandardizeAddressXfinityRequestType> value) {
        this.standardizeAddressXfinity = value;
    }

}
