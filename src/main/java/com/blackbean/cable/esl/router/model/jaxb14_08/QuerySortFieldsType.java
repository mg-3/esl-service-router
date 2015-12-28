
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySortFieldsType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuerySortFieldsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="houseNumber"/>
 *     &lt;enumeration value="streetName"/>
 *     &lt;enumeration value="streetAddress"/>
 *     &lt;enumeration value="locationId"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "QuerySortFieldsType")
@XmlEnum
public enum QuerySortFieldsType {

    @XmlEnumValue("houseNumber")
    HOUSE_NUMBER("houseNumber"),
    @XmlEnumValue("streetName")
    STREET_NAME("streetName"),
    @XmlEnumValue("streetAddress")
    STREET_ADDRESS("streetAddress"),
    @XmlEnumValue("locationId")
    LOCATION_ID("locationId");
    private final String value;

    QuerySortFieldsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuerySortFieldsType fromValue(String v) {
        for (QuerySortFieldsType c : QuerySortFieldsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
