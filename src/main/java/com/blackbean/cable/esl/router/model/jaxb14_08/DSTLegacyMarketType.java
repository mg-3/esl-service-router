
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for DSTLegacyMarketType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="DSTLegacyMarketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountCorp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FranchiseTaxArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagementArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricingLevelSwitch" type="{http://xml.comcast.com/location/types}PricingLevelSwitchType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSTLegacyMarketType", propOrder = {
        "accountCorp",
        "franchiseTaxArea",
        "managementArea",
        "pricingLevelSwitch"
})
public class DSTLegacyMarketType {

    @XmlElement(name = "AccountCorp", required = true)
    protected String accountCorp;
    @XmlElementRef(name = "FranchiseTaxArea", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> franchiseTaxArea;
    @XmlElementRef(name = "ManagementArea", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> managementArea;
    @XmlElement(name = "PricingLevelSwitch", required = true)
    @XmlSchemaType(name = "string")
    protected PricingLevelSwitchType pricingLevelSwitch;

    /**
     * Gets the value of the accountCorp property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAccountCorp() {
        return accountCorp;
    }

    /**
     * Sets the value of the accountCorp property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccountCorp(String value) {
        this.accountCorp = value;
    }

    /**
     * Gets the value of the franchiseTaxArea property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getFranchiseTaxArea() {
        return franchiseTaxArea;
    }

    /**
     * Sets the value of the franchiseTaxArea property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setFranchiseTaxArea(JAXBElement<String> value) {
        this.franchiseTaxArea = value;
    }

    /**
     * Gets the value of the managementArea property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getManagementArea() {
        return managementArea;
    }

    /**
     * Sets the value of the managementArea property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setManagementArea(JAXBElement<String> value) {
        this.managementArea = value;
    }

    /**
     * Gets the value of the pricingLevelSwitch property.
     *
     * @return possible object is
     * {@link PricingLevelSwitchType }
     */
    public PricingLevelSwitchType getPricingLevelSwitch() {
        return pricingLevelSwitch;
    }

    /**
     * Sets the value of the pricingLevelSwitch property.
     *
     * @param value allowed object is
     *              {@link PricingLevelSwitchType }
     */
    public void setPricingLevelSwitch(PricingLevelSwitchType value) {
        this.pricingLevelSwitch = value;
    }

}
