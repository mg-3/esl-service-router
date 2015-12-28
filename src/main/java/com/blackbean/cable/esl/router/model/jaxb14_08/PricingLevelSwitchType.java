
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingLevelSwitchType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingLevelSwitchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FranchiseTaxArea"/>
 *     &lt;enumeration value="ManagementArea"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "PricingLevelSwitchType")
@XmlEnum
public enum PricingLevelSwitchType {

    @XmlEnumValue("FranchiseTaxArea")
    FRANCHISE_TAX_AREA("FranchiseTaxArea"),
    @XmlEnumValue("ManagementArea")
    MANAGEMENT_AREA("ManagementArea");
    private final String value;

    PricingLevelSwitchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PricingLevelSwitchType fromValue(String v) {
        for (PricingLevelSwitchType c : PricingLevelSwitchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
