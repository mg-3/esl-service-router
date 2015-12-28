
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
 *         &lt;element name="verifyLocationReturn" type="{http://xml.blackbean.com/location/types}VerifyLocationResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "verifyLocationReturn"
})
@XmlRootElement(name = "verifyLocationResponse", namespace = "http://xml.blackbean.com/location/services")
public class VerifyLocationResponse {

    @XmlElementRef(name = "verifyLocationReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<VerifyLocationResponseType> verifyLocationReturn;

    /**
     * Gets the value of the verifyLocationReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link VerifyLocationResponseType }{@code >}
     */
    public JAXBElement<VerifyLocationResponseType> getVerifyLocationReturn() {
        return verifyLocationReturn;
    }

    /**
     * Sets the value of the verifyLocationReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link VerifyLocationResponseType }{@code >}
     */
    public void setVerifyLocationReturn(JAXBElement<VerifyLocationResponseType> value) {
        this.verifyLocationReturn = value;
    }

}
