
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for VendorMarketReferenceType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="VendorMarketReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vendorType" type="{http://xml.blackbean.com/location/types}VendorMarketType"/>
 *         &lt;element name="VendorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VendorMarketID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorMarketReferenceType", propOrder = {
        "vendorType",
        "vendorID",
        "vendorMarketID"
})
public class VendorMarketReferenceType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VendorMarketType vendorType;
    @XmlElement(name = "VendorID", required = true)
    protected String vendorID;
    @XmlElement(name = "VendorMarketID", required = true)
    protected String vendorMarketID;

    /**
     * Gets the value of the vendorType property.
     *
     * @return possible object is
     * {@link VendorMarketType }
     */
    public VendorMarketType getVendorType() {
        return vendorType;
    }

    /**
     * Sets the value of the vendorType property.
     *
     * @param value allowed object is
     *              {@link VendorMarketType }
     */
    public void setVendorType(VendorMarketType value) {
        this.vendorType = value;
    }

    /**
     * Gets the value of the vendorID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVendorID() {
        return vendorID;
    }

    /**
     * Sets the value of the vendorID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVendorID(String value) {
        this.vendorID = value;
    }

    /**
     * Gets the value of the vendorMarketID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVendorMarketID() {
        return vendorMarketID;
    }

    /**
     * Sets the value of the vendorMarketID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVendorMarketID(String value) {
        this.vendorMarketID = value;
    }

}
