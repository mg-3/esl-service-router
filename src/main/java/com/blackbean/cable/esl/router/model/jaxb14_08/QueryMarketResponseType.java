
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMarketResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryMarketResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketReference" type="{http://xml.comcast.com/location/types}ArrayOfMarketReferenceType" minOccurs="0"/>
 *         &lt;element name="vendorMarketReference" type="{http://xml.comcast.com/location/types}ArrayOfVendorMarketReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMarketResponseType", propOrder = {
        "marketReference",
        "vendorMarketReference"
})
public class QueryMarketResponseType {

    @XmlElementRef(name = "marketReference", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMarketReferenceType> marketReference;
    @XmlElementRef(name = "vendorMarketReference", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVendorMarketReferenceType> vendorMarketReference;

    /**
     * Gets the value of the marketReference property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfMarketReferenceType }{@code >}
     */
    public JAXBElement<ArrayOfMarketReferenceType> getMarketReference() {
        return marketReference;
    }

    /**
     * Sets the value of the marketReference property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfMarketReferenceType }{@code >}
     */
    public void setMarketReference(JAXBElement<ArrayOfMarketReferenceType> value) {
        this.marketReference = value;
    }

    /**
     * Gets the value of the vendorMarketReference property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfVendorMarketReferenceType }{@code >}
     */
    public JAXBElement<ArrayOfVendorMarketReferenceType> getVendorMarketReference() {
        return vendorMarketReference;
    }

    /**
     * Sets the value of the vendorMarketReference property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfVendorMarketReferenceType }{@code >}
     */
    public void setVendorMarketReference(JAXBElement<ArrayOfVendorMarketReferenceType> value) {
        this.vendorMarketReference = value;
    }

}
