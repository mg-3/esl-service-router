
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
 *         &lt;element name="ModifyMarket" type="{http://xml.comcast.com/location/types}ModifyMarketRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "modifyMarket"
})
@XmlRootElement(name = "modifyMarket", namespace = "http://xml.comcast.com/location/services")
public class ModifyMarket {

    @XmlElementRef(name = "ModifyMarket", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ModifyMarketRequestType> modifyMarket;

    /**
     * Gets the value of the modifyMarket property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ModifyMarketRequestType }{@code >}
     */
    public JAXBElement<ModifyMarketRequestType> getModifyMarket() {
        return modifyMarket;
    }

    /**
     * Sets the value of the modifyMarket property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ModifyMarketRequestType }{@code >}
     */
    public void setModifyMarket(JAXBElement<ModifyMarketRequestType> value) {
        this.modifyMarket = value;
    }

}
