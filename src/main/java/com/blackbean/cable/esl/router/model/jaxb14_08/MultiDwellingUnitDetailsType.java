
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiDwellingUnitDetailsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="MultiDwellingUnitDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="units" type="{http://xml.comcast.com/location/types}MDUUnitsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiDwellingUnitDetailsType", propOrder = {
        "units"
})
public class MultiDwellingUnitDetailsType {

    @XmlElement(required = true)
    protected MDUUnitsType units;

    /**
     * Gets the value of the units property.
     *
     * @return possible object is
     * {@link MDUUnitsType }
     */
    public MDUUnitsType getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     *
     * @param value allowed object is
     *              {@link MDUUnitsType }
     */
    public void setUnits(MDUUnitsType value) {
        this.units = value;
    }

}
