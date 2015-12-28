
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
 *         &lt;element name="getLocationInformationReturn" type="{http://xml.blackbean.com/location/types}GetLocationInformationResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getLocationInformationReturn"
})
@XmlRootElement(name = "getLocationInformationResponse", namespace = "http://xml.blackbean.com/location/services")
public class GetLocationInformationResponse {

    @XmlElementRef(name = "getLocationInformationReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetLocationInformationResponseType> getLocationInformationReturn;

    /**
     * Gets the value of the getLocationInformationReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetLocationInformationResponseType }{@code >}
     */
    public JAXBElement<GetLocationInformationResponseType> getGetLocationInformationReturn() {
        return getLocationInformationReturn;
    }

    /**
     * Sets the value of the getLocationInformationReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetLocationInformationResponseType }{@code >}
     */
    public void setGetLocationInformationReturn(JAXBElement<GetLocationInformationResponseType> value) {
        this.getLocationInformationReturn = value;
    }

}
