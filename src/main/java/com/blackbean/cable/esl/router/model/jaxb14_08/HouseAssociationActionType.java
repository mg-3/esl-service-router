
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseAssociationActionType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HouseAssociationActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Create"/>
 *     &lt;enumeration value="Remove"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "HouseAssociationActionType")
@XmlEnum
public enum HouseAssociationActionType {

    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Remove")
    REMOVE("Remove");
    private final String value;

    HouseAssociationActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HouseAssociationActionType fromValue(String v) {
        for (HouseAssociationActionType c : HouseAssociationActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
