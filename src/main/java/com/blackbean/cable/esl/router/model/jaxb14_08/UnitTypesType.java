
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for UnitTypesType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="UnitTypesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitSequence">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="3"/>
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="unitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitTypesType", propOrder = {
        "unitSequence",
        "unitType",
        "unitValue"
})
public class UnitTypesType {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer unitSequence;
    @XmlElementRef(name = "unitType", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitType;
    @XmlElementRef(name = "unitValue", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitValue;

    /**
     * Gets the value of the unitSequence property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getUnitSequence() {
        return unitSequence;
    }

    /**
     * Sets the value of the unitSequence property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setUnitSequence(Integer value) {
        this.unitSequence = value;
    }

    /**
     * Gets the value of the unitType property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setUnitType(JAXBElement<String> value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the unitValue property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getUnitValue() {
        return unitValue;
    }

    /**
     * Sets the value of the unitValue property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setUnitValue(JAXBElement<String> value) {
        this.unitValue = value;
    }

}
