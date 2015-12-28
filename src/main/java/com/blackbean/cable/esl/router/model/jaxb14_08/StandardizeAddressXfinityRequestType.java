
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardizeAddressXfinityRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="StandardizeAddressXfinityRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresses" type="{http://xml.comcast.com/location/types}ArrayOfStandardizeAddressXfinityAddressType" minOccurs="0"/>
 *         &lt;element name="requestedResults" type="{http://xml.comcast.com/location/types}StandardizeAddressXfinityRequestedResultsType" minOccurs="0"/>
 *         &lt;element name="geocodingConstraints" type="{http://xml.comcast.com/location/types}GeocodingConstraintsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardizeAddressXfinityRequestType", propOrder = {
        "addresses",
        "requestedResults",
        "geocodingConstraints"
})
public class StandardizeAddressXfinityRequestType {

    @XmlElementRef(name = "addresses", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStandardizeAddressXfinityAddressType> addresses;
    protected StandardizeAddressXfinityRequestedResultsType requestedResults;
    protected GeocodingConstraintsType geocodingConstraints;

    /**
     * Gets the value of the addresses property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfStandardizeAddressXfinityAddressType }{@code >}
     */
    public JAXBElement<ArrayOfStandardizeAddressXfinityAddressType> getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfStandardizeAddressXfinityAddressType }{@code >}
     */
    public void setAddresses(JAXBElement<ArrayOfStandardizeAddressXfinityAddressType> value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the requestedResults property.
     *
     * @return possible object is
     * {@link StandardizeAddressXfinityRequestedResultsType }
     */
    public StandardizeAddressXfinityRequestedResultsType getRequestedResults() {
        return requestedResults;
    }

    /**
     * Sets the value of the requestedResults property.
     *
     * @param value allowed object is
     *              {@link StandardizeAddressXfinityRequestedResultsType }
     */
    public void setRequestedResults(StandardizeAddressXfinityRequestedResultsType value) {
        this.requestedResults = value;
    }

    /**
     * Gets the value of the geocodingConstraints property.
     *
     * @return possible object is
     * {@link GeocodingConstraintsType }
     */
    public GeocodingConstraintsType getGeocodingConstraints() {
        return geocodingConstraints;
    }

    /**
     * Sets the value of the geocodingConstraints property.
     *
     * @param value allowed object is
     *              {@link GeocodingConstraintsType }
     */
    public void setGeocodingConstraints(GeocodingConstraintsType value) {
        this.geocodingConstraints = value;
    }

}
