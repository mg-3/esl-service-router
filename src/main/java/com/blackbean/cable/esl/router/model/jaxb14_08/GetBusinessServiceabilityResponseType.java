
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBusinessServiceabilityResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetBusinessServiceabilityResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessServiceabilityResponses" type="{http://xml.blackbean.com/location/types}ArrayOfBusinessServiceabilityResponseItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBusinessServiceabilityResponseType", propOrder = {
        "businessServiceabilityResponses"
})
public class GetBusinessServiceabilityResponseType {

    @XmlElementRef(name = "BusinessServiceabilityResponses", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBusinessServiceabilityResponseItemType> businessServiceabilityResponses;

    /**
     * Gets the value of the businessServiceabilityResponses property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfBusinessServiceabilityResponseItemType }{@code >}
     */
    public JAXBElement<ArrayOfBusinessServiceabilityResponseItemType> getBusinessServiceabilityResponses() {
        return businessServiceabilityResponses;
    }

    /**
     * Sets the value of the businessServiceabilityResponses property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfBusinessServiceabilityResponseItemType }{@code >}
     */
    public void setBusinessServiceabilityResponses(JAXBElement<ArrayOfBusinessServiceabilityResponseItemType> value) {
        this.businessServiceabilityResponses = value;
    }

}
