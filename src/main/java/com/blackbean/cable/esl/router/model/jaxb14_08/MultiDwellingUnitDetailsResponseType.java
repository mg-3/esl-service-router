
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiDwellingUnitDetailsResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="MultiDwellingUnitDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="units" type="{http://xml.comcast.com/location/types}MDUUnitsResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiDwellingUnitDetailsResponseType", propOrder = {
        "units"
})
public class MultiDwellingUnitDetailsResponseType {

    @XmlElement(required = true)
    protected MDUUnitsResponseType units;

    /**
     * Gets the value of the units property.
     *
     * @return possible object is
     * {@link MDUUnitsResponseType }
     */
    public MDUUnitsResponseType getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     *
     * @param value allowed object is
     *              {@link MDUUnitsResponseType }
     */
    public void setUnits(MDUUnitsResponseType value) {
        this.units = value;
    }

}
