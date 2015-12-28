
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceabilityUpdateType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceabilityUpdateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="HighspeedInternet"/>
 *     &lt;enumeration value="Voice"/>
 *     &lt;enumeration value="Video"/>
 *     &lt;enumeration value="HomeSecurity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ServiceabilityUpdateType")
@XmlEnum
public enum ServiceabilityUpdateType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("HighspeedInternet")
    HIGHSPEED_INTERNET("HighspeedInternet"),
    @XmlEnumValue("Voice")
    VOICE("Voice"),
    @XmlEnumValue("Video")
    VIDEO("Video"),
    @XmlEnumValue("HomeSecurity")
    HOME_SECURITY("HomeSecurity");
    private final String value;

    ServiceabilityUpdateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceabilityUpdateType fromValue(String v) {
        for (ServiceabilityUpdateType c : ServiceabilityUpdateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
