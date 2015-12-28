
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
 *         &lt;element name="AddMarket" type="{http://xml.comcast.com/location/types}AddMarketRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "addMarket"
})
@XmlRootElement(name = "addMarket", namespace = "http://xml.comcast.com/location/services")
public class AddMarket {

    @XmlElementRef(name = "AddMarket", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<AddMarketRequestType> addMarket;

    /**
     * Gets the value of the addMarket property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AddMarketRequestType }{@code >}
     */
    public JAXBElement<AddMarketRequestType> getAddMarket() {
        return addMarket;
    }

    /**
     * Sets the value of the addMarket property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AddMarketRequestType }{@code >}
     */
    public void setAddMarket(JAXBElement<AddMarketRequestType> value) {
        this.addMarket = value;
    }

}
