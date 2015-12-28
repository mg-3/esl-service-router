
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
 *         &lt;element name="deleteMsagAddressAssociationReturn" type="{http://xml.comcast.com/location/types}DeleteMsagAddressAssociationResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deleteMsagAddressAssociationReturn"
})
@XmlRootElement(name = "deleteMsagAddressAssociationResponse", namespace = "http://xml.comcast.com/location/services")
public class DeleteMsagAddressAssociationResponse {

    @XmlElementRef(name = "deleteMsagAddressAssociationReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<DeleteMsagAddressAssociationResponseType> deleteMsagAddressAssociationReturn;

    /**
     * Gets the value of the deleteMsagAddressAssociationReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DeleteMsagAddressAssociationResponseType }{@code >}
     */
    public JAXBElement<DeleteMsagAddressAssociationResponseType> getDeleteMsagAddressAssociationReturn() {
        return deleteMsagAddressAssociationReturn;
    }

    /**
     * Sets the value of the deleteMsagAddressAssociationReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DeleteMsagAddressAssociationResponseType }{@code >}
     */
    public void setDeleteMsagAddressAssociationReturn(JAXBElement<DeleteMsagAddressAssociationResponseType> value) {
        this.deleteMsagAddressAssociationReturn = value;
    }

}
