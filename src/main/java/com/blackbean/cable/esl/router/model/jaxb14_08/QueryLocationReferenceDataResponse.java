
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
 *         &lt;element name="queryLocationReferenceDataReturn" type="{http://xml.blackbean.com/location/types}QueryLocationReferenceDataResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryLocationReferenceDataReturn"
})
@XmlRootElement(name = "queryLocationReferenceDataResponse", namespace = "http://xml.blackbean.com/location/services")
public class QueryLocationReferenceDataResponse {

    @XmlElementRef(name = "queryLocationReferenceDataReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryLocationReferenceDataResponseType> queryLocationReferenceDataReturn;

    /**
     * Gets the value of the queryLocationReferenceDataReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryLocationReferenceDataResponseType }{@code >}
     */
    public JAXBElement<QueryLocationReferenceDataResponseType> getQueryLocationReferenceDataReturn() {
        return queryLocationReferenceDataReturn;
    }

    /**
     * Sets the value of the queryLocationReferenceDataReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryLocationReferenceDataResponseType }{@code >}
     */
    public void setQueryLocationReferenceDataReturn(JAXBElement<QueryLocationReferenceDataResponseType> value) {
        this.queryLocationReferenceDataReturn = value;
    }

}
