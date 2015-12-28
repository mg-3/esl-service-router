
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOBTypesType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LOBTypesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Video"/>
 *     &lt;enumeration value="HighSpeedInternet"/>
 *     &lt;enumeration value="Voice"/>
 *     &lt;enumeration value="HomeSecurity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "LOBTypesType")
@XmlEnum
public enum LOBTypesType {

    @XmlEnumValue("Video")
    VIDEO("Video"),
    @XmlEnumValue("HighSpeedInternet")
    HIGH_SPEED_INTERNET("HighSpeedInternet"),
    @XmlEnumValue("Voice")
    VOICE("Voice"),
    @XmlEnumValue("HomeSecurity")
    HOME_SECURITY("HomeSecurity");
    private final String value;

    LOBTypesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LOBTypesType fromValue(String v) {
        for (LOBTypesType c : LOBTypesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
