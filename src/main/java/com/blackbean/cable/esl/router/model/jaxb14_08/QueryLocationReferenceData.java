
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
 *         &lt;element name="QueryLocationReferenceData" type="{http://xml.blackbean.com/location/types}QueryLocationReferenceDataRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryLocationReferenceData"
})
@XmlRootElement(name = "queryLocationReferenceData", namespace = "http://xml.blackbean.com/location/services")
public class QueryLocationReferenceData {

    @XmlElementRef(name = "QueryLocationReferenceData", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryLocationReferenceDataRequestType> queryLocationReferenceData;

    /**
     * Gets the value of the queryLocationReferenceData property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryLocationReferenceDataRequestType }{@code >}
     */
    public JAXBElement<QueryLocationReferenceDataRequestType> getQueryLocationReferenceData() {
        return queryLocationReferenceData;
    }

    /**
     * Sets the value of the queryLocationReferenceData property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryLocationReferenceDataRequestType }{@code >}
     */
    public void setQueryLocationReferenceData(JAXBElement<QueryLocationReferenceDataRequestType> value) {
        this.queryLocationReferenceData = value;
    }

}
