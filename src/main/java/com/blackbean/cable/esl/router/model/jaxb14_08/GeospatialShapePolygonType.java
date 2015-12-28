
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeospatialShapePolygonType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GeospatialShapePolygonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="point" type="{http://xml.comcast.com/location/types}ArrayOfGeographicCoordinatePointType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeospatialShapePolygonType", propOrder = {
        "point"
})
public class GeospatialShapePolygonType {

    @XmlElement(required = true)
    protected ArrayOfGeographicCoordinatePointType point;

    /**
     * Gets the value of the point property.
     *
     * @return possible object is
     * {@link ArrayOfGeographicCoordinatePointType }
     */
    public ArrayOfGeographicCoordinatePointType getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     *
     * @param value allowed object is
     *              {@link ArrayOfGeographicCoordinatePointType }
     */
    public void setPoint(ArrayOfGeographicCoordinatePointType value) {
        this.point = value;
    }

}
