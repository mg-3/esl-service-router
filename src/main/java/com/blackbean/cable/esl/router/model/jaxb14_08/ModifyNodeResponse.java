
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
 *         &lt;element name="modifyNodeReturn" type="{http://xml.blackbean.com/location/types}ModifyNodeResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "modifyNodeReturn"
})
@XmlRootElement(name = "modifyNodeResponse", namespace = "http://xml.blackbean.com/location/services")
public class ModifyNodeResponse {

    @XmlElementRef(name = "modifyNodeReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ModifyNodeResponseType> modifyNodeReturn;

    /**
     * Gets the value of the modifyNodeReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ModifyNodeResponseType }{@code >}
     */
    public JAXBElement<ModifyNodeResponseType> getModifyNodeReturn() {
        return modifyNodeReturn;
    }

    /**
     * Sets the value of the modifyNodeReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ModifyNodeResponseType }{@code >}
     */
    public void setModifyNodeReturn(JAXBElement<ModifyNodeResponseType> value) {
        this.modifyNodeReturn = value;
    }

}
