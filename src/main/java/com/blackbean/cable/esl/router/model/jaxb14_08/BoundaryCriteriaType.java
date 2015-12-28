
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for BoundaryCriteriaType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="BoundaryCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoundaryType" type="{http://xml.comcast.com/location/types}BoundaryTypeSimpleType" minOccurs="0"/>
 *         &lt;element name="Polygon" type="{http://xml.comcast.com/location/types}GeospatialShapePolygonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundaryCriteriaType", propOrder = {
        "boundaryType",
        "polygon"
})
public class BoundaryCriteriaType {

    @XmlElement(name = "BoundaryType")
    @XmlSchemaType(name = "string")
    protected BoundaryTypeSimpleType boundaryType;
    @XmlElement(name = "Polygon")
    protected GeospatialShapePolygonType polygon;

    /**
     * Gets the value of the boundaryType property.
     *
     * @return possible object is
     * {@link BoundaryTypeSimpleType }
     */
    public BoundaryTypeSimpleType getBoundaryType() {
        return boundaryType;
    }

    /**
     * Sets the value of the boundaryType property.
     *
     * @param value allowed object is
     *              {@link BoundaryTypeSimpleType }
     */
    public void setBoundaryType(BoundaryTypeSimpleType value) {
        this.boundaryType = value;
    }

    /**
     * Gets the value of the polygon property.
     *
     * @return possible object is
     * {@link GeospatialShapePolygonType }
     */
    public GeospatialShapePolygonType getPolygon() {
        return polygon;
    }

    /**
     * Sets the value of the polygon property.
     *
     * @param value allowed object is
     *              {@link GeospatialShapePolygonType }
     */
    public void setPolygon(GeospatialShapePolygonType value) {
        this.polygon = value;
    }

}
