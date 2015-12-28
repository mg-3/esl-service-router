
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
 *         &lt;element name="addLocationReturn" type="{http://xml.blackbean.com/location/types}AddLocationResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "addLocationReturn"
})
@XmlRootElement(name = "addLocationResponse", namespace = "http://xml.blackbean.com/location/services")
public class AddLocationResponse {

    @XmlElementRef(name = "addLocationReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<AddLocationResponseType> addLocationReturn;

    /**
     * Gets the value of the addLocationReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AddLocationResponseType }{@code >}
     */
    public JAXBElement<AddLocationResponseType> getAddLocationReturn() {
        return addLocationReturn;
    }

    /**
     * Sets the value of the addLocationReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AddLocationResponseType }{@code >}
     */
    public void setAddLocationReturn(JAXBElement<AddLocationResponseType> value) {
        this.addLocationReturn = value;
    }

}
