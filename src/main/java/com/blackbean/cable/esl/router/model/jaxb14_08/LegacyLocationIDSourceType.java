
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegacyLocationIDSourceType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegacyLocationIDSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CSGHouseKey"/>
 *     &lt;enumeration value="DDPAccountNumber"/>
 *     &lt;enumeration value="DSTHouseKey"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "LegacyLocationIDSourceType")
@XmlEnum
public enum LegacyLocationIDSourceType {

    @XmlEnumValue("CSGHouseKey")
    CSG_HOUSE_KEY("CSGHouseKey"),
    @XmlEnumValue("DDPAccountNumber")
    DDP_ACCOUNT_NUMBER("DDPAccountNumber"),
    @XmlEnumValue("DSTHouseKey")
    DST_HOUSE_KEY("DSTHouseKey");
    private final String value;

    LegacyLocationIDSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LegacyLocationIDSourceType fromValue(String v) {
        for (LegacyLocationIDSourceType c : LegacyLocationIDSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
