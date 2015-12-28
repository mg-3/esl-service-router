
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationUpdateTypeSimpleType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationUpdateTypeSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PostalAddress"/>
 *     &lt;enumeration value="Serviceability"/>
 *     &lt;enumeration value="BillingSystemDetails"/>
 *     &lt;enumeration value="DDPAuxFields"/>
 *     &lt;enumeration value="DDPVoIPFields"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "LocationUpdateTypeSimpleType")
@XmlEnum
public enum LocationUpdateTypeSimpleType {

    @XmlEnumValue("PostalAddress")
    POSTAL_ADDRESS("PostalAddress"),
    @XmlEnumValue("Serviceability")
    SERVICEABILITY("Serviceability"),
    @XmlEnumValue("BillingSystemDetails")
    BILLING_SYSTEM_DETAILS("BillingSystemDetails"),
    @XmlEnumValue("DDPAuxFields")
    DDP_AUX_FIELDS("DDPAuxFields"),
    @XmlEnumValue("DDPVoIPFields")
    DDP_VO_IP_FIELDS("DDPVoIPFields");
    private final String value;

    LocationUpdateTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationUpdateTypeSimpleType fromValue(String v) {
        for (LocationUpdateTypeSimpleType c : LocationUpdateTypeSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
