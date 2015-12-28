
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
 *         &lt;element name="queryLocationQueueReturn" type="{http://xml.blackbean.com/location/types}QueryLocationQueueResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryLocationQueueReturn"
})
@XmlRootElement(name = "queryLocationQueueResponse", namespace = "http://xml.blackbean.com/location/services")
public class QueryLocationQueueResponse {

    @XmlElementRef(name = "queryLocationQueueReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryLocationQueueResponseType> queryLocationQueueReturn;

    /**
     * Gets the value of the queryLocationQueueReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryLocationQueueResponseType }{@code >}
     */
    public JAXBElement<QueryLocationQueueResponseType> getQueryLocationQueueReturn() {
        return queryLocationQueueReturn;
    }

    /**
     * Sets the value of the queryLocationQueueReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryLocationQueueResponseType }{@code >}
     */
    public void setQueryLocationQueueReturn(JAXBElement<QueryLocationQueueResponseType> value) {
        this.queryLocationQueueReturn = value;
    }

}
