
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for GeocodedAddressType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GeocodedAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="houseNumberPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="houseNumberSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetPreDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetPostDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitTypes" type="{http://xml.blackbean.com/location/types}ArrayOfUnitTypesType" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;pattern value="[A-Z]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="zipCode" type="{http://xml.blackbean.com/location/types}ZipCodeType" minOccurs="0"/>
 *         &lt;element name="dwellingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetSide" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="geocodingPrecision" type="{http://xml.blackbean.com/location/types}GeocodingPrecisionType" minOccurs="0"/>
 *         &lt;element name="closeMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="urbanization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CensusBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CensusTract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodedAddressType", propOrder = {
        "houseNumberPrefix",
        "houseNumber",
        "houseNumberSuffix",
        "streetPreDirection",
        "streetName",
        "streetSuffix",
        "streetPostDirection",
        "unitTypes",
        "city",
        "state",
        "zipCode",
        "dwellingCode",
        "streetSide",
        "latitude",
        "longitude",
        "geocodingPrecision",
        "closeMatch",
        "urbanization",
        "censusBlock",
        "censusTract"
})
public class GeocodedAddressType {

    @XmlElementRef(name = "houseNumberPrefix", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumberPrefix;
    @XmlElementRef(name = "houseNumber", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumber;
    @XmlElementRef(name = "houseNumberSuffix", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumberSuffix;
    @XmlElementRef(name = "streetPreDirection", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetPreDirection;
    @XmlElementRef(name = "streetName", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetName;
    @XmlElementRef(name = "streetSuffix", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetSuffix;
    @XmlElementRef(name = "streetPostDirection", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetPostDirection;
    @XmlElementRef(name = "unitTypes", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUnitTypesType> unitTypes;
    @XmlElementRef(name = "city", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "state", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "zipCode", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ZipCodeType> zipCode;
    @XmlElementRef(name = "dwellingCode", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dwellingCode;
    @XmlElementRef(name = "streetSide", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetSide;
    @XmlElementRef(name = "latitude", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> latitude;
    @XmlElementRef(name = "longitude", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> longitude;
    @XmlElementRef(name = "geocodingPrecision", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<GeocodingPrecisionType> geocodingPrecision;
    @XmlElementRef(name = "closeMatch", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> closeMatch;
    @XmlElementRef(name = "urbanization", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> urbanization;
    @XmlElementRef(name = "CensusBlock", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> censusBlock;
    @XmlElementRef(name = "CensusTract", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> censusTract;

    /**
     * Gets the value of the houseNumberPrefix property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHouseNumberPrefix() {
        return houseNumberPrefix;
    }

    /**
     * Sets the value of the houseNumberPrefix property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHouseNumberPrefix(JAXBElement<String> value) {
        this.houseNumberPrefix = value;
    }

    /**
     * Gets the value of the houseNumber property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHouseNumber(JAXBElement<String> value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the houseNumberSuffix property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHouseNumberSuffix() {
        return houseNumberSuffix;
    }

    /**
     * Sets the value of the houseNumberSuffix property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHouseNumberSuffix(JAXBElement<String> value) {
        this.houseNumberSuffix = value;
    }

    /**
     * Gets the value of the streetPreDirection property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getStreetPreDirection() {
        return streetPreDirection;
    }

    /**
     * Sets the value of the streetPreDirection property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setStreetPreDirection(JAXBElement<String> value) {
        this.streetPreDirection = value;
    }

    /**
     * Gets the value of the streetName property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setStreetName(JAXBElement<String> value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetSuffix property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * Sets the value of the streetSuffix property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setStreetSuffix(JAXBElement<String> value) {
        this.streetSuffix = value;
    }

    /**
     * Gets the value of the streetPostDirection property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getStreetPostDirection() {
        return streetPostDirection;
    }

    /**
     * Sets the value of the streetPostDirection property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setStreetPostDirection(JAXBElement<String> value) {
        this.streetPostDirection = value;
    }

    /**
     * Gets the value of the unitTypes property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfUnitTypesType }{@code >}
     */
    public JAXBElement<ArrayOfUnitTypesType> getUnitTypes() {
        return unitTypes;
    }

    /**
     * Sets the value of the unitTypes property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfUnitTypesType }{@code >}
     */
    public void setUnitTypes(JAXBElement<ArrayOfUnitTypesType> value) {
        this.unitTypes = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Gets the value of the zipCode property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ZipCodeType }{@code >}
     */
    public JAXBElement<ZipCodeType> getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ZipCodeType }{@code >}
     */
    public void setZipCode(JAXBElement<ZipCodeType> value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the dwellingCode property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDwellingCode() {
        return dwellingCode;
    }

    /**
     * Sets the value of the dwellingCode property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDwellingCode(JAXBElement<String> value) {
        this.dwellingCode = value;
    }

    /**
     * Gets the value of the streetSide property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getStreetSide() {
        return streetSide;
    }

    /**
     * Sets the value of the streetSide property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setStreetSide(JAXBElement<String> value) {
        this.streetSide = value;
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
     * Gets the value of the closeMatch property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public JAXBElement<Boolean> getCloseMatch() {
        return closeMatch;
    }

    /**
     * Sets the value of the closeMatch property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public void setCloseMatch(JAXBElement<Boolean> value) {
        this.closeMatch = value;
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
     * Gets the value of the censusTract property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getCensusTract() {
        return censusTract;
    }

    /**
     * Sets the value of the censusTract property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setCensusTract(JAXBElement<String> value) {
        this.censusTract = value;
    }

}
