
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeocodingResultMatchCategoryType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeocodingResultMatchCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SingleUniqueMatch"/>
 *     &lt;enumeration value="BestOfMultipleMatches"/>
 *     &lt;enumeration value="ZipCentroidMatch"/>
 *     &lt;enumeration value="GeographicMatch"/>
 *     &lt;enumeration value="NonMatch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "GeocodingResultMatchCategoryType")
@XmlEnum
public enum GeocodingResultMatchCategoryType {

    @XmlEnumValue("SingleUniqueMatch")
    SINGLE_UNIQUE_MATCH("SingleUniqueMatch"),
    @XmlEnumValue("BestOfMultipleMatches")
    BEST_OF_MULTIPLE_MATCHES("BestOfMultipleMatches"),
    @XmlEnumValue("ZipCentroidMatch")
    ZIP_CENTROID_MATCH("ZipCentroidMatch"),
    @XmlEnumValue("GeographicMatch")
    GEOGRAPHIC_MATCH("GeographicMatch"),
    @XmlEnumValue("NonMatch")
    NON_MATCH("NonMatch");
    private final String value;

    GeocodingResultMatchCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeocodingResultMatchCategoryType fromValue(String v) {
        for (GeocodingResultMatchCategoryType c : GeocodingResultMatchCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
