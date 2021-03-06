
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
 *         &lt;element name="queryNodeReturn" type="{http://xml.blackbean.com/location/types}QueryNodeResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryNodeReturn"
})
@XmlRootElement(name = "queryNodeResponse", namespace = "http://xml.blackbean.com/location/services")
public class QueryNodeResponse {

    @XmlElementRef(name = "queryNodeReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryNodeResponseType> queryNodeReturn;

    /**
     * Gets the value of the queryNodeReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryNodeResponseType }{@code >}
     */
    public JAXBElement<QueryNodeResponseType> getQueryNodeReturn() {
        return queryNodeReturn;
    }

    /**
     * Sets the value of the queryNodeReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryNodeResponseType }{@code >}
     */
    public void setQueryNodeReturn(JAXBElement<QueryNodeResponseType> value) {
        this.queryNodeReturn = value;
    }

}
