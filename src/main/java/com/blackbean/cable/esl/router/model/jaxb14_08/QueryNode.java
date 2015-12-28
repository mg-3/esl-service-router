
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
 *         &lt;element name="QueryNode" type="{http://xml.comcast.com/location/types}QueryNodeRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryNode"
})
@XmlRootElement(name = "queryNode", namespace = "http://xml.comcast.com/location/services")
public class QueryNode {

    @XmlElementRef(name = "QueryNode", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryNodeRequestType> queryNode;

    /**
     * Gets the value of the queryNode property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link QueryNodeRequestType }{@code >}
     */
    public JAXBElement<QueryNodeRequestType> getQueryNode() {
        return queryNode;
    }

    /**
     * Sets the value of the queryNode property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link QueryNodeRequestType }{@code >}
     */
    public void setQueryNode(JAXBElement<QueryNodeRequestType> value) {
        this.queryNode = value;
    }

}
