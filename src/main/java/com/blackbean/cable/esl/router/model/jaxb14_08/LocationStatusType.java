
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationStatusType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="VerificationRequired"/>
 *     &lt;enumeration value="PermanentlyNotServiceable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "LocationStatusType")
@XmlEnum
public enum LocationStatusType {

    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("VerificationRequired")
    VERIFICATION_REQUIRED("VerificationRequired"),
    @XmlEnumValue("PermanentlyNotServiceable")
    PERMANENTLY_NOT_SERVICEABLE("PermanentlyNotServiceable");
    private final String value;

    LocationStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationStatusType fromValue(String v) {
        for (LocationStatusType c : LocationStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
