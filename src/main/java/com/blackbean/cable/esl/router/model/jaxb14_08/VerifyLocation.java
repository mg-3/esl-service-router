
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
 *         &lt;element name="VerifyLocation" type="{http://xml.blackbean.com/location/types}VerifyLocationRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "verifyLocation"
})
@XmlRootElement(name = "verifyLocation", namespace = "http://xml.blackbean.com/location/services")
public class VerifyLocation {

    @XmlElementRef(name = "VerifyLocation", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<VerifyLocationRequestType> verifyLocation;

    /**
     * Gets the value of the verifyLocation property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link VerifyLocationRequestType }{@code >}
     */
    public JAXBElement<VerifyLocationRequestType> getVerifyLocation() {
        return verifyLocation;
    }

    /**
     * Sets the value of the verifyLocation property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link VerifyLocationRequestType }{@code >}
     */
    public void setVerifyLocation(JAXBElement<VerifyLocationRequestType> value) {
        this.verifyLocation = value;
    }

}
