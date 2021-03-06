
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
 *         &lt;element name="getGeoTagReturn" type="{http://xml.blackbean.com/location/types}GetGeoTagResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getGeoTagReturn"
})
@XmlRootElement(name = "getGeoTagResponse", namespace = "http://xml.blackbean.com/location/services")
public class GetGeoTagResponse {

    @XmlElementRef(name = "getGeoTagReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetGeoTagResponseType> getGeoTagReturn;

    /**
     * Gets the value of the getGeoTagReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetGeoTagResponseType }{@code >}
     */
    public JAXBElement<GetGeoTagResponseType> getGetGeoTagReturn() {
        return getGeoTagReturn;
    }

    /**
     * Sets the value of the getGeoTagReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetGeoTagResponseType }{@code >}
     */
    public void setGetGeoTagReturn(JAXBElement<GetGeoTagResponseType> value) {
        this.getGeoTagReturn = value;
    }

}
