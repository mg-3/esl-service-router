
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeocodingCustomMatchModeType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GeocodingCustomMatchModeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matchCounty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matchPostalCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matchStreet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="preferZipOverCity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matchHouseNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matchLocality" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matchState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matchCity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matchInput" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodingCustomMatchModeType", propOrder = {
        "matchCounty",
        "matchPostalCode",
        "matchStreet",
        "preferZipOverCity",
        "matchHouseNumber",
        "matchLocality",
        "matchState",
        "matchCity",
        "matchInput"
})
public class GeocodingCustomMatchModeType {

    protected Boolean matchCounty;
    protected Boolean matchPostalCode;
    protected Boolean matchStreet;
    protected Boolean preferZipOverCity;
    protected Boolean matchHouseNumber;
    protected Boolean matchLocality;
    protected Boolean matchState;
    protected Boolean matchCity;
    protected Boolean matchInput;

    /**
     * Gets the value of the matchCounty property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMatchCounty() {
        return matchCounty;
    }

    /**
     * Sets the value of the matchCounty property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMatchCounty(Boolean value) {
        this.matchCounty = value;
    }

    /**
     * Gets the value of the matchPostalCode property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMatchPostalCode() {
        return matchPostalCode;
    }

    /**
     * Sets the value of the matchPostalCode property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMatchPostalCode(Boolean value) {
        this.matchPostalCode = value;
    }

    /**
     * Gets the value of the matchStreet property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMatchStreet() {
        return matchStreet;
    }

    /**
     * Sets the value of the matchStreet property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMatchStreet(Boolean value) {
        this.matchStreet = value;
    }

    /**
     * Gets the value of the preferZipOverCity property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPreferZipOverCity() {
        return preferZipOverCity;
    }

    /**
     * Sets the value of the preferZipOverCity property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPreferZipOverCity(Boolean value) {
        this.preferZipOverCity = value;
    }

    /**
     * Gets the value of the matchHouseNumber property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMatchHouseNumber() {
        return matchHouseNumber;
    }

    /**
     * Sets the value of the matchHouseNumber property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMatchHouseNumber(Boolean value) {
        this.matchHouseNumber = value;
    }

    /**
     * Gets the value of the matchLocality property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMatchLocality() {
        return matchLocality;
    }

    /**
     * Sets the value of the matchLocality property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMatchLocality(Boolean value) {
        this.matchLocality = value;
    }

    /**
     * Gets the value of the matchState property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMatchState() {
        return matchState;
    }

    /**
     * Sets the value of the matchState property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMatchState(Boolean value) {
        this.matchState = value;
    }

    /**
     * Gets the value of the matchCity property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMatchCity() {
        return matchCity;
    }

    /**
     * Sets the value of the matchCity property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMatchCity(Boolean value) {
        this.matchCity = value;
    }

    /**
     * Gets the value of the matchInput property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMatchInput() {
        return matchInput;
    }

    /**
     * Sets the value of the matchInput property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMatchInput(Boolean value) {
        this.matchInput = value;
    }

}
