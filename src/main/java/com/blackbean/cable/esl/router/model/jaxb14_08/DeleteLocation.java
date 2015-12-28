
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
 *         &lt;element name="DeleteLocation" type="{http://xml.blackbean.com/location/types}DeleteLocationRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deleteLocation"
})
@XmlRootElement(name = "deleteLocation", namespace = "http://xml.blackbean.com/location/services")
public class DeleteLocation {

    @XmlElementRef(name = "DeleteLocation", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<DeleteLocationRequestType> deleteLocation;

    /**
     * Gets the value of the deleteLocation property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DeleteLocationRequestType }{@code >}
     */
    public JAXBElement<DeleteLocationRequestType> getDeleteLocation() {
        return deleteLocation;
    }

    /**
     * Sets the value of the deleteLocation property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DeleteLocationRequestType }{@code >}
     */
    public void setDeleteLocation(JAXBElement<DeleteLocationRequestType> value) {
        this.deleteLocation = value;
    }

}
