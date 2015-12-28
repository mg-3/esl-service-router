
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NearestNeighborCriteriaType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="NearestNeighborCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startingPoint" type="{http://xml.comcast.com/location/types}NearestNeighborCriteriaStartingPointType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NearestNeighborCriteriaType", propOrder = {
        "startingPoint"
})
public class NearestNeighborCriteriaType {

    @XmlElement(required = true)
    protected NearestNeighborCriteriaStartingPointType startingPoint;

    /**
     * Gets the value of the startingPoint property.
     *
     * @return possible object is
     * {@link NearestNeighborCriteriaStartingPointType }
     */
    public NearestNeighborCriteriaStartingPointType getStartingPoint() {
        return startingPoint;
    }

    /**
     * Sets the value of the startingPoint property.
     *
     * @param value allowed object is
     *              {@link NearestNeighborCriteriaStartingPointType }
     */
    public void setStartingPoint(NearestNeighborCriteriaStartingPointType value) {
        this.startingPoint = value;
    }

}
