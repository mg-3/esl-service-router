
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
 *         &lt;element name="modifySingleViewAddressAssociationReturn" type="{http://xml.comcast.com/location/types}ResponseStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "modifySingleViewAddressAssociationReturn"
})
@XmlRootElement(name = "modifySingleViewAddressAssociationResponse", namespace = "http://xml.comcast.com/location/services")
public class ModifySingleViewAddressAssociationResponse {

    @XmlElementRef(name = "modifySingleViewAddressAssociationReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseStatusType> modifySingleViewAddressAssociationReturn;

    /**
     * Gets the value of the modifySingleViewAddressAssociationReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ResponseStatusType }{@code >}
     */
    public JAXBElement<ResponseStatusType> getModifySingleViewAddressAssociationReturn() {
        return modifySingleViewAddressAssociationReturn;
    }

    /**
     * Sets the value of the modifySingleViewAddressAssociationReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ResponseStatusType }{@code >}
     */
    public void setModifySingleViewAddressAssociationReturn(JAXBElement<ResponseStatusType> value) {
        this.modifySingleViewAddressAssociationReturn = value;
    }

}
