
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
 *         &lt;element name="modifyMarketReturn" type="{http://xml.comcast.com/location/types}AddModifyMarketResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "modifyMarketReturn"
})
@XmlRootElement(name = "modifyMarketResponse", namespace = "http://xml.comcast.com/location/services")
public class ModifyMarketResponse {

    @XmlElementRef(name = "modifyMarketReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<AddModifyMarketResponseType> modifyMarketReturn;

    /**
     * Gets the value of the modifyMarketReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AddModifyMarketResponseType }{@code >}
     */
    public JAXBElement<AddModifyMarketResponseType> getModifyMarketReturn() {
        return modifyMarketReturn;
    }

    /**
     * Sets the value of the modifyMarketReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AddModifyMarketResponseType }{@code >}
     */
    public void setModifyMarketReturn(JAXBElement<AddModifyMarketResponseType> value) {
        this.modifyMarketReturn = value;
    }

}
