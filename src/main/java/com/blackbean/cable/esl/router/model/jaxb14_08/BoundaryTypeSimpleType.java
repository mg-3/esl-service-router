
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BoundaryTypeSimpleType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BoundaryTypeSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Polygon"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "BoundaryTypeSimpleType")
@XmlEnum
public enum BoundaryTypeSimpleType {

    @XmlEnumValue("Polygon")
    POLYGON("Polygon");
    private final String value;

    BoundaryTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoundaryTypeSimpleType fromValue(String v) {
        for (BoundaryTypeSimpleType c : BoundaryTypeSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
