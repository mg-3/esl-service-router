
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
 *         &lt;element name="queryMsagDataReturn" type="{http://xml.comcast.com/location/types}QueryMsagDataResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryMsagDataReturn"
})
@XmlRootElement(name = "queryMsagDataResponse", namespace = "http://xml.comcast.com/location/services")
public class QueryMsagDataResponse {

    @XmlElementRef(name = "queryMsagDataReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryMsagDataResponseType> queryMsagDataReturn;

    /**
     * Gets the value of the queryMsagDataReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryMsagDataResponseType }{@code >}
     */
    public JAXBElement<QueryMsagDataResponseType> getQueryMsagDataReturn() {
        return queryMsagDataReturn;
    }

    /**
     * Sets the value of the queryMsagDataReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryMsagDataResponseType }{@code >}
     */
    public void setQueryMsagDataReturn(JAXBElement<QueryMsagDataResponseType> value) {
        this.queryMsagDataReturn = value;
    }

}
