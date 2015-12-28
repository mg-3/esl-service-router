
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortOrderType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortOrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="descending"/>
 *     &lt;enumeration value="ascending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "SortOrderType")
@XmlEnum
public enum SortOrderType {

    @XmlEnumValue("descending")
    DESCENDING("descending"),
    @XmlEnumValue("ascending")
    ASCENDING("ascending");
    private final String value;

    SortOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortOrderType fromValue(String v) {
        for (SortOrderType c : SortOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
