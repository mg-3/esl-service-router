
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddModifyMarketLegacyMarketDetailsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddModifyMarketLegacyMarketDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legacyMarketValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legacyMarketTypeID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddModifyMarketLegacyMarketDetailsType", propOrder = {
        "legacyMarketValue",
        "legacyMarketTypeID"
})
public class AddModifyMarketLegacyMarketDetailsType {

    @XmlElement(required = true)
    protected String legacyMarketValue;
    @XmlElement(required = true)
    protected String legacyMarketTypeID;

    /**
     * Gets the value of the legacyMarketValue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLegacyMarketValue() {
        return legacyMarketValue;
    }

    /**
     * Sets the value of the legacyMarketValue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLegacyMarketValue(String value) {
        this.legacyMarketValue = value;
    }

    /**
     * Gets the value of the legacyMarketTypeID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLegacyMarketTypeID() {
        return legacyMarketTypeID;
    }

    /**
     * Sets the value of the legacyMarketTypeID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLegacyMarketTypeID(String value) {
        this.legacyMarketTypeID = value;
    }

}
