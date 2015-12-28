
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
 *         &lt;element name="getLocationFromBillerReturn" type="{http://xml.comcast.com/location/types}GetLocationFromBillerResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getLocationFromBillerReturn"
})
@XmlRootElement(name = "getLocationFromBillerResponse", namespace = "http://xml.comcast.com/location/services")
public class GetLocationFromBillerResponse {

    @XmlElementRef(name = "getLocationFromBillerReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetLocationFromBillerResponseType> getLocationFromBillerReturn;

    /**
     * Gets the value of the getLocationFromBillerReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetLocationFromBillerResponseType }{@code >}
     */
    public JAXBElement<GetLocationFromBillerResponseType> getGetLocationFromBillerReturn() {
        return getLocationFromBillerReturn;
    }

    /**
     * Sets the value of the getLocationFromBillerReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetLocationFromBillerResponseType }{@code >}
     */
    public void setGetLocationFromBillerReturn(JAXBElement<GetLocationFromBillerResponseType> value) {
        this.getLocationFromBillerReturn = value;
    }

}
