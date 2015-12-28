
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeospatialSearchCriteriaType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GeospatialSearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NearestNeighborCriteria" type="{http://xml.blackbean.com/location/types}NearestNeighborCriteriaType" minOccurs="0"/>
 *         &lt;element name="BoundaryCriteria" type="{http://xml.blackbean.com/location/types}BoundaryCriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeospatialSearchCriteriaType", propOrder = {
        "nearestNeighborCriteria",
        "boundaryCriteria"
})
public class GeospatialSearchCriteriaType {

    @XmlElementRef(name = "NearestNeighborCriteria", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<NearestNeighborCriteriaType> nearestNeighborCriteria;
    @XmlElementRef(name = "BoundaryCriteria", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<BoundaryCriteriaType> boundaryCriteria;

    /**
     * Gets the value of the nearestNeighborCriteria property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link NearestNeighborCriteriaType }{@code >}
     */
    public JAXBElement<NearestNeighborCriteriaType> getNearestNeighborCriteria() {
        return nearestNeighborCriteria;
    }

    /**
     * Sets the value of the nearestNeighborCriteria property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link NearestNeighborCriteriaType }{@code >}
     */
    public void setNearestNeighborCriteria(JAXBElement<NearestNeighborCriteriaType> value) {
        this.nearestNeighborCriteria = value;
    }

    /**
     * Gets the value of the boundaryCriteria property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BoundaryCriteriaType }{@code >}
     */
    public JAXBElement<BoundaryCriteriaType> getBoundaryCriteria() {
        return boundaryCriteria;
    }

    /**
     * Sets the value of the boundaryCriteria property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BoundaryCriteriaType }{@code >}
     */
    public void setBoundaryCriteria(JAXBElement<BoundaryCriteriaType> value) {
        this.boundaryCriteria = value;
    }

}
