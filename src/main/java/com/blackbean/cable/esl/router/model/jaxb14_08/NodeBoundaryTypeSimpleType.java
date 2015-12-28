
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeBoundaryTypeSimpleType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NodeBoundaryTypeSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Designed"/>
 *     &lt;enumeration value="Derived"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "NodeBoundaryTypeSimpleType")
@XmlEnum
public enum NodeBoundaryTypeSimpleType {

    @XmlEnumValue("Designed")
    DESIGNED("Designed"),
    @XmlEnumValue("Derived")
    DERIVED("Derived");
    private final String value;

    NodeBoundaryTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NodeBoundaryTypeSimpleType fromValue(String v) {
        for (NodeBoundaryTypeSimpleType c : NodeBoundaryTypeSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
