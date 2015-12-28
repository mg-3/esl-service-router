
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
 *         &lt;element name="GetLocationXfinity" type="{http://xml.blackbean.com/location/types}GetLocationXfinityRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getLocationXfinity"
})
@XmlRootElement(name = "getLocationXfinity", namespace = "http://xml.blackbean.com/location/services")
public class GetLocationXfinity {

    @XmlElementRef(name = "GetLocationXfinity", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetLocationXfinityRequestType> getLocationXfinity;

    /**
     * Gets the value of the getLocationXfinity property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetLocationXfinityRequestType }{@code >}
     */
    public JAXBElement<GetLocationXfinityRequestType> getGetLocationXfinity() {
        return getLocationXfinity;
    }

    /**
     * Sets the value of the getLocationXfinity property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetLocationXfinityRequestType }{@code >}
     */
    public void setGetLocationXfinity(JAXBElement<GetLocationXfinityRequestType> value) {
        this.getLocationXfinity = value;
    }

}
