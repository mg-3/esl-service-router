
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
 *         &lt;element name="getMarketReturn" type="{http://xml.comcast.com/location/types}GetMarketResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getMarketReturn"
})
@XmlRootElement(name = "getMarketResponse", namespace = "http://xml.comcast.com/location/services")
public class GetMarketResponse {

    @XmlElementRef(name = "getMarketReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetMarketResponseType> getMarketReturn;

    /**
     * Gets the value of the getMarketReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetMarketResponseType }{@code >}
     */
    public JAXBElement<GetMarketResponseType> getGetMarketReturn() {
        return getMarketReturn;
    }

    /**
     * Sets the value of the getMarketReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetMarketResponseType }{@code >}
     */
    public void setGetMarketReturn(JAXBElement<GetMarketResponseType> value) {
        this.getMarketReturn = value;
    }

}
