
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
 *         &lt;element name="refreshCacheReturn" type="{http://xml.comcast.com/location/types}RefreshCacheResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "refreshCacheReturn"
})
@XmlRootElement(name = "refreshCacheResponse", namespace = "http://xml.comcast.com/location/services")
public class RefreshCacheResponse {

    @XmlElementRef(name = "refreshCacheReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<RefreshCacheResponseType> refreshCacheReturn;

    /**
     * Gets the value of the refreshCacheReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link RefreshCacheResponseType }{@code >}
     */
    public JAXBElement<RefreshCacheResponseType> getRefreshCacheReturn() {
        return refreshCacheReturn;
    }

    /**
     * Sets the value of the refreshCacheReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link RefreshCacheResponseType }{@code >}
     */
    public void setRefreshCacheReturn(JAXBElement<RefreshCacheResponseType> value) {
        this.refreshCacheReturn = value;
    }

}
