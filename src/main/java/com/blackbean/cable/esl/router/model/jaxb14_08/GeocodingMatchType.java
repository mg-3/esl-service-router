
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeocodingMatchType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeocodingMatchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="close"/>
 *     &lt;enumeration value="exact"/>
 *     &lt;enumeration value="custom"/>
 *     &lt;enumeration value="relax"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "GeocodingMatchType")
@XmlEnum
public enum GeocodingMatchType {

    @XmlEnumValue("close")
    CLOSE("close"),
    @XmlEnumValue("exact")
    EXACT("exact"),
    @XmlEnumValue("custom")
    CUSTOM("custom"),
    @XmlEnumValue("relax")
    RELAX("relax");
    private final String value;

    GeocodingMatchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeocodingMatchType fromValue(String v) {
        for (GeocodingMatchType c : GeocodingMatchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
