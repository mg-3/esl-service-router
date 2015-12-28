
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
 *         &lt;element name="addMarketReturn" type="{http://xml.comcast.com/location/types}AddModifyMarketResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "addMarketReturn"
})
@XmlRootElement(name = "addMarketResponse", namespace = "http://xml.comcast.com/location/services")
public class AddMarketResponse {

    @XmlElementRef(name = "addMarketReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<AddModifyMarketResponseType> addMarketReturn;

    /**
     * Gets the value of the addMarketReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AddModifyMarketResponseType }{@code >}
     */
    public JAXBElement<AddModifyMarketResponseType> getAddMarketReturn() {
        return addMarketReturn;
    }

    /**
     * Sets the value of the addMarketReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AddModifyMarketResponseType }{@code >}
     */
    public void setAddMarketReturn(JAXBElement<AddModifyMarketResponseType> value) {
        this.addMarketReturn = value;
    }

}
