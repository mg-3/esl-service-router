
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeStatusSimpleType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NodeStatusSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Planned"/>
 *     &lt;enumeration value="Production"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "NodeStatusSimpleType")
@XmlEnum
public enum NodeStatusSimpleType {

    @XmlEnumValue("Planned")
    PLANNED("Planned"),
    @XmlEnumValue("Production")
    PRODUCTION("Production"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    NodeStatusSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NodeStatusSimpleType fromValue(String v) {
        for (NodeStatusSimpleType c : NodeStatusSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
