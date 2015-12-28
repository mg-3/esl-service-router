
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
 *         &lt;element name="AddLocation" type="{http://xml.comcast.com/location/types}AddLocationRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "addLocation"
})
@XmlRootElement(name = "addLocation", namespace = "http://xml.comcast.com/location/services")
public class AddLocation {

    @XmlElementRef(name = "AddLocation", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<AddLocationRequestType> addLocation;

    /**
     * Gets the value of the addLocation property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AddLocationRequestType }{@code >}
     */
    public JAXBElement<AddLocationRequestType> getAddLocation() {
        return addLocation;
    }

    /**
     * Sets the value of the addLocation property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AddLocationRequestType }{@code >}
     */
    public void setAddLocation(JAXBElement<AddLocationRequestType> value) {
        this.addLocation = value;
    }

}
