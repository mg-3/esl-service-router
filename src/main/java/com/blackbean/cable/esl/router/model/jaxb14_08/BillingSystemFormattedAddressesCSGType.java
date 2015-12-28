
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingSystemFormattedAddressesCSGType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="BillingSystemFormattedAddressesCSGType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressLine1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="26"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegacyLocationID" type="{http://xml.blackbean.com/location/types}LegacyLocationIDType" minOccurs="0"/>
 *         &lt;element name="PostalCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingSystemFormattedAddressesCSGType", propOrder = {
        "addressLine1",
        "addressLine2",
        "legacyLocationID",
        "postalCode"
})
public class BillingSystemFormattedAddressesCSGType {

    @XmlElement(name = "AddressLine1")
    protected String addressLine1;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "LegacyLocationID")
    protected LegacyLocationIDType legacyLocationID;
    @XmlElement(name = "PostalCode")
    protected String postalCode;

    /**
     * Gets the value of the addressLine1 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the legacyLocationID property.
     *
     * @return possible object is
     * {@link LegacyLocationIDType }
     */
    public LegacyLocationIDType getLegacyLocationID() {
        return legacyLocationID;
    }

    /**
     * Sets the value of the legacyLocationID property.
     *
     * @param value allowed object is
     *              {@link LegacyLocationIDType }
     */
    public void setLegacyLocationID(LegacyLocationIDType value) {
        this.legacyLocationID = value;
    }

    /**
     * Gets the value of the postalCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

}
