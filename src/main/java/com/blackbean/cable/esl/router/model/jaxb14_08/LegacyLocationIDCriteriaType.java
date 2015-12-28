
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LegacyLocationIDCriteriaType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LegacyLocationIDCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legacyID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legacyIDSource" type="{http://xml.blackbean.com/location/types}LegacyLocationIDSourceType"/>
 *         &lt;element name="getLocationOnSingleAddressFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegacyLocationIDCriteriaType", propOrder = {
        "legacyID",
        "legacyIDSource",
        "getLocationOnSingleAddressFound"
})
public class LegacyLocationIDCriteriaType {

    @XmlElement(required = true)
    protected String legacyID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LegacyLocationIDSourceType legacyIDSource;
    protected Boolean getLocationOnSingleAddressFound;

    /**
     * Gets the value of the legacyID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLegacyID() {
        return legacyID;
    }

    /**
     * Sets the value of the legacyID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLegacyID(String value) {
        this.legacyID = value;
    }

    /**
     * Gets the value of the legacyIDSource property.
     *
     * @return possible object is
     * {@link LegacyLocationIDSourceType }
     */
    public LegacyLocationIDSourceType getLegacyIDSource() {
        return legacyIDSource;
    }

    /**
     * Sets the value of the legacyIDSource property.
     *
     * @param value allowed object is
     *              {@link LegacyLocationIDSourceType }
     */
    public void setLegacyIDSource(LegacyLocationIDSourceType value) {
        this.legacyIDSource = value;
    }

    /**
     * Gets the value of the getLocationOnSingleAddressFound property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isGetLocationOnSingleAddressFound() {
        return getLocationOnSingleAddressFound;
    }

    /**
     * Sets the value of the getLocationOnSingleAddressFound property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setGetLocationOnSingleAddressFound(Boolean value) {
        this.getLocationOnSingleAddressFound = value;
    }

}
