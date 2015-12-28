
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
 *         &lt;element name="getLocationXfinityReturn" type="{http://xml.comcast.com/location/types}GetLocationXfinityResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getLocationXfinityReturn"
})
@XmlRootElement(name = "getLocationXfinityResponse", namespace = "http://xml.comcast.com/location/services")
public class GetLocationXfinityResponse {

    @XmlElementRef(name = "getLocationXfinityReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetLocationXfinityResponseType> getLocationXfinityReturn;

    /**
     * Gets the value of the getLocationXfinityReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetLocationXfinityResponseType }{@code >}
     */
    public JAXBElement<GetLocationXfinityResponseType> getGetLocationXfinityReturn() {
        return getLocationXfinityReturn;
    }

    /**
     * Sets the value of the getLocationXfinityReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetLocationXfinityResponseType }{@code >}
     */
    public void setGetLocationXfinityReturn(JAXBElement<GetLocationXfinityResponseType> value) {
        this.getLocationXfinityReturn = value;
    }

}
