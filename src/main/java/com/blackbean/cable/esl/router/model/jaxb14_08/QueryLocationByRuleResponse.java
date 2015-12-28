
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
 *         &lt;element name="queryLocationByRuleReturn" type="{http://xml.blackbean.com/location/types}QueryLocationResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryLocationByRuleReturn"
})
@XmlRootElement(name = "queryLocationByRuleResponse", namespace = "http://xml.blackbean.com/location/services")
public class QueryLocationByRuleResponse {

    @XmlElementRef(name = "queryLocationByRuleReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryLocationResponseType> queryLocationByRuleReturn;

    /**
     * Gets the value of the queryLocationByRuleReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryLocationResponseType }{@code >}
     */
    public JAXBElement<QueryLocationResponseType> getQueryLocationByRuleReturn() {
        return queryLocationByRuleReturn;
    }

    /**
     * Sets the value of the queryLocationByRuleReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryLocationResponseType }{@code >}
     */
    public void setQueryLocationByRuleReturn(JAXBElement<QueryLocationResponseType> value) {
        this.queryLocationByRuleReturn = value;
    }

}
