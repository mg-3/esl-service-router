
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
 *         &lt;element name="ModifyHomeSecurity" type="{http://xml.comcast.com/location/types}ModifyHomeSecurityRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "modifyHomeSecurity"
})
@XmlRootElement(name = "modifyHomeSecurity", namespace = "http://xml.comcast.com/location/services")
public class ModifyHomeSecurity {

    @XmlElementRef(name = "ModifyHomeSecurity", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ModifyHomeSecurityRequestType> modifyHomeSecurity;

    /**
     * Gets the value of the modifyHomeSecurity property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ModifyHomeSecurityRequestType }{@code >}
     */
    public JAXBElement<ModifyHomeSecurityRequestType> getModifyHomeSecurity() {
        return modifyHomeSecurity;
    }

    /**
     * Sets the value of the modifyHomeSecurity property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ModifyHomeSecurityRequestType }{@code >}
     */
    public void setModifyHomeSecurity(JAXBElement<ModifyHomeSecurityRequestType> value) {
        this.modifyHomeSecurity = value;
    }

}
