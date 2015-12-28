
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LegacyLocationIDType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LegacyLocationIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegacyLocationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LegacyLocationIDSource" type="{http://xml.blackbean.com/location/types}LegacyLocationIDSourceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegacyLocationIDType", propOrder = {
        "legacyLocationID",
        "legacyLocationIDSource"
})
public class LegacyLocationIDType {

    @XmlElement(name = "LegacyLocationID", required = true)
    protected String legacyLocationID;
    @XmlElement(name = "LegacyLocationIDSource", required = true)
    @XmlSchemaType(name = "string")
    protected LegacyLocationIDSourceType legacyLocationIDSource;

    /**
     * Gets the value of the legacyLocationID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLegacyLocationID() {
        return legacyLocationID;
    }

    /**
     * Sets the value of the legacyLocationID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLegacyLocationID(String value) {
        this.legacyLocationID = value;
    }

    /**
     * Gets the value of the legacyLocationIDSource property.
     *
     * @return possible object is
     * {@link LegacyLocationIDSourceType }
     */
    public LegacyLocationIDSourceType getLegacyLocationIDSource() {
        return legacyLocationIDSource;
    }

    /**
     * Sets the value of the legacyLocationIDSource property.
     *
     * @param value allowed object is
     *              {@link LegacyLocationIDSourceType }
     */
    public void setLegacyLocationIDSource(LegacyLocationIDSourceType value) {
        this.legacyLocationIDSource = value;
    }

}
