
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
 *         &lt;element name="DeleteMsagAddressAssociation" type="{http://xml.blackbean.com/location/types}DeleteMsagAddressAssociationRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deleteMsagAddressAssociation"
})
@XmlRootElement(name = "deleteMsagAddressAssociation", namespace = "http://xml.blackbean.com/location/services")
public class DeleteMsagAddressAssociation {

    @XmlElementRef(name = "DeleteMsagAddressAssociation", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<DeleteMsagAddressAssociationRequestType> deleteMsagAddressAssociation;

    /**
     * Gets the value of the deleteMsagAddressAssociation property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DeleteMsagAddressAssociationRequestType }{@code >}
     */
    public JAXBElement<DeleteMsagAddressAssociationRequestType> getDeleteMsagAddressAssociation() {
        return deleteMsagAddressAssociation;
    }

    /**
     * Sets the value of the deleteMsagAddressAssociation property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DeleteMsagAddressAssociationRequestType }{@code >}
     */
    public void setDeleteMsagAddressAssociation(JAXBElement<DeleteMsagAddressAssociationRequestType> value) {
        this.deleteMsagAddressAssociation = value;
    }

}
