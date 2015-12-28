
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeographicMeasurementMethodType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeographicMeasurementMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ActualFieldMeasurement"/>
 *     &lt;enumeration value="DesignBasedMeasurement"/>
 *     &lt;enumeration value="UserSpecified"/>
 *     &lt;enumeration value="PreciseGeocodingResult"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "GeographicMeasurementMethodType")
@XmlEnum
public enum GeographicMeasurementMethodType {

    @XmlEnumValue("ActualFieldMeasurement")
    ACTUAL_FIELD_MEASUREMENT("ActualFieldMeasurement"),
    @XmlEnumValue("DesignBasedMeasurement")
    DESIGN_BASED_MEASUREMENT("DesignBasedMeasurement"),
    @XmlEnumValue("UserSpecified")
    USER_SPECIFIED("UserSpecified"),
    @XmlEnumValue("PreciseGeocodingResult")
    PRECISE_GEOCODING_RESULT("PreciseGeocodingResult");
    private final String value;

    GeographicMeasurementMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeographicMeasurementMethodType fromValue(String v) {
        for (GeographicMeasurementMethodType c : GeographicMeasurementMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
