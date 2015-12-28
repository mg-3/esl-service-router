
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressStandardizationConstraintCriteriaType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddressStandardizationConstraintCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matchAddressNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matchStreet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matchCity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matchState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matchZip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matchPreferZipOverCity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="returnCloseMatchesOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cassMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maxCandidates" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="returnE911Availability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressStandardizationConstraintCriteriaType", propOrder = {
        "matchAddressNumber",
        "matchStreet",
        "matchCity",
        "matchState",
        "matchZip",
        "matchPreferZipOverCity",
        "returnCloseMatchesOnly",
        "cassMode",
        "maxCandidates",
        "returnE911Availability"
})
public class AddressStandardizationConstraintCriteriaType {

    protected Boolean matchAddressNumber;
    protected Boolean matchStreet;
    protected Boolean matchCity;
    protected Boolean matchState;
    protected Boolean matchZip;
    protected Boolean matchPreferZipOverCity;
    protected Boolean returnCloseMatchesOnly;
    protected Boolean cassMode;
    protected Integer maxCandidates;
    protected Boolean returnE911Availability;

    /**
     * Gets the value of the matchAddressNumber property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMatchAddressNumber() {
        return matchAddressNumber;
    }

    /**
     * Sets the value of the matchAddressNumber property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMatchAddressNumber(Boolean value) {
        this.matchAddressNumber = value;
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
     * Gets the value of the matchZip property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMatchZip() {
        return matchZip;
    }

    /**
     * Sets the value of the matchZip property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMatchZip(Boolean value) {
        this.matchZip = value;
    }

    /**
     * Gets the value of the matchPreferZipOverCity property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMatchPreferZipOverCity() {
        return matchPreferZipOverCity;
    }

    /**
     * Sets the value of the matchPreferZipOverCity property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMatchPreferZipOverCity(Boolean value) {
        this.matchPreferZipOverCity = value;
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
     * Gets the value of the cassMode property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isCassMode() {
        return cassMode;
    }

    /**
     * Sets the value of the cassMode property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setCassMode(Boolean value) {
        this.cassMode = value;
    }

    /**
     * Gets the value of the maxCandidates property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getMaxCandidates() {
        return maxCandidates;
    }

    /**
     * Sets the value of the maxCandidates property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setMaxCandidates(Integer value) {
        this.maxCandidates = value;
    }

    /**
     * Gets the value of the returnE911Availability property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isReturnE911Availability() {
        return returnE911Availability;
    }

    /**
     * Sets the value of the returnE911Availability property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setReturnE911Availability(Boolean value) {
        this.returnE911Availability = value;
    }

}
