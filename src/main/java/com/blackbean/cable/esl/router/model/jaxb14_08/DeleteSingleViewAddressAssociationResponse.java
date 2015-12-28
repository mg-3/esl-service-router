
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
 *         &lt;element name="deleteSingleViewAddressAssociationReturn" type="{http://xml.comcast.com/location/types}ResponseStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deleteSingleViewAddressAssociationReturn"
})
@XmlRootElement(name = "deleteSingleViewAddressAssociationResponse", namespace = "http://xml.comcast.com/location/services")
public class DeleteSingleViewAddressAssociationResponse {

    @XmlElementRef(name = "deleteSingleViewAddressAssociationReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseStatusType> deleteSingleViewAddressAssociationReturn;

    /**
     * Gets the value of the deleteSingleViewAddressAssociationReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ResponseStatusType }{@code >}
     */
    public JAXBElement<ResponseStatusType> getDeleteSingleViewAddressAssociationReturn() {
        return deleteSingleViewAddressAssociationReturn;
    }

    /**
     * Sets the value of the deleteSingleViewAddressAssociationReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ResponseStatusType }{@code >}
     */
    public void setDeleteSingleViewAddressAssociationReturn(JAXBElement<ResponseStatusType> value) {
        this.deleteSingleViewAddressAssociationReturn = value;
    }

}
