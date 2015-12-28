
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
 *         &lt;element name="addNodeReturn" type="{http://xml.blackbean.com/location/types}AddNodeResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "addNodeReturn"
})
@XmlRootElement(name = "addNodeResponse", namespace = "http://xml.blackbean.com/location/services")
public class AddNodeResponse {

    @XmlElementRef(name = "addNodeReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<AddNodeResponseType> addNodeReturn;

    /**
     * Gets the value of the addNodeReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AddNodeResponseType }{@code >}
     */
    public JAXBElement<AddNodeResponseType> getAddNodeReturn() {
        return addNodeReturn;
    }

    /**
     * Sets the value of the addNodeReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AddNodeResponseType }{@code >}
     */
    public void setAddNodeReturn(JAXBElement<AddNodeResponseType> value) {
        this.addNodeReturn = value;
    }

}
