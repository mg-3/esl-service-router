
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ModifyHomeSecurityRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ModifyHomeSecurityRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legacyID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legacyIDSource" type="{http://xml.comcast.com/location/types}LegacyLocationIDSourceType"/>
 *         &lt;element name="HomeSecurity" type="{http://xml.comcast.com/location/types}HomeSecurityType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyHomeSecurityRequestType", propOrder = {
        "legacyID",
        "legacyIDSource",
        "homeSecurity"
})
public class ModifyHomeSecurityRequestType {

    @XmlElement(required = true)
    protected String legacyID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LegacyLocationIDSourceType legacyIDSource;
    @XmlElement(name = "HomeSecurity", required = true)
    protected HomeSecurityType homeSecurity;

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
     * Gets the value of the homeSecurity property.
     *
     * @return possible object is
     * {@link HomeSecurityType }
     */
    public HomeSecurityType getHomeSecurity() {
        return homeSecurity;
    }

    /**
     * Sets the value of the homeSecurity property.
     *
     * @param value allowed object is
     *              {@link HomeSecurityType }
     */
    public void setHomeSecurity(HomeSecurityType value) {
        this.homeSecurity = value;
    }

}
