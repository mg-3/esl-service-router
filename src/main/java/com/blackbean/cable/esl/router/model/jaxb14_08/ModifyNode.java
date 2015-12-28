
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
 *         &lt;element name="ModifyNode" type="{http://xml.blackbean.com/location/types}ModifyNodeRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "modifyNode"
})
@XmlRootElement(name = "modifyNode", namespace = "http://xml.blackbean.com/location/services")
public class ModifyNode {

    @XmlElementRef(name = "ModifyNode", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ModifyNodeRequestType> modifyNode;

    /**
     * Gets the value of the modifyNode property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ModifyNodeRequestType }{@code >}
     */
    public JAXBElement<ModifyNodeRequestType> getModifyNode() {
        return modifyNode;
    }

    /**
     * Sets the value of the modifyNode property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ModifyNodeRequestType }{@code >}
     */
    public void setModifyNode(JAXBElement<ModifyNodeRequestType> value) {
        this.modifyNode = value;
    }

}
