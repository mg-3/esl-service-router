
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLocationXfinityAddressType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryLocationXfinityAddressType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="E911Address"/>
 *     &lt;enumeration value="ServiceAddress"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "QueryLocationXfinityAddressType")
@XmlEnum
public enum QueryLocationXfinityAddressType {

    @XmlEnumValue("E911Address")
    E_911_ADDRESS("E911Address"),
    @XmlEnumValue("ServiceAddress")
    SERVICE_ADDRESS("ServiceAddress");
    private final String value;

    QueryLocationXfinityAddressType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryLocationXfinityAddressType fromValue(String v) {
        for (QueryLocationXfinityAddressType c : QueryLocationXfinityAddressType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
