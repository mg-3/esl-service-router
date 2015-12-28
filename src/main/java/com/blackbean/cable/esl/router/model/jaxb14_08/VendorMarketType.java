
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VendorMarketType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VendorMarketType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Wireless"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "VendorMarketType")
@XmlEnum
public enum VendorMarketType {

    @XmlEnumValue("Wireless")
    WIRELESS("Wireless");
    private final String value;

    VendorMarketType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VendorMarketType fromValue(String v) {
        for (VendorMarketType c : VendorMarketType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
