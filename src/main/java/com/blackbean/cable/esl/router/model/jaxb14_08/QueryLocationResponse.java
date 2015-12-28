
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
 *         &lt;element name="queryLocationReturn" type="{http://xml.blackbean.com/location/types}QueryLocationResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryLocationReturn"
})
@XmlRootElement(name = "queryLocationResponse", namespace = "http://xml.blackbean.com/location/services")
public class QueryLocationResponse {

    @XmlElementRef(name = "queryLocationReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryLocationResponseType> queryLocationReturn;

    /**
     * Gets the value of the queryLocationReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryLocationResponseType }{@code >}
     */
    public JAXBElement<QueryLocationResponseType> getQueryLocationReturn() {
        return queryLocationReturn;
    }

    /**
     * Sets the value of the queryLocationReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryLocationResponseType }{@code >}
     */
    public void setQueryLocationReturn(JAXBElement<QueryLocationResponseType> value) {
        this.queryLocationReturn = value;
    }

}
