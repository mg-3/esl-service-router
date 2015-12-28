
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
 *         &lt;element name="GetNode" type="{http://xml.blackbean.com/location/types}GetNodeRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getNode"
})
@XmlRootElement(name = "getNode", namespace = "http://xml.blackbean.com/location/services")
public class GetNode {

    @XmlElementRef(name = "GetNode", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetNodeRequestType> getNode;

    /**
     * Gets the value of the getNode property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetNodeRequestType }{@code >}
     */
    public JAXBElement<GetNodeRequestType> getGetNode() {
        return getNode;
    }

    /**
     * Sets the value of the getNode property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetNodeRequestType }{@code >}
     */
    public void setGetNode(JAXBElement<GetNodeRequestType> value) {
        this.getNode = value;
    }

}
