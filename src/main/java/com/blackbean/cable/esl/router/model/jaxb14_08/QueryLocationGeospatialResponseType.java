
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLocationGeospatialResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryLocationGeospatialResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationReference" type="{http://xml.blackbean.com/location/types}ArrayOfLocationReferenceType"/>
 *         &lt;element name="numOfLocations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLocationGeospatialResponseType", propOrder = {
        "locationReference",
        "numOfLocations"
})
public class QueryLocationGeospatialResponseType {

    @XmlElement(required = true)
    protected ArrayOfLocationReferenceType locationReference;
    protected Integer numOfLocations;

    /**
     * Gets the value of the locationReference property.
     *
     * @return possible object is
     * {@link ArrayOfLocationReferenceType }
     */
    public ArrayOfLocationReferenceType getLocationReference() {
        return locationReference;
    }

    /**
     * Sets the value of the locationReference property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationReferenceType }
     */
    public void setLocationReference(ArrayOfLocationReferenceType value) {
        this.locationReference = value;
    }

    /**
     * Gets the value of the numOfLocations property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getNumOfLocations() {
        return numOfLocations;
    }

    /**
     * Sets the value of the numOfLocations property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setNumOfLocations(Integer value) {
        this.numOfLocations = value;
    }

}
