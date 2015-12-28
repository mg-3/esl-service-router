
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuplicateHouseUsageSimpleType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DuplicateHouseUsageSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DualHouse"/>
 *     &lt;enumeration value="DupHouse"/>
 *     &lt;enumeration value="HomeBasedBusiness"/>
 *     &lt;enumeration value="Equipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "DuplicateHouseUsageSimpleType")
@XmlEnum
public enum DuplicateHouseUsageSimpleType {

    @XmlEnumValue("DualHouse")
    DUAL_HOUSE("DualHouse"),
    @XmlEnumValue("DupHouse")
    DUP_HOUSE("DupHouse"),
    @XmlEnumValue("HomeBasedBusiness")
    HOME_BASED_BUSINESS("HomeBasedBusiness"),
    @XmlEnumValue("Equipment")
    EQUIPMENT("Equipment");
    private final String value;

    DuplicateHouseUsageSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DuplicateHouseUsageSimpleType fromValue(String v) {
        for (DuplicateHouseUsageSimpleType c : DuplicateHouseUsageSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
