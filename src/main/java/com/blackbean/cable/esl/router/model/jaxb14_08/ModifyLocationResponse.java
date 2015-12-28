
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
 *         &lt;element name="modifyLocationReturn" type="{http://xml.comcast.com/location/types}ModifyLocationResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "modifyLocationReturn"
})
@XmlRootElement(name = "modifyLocationResponse", namespace = "http://xml.comcast.com/location/services")
public class ModifyLocationResponse {

    @XmlElementRef(name = "modifyLocationReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ModifyLocationResponseType> modifyLocationReturn;

    /**
     * Gets the value of the modifyLocationReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ModifyLocationResponseType }{@code >}
     */
    public JAXBElement<ModifyLocationResponseType> getModifyLocationReturn() {
        return modifyLocationReturn;
    }

    /**
     * Sets the value of the modifyLocationReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ModifyLocationResponseType }{@code >}
     */
    public void setModifyLocationReturn(JAXBElement<ModifyLocationResponseType> value) {
        this.modifyLocationReturn = value;
    }

}
