
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for GeographyInfoType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GeographyInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="censusBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="censusTract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vertexCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fipsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minorCivilDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geocodingPrecision" type="{http://xml.blackbean.com/location/types}GeocodingPrecisionType" minOccurs="0"/>
 *         &lt;element name="urbanization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographyInfoType", propOrder = {
        "censusBlock",
        "censusTract",
        "placeName",
        "vertexCode",
        "fipsCode",
        "countyName",
        "minorCivilDivision",
        "geocodingPrecision",
        "urbanization",
        "latitude",
        "longitude"
})
public class GeographyInfoType {

    protected String censusBlock;
    protected String censusTract;
    protected String placeName;
    protected String vertexCode;
    protected String fipsCode;
    protected String countyName;
    protected String minorCivilDivision;
    protected GeocodingPrecisionType geocodingPrecision;
    protected String urbanization;
    @XmlElementRef(name = "latitude", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> latitude;
    @XmlElementRef(name = "longitude", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> longitude;

    /**
     * Gets the value of the censusBlock property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCensusBlock() {
        return censusBlock;
    }

    /**
     * Sets the value of the censusBlock property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCensusBlock(String value) {
        this.censusBlock = value;
    }

    /**
     * Gets the value of the censusTract property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCensusTract() {
        return censusTract;
    }

    /**
     * Sets the value of the censusTract property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCensusTract(String value) {
        this.censusTract = value;
    }

    /**
     * Gets the value of the placeName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPlaceName(String value) {
        this.placeName = value;
    }

    /**
     * Gets the value of the vertexCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVertexCode() {
        return vertexCode;
    }

    /**
     * Sets the value of the vertexCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVertexCode(String value) {
        this.vertexCode = value;
    }

    /**
     * Gets the value of the fipsCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFipsCode() {
        return fipsCode;
    }

    /**
     * Sets the value of the fipsCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFipsCode(String value) {
        this.fipsCode = value;
    }

    /**
     * Gets the value of the countyName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * Sets the value of the countyName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCountyName(String value) {
        this.countyName = value;
    }

    /**
     * Gets the value of the minorCivilDivision property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMinorCivilDivision() {
        return minorCivilDivision;
    }

    /**
     * Sets the value of the minorCivilDivision property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMinorCivilDivision(String value) {
        this.minorCivilDivision = value;
    }

    /**
     * Gets the value of the geocodingPrecision property.
     *
     * @return possible object is
     * {@link GeocodingPrecisionType }
     */
    public GeocodingPrecisionType getGeocodingPrecision() {
        return geocodingPrecision;
    }

    /**
     * Sets the value of the geocodingPrecision property.
     *
     * @param value allowed object is
     *              {@link GeocodingPrecisionType }
     */
    public void setGeocodingPrecision(GeocodingPrecisionType value) {
        this.geocodingPrecision = value;
    }

    /**
     * Gets the value of the urbanization property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUrbanization() {
        return urbanization;
    }

    /**
     * Sets the value of the urbanization property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUrbanization(String value) {
        this.urbanization = value;
    }

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

}
