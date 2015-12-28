
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
 *         &lt;element name="deleteMarketReturn" type="{http://xml.blackbean.com/location/types}DeleteMarketResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deleteMarketReturn"
})
@XmlRootElement(name = "deleteMarketResponse", namespace = "http://xml.blackbean.com/location/services")
public class DeleteMarketResponse {

    @XmlElementRef(name = "deleteMarketReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<DeleteMarketResponseType> deleteMarketReturn;

    /**
     * Gets the value of the deleteMarketReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DeleteMarketResponseType }{@code >}
     */
    public JAXBElement<DeleteMarketResponseType> getDeleteMarketReturn() {
        return deleteMarketReturn;
    }

    /**
     * Sets the value of the deleteMarketReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DeleteMarketResponseType }{@code >}
     */
    public void setDeleteMarketReturn(JAXBElement<DeleteMarketResponseType> value) {
        this.deleteMarketReturn = value;
    }

}
