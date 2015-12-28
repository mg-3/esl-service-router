
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteLocationOptionsSimpleType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeleteLocationOptionsSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FailWhenLinkedHousesPresent"/>
 *     &lt;enumeration value="DeleteOnlyAfterSuccessfulDeleteFromBilling"/>
 *     &lt;enumeration value="AlwaysDeleteLocation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "DeleteLocationOptionsSimpleType")
@XmlEnum
public enum DeleteLocationOptionsSimpleType {

    @XmlEnumValue("FailWhenLinkedHousesPresent")
    FAIL_WHEN_LINKED_HOUSES_PRESENT("FailWhenLinkedHousesPresent"),
    @XmlEnumValue("DeleteOnlyAfterSuccessfulDeleteFromBilling")
    DELETE_ONLY_AFTER_SUCCESSFUL_DELETE_FROM_BILLING("DeleteOnlyAfterSuccessfulDeleteFromBilling"),
    @XmlEnumValue("AlwaysDeleteLocation")
    ALWAYS_DELETE_LOCATION("AlwaysDeleteLocation");
    private final String value;

    DeleteLocationOptionsSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeleteLocationOptionsSimpleType fromValue(String v) {
        for (DeleteLocationOptionsSimpleType c : DeleteLocationOptionsSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
