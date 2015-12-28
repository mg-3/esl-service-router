
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLocationXfinityResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryLocationXfinityResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchResultFound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationSummary" type="{http://xml.blackbean.com/location/types}ArrayOfQueryAddressResponseType" minOccurs="0"/>
 *         &lt;element name="locationDetail" type="{http://xml.blackbean.com/location/types}GetLocationXfinityResponseType" minOccurs="0"/>
 *         &lt;element name="singleViewAddressDetail" type="{http://xml.blackbean.com/location/types}SingleViewAddressDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLocationXfinityResponseType", propOrder = {
        "searchResultFound",
        "locationSummary",
        "locationDetail",
        "singleViewAddressDetail"
})
public class QueryLocationXfinityResponseType {

    protected String searchResultFound;
    protected ArrayOfQueryAddressResponseType locationSummary;
    protected GetLocationXfinityResponseType locationDetail;
    protected SingleViewAddressDetailsType singleViewAddressDetail;

    /**
     * Gets the value of the searchResultFound property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSearchResultFound() {
        return searchResultFound;
    }

    /**
     * Sets the value of the searchResultFound property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSearchResultFound(String value) {
        this.searchResultFound = value;
    }

    /**
     * Gets the value of the locationSummary property.
     *
     * @return possible object is
     * {@link ArrayOfQueryAddressResponseType }
     */
    public ArrayOfQueryAddressResponseType getLocationSummary() {
        return locationSummary;
    }

    /**
     * Sets the value of the locationSummary property.
     *
     * @param value allowed object is
     *              {@link ArrayOfQueryAddressResponseType }
     */
    public void setLocationSummary(ArrayOfQueryAddressResponseType value) {
        this.locationSummary = value;
    }

    /**
     * Gets the value of the locationDetail property.
     *
     * @return possible object is
     * {@link GetLocationXfinityResponseType }
     */
    public GetLocationXfinityResponseType getLocationDetail() {
        return locationDetail;
    }

    /**
     * Sets the value of the locationDetail property.
     *
     * @param value allowed object is
     *              {@link GetLocationXfinityResponseType }
     */
    public void setLocationDetail(GetLocationXfinityResponseType value) {
        this.locationDetail = value;
    }

    /**
     * Gets the value of the singleViewAddressDetail property.
     *
     * @return possible object is
     * {@link SingleViewAddressDetailsType }
     */
    public SingleViewAddressDetailsType getSingleViewAddressDetail() {
        return singleViewAddressDetail;
    }

    /**
     * Sets the value of the singleViewAddressDetail property.
     *
     * @param value allowed object is
     *              {@link SingleViewAddressDetailsType }
     */
    public void setSingleViewAddressDetail(SingleViewAddressDetailsType value) {
        this.singleViewAddressDetail = value;
    }

}
