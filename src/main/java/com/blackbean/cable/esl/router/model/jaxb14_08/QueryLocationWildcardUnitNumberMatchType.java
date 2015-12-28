
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLocationWildcardUnitNumberMatchType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryLocationWildcardUnitNumberMatchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="right"/>
 *     &lt;enumeration value="both"/>
 *     &lt;enumeration value="left"/>
 *     &lt;enumeration value="neither"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "QueryLocationWildcardUnitNumberMatchType")
@XmlEnum
public enum QueryLocationWildcardUnitNumberMatchType {

    @XmlEnumValue("right")
    RIGHT("right"),
    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("left")
    LEFT("left"),
    @XmlEnumValue("neither")
    NEITHER("neither");
    private final String value;

    QueryLocationWildcardUnitNumberMatchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryLocationWildcardUnitNumberMatchType fromValue(String v) {
        for (QueryLocationWildcardUnitNumberMatchType c : QueryLocationWildcardUnitNumberMatchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
