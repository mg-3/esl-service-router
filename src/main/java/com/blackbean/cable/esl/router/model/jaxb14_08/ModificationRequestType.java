
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificationRequestType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModificationRequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PostalAddress"/>
 *     &lt;enumeration value="AlternatePostalAddress"/>
 *     &lt;enumeration value="LocationDetails"/>
 *     &lt;enumeration value="MarketID"/>
 *     &lt;enumeration value="LocationCapabilityExceptions"/>
 *     &lt;enumeration value="GeographicCoordinates"/>
 *     &lt;enumeration value="LocationHouseAssociation"/>
 *     &lt;enumeration value="FraudIndicator"/>
 *     &lt;enumeration value="LocationServiceability"/>
 *     &lt;enumeration value="LocationCustomFields"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ModificationRequestType")
@XmlEnum
public enum ModificationRequestType {

    @XmlEnumValue("PostalAddress")
    POSTAL_ADDRESS("PostalAddress"),
    @XmlEnumValue("AlternatePostalAddress")
    ALTERNATE_POSTAL_ADDRESS("AlternatePostalAddress"),
    @XmlEnumValue("LocationDetails")
    LOCATION_DETAILS("LocationDetails"),
    @XmlEnumValue("MarketID")
    MARKET_ID("MarketID"),
    @XmlEnumValue("LocationCapabilityExceptions")
    LOCATION_CAPABILITY_EXCEPTIONS("LocationCapabilityExceptions"),
    @XmlEnumValue("GeographicCoordinates")
    GEOGRAPHIC_COORDINATES("GeographicCoordinates"),
    @XmlEnumValue("LocationHouseAssociation")
    LOCATION_HOUSE_ASSOCIATION("LocationHouseAssociation"),
    @XmlEnumValue("FraudIndicator")
    FRAUD_INDICATOR("FraudIndicator"),
    @XmlEnumValue("LocationServiceability")
    LOCATION_SERVICEABILITY("LocationServiceability"),
    @XmlEnumValue("LocationCustomFields")
    LOCATION_CUSTOM_FIELDS("LocationCustomFields");
    private final String value;

    ModificationRequestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModificationRequestType fromValue(String v) {
        for (ModificationRequestType c : ModificationRequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
