
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLocationXfinityRequestedResultsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetLocationXfinityRequestedResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="marketInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="marketHierarchyInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="capabilityInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="homeSecurityInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="networkConnectivityInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="geographyInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="telephonyInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="msagInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customFieldsInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="billingDetailsInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="e911AddressInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLocationXfinityRequestedResultsType", propOrder = {
        "addressInfo",
        "marketInfo",
        "marketHierarchyInfo",
        "capabilityInfo",
        "homeSecurityInfo",
        "networkConnectivityInfo",
        "geographyInfo",
        "telephonyInfo",
        "msagInfo",
        "customFieldsInfo",
        "billingDetailsInfo",
        "e911AddressInfo"
})
public class GetLocationXfinityRequestedResultsType {

    protected Boolean addressInfo;
    protected Boolean marketInfo;
    @XmlElementRef(name = "marketHierarchyInfo", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> marketHierarchyInfo;
    protected Boolean capabilityInfo;
    protected Boolean homeSecurityInfo;
    protected Boolean networkConnectivityInfo;
    protected Boolean geographyInfo;
    protected Boolean telephonyInfo;
    protected Boolean msagInfo;
    protected Boolean customFieldsInfo;
    protected Boolean billingDetailsInfo;
    protected Boolean e911AddressInfo;

    /**
     * Gets the value of the addressInfo property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAddressInfo(Boolean value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the marketInfo property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMarketInfo() {
        return marketInfo;
    }

    /**
     * Sets the value of the marketInfo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMarketInfo(Boolean value) {
        this.marketInfo = value;
    }

    /**
     * Gets the value of the marketHierarchyInfo property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public JAXBElement<Boolean> getMarketHierarchyInfo() {
        return marketHierarchyInfo;
    }

    /**
     * Sets the value of the marketHierarchyInfo property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public void setMarketHierarchyInfo(JAXBElement<Boolean> value) {
        this.marketHierarchyInfo = value;
    }

    /**
     * Gets the value of the capabilityInfo property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isCapabilityInfo() {
        return capabilityInfo;
    }

    /**
     * Sets the value of the capabilityInfo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setCapabilityInfo(Boolean value) {
        this.capabilityInfo = value;
    }

    /**
     * Gets the value of the homeSecurityInfo property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isHomeSecurityInfo() {
        return homeSecurityInfo;
    }

    /**
     * Sets the value of the homeSecurityInfo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setHomeSecurityInfo(Boolean value) {
        this.homeSecurityInfo = value;
    }

    /**
     * Gets the value of the networkConnectivityInfo property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isNetworkConnectivityInfo() {
        return networkConnectivityInfo;
    }

    /**
     * Sets the value of the networkConnectivityInfo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setNetworkConnectivityInfo(Boolean value) {
        this.networkConnectivityInfo = value;
    }

    /**
     * Gets the value of the geographyInfo property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isGeographyInfo() {
        return geographyInfo;
    }

    /**
     * Sets the value of the geographyInfo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setGeographyInfo(Boolean value) {
        this.geographyInfo = value;
    }

    /**
     * Gets the value of the telephonyInfo property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTelephonyInfo() {
        return telephonyInfo;
    }

    /**
     * Sets the value of the telephonyInfo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTelephonyInfo(Boolean value) {
        this.telephonyInfo = value;
    }

    /**
     * Gets the value of the msagInfo property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMsagInfo() {
        return msagInfo;
    }

    /**
     * Sets the value of the msagInfo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMsagInfo(Boolean value) {
        this.msagInfo = value;
    }

    /**
     * Gets the value of the customFieldsInfo property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isCustomFieldsInfo() {
        return customFieldsInfo;
    }

    /**
     * Sets the value of the customFieldsInfo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setCustomFieldsInfo(Boolean value) {
        this.customFieldsInfo = value;
    }

    /**
     * Gets the value of the billingDetailsInfo property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isBillingDetailsInfo() {
        return billingDetailsInfo;
    }

    /**
     * Sets the value of the billingDetailsInfo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setBillingDetailsInfo(Boolean value) {
        this.billingDetailsInfo = value;
    }

    /**
     * Gets the value of the e911AddressInfo property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isE911AddressInfo() {
        return e911AddressInfo;
    }

    /**
     * Sets the value of the e911AddressInfo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setE911AddressInfo(Boolean value) {
        this.e911AddressInfo = value;
    }

}
