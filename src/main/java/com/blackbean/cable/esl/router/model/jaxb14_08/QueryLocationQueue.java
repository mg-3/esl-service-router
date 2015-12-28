
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
 *         &lt;element name="QueryLocationQueue" type="{http://xml.comcast.com/location/types}QueryLocationQueueRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryLocationQueue"
})
@XmlRootElement(name = "queryLocationQueue", namespace = "http://xml.comcast.com/location/services")
public class QueryLocationQueue {

    @XmlElementRef(name = "QueryLocationQueue", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryLocationQueueRequestType> queryLocationQueue;

    /**
     * Gets the value of the queryLocationQueue property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryLocationQueueRequestType }{@code >}
     */
    public JAXBElement<QueryLocationQueueRequestType> getQueryLocationQueue() {
        return queryLocationQueue;
    }

    /**
     * Sets the value of the queryLocationQueue property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryLocationQueueRequestType }{@code >}
     */
    public void setQueryLocationQueue(JAXBElement<QueryLocationQueueRequestType> value) {
        this.queryLocationQueue = value;
    }

}
