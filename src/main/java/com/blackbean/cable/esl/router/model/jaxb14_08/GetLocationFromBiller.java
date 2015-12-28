
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
 *         &lt;element name="GetLocationFromBiller" type="{http://xml.blackbean.com/location/types}GetLocationFromBillerRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getLocationFromBiller"
})
@XmlRootElement(name = "getLocationFromBiller", namespace = "http://xml.blackbean.com/location/services")
public class GetLocationFromBiller {

    @XmlElementRef(name = "GetLocationFromBiller", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetLocationFromBillerRequestType> getLocationFromBiller;

    /**
     * Gets the value of the getLocationFromBiller property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetLocationFromBillerRequestType }{@code >}
     */
    public JAXBElement<GetLocationFromBillerRequestType> getGetLocationFromBiller() {
        return getLocationFromBiller;
    }

    /**
     * Sets the value of the getLocationFromBiller property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetLocationFromBillerRequestType }{@code >}
     */
    public void setGetLocationFromBiller(JAXBElement<GetLocationFromBillerRequestType> value) {
        this.getLocationFromBiller = value;
    }

}
