
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressCriteriaByRulesType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddressCriteriaByRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getLocationOnSingleAddressFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="standardizeStreetAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="wildcardStreetAddressMatch" type="{http://xml.comcast.com/location/types}QueryLocationWildcardAddressMatchType" minOccurs="0"/>
 *         &lt;element name="wildcardUnitNumberMatch" type="{http://xml.comcast.com/location/types}QueryLocationWildcardUnitNumberMatchType" minOccurs="0"/>
 *         &lt;element name="postalAddressCriteria" type="{http://xml.comcast.com/location/types}QueryPostalAddressType" minOccurs="0"/>
 *         &lt;element name="addressSummaryCriteria" type="{http://xml.comcast.com/location/types}AddressSummaryCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressCriteriaByRulesType", propOrder = {
        "getLocationOnSingleAddressFound",
        "standardizeStreetAddress",
        "wildcardStreetAddressMatch",
        "wildcardUnitNumberMatch",
        "postalAddressCriteria",
        "addressSummaryCriteria"
})
public class AddressCriteriaByRulesType {

    protected Boolean getLocationOnSingleAddressFound;
    protected Boolean standardizeStreetAddress;
    @XmlSchemaType(name = "string")
    protected QueryLocationWildcardAddressMatchType wildcardStreetAddressMatch;
    @XmlSchemaType(name = "string")
    protected QueryLocationWildcardUnitNumberMatchType wildcardUnitNumberMatch;
    protected QueryPostalAddressType postalAddressCriteria;
    protected AddressSummaryCriteria addressSummaryCriteria;

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

    /**
     * Gets the value of the standardizeStreetAddress property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isStandardizeStreetAddress() {
        return standardizeStreetAddress;
    }

    /**
     * Sets the value of the standardizeStreetAddress property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setStandardizeStreetAddress(Boolean value) {
        this.standardizeStreetAddress = value;
    }

    /**
     * Gets the value of the wildcardStreetAddressMatch property.
     *
     * @return possible object is
     * {@link QueryLocationWildcardAddressMatchType }
     */
    public QueryLocationWildcardAddressMatchType getWildcardStreetAddressMatch() {
        return wildcardStreetAddressMatch;
    }

    /**
     * Sets the value of the wildcardStreetAddressMatch property.
     *
     * @param value allowed object is
     *              {@link QueryLocationWildcardAddressMatchType }
     */
    public void setWildcardStreetAddressMatch(QueryLocationWildcardAddressMatchType value) {
        this.wildcardStreetAddressMatch = value;
    }

    /**
     * Gets the value of the wildcardUnitNumberMatch property.
     *
     * @return possible object is
     * {@link QueryLocationWildcardUnitNumberMatchType }
     */
    public QueryLocationWildcardUnitNumberMatchType getWildcardUnitNumberMatch() {
        return wildcardUnitNumberMatch;
    }

    /**
     * Sets the value of the wildcardUnitNumberMatch property.
     *
     * @param value allowed object is
     *              {@link QueryLocationWildcardUnitNumberMatchType }
     */
    public void setWildcardUnitNumberMatch(QueryLocationWildcardUnitNumberMatchType value) {
        this.wildcardUnitNumberMatch = value;
    }

    /**
     * Gets the value of the postalAddressCriteria property.
     *
     * @return possible object is
     * {@link QueryPostalAddressType }
     */
    public QueryPostalAddressType getPostalAddressCriteria() {
        return postalAddressCriteria;
    }

    /**
     * Sets the value of the postalAddressCriteria property.
     *
     * @param value allowed object is
     *              {@link QueryPostalAddressType }
     */
    public void setPostalAddressCriteria(QueryPostalAddressType value) {
        this.postalAddressCriteria = value;
    }

    /**
     * Gets the value of the addressSummaryCriteria property.
     *
     * @return possible object is
     * {@link AddressSummaryCriteria }
     */
    public AddressSummaryCriteria getAddressSummaryCriteria() {
        return addressSummaryCriteria;
    }

    /**
     * Sets the value of the addressSummaryCriteria property.
     *
     * @param value allowed object is
     *              {@link AddressSummaryCriteria }
     */
    public void setAddressSummaryCriteria(AddressSummaryCriteria value) {
        this.addressSummaryCriteria = value;
    }

}
