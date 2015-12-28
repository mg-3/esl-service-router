
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
 *         &lt;element name="deleteNodeReturn" type="{http://xml.blackbean.com/location/types}DeleteNodeResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deleteNodeReturn"
})
@XmlRootElement(name = "deleteNodeResponse", namespace = "http://xml.blackbean.com/location/services")
public class DeleteNodeResponse {

    @XmlElementRef(name = "deleteNodeReturn", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<DeleteNodeResponseType> deleteNodeReturn;

    /**
     * Gets the value of the deleteNodeReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DeleteNodeResponseType }{@code >}
     */
    public JAXBElement<DeleteNodeResponseType> getDeleteNodeReturn() {
        return deleteNodeReturn;
    }

    /**
     * Sets the value of the deleteNodeReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DeleteNodeResponseType }{@code >}
     */
    public void setDeleteNodeReturn(JAXBElement<DeleteNodeResponseType> value) {
        this.deleteNodeReturn = value;
    }

}
