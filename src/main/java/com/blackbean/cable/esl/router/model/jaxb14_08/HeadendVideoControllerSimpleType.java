
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeadendVideoControllerSimpleType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HeadendVideoControllerSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Motorola"/>
 *     &lt;enumeration value="ScientificAtlanta"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "HeadendVideoControllerSimpleType")
@XmlEnum
public enum HeadendVideoControllerSimpleType {

    @XmlEnumValue("Motorola")
    MOTOROLA("Motorola"),
    @XmlEnumValue("ScientificAtlanta")
    SCIENTIFIC_ATLANTA("ScientificAtlanta"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    HeadendVideoControllerSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeadendVideoControllerSimpleType fromValue(String v) {
        for (HeadendVideoControllerSimpleType c : HeadendVideoControllerSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
