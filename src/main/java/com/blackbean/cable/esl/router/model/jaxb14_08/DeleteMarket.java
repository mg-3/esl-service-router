
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
 *         &lt;element name="DeleteMarket" type="{http://xml.blackbean.com/location/types}DeleteMarketRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deleteMarket"
})
@XmlRootElement(name = "deleteMarket", namespace = "http://xml.blackbean.com/location/services")
public class DeleteMarket {

    @XmlElementRef(name = "DeleteMarket", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<DeleteMarketRequestType> deleteMarket;

    /**
     * Gets the value of the deleteMarket property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DeleteMarketRequestType }{@code >}
     */
    public JAXBElement<DeleteMarketRequestType> getDeleteMarket() {
        return deleteMarket;
    }

    /**
     * Sets the value of the deleteMarket property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DeleteMarketRequestType }{@code >}
     */
    public void setDeleteMarket(JAXBElement<DeleteMarketRequestType> value) {
        this.deleteMarket = value;
    }

}
