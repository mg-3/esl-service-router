
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeocodingResultPointLocationType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeocodingResultPointLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SingleAddressPosition"/>
 *     &lt;enumeration value="InterpolatedStreetAddressPosition"/>
 *     &lt;enumeration value="PointZipCentroid"/>
 *     &lt;enumeration value="StreetAddressPosition"/>
 *     &lt;enumeration value="StreetCenterPoint"/>
 *     &lt;enumeration value="ZIPPlus4Centroid"/>
 *     &lt;enumeration value="ZIPPlus2Centroid"/>
 *     &lt;enumeration value="ZipCentroid"/>
 *     &lt;enumeration value="SteetIntersection"/>
 *     &lt;enumeration value="NoCoordinatesAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "GeocodingResultPointLocationType")
@XmlEnum
public enum GeocodingResultPointLocationType {

    @XmlEnumValue("SingleAddressPosition")
    SINGLE_ADDRESS_POSITION("SingleAddressPosition"),
    @XmlEnumValue("InterpolatedStreetAddressPosition")
    INTERPOLATED_STREET_ADDRESS_POSITION("InterpolatedStreetAddressPosition"),
    @XmlEnumValue("PointZipCentroid")
    POINT_ZIP_CENTROID("PointZipCentroid"),
    @XmlEnumValue("StreetAddressPosition")
    STREET_ADDRESS_POSITION("StreetAddressPosition"),
    @XmlEnumValue("StreetCenterPoint")
    STREET_CENTER_POINT("StreetCenterPoint"),
    @XmlEnumValue("ZIPPlus4Centroid")
    ZIP_PLUS_4_CENTROID("ZIPPlus4Centroid"),
    @XmlEnumValue("ZIPPlus2Centroid")
    ZIP_PLUS_2_CENTROID("ZIPPlus2Centroid"),
    @XmlEnumValue("ZipCentroid")
    ZIP_CENTROID("ZipCentroid"),
    @XmlEnumValue("SteetIntersection")
    STEET_INTERSECTION("SteetIntersection"),
    @XmlEnumValue("NoCoordinatesAvailable")
    NO_COORDINATES_AVAILABLE("NoCoordinatesAvailable");
    private final String value;

    GeocodingResultPointLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeocodingResultPointLocationType fromValue(String v) {
        for (GeocodingResultPointLocationType c : GeocodingResultPointLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
