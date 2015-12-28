
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LegacyMarketIDType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LegacyMarketIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legacyMarketIDSource" type="{http://xml.blackbean.com/location/types}BillingSystemType"/>
 *         &lt;element name="CSGMarketID" type="{http://xml.blackbean.com/location/types}CSGLegacyMarketType" minOccurs="0"/>
 *         &lt;element name="DSTMarketID" type="{http://xml.blackbean.com/location/types}DSTLegacyMarketType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegacyMarketIDType", propOrder = {
        "legacyMarketIDSource",
        "csgMarketID",
        "dstMarketID"
})
public class LegacyMarketIDType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BillingSystemType legacyMarketIDSource;
    @XmlElementRef(name = "CSGMarketID", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<CSGLegacyMarketType> csgMarketID;
    @XmlElementRef(name = "DSTMarketID", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<DSTLegacyMarketType> dstMarketID;

    /**
     * Gets the value of the legacyMarketIDSource property.
     *
     * @return possible object is
     * {@link BillingSystemType }
     */
    public BillingSystemType getLegacyMarketIDSource() {
        return legacyMarketIDSource;
    }

    /**
     * Sets the value of the legacyMarketIDSource property.
     *
     * @param value allowed object is
     *              {@link BillingSystemType }
     */
    public void setLegacyMarketIDSource(BillingSystemType value) {
        this.legacyMarketIDSource = value;
    }

    /**
     * Gets the value of the csgMarketID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link CSGLegacyMarketType }{@code >}
     */
    public JAXBElement<CSGLegacyMarketType> getCSGMarketID() {
        return csgMarketID;
    }

    /**
     * Sets the value of the csgMarketID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link CSGLegacyMarketType }{@code >}
     */
    public void setCSGMarketID(JAXBElement<CSGLegacyMarketType> value) {
        this.csgMarketID = value;
    }

    /**
     * Gets the value of the dstMarketID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DSTLegacyMarketType }{@code >}
     */
    public JAXBElement<DSTLegacyMarketType> getDSTMarketID() {
        return dstMarketID;
    }

    /**
     * Sets the value of the dstMarketID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DSTLegacyMarketType }{@code >}
     */
    public void setDSTMarketID(JAXBElement<DSTLegacyMarketType> value) {
        this.dstMarketID = value;
    }

}
