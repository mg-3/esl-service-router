
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
 *         &lt;element name="AddNode" type="{http://xml.blackbean.com/location/types}AddNodeRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "addNode"
})
@XmlRootElement(name = "addNode", namespace = "http://xml.blackbean.com/location/services")
public class AddNode {

    @XmlElementRef(name = "AddNode", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<AddNodeRequestType> addNode;

    /**
     * Gets the value of the addNode property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AddNodeRequestType }{@code >}
     */
    public JAXBElement<AddNodeRequestType> getAddNode() {
        return addNode;
    }

    /**
     * Sets the value of the addNode property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AddNodeRequestType }{@code >}
     */
    public void setAddNode(JAXBElement<AddNodeRequestType> value) {
        this.addNode = value;
    }

}
