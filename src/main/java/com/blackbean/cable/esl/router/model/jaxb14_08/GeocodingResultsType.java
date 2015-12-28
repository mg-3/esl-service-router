
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for GeocodingResultsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GeocodingResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="censusBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urbanization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geocodingPrecision" type="{http://xml.blackbean.com/location/types}GeocodingPrecisionType" minOccurs="0"/>
 *         &lt;element name="rateCenterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodingResultsType", propOrder = {
        "latitude",
        "longitude",
        "censusBlock",
        "urbanization",
        "geocodingPrecision",
        "rateCenterName"
})
public class GeocodingResultsType {

    @XmlElementRef(name = "latitude", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> latitude;
    @XmlElementRef(name = "longitude", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> longitude;
    @XmlElementRef(name = "censusBlock", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> censusBlock;
    @XmlElementRef(name = "urbanization", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> urbanization;
    @XmlElementRef(name = "geocodingPrecision", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<GeocodingPrecisionType> geocodingPrecision;
    @XmlElementRef(name = "rateCenterName", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rateCenterName;

    /**
     * Gets the value of the latitude property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    public JAXBElement<BigDecimal> getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    public void setLatitude(JAXBElement<BigDecimal> value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    public JAXBElement<BigDecimal> getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    public void setLongitude(JAXBElement<BigDecimal> value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the censusBlock property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getCensusBlock() {
        return censusBlock;
    }

    /**
     * Sets the value of the censusBlock property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setCensusBlock(JAXBElement<String> value) {
        this.censusBlock = value;
    }

    /**
     * Gets the value of the urbanization property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getUrbanization() {
        return urbanization;
    }

    /**
     * Sets the value of the urbanization property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setUrbanization(JAXBElement<String> value) {
        this.urbanization = value;
    }

    /**
     * Gets the value of the geocodingPrecision property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GeocodingPrecisionType }{@code >}
     */
    public JAXBElement<GeocodingPrecisionType> getGeocodingPrecision() {
        return geocodingPrecision;
    }

    /**
     * Sets the value of the geocodingPrecision property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GeocodingPrecisionType }{@code >}
     */
    public void setGeocodingPrecision(JAXBElement<GeocodingPrecisionType> value) {
        this.geocodingPrecision = value;
    }

    /**
     * Gets the value of the rateCenterName property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getRateCenterName() {
        return rateCenterName;
    }

    /**
     * Sets the value of the rateCenterName property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setRateCenterName(JAXBElement<String> value) {
        this.rateCenterName = value;
    }

}
