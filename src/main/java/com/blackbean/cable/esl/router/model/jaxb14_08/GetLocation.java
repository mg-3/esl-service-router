
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
 *         &lt;element name="GetLocation" type="{http://xml.comcast.com/location/types}GetLocationRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getLocation"
})
@XmlRootElement(name = "getLocation", namespace = "http://xml.comcast.com/location/services")
public class GetLocation {

    @XmlElementRef(name = "GetLocation", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetLocationRequestType> getLocation;

    /**
     * Gets the value of the getLocation property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetLocationRequestType }{@code >}
     */
    public JAXBElement<GetLocationRequestType> getGetLocation() {
        return getLocation;
    }

    /**
     * Sets the value of the getLocation property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetLocationRequestType }{@code >}
     */
    public void setGetLocation(JAXBElement<GetLocationRequestType> value) {
        this.getLocation = value;
    }

}
