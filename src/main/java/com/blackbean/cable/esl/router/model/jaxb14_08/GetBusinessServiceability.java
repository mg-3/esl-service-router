
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
 *         &lt;element name="GetBusinessServiceabilityRequest" type="{http://xml.comcast.com/location/types}GetBusinessServiceabilityRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getBusinessServiceabilityRequest"
})
@XmlRootElement(name = "getBusinessServiceability", namespace = "http://xml.comcast.com/location/services")
public class GetBusinessServiceability {

    @XmlElementRef(name = "GetBusinessServiceabilityRequest", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetBusinessServiceabilityRequestType> getBusinessServiceabilityRequest;

    /**
     * Gets the value of the getBusinessServiceabilityRequest property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetBusinessServiceabilityRequestType }{@code >}
     */
    public JAXBElement<GetBusinessServiceabilityRequestType> getGetBusinessServiceabilityRequest() {
        return getBusinessServiceabilityRequest;
    }

    /**
     * Sets the value of the getBusinessServiceabilityRequest property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetBusinessServiceabilityRequestType }{@code >}
     */
    public void setGetBusinessServiceabilityRequest(JAXBElement<GetBusinessServiceabilityRequestType> value) {
        this.getBusinessServiceabilityRequest = value;
    }

}
