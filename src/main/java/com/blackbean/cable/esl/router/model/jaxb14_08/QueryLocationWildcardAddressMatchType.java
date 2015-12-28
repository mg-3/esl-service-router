
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLocationWildcardAddressMatchType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryLocationWildcardAddressMatchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="left"/>
 *     &lt;enumeration value="right"/>
 *     &lt;enumeration value="both"/>
 *     &lt;enumeration value="neither"/>
 *     &lt;enumeration value="phonetic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "QueryLocationWildcardAddressMatchType")
@XmlEnum
public enum QueryLocationWildcardAddressMatchType {

    @XmlEnumValue("left")
    LEFT("left"),
    @XmlEnumValue("right")
    RIGHT("right"),
    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("neither")
    NEITHER("neither"),
    @XmlEnumValue("phonetic")
    PHONETIC("phonetic");
    private final String value;

    QueryLocationWildcardAddressMatchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryLocationWildcardAddressMatchType fromValue(String v) {
        for (QueryLocationWildcardAddressMatchType c : QueryLocationWildcardAddressMatchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
