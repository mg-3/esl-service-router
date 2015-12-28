
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
 *         &lt;element name="queryLocationGeospatialReturn" type="{http://xml.blackbean.com/location/types}QueryLocationGeospatialResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryLocationGeospatialReturn"
})
@XmlRootElement(name = "queryLocationGeospatialResponse", namespace = "http://xml.blackbean.com/location/services")
public class QueryLocationGeospatialResponse {

    @XmlElementRef(name = "queryLocationGeospatialReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryLocationGeospatialResponseType> queryLocationGeospatialReturn;

    /**
     * Gets the value of the queryLocationGeospatialReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryLocationGeospatialResponseType }{@code >}
     */
    public JAXBElement<QueryLocationGeospatialResponseType> getQueryLocationGeospatialReturn() {
        return queryLocationGeospatialReturn;
    }

    /**
     * Sets the value of the queryLocationGeospatialReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryLocationGeospatialResponseType }{@code >}
     */
    public void setQueryLocationGeospatialReturn(JAXBElement<QueryLocationGeospatialResponseType> value) {
        this.queryLocationGeospatialReturn = value;
    }

}
