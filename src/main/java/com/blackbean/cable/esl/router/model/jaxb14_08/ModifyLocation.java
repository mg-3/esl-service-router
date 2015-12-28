
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
 *         &lt;element name="ModifyLocation" type="{http://xml.comcast.com/location/types}ModifyLocationRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "modifyLocation"
})
@XmlRootElement(name = "modifyLocation", namespace = "http://xml.comcast.com/location/services")
public class ModifyLocation {

    @XmlElementRef(name = "ModifyLocation", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ModifyLocationRequestType> modifyLocation;

    /**
     * Gets the value of the modifyLocation property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ModifyLocationRequestType }{@code >}
     */
    public JAXBElement<ModifyLocationRequestType> getModifyLocation() {
        return modifyLocation;
    }

    /**
     * Sets the value of the modifyLocation property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ModifyLocationRequestType }{@code >}
     */
    public void setModifyLocation(JAXBElement<ModifyLocationRequestType> value) {
        this.modifyLocation = value;
    }

}
