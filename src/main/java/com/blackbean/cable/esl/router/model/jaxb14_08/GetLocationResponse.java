
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
 *         &lt;element name="getLocationReturn" type="{http://xml.comcast.com/location/types}GetLocationResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getLocationReturn"
})
@XmlRootElement(name = "getLocationResponse", namespace = "http://xml.comcast.com/location/services")
public class GetLocationResponse {

    @XmlElementRef(name = "getLocationReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetLocationResponseType> getLocationReturn;

    /**
     * Gets the value of the getLocationReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetLocationResponseType }{@code >}
     */
    public JAXBElement<GetLocationResponseType> getGetLocationReturn() {
        return getLocationReturn;
    }

    /**
     * Sets the value of the getLocationReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetLocationResponseType }{@code >}
     */
    public void setGetLocationReturn(JAXBElement<GetLocationResponseType> value) {
        this.getLocationReturn = value;
    }

}
