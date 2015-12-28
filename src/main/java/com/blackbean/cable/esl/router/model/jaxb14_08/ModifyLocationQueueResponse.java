
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
 *         &lt;element name="modifyLocationQueueReturn" type="{http://xml.comcast.com/location/types}ModifyLocationQueueResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "modifyLocationQueueReturn"
})
@XmlRootElement(name = "modifyLocationQueueResponse", namespace = "http://xml.comcast.com/location/services")
public class ModifyLocationQueueResponse {

    @XmlElementRef(name = "modifyLocationQueueReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ModifyLocationQueueResponseType> modifyLocationQueueReturn;

    /**
     * Gets the value of the modifyLocationQueueReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ModifyLocationQueueResponseType }{@code >}
     */
    public JAXBElement<ModifyLocationQueueResponseType> getModifyLocationQueueReturn() {
        return modifyLocationQueueReturn;
    }

    /**
     * Sets the value of the modifyLocationQueueReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ModifyLocationQueueResponseType }{@code >}
     */
    public void setModifyLocationQueueReturn(JAXBElement<ModifyLocationQueueResponseType> value) {
        this.modifyLocationQueueReturn = value;
    }

}
