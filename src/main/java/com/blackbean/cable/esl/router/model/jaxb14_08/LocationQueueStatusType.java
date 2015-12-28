
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationQueueStatusType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationQueueStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="ASSIGNED"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="CLOSED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "LocationQueueStatusType")
@XmlEnum
public enum LocationQueueStatusType {

    NEW,
    ASSIGNED,
    REJECTED,
    APPROVED,
    CLOSED;

    public String value() {
        return name();
    }

    public static LocationQueueStatusType fromValue(String v) {
        return valueOf(v);
    }

}
