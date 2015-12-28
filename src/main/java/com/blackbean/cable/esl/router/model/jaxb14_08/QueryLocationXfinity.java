
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
 *         &lt;element name="QueryLocationXfinity" type="{http://xml.blackbean.com/location/types}QueryLocationXfinityRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryLocationXfinity"
})
@XmlRootElement(name = "queryLocationXfinity", namespace = "http://xml.blackbean.com/location/services")
public class QueryLocationXfinity {

    @XmlElementRef(name = "QueryLocationXfinity", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryLocationXfinityRequestType> queryLocationXfinity;

    /**
     * Gets the value of the queryLocationXfinity property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryLocationXfinityRequestType }{@code >}
     */
    public JAXBElement<QueryLocationXfinityRequestType> getQueryLocationXfinity() {
        return queryLocationXfinity;
    }

    /**
     * Sets the value of the queryLocationXfinity property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryLocationXfinityRequestType }{@code >}
     */
    public void setQueryLocationXfinity(JAXBElement<QueryLocationXfinityRequestType> value) {
        this.queryLocationXfinity = value;
    }

}
