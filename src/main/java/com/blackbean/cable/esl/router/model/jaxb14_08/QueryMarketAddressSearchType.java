
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMarketAddressSearchType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryMarketAddressSearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[A-Z]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="zip" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{5}([\-]?\d{4})?"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="returnWirelessVendorMarketReference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="returnLevel4MarketsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMarketAddressSearchType", propOrder = {
        "city",
        "state",
        "zip",
        "returnWirelessVendorMarketReference",
        "returnLevel4MarketsOnly"
})
public class QueryMarketAddressSearchType {

    protected String city;
    protected String state;
    protected String zip;
    protected Boolean returnWirelessVendorMarketReference;
    protected Boolean returnLevel4MarketsOnly;

    /**
     * Gets the value of the city property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the returnWirelessVendorMarketReference property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isReturnWirelessVendorMarketReference() {
        return returnWirelessVendorMarketReference;
    }

    /**
     * Sets the value of the returnWirelessVendorMarketReference property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setReturnWirelessVendorMarketReference(Boolean value) {
        this.returnWirelessVendorMarketReference = value;
    }

    /**
     * Gets the value of the returnLevel4MarketsOnly property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isReturnLevel4MarketsOnly() {
        return returnLevel4MarketsOnly;
    }

    /**
     * Sets the value of the returnLevel4MarketsOnly property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setReturnLevel4MarketsOnly(Boolean value) {
        this.returnLevel4MarketsOnly = value;
    }

}
