
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for GeocodingConstraintsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GeocodingConstraintsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matchMode" type="{http://xml.blackbean.com/location/types}GeocodingMatchType" minOccurs="0"/>
 *         &lt;element name="returnCloseMatchesOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customMatchModeSettings" type="{http://xml.blackbean.com/location/types}GeocodingCustomMatchModeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodingConstraintsType", propOrder = {
        "matchMode",
        "returnCloseMatchesOnly",
        "customMatchModeSettings"
})
public class GeocodingConstraintsType {

    @XmlSchemaType(name = "string")
    protected GeocodingMatchType matchMode;
    protected Boolean returnCloseMatchesOnly;
    @XmlElementRef(name = "customMatchModeSettings", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<GeocodingCustomMatchModeType> customMatchModeSettings;

    /**
     * Gets the value of the matchMode property.
     *
     * @return possible object is
     * {@link GeocodingMatchType }
     */
    public GeocodingMatchType getMatchMode() {
        return matchMode;
    }

    /**
     * Sets the value of the matchMode property.
     *
     * @param value allowed object is
     *              {@link GeocodingMatchType }
     */
    public void setMatchMode(GeocodingMatchType value) {
        this.matchMode = value;
    }

    /**
     * Gets the value of the returnCloseMatchesOnly property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isReturnCloseMatchesOnly() {
        return returnCloseMatchesOnly;
    }

    /**
     * Sets the value of the returnCloseMatchesOnly property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setReturnCloseMatchesOnly(Boolean value) {
        this.returnCloseMatchesOnly = value;
    }

    /**
     * Gets the value of the customMatchModeSettings property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GeocodingCustomMatchModeType }{@code >}
     */
    public JAXBElement<GeocodingCustomMatchModeType> getCustomMatchModeSettings() {
        return customMatchModeSettings;
    }

    /**
     * Sets the value of the customMatchModeSettings property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GeocodingCustomMatchModeType }{@code >}
     */
    public void setCustomMatchModeSettings(JAXBElement<GeocodingCustomMatchModeType> value) {
        this.customMatchModeSettings = value;
    }

}
