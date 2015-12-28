
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for E911RateCenterCertificationType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="E911RateCenterCertificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Certified"/>
 *     &lt;enumeration value="CertifiedResidentialOnly"/>
 *     &lt;enumeration value="CertifiedCommercialOnly"/>
 *     &lt;enumeration value="NotCertifiedForCounty"/>
 *     &lt;enumeration value="NotCertifiedForLocality"/>
 *     &lt;enumeration value="NotCertified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "E911RateCenterCertificationType")
@XmlEnum
public enum E911RateCenterCertificationType {

    @XmlEnumValue("Certified")
    CERTIFIED("Certified"),
    @XmlEnumValue("CertifiedResidentialOnly")
    CERTIFIED_RESIDENTIAL_ONLY("CertifiedResidentialOnly"),
    @XmlEnumValue("CertifiedCommercialOnly")
    CERTIFIED_COMMERCIAL_ONLY("CertifiedCommercialOnly"),
    @XmlEnumValue("NotCertifiedForCounty")
    NOT_CERTIFIED_FOR_COUNTY("NotCertifiedForCounty"),
    @XmlEnumValue("NotCertifiedForLocality")
    NOT_CERTIFIED_FOR_LOCALITY("NotCertifiedForLocality"),
    @XmlEnumValue("NotCertified")
    NOT_CERTIFIED("NotCertified");
    private final String value;

    E911RateCenterCertificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static E911RateCenterCertificationType fromValue(String v) {
        for (E911RateCenterCertificationType c : E911RateCenterCertificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
