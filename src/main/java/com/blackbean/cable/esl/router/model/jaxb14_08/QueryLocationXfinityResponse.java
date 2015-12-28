
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
 *         &lt;element name="queryLocationXfinityReturn" type="{http://xml.blackbean.com/location/types}QueryLocationXfinityResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryLocationXfinityReturn"
})
@XmlRootElement(name = "queryLocationXfinityResponse", namespace = "http://xml.blackbean.com/location/services")
public class QueryLocationXfinityResponse {

    @XmlElementRef(name = "queryLocationXfinityReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryLocationXfinityResponseType> queryLocationXfinityReturn;

    /**
     * Gets the value of the queryLocationXfinityReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryLocationXfinityResponseType }{@code >}
     */
    public JAXBElement<QueryLocationXfinityResponseType> getQueryLocationXfinityReturn() {
        return queryLocationXfinityReturn;
    }

    /**
     * Sets the value of the queryLocationXfinityReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryLocationXfinityResponseType }{@code >}
     */
    public void setQueryLocationXfinityReturn(JAXBElement<QueryLocationXfinityResponseType> value) {
        this.queryLocationXfinityReturn = value;
    }

}
