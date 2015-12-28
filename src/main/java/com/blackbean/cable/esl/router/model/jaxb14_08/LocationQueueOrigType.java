
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationQueueOrigType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationQueueOrigType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cwb"/>
 *     &lt;enumeration value="sales"/>
 *     &lt;enumeration value="edip"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="market"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "LocationQueueOrigType")
@XmlEnum
public enum LocationQueueOrigType {

    @XmlEnumValue("cwb")
    CWB("cwb"),
    @XmlEnumValue("sales")
    SALES("sales"),
    @XmlEnumValue("edip")
    EDIP("edip"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("market")
    MARKET("market");
    private final String value;

    LocationQueueOrigType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationQueueOrigType fromValue(String v) {
        for (LocationQueueOrigType c : LocationQueueOrigType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
