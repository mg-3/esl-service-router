
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLocationXfinityRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryLocationXfinityRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressSearch" type="{http://xml.blackbean.com/location/types}AddressXfinityCriteriaType" minOccurs="0"/>
 *         &lt;element name="singleAddressOptions" type="{http://xml.blackbean.com/location/types}GetLocationXfinityRequestedResultsType" minOccurs="0"/>
 *         &lt;element name="resultSpec" type="{http://xml.blackbean.com/location/types}QueryResultSpecType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLocationXfinityRequestType", propOrder = {
        "addressSearch",
        "singleAddressOptions",
        "resultSpec"
})
public class QueryLocationXfinityRequestType {

    @XmlElementRef(name = "addressSearch", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressXfinityCriteriaType> addressSearch;
    protected GetLocationXfinityRequestedResultsType singleAddressOptions;
    protected QueryResultSpecType resultSpec;

    /**
     * Gets the value of the addressSearch property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AddressXfinityCriteriaType }{@code >}
     */
    public JAXBElement<AddressXfinityCriteriaType> getAddressSearch() {
        return addressSearch;
    }

    /**
     * Sets the value of the addressSearch property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AddressXfinityCriteriaType }{@code >}
     */
    public void setAddressSearch(JAXBElement<AddressXfinityCriteriaType> value) {
        this.addressSearch = value;
    }

    /**
     * Gets the value of the singleAddressOptions property.
     *
     * @return possible object is
     * {@link GetLocationXfinityRequestedResultsType }
     */
    public GetLocationXfinityRequestedResultsType getSingleAddressOptions() {
        return singleAddressOptions;
    }

    /**
     * Sets the value of the singleAddressOptions property.
     *
     * @param value allowed object is
     *              {@link GetLocationXfinityRequestedResultsType }
     */
    public void setSingleAddressOptions(GetLocationXfinityRequestedResultsType value) {
        this.singleAddressOptions = value;
    }

    /**
     * Gets the value of the resultSpec property.
     *
     * @return possible object is
     * {@link QueryResultSpecType }
     */
    public QueryResultSpecType getResultSpec() {
        return resultSpec;
    }

    /**
     * Sets the value of the resultSpec property.
     *
     * @param value allowed object is
     *              {@link QueryResultSpecType }
     */
    public void setResultSpec(QueryResultSpecType value) {
        this.resultSpec = value;
    }

}
