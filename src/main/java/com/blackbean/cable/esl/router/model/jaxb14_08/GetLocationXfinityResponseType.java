
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLocationXfinityResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetLocationXfinityResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressInfo" type="{http://xml.comcast.com/location/types}AddressInfoType" minOccurs="0"/>
 *         &lt;element name="marketInfo" type="{http://xml.comcast.com/location/types}MarketReferenceType" minOccurs="0"/>
 *         &lt;element name="marketHierarchyInfo" type="{http://xml.comcast.com/location/types}MarketHierarchyLevelInfo" minOccurs="0"/>
 *         &lt;element name="capabilityInfo" type="{http://xml.comcast.com/location/types}LocationCapabilitiesInfoType" minOccurs="0"/>
 *         &lt;element name="homeSecurityInfo" type="{http://xml.comcast.com/location/types}HomeSecurityType" minOccurs="0"/>
 *         &lt;element name="networkConnectivityInfo" type="{http://xml.comcast.com/location/types}LocationNetworkConnectivityType" minOccurs="0"/>
 *         &lt;element name="geographyInfo" type="{http://xml.comcast.com/location/types}GeographyInfoType" minOccurs="0"/>
 *         &lt;element name="telephonyInfo" type="{http://xml.comcast.com/location/types}TelephonyInfoType" minOccurs="0"/>
 *         &lt;element name="msagInfo" type="{http://xml.comcast.com/location/types}ArrayOfMsagDataType" minOccurs="0"/>
 *         &lt;element name="customFieldsInfo" type="{http://xml.comcast.com/location/types}ArrayOfLocationCustomFieldsType" minOccurs="0"/>
 *         &lt;element name="billingDetailsInfo" type="{http://xml.comcast.com/location/types}BillingDetailsInfoType" minOccurs="0"/>
 *         &lt;element name="e911AddressInfo" type="{http://xml.comcast.com/location/types}E911AddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLocationXfinityResponseType", propOrder = {
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
public class GetLocationXfinityResponseType {

    protected AddressInfoType addressInfo;
    protected MarketReferenceType marketInfo;
    protected MarketHierarchyLevelInfo marketHierarchyInfo;
    protected LocationCapabilitiesInfoType capabilityInfo;
    protected HomeSecurityType homeSecurityInfo;
    protected LocationNetworkConnectivityType networkConnectivityInfo;
    protected GeographyInfoType geographyInfo;
    protected TelephonyInfoType telephonyInfo;
    protected ArrayOfMsagDataType msagInfo;
    protected ArrayOfLocationCustomFieldsType customFieldsInfo;
    protected BillingDetailsInfoType billingDetailsInfo;
    protected E911AddressType e911AddressInfo;

    /**
     * Gets the value of the addressInfo property.
     *
     * @return possible object is
     * {@link AddressInfoType }
     */
    public AddressInfoType getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     *
     * @param value allowed object is
     *              {@link AddressInfoType }
     */
    public void setAddressInfo(AddressInfoType value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the marketInfo property.
     *
     * @return possible object is
     * {@link MarketReferenceType }
     */
    public MarketReferenceType getMarketInfo() {
        return marketInfo;
    }

    /**
     * Sets the value of the marketInfo property.
     *
     * @param value allowed object is
     *              {@link MarketReferenceType }
     */
    public void setMarketInfo(MarketReferenceType value) {
        this.marketInfo = value;
    }

    /**
     * Gets the value of the marketHierarchyInfo property.
     *
     * @return possible object is
     * {@link MarketHierarchyLevelInfo }
     */
    public MarketHierarchyLevelInfo getMarketHierarchyInfo() {
        return marketHierarchyInfo;
    }

    /**
     * Sets the value of the marketHierarchyInfo property.
     *
     * @param value allowed object is
     *              {@link MarketHierarchyLevelInfo }
     */
    public void setMarketHierarchyInfo(MarketHierarchyLevelInfo value) {
        this.marketHierarchyInfo = value;
    }

    /**
     * Gets the value of the capabilityInfo property.
     *
     * @return possible object is
     * {@link LocationCapabilitiesInfoType }
     */
    public LocationCapabilitiesInfoType getCapabilityInfo() {
        return capabilityInfo;
    }

    /**
     * Sets the value of the capabilityInfo property.
     *
     * @param value allowed object is
     *              {@link LocationCapabilitiesInfoType }
     */
    public void setCapabilityInfo(LocationCapabilitiesInfoType value) {
        this.capabilityInfo = value;
    }

    /**
     * Gets the value of the homeSecurityInfo property.
     *
     * @return possible object is
     * {@link HomeSecurityType }
     */
    public HomeSecurityType getHomeSecurityInfo() {
        return homeSecurityInfo;
    }

    /**
     * Sets the value of the homeSecurityInfo property.
     *
     * @param value allowed object is
     *              {@link HomeSecurityType }
     */
    public void setHomeSecurityInfo(HomeSecurityType value) {
        this.homeSecurityInfo = value;
    }

    /**
     * Gets the value of the networkConnectivityInfo property.
     *
     * @return possible object is
     * {@link LocationNetworkConnectivityType }
     */
    public LocationNetworkConnectivityType getNetworkConnectivityInfo() {
        return networkConnectivityInfo;
    }

    /**
     * Sets the value of the networkConnectivityInfo property.
     *
     * @param value allowed object is
     *              {@link LocationNetworkConnectivityType }
     */
    public void setNetworkConnectivityInfo(LocationNetworkConnectivityType value) {
        this.networkConnectivityInfo = value;
    }

    /**
     * Gets the value of the geographyInfo property.
     *
     * @return possible object is
     * {@link GeographyInfoType }
     */
    public GeographyInfoType getGeographyInfo() {
        return geographyInfo;
    }

    /**
     * Sets the value of the geographyInfo property.
     *
     * @param value allowed object is
     *              {@link GeographyInfoType }
     */
    public void setGeographyInfo(GeographyInfoType value) {
        this.geographyInfo = value;
    }

    /**
     * Gets the value of the telephonyInfo property.
     *
     * @return possible object is
     * {@link TelephonyInfoType }
     */
    public TelephonyInfoType getTelephonyInfo() {
        return telephonyInfo;
    }

    /**
     * Sets the value of the telephonyInfo property.
     *
     * @param value allowed object is
     *              {@link TelephonyInfoType }
     */
    public void setTelephonyInfo(TelephonyInfoType value) {
        this.telephonyInfo = value;
    }

    /**
     * Gets the value of the msagInfo property.
     *
     * @return possible object is
     * {@link ArrayOfMsagDataType }
     */
    public ArrayOfMsagDataType getMsagInfo() {
        return msagInfo;
    }

    /**
     * Sets the value of the msagInfo property.
     *
     * @param value allowed object is
     *              {@link ArrayOfMsagDataType }
     */
    public void setMsagInfo(ArrayOfMsagDataType value) {
        this.msagInfo = value;
    }

    /**
     * Gets the value of the customFieldsInfo property.
     *
     * @return possible object is
     * {@link ArrayOfLocationCustomFieldsType }
     */
    public ArrayOfLocationCustomFieldsType getCustomFieldsInfo() {
        return customFieldsInfo;
    }

    /**
     * Sets the value of the customFieldsInfo property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationCustomFieldsType }
     */
    public void setCustomFieldsInfo(ArrayOfLocationCustomFieldsType value) {
        this.customFieldsInfo = value;
    }

    /**
     * Gets the value of the billingDetailsInfo property.
     *
     * @return possible object is
     * {@link BillingDetailsInfoType }
     */
    public BillingDetailsInfoType getBillingDetailsInfo() {
        return billingDetailsInfo;
    }

    /**
     * Sets the value of the billingDetailsInfo property.
     *
     * @param value allowed object is
     *              {@link BillingDetailsInfoType }
     */
    public void setBillingDetailsInfo(BillingDetailsInfoType value) {
        this.billingDetailsInfo = value;
    }

    /**
     * Gets the value of the e911AddressInfo property.
     *
     * @return possible object is
     * {@link E911AddressType }
     */
    public E911AddressType getE911AddressInfo() {
        return e911AddressInfo;
    }

    /**
     * Sets the value of the e911AddressInfo property.
     *
     * @param value allowed object is
     *              {@link E911AddressType }
     */
    public void setE911AddressInfo(E911AddressType value) {
        this.e911AddressInfo = value;
    }

}
