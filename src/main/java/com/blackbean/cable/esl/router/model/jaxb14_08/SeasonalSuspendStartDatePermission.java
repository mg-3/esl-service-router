
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeasonalSuspendStartDatePermission.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeasonalSuspendStartDatePermission">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="user"/>
 *     &lt;enumeration value="market"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "SeasonalSuspendStartDatePermission")
@XmlEnum
public enum SeasonalSuspendStartDatePermission {

    @XmlEnumValue("user")
    USER("user"),
    @XmlEnumValue("market")
    MARKET("market");
    private final String value;

    SeasonalSuspendStartDatePermission(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeasonalSuspendStartDatePermission fromValue(String v) {
        for (SeasonalSuspendStartDatePermission c : SeasonalSuspendStartDatePermission.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
