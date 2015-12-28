
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ZipCodeType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ZipCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zip5">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{5}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="zip4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{4}"/>
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
@XmlType(name = "ZipCodeType", propOrder = {
        "zip5",
        "zip4"
})
public class ZipCodeType {

    @XmlElement(required = true)
    protected String zip5;
    @XmlElementRef(name = "zip4", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zip4;

    /**
     * Gets the value of the zip5 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getZip5() {
        return zip5;
    }

    /**
     * Sets the value of the zip5 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setZip5(String value) {
        this.zip5 = value;
    }

    /**
     * Gets the value of the zip4 property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getZip4() {
        return zip4;
    }

    /**
     * Sets the value of the zip4 property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setZip4(JAXBElement<String> value) {
        this.zip4 = value;
    }

}
