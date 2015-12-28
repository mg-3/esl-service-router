
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingDetailsInfoType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="BillingDetailsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ddpDetails" type="{http://xml.blackbean.com/location/types}ArrayOfDDPDetailsType" minOccurs="0"/>
 *         &lt;element name="csgDetails" type="{http://xml.blackbean.com/location/types}ArrayOfCSGDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingDetailsInfoType", propOrder = {
        "ddpDetails",
        "csgDetails"
})
public class BillingDetailsInfoType {

    protected ArrayOfDDPDetailsType ddpDetails;
    protected ArrayOfCSGDetailsType csgDetails;

    /**
     * Gets the value of the ddpDetails property.
     *
     * @return possible object is
     * {@link ArrayOfDDPDetailsType }
     */
    public ArrayOfDDPDetailsType getDdpDetails() {
        return ddpDetails;
    }

    /**
     * Sets the value of the ddpDetails property.
     *
     * @param value allowed object is
     *              {@link ArrayOfDDPDetailsType }
     */
    public void setDdpDetails(ArrayOfDDPDetailsType value) {
        this.ddpDetails = value;
    }

    /**
     * Gets the value of the csgDetails property.
     *
     * @return possible object is
     * {@link ArrayOfCSGDetailsType }
     */
    public ArrayOfCSGDetailsType getCsgDetails() {
        return csgDetails;
    }

    /**
     * Sets the value of the csgDetails property.
     *
     * @param value allowed object is
     *              {@link ArrayOfCSGDetailsType }
     */
    public void setCsgDetails(ArrayOfCSGDetailsType value) {
        this.csgDetails = value;
    }

}
