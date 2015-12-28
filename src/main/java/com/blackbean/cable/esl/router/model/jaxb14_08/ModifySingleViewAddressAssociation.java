
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
 *         &lt;element name="ModifySingleViewAddressAssociation" type="{http://xml.comcast.com/location/types}ModifySingleViewAddressAssociationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "modifySingleViewAddressAssociation"
})
@XmlRootElement(name = "modifySingleViewAddressAssociation", namespace = "http://xml.comcast.com/location/services")
public class ModifySingleViewAddressAssociation {

    @XmlElementRef(name = "ModifySingleViewAddressAssociation", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ModifySingleViewAddressAssociationType> modifySingleViewAddressAssociation;

    /**
     * Gets the value of the modifySingleViewAddressAssociation property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ModifySingleViewAddressAssociationType }{@code >}
     */
    public JAXBElement<ModifySingleViewAddressAssociationType> getModifySingleViewAddressAssociation() {
        return modifySingleViewAddressAssociation;
    }

    /**
     * Sets the value of the modifySingleViewAddressAssociation property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ModifySingleViewAddressAssociationType }{@code >}
     */
    public void setModifySingleViewAddressAssociation(JAXBElement<ModifySingleViewAddressAssociationType> value) {
        this.modifySingleViewAddressAssociation = value;
    }

}
