
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DropLocationType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DropLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AboveGround"/>
 *     &lt;enumeration value="UnderGround"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "DropLocationType")
@XmlEnum
public enum DropLocationType {

    @XmlEnumValue("AboveGround")
    ABOVE_GROUND("AboveGround"),
    @XmlEnumValue("UnderGround")
    UNDER_GROUND("UnderGround"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    DropLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DropLocationType fromValue(String v) {
        for (DropLocationType c : DropLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
