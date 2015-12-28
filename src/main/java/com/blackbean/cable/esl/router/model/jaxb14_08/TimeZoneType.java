
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeZoneType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="TimeZoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UTCOffset">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="12"/>
 *               &lt;minInclusive value="-12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DST" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZoneType", propOrder = {
        "name",
        "utcOffset",
        "dst"
})
public class TimeZoneType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "UTCOffset")
    protected int utcOffset;
    @XmlElement(name = "DST")
    protected String dst;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the utcOffset property.
     */
    public int getUTCOffset() {
        return utcOffset;
    }

    /**
     * Sets the value of the utcOffset property.
     */
    public void setUTCOffset(int value) {
        this.utcOffset = value;
    }

    /**
     * Gets the value of the dst property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDST() {
        return dst;
    }

    /**
     * Sets the value of the dst property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDST(String value) {
        this.dst = value;
    }

}
