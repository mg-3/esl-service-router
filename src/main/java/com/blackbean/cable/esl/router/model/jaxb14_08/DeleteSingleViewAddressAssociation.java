
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
 *         &lt;element name="DeleteSingleViewAddressAssociation" type="{http://xml.blackbean.com/location/types}DeleteSingleViewAddressAssociationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deleteSingleViewAddressAssociation"
})
@XmlRootElement(name = "deleteSingleViewAddressAssociation", namespace = "http://xml.blackbean.com/location/services")
public class DeleteSingleViewAddressAssociation {

    @XmlElementRef(name = "DeleteSingleViewAddressAssociation", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<DeleteSingleViewAddressAssociationType> deleteSingleViewAddressAssociation;

    /**
     * Gets the value of the deleteSingleViewAddressAssociation property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DeleteSingleViewAddressAssociationType }{@code >}
     */
    public JAXBElement<DeleteSingleViewAddressAssociationType> getDeleteSingleViewAddressAssociation() {
        return deleteSingleViewAddressAssociation;
    }

    /**
     * Sets the value of the deleteSingleViewAddressAssociation property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DeleteSingleViewAddressAssociationType }{@code >}
     */
    public void setDeleteSingleViewAddressAssociation(JAXBElement<DeleteSingleViewAddressAssociationType> value) {
        this.deleteSingleViewAddressAssociation = value;
    }

}
