
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternateAddressStatusType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlternateAddressStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="Keep"/>
 *     &lt;enumeration value="ReplaceStandardized"/>
 *     &lt;enumeration value="Delete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "AlternateAddressStatusType")
@XmlEnum
public enum AlternateAddressStatusType {

    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("Keep")
    KEEP("Keep"),
    @XmlEnumValue("ReplaceStandardized")
    REPLACE_STANDARDIZED("ReplaceStandardized"),
    @XmlEnumValue("Delete")
    DELETE("Delete");
    private final String value;

    AlternateAddressStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlternateAddressStatusType fromValue(String v) {
        for (AlternateAddressStatusType c : AlternateAddressStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
