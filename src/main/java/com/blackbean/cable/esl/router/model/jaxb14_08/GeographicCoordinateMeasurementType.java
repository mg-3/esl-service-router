
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for GeographicCoordinateMeasurementType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GeographicCoordinateMeasurementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeographicCoordinate" type="{http://xml.comcast.com/location/types}GeographicCoordinatePointType"/>
 *         &lt;element name="Elevation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MeasurementMethod" type="{http://xml.comcast.com/location/types}GeographicMeasurementMethodType"/>
 *         &lt;element name="MeasurementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicCoordinateMeasurementType", propOrder = {
        "geographicCoordinate",
        "elevation",
        "measurementMethod",
        "measurementDate"
})
public class GeographicCoordinateMeasurementType {

    @XmlElement(name = "GeographicCoordinate", required = true)
    protected GeographicCoordinatePointType geographicCoordinate;
    @XmlElementRef(name = "Elevation", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> elevation;
    @XmlElement(name = "MeasurementMethod", required = true)
    @XmlSchemaType(name = "string")
    protected GeographicMeasurementMethodType measurementMethod;
    @XmlElement(name = "MeasurementDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measurementDate;

    /**
     * Gets the value of the geographicCoordinate property.
     *
     * @return possible object is
     * {@link GeographicCoordinatePointType }
     */
    public GeographicCoordinatePointType getGeographicCoordinate() {
        return geographicCoordinate;
    }

    /**
     * Sets the value of the geographicCoordinate property.
     *
     * @param value allowed object is
     *              {@link GeographicCoordinatePointType }
     */
    public void setGeographicCoordinate(GeographicCoordinatePointType value) {
        this.geographicCoordinate = value;
    }

    /**
     * Gets the value of the elevation property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    public JAXBElement<BigDecimal> getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    public void setElevation(JAXBElement<BigDecimal> value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the measurementMethod property.
     *
     * @return possible object is
     * {@link GeographicMeasurementMethodType }
     */
    public GeographicMeasurementMethodType getMeasurementMethod() {
        return measurementMethod;
    }

    /**
     * Sets the value of the measurementMethod property.
     *
     * @param value allowed object is
     *              {@link GeographicMeasurementMethodType }
     */
    public void setMeasurementMethod(GeographicMeasurementMethodType value) {
        this.measurementMethod = value;
    }

    /**
     * Gets the value of the measurementDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getMeasurementDate() {
        return measurementDate;
    }

    /**
     * Sets the value of the measurementDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setMeasurementDate(XMLGregorianCalendar value) {
        this.measurementDate = value;
    }

}
