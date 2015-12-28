
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
 *         &lt;element name="GetGeoTag" type="{http://xml.comcast.com/location/types}GetGeoTagRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getGeoTag"
})
@XmlRootElement(name = "getGeoTag", namespace = "http://xml.comcast.com/location/services")
public class GetGeoTag {

    @XmlElementRef(name = "GetGeoTag", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetGeoTagRequestType> getGeoTag;

    /**
     * Gets the value of the getGeoTag property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetGeoTagRequestType }{@code >}
     */
    public JAXBElement<GetGeoTagRequestType> getGetGeoTag() {
        return getGeoTag;
    }

    /**
     * Sets the value of the getGeoTag property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetGeoTagRequestType }{@code >}
     */
    public void setGetGeoTag(JAXBElement<GetGeoTagRequestType> value) {
        this.getGeoTag = value;
    }

}
