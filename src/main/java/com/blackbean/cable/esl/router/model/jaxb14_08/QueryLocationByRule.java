
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
 *         &lt;element name="QueryLocationByRule" type="{http://xml.comcast.com/location/types}QueryLocationByRuleRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryLocationByRule"
})
@XmlRootElement(name = "queryLocationByRule", namespace = "http://xml.comcast.com/location/services")
public class QueryLocationByRule {

    @XmlElementRef(name = "QueryLocationByRule", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryLocationByRuleRequestType> queryLocationByRule;

    /**
     * Gets the value of the queryLocationByRule property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryLocationByRuleRequestType }{@code >}
     */
    public JAXBElement<QueryLocationByRuleRequestType> getQueryLocationByRule() {
        return queryLocationByRule;
    }

    /**
     * Sets the value of the queryLocationByRule property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryLocationByRuleRequestType }{@code >}
     */
    public void setQueryLocationByRule(JAXBElement<QueryLocationByRuleRequestType> value) {
        this.queryLocationByRule = value;
    }

}
