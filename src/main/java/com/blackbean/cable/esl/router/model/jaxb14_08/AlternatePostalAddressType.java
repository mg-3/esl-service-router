
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternatePostalAddressType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AlternatePostalAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternateAddressNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AlternateAddressType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PostalAddress" type="{http://xml.comcast.com/location/types}PostalAddressType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternatePostalAddressType", propOrder = {
        "alternateAddressNumber",
        "alternateAddressType",
        "postalAddress"
})
public class AlternatePostalAddressType {

    @XmlElement(name = "AlternateAddressNumber")
    protected int alternateAddressNumber;
    @XmlElement(name = "AlternateAddressType", required = true)
    protected String alternateAddressType;
    @XmlElement(name = "PostalAddress", required = true)
    protected PostalAddressType postalAddress;

    /**
     * Gets the value of the alternateAddressNumber property.
     */
    public int getAlternateAddressNumber() {
        return alternateAddressNumber;
    }

    /**
     * Sets the value of the alternateAddressNumber property.
     */
    public void setAlternateAddressNumber(int value) {
        this.alternateAddressNumber = value;
    }

    /**
     * Gets the value of the alternateAddressType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAlternateAddressType() {
        return alternateAddressType;
    }

    /**
     * Sets the value of the alternateAddressType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAlternateAddressType(String value) {
        this.alternateAddressType = value;
    }

    /**
     * Gets the value of the postalAddress property.
     *
     * @return possible object is
     * {@link PostalAddressType }
     */
    public PostalAddressType getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     *
     * @param value allowed object is
     *              {@link PostalAddressType }
     */
    public void setPostalAddress(PostalAddressType value) {
        this.postalAddress = value;
    }

}
