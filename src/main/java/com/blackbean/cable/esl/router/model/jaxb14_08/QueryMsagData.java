
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
 *         &lt;element name="QueryMsagData" type="{http://xml.blackbean.com/location/types}QueryMsagDataRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryMsagData"
})
@XmlRootElement(name = "queryMsagData", namespace = "http://xml.blackbean.com/location/services")
public class QueryMsagData {

    @XmlElementRef(name = "QueryMsagData", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryMsagDataRequestType> queryMsagData;

    /**
     * Gets the value of the queryMsagData property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryMsagDataRequestType }{@code >}
     */
    public JAXBElement<QueryMsagDataRequestType> getQueryMsagData() {
        return queryMsagData;
    }

    /**
     * Sets the value of the queryMsagData property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryMsagDataRequestType }{@code >}
     */
    public void setQueryMsagData(JAXBElement<QueryMsagDataRequestType> value) {
        this.queryMsagData = value;
    }

}
