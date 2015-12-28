
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
 *         &lt;element name="modifyHomeSecurityReturn" type="{http://xml.comcast.com/location/types}ModifyHomeSecurityResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "modifyHomeSecurityReturn"
})
@XmlRootElement(name = "modifyHomeSecurityResponse", namespace = "http://xml.comcast.com/location/services")
public class ModifyHomeSecurityResponse {

    @XmlElementRef(name = "modifyHomeSecurityReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ModifyHomeSecurityResponseType> modifyHomeSecurityReturn;

    /**
     * Gets the value of the modifyHomeSecurityReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ModifyHomeSecurityResponseType }{@code >}
     */
    public JAXBElement<ModifyHomeSecurityResponseType> getModifyHomeSecurityReturn() {
        return modifyHomeSecurityReturn;
    }

    /**
     * Sets the value of the modifyHomeSecurityReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ModifyHomeSecurityResponseType }{@code >}
     */
    public void setModifyHomeSecurityReturn(JAXBElement<ModifyHomeSecurityResponseType> value) {
        this.modifyHomeSecurityReturn = value;
    }

}
