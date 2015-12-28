
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationGeographyType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationGeographyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinorCivilDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIPSCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VertexCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CensusTract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CensusBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationGeographyType", propOrder = {
        "minorCivilDivision",
        "placeName",
        "fipsCode",
        "vertexCode",
        "countyName",
        "censusTract",
        "censusBlock"
})
public class LocationGeographyType {

    @XmlElementRef(name = "MinorCivilDivision", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minorCivilDivision;
    @XmlElementRef(name = "PlaceName", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> placeName;
    @XmlElementRef(name = "FIPSCode", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fipsCode;
    @XmlElementRef(name = "VertexCode", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vertexCode;
    @XmlElementRef(name = "CountyName", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countyName;
    @XmlElementRef(name = "CensusTract", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> censusTract;
    @XmlElementRef(name = "CensusBlock", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> censusBlock;

    /**
     * Gets the value of the minorCivilDivision property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getMinorCivilDivision() {
        return minorCivilDivision;
    }

    /**
     * Sets the value of the minorCivilDivision property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setMinorCivilDivision(JAXBElement<String> value) {
        this.minorCivilDivision = value;
    }

    /**
     * Gets the value of the placeName property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setPlaceName(JAXBElement<String> value) {
        this.placeName = value;
    }

    /**
     * Gets the value of the fipsCode property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getFIPSCode() {
        return fipsCode;
    }

    /**
     * Sets the value of the fipsCode property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setFIPSCode(JAXBElement<String> value) {
        this.fipsCode = value;
    }

    /**
     * Gets the value of the vertexCode property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getVertexCode() {
        return vertexCode;
    }

    /**
     * Sets the value of the vertexCode property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setVertexCode(JAXBElement<String> value) {
        this.vertexCode = value;
    }

    /**
     * Gets the value of the countyName property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getCountyName() {
        return countyName;
    }

    /**
     * Sets the value of the countyName property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setCountyName(JAXBElement<String> value) {
        this.countyName = value;
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

}
