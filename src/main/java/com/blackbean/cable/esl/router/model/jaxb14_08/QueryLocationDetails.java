
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
 *         &lt;element name="QueryLocationDetails" type="{http://xml.blackbean.com/location/types}QueryLocationDetailsRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryLocationDetails"
})
@XmlRootElement(name = "queryLocationDetails", namespace = "http://xml.blackbean.com/location/services")
public class QueryLocationDetails {

    @XmlElementRef(name = "QueryLocationDetails", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryLocationDetailsRequestType> queryLocationDetails;

    /**
     * Gets the value of the queryLocationDetails property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryLocationDetailsRequestType }{@code >}
     */
    public JAXBElement<QueryLocationDetailsRequestType> getQueryLocationDetails() {
        return queryLocationDetails;
    }

    /**
     * Sets the value of the queryLocationDetails property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryLocationDetailsRequestType }{@code >}
     */
    public void setQueryLocationDetails(JAXBElement<QueryLocationDetailsRequestType> value) {
        this.queryLocationDetails = value;
    }

}
