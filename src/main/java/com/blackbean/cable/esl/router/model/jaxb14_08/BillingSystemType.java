
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingSystemType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingSystemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CSG"/>
 *     &lt;enumeration value="DST"/>
 *     &lt;enumeration value="DDP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "BillingSystemType")
@XmlEnum
public enum BillingSystemType {

    CSG,
    DST,
    DDP;

    public String value() {
        return name();
    }

    public static BillingSystemType fromValue(String v) {
        return valueOf(v);
    }

}
