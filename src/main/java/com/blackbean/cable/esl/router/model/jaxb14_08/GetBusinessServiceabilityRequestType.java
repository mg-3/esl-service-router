
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBusinessServiceabilityRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetBusinessServiceabilityRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessServiceabilityRequests" type="{http://xml.comcast.com/location/types}ArrayOfBusinessServiceabilityRequestItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBusinessServiceabilityRequestType", propOrder = {
        "businessServiceabilityRequests"
})
public class GetBusinessServiceabilityRequestType {

    @XmlElement(name = "BusinessServiceabilityRequests", required = true)
    protected ArrayOfBusinessServiceabilityRequestItemType businessServiceabilityRequests;

    /**
     * Gets the value of the businessServiceabilityRequests property.
     *
     * @return possible object is
     * {@link ArrayOfBusinessServiceabilityRequestItemType }
     */
    public ArrayOfBusinessServiceabilityRequestItemType getBusinessServiceabilityRequests() {
        return businessServiceabilityRequests;
    }

    /**
     * Sets the value of the businessServiceabilityRequests property.
     *
     * @param value allowed object is
     *              {@link ArrayOfBusinessServiceabilityRequestItemType }
     */
    public void setBusinessServiceabilityRequests(ArrayOfBusinessServiceabilityRequestItemType value) {
        this.businessServiceabilityRequests = value;
    }

}
