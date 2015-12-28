
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LegacyMarketIDCriteriaType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LegacyMarketIDCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingSystem" type="{http://xml.comcast.com/location/types}BillingSystemType"/>
 *         &lt;element name="billingSystemMarketID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="12"/>
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
@XmlType(name = "LegacyMarketIDCriteriaType", propOrder = {
        "billingSystem",
        "billingSystemMarketID"
})
public class LegacyMarketIDCriteriaType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BillingSystemType billingSystem;
    @XmlElement(required = true)
    protected String billingSystemMarketID;

    /**
     * Gets the value of the billingSystem property.
     *
     * @return possible object is
     * {@link BillingSystemType }
     */
    public BillingSystemType getBillingSystem() {
        return billingSystem;
    }

    /**
     * Sets the value of the billingSystem property.
     *
     * @param value allowed object is
     *              {@link BillingSystemType }
     */
    public void setBillingSystem(BillingSystemType value) {
        this.billingSystem = value;
    }

    /**
     * Gets the value of the billingSystemMarketID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBillingSystemMarketID() {
        return billingSystemMarketID;
    }

    /**
     * Sets the value of the billingSystemMarketID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBillingSystemMarketID(String value) {
        this.billingSystemMarketID = value;
    }

}
