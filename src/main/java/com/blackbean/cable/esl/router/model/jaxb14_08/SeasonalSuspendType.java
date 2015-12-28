
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SeasonalSuspendType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="SeasonalSuspendType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionToDefineDate" type="{http://xml.comcast.com/location/types}SeasonalSuspendStartDatePermission" minOccurs="0"/>
 *         &lt;element name="maxTotalDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="preDateTotalDaysAllowed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minTotalDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="earliestStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latestStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeasonalSuspendType", propOrder = {
        "enabled",
        "permissionToDefineDate",
        "maxTotalDays",
        "preDateTotalDaysAllowed",
        "minTotalDays",
        "earliestStartDate",
        "latestStartDate"
})
public class SeasonalSuspendType {

    @XmlElementRef(name = "enabled", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> enabled;
    @XmlSchemaType(name = "string")
    protected SeasonalSuspendStartDatePermission permissionToDefineDate;
    protected Long maxTotalDays;
    @XmlElementRef(name = "preDateTotalDaysAllowed", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> preDateTotalDaysAllowed;
    protected Long minTotalDays;
    protected String earliestStartDate;
    protected String latestStartDate;

    /**
     * Gets the value of the enabled property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public JAXBElement<Boolean> getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public void setEnabled(JAXBElement<Boolean> value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the permissionToDefineDate property.
     *
     * @return possible object is
     * {@link SeasonalSuspendStartDatePermission }
     */
    public SeasonalSuspendStartDatePermission getPermissionToDefineDate() {
        return permissionToDefineDate;
    }

    /**
     * Sets the value of the permissionToDefineDate property.
     *
     * @param value allowed object is
     *              {@link SeasonalSuspendStartDatePermission }
     */
    public void setPermissionToDefineDate(SeasonalSuspendStartDatePermission value) {
        this.permissionToDefineDate = value;
    }

    /**
     * Gets the value of the maxTotalDays property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getMaxTotalDays() {
        return maxTotalDays;
    }

    /**
     * Sets the value of the maxTotalDays property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setMaxTotalDays(Long value) {
        this.maxTotalDays = value;
    }

    /**
     * Gets the value of the preDateTotalDaysAllowed property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    public JAXBElement<Long> getPreDateTotalDaysAllowed() {
        return preDateTotalDaysAllowed;
    }

    /**
     * Sets the value of the preDateTotalDaysAllowed property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    public void setPreDateTotalDaysAllowed(JAXBElement<Long> value) {
        this.preDateTotalDaysAllowed = value;
    }

    /**
     * Gets the value of the minTotalDays property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getMinTotalDays() {
        return minTotalDays;
    }

    /**
     * Sets the value of the minTotalDays property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setMinTotalDays(Long value) {
        this.minTotalDays = value;
    }

    /**
     * Gets the value of the earliestStartDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEarliestStartDate() {
        return earliestStartDate;
    }

    /**
     * Sets the value of the earliestStartDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEarliestStartDate(String value) {
        this.earliestStartDate = value;
    }

    /**
     * Gets the value of the latestStartDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLatestStartDate() {
        return latestStartDate;
    }

    /**
     * Sets the value of the latestStartDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLatestStartDate(String value) {
        this.latestStartDate = value;
    }

}
