
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardizeAddressXfinityAddressType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="StandardizeAddressXfinityAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="addressString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://xml.blackbean.com/location/types}AddressXfinityCriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardizeAddressXfinityAddressType", propOrder = {
        "requestRefNum",
        "addressString",
        "address"
})
public class StandardizeAddressXfinityAddressType {

    protected int requestRefNum;
    protected String addressString;
    protected AddressXfinityCriteriaType address;

    /**
     * Gets the value of the requestRefNum property.
     */
    public int getRequestRefNum() {
        return requestRefNum;
    }

    /**
     * Sets the value of the requestRefNum property.
     */
    public void setRequestRefNum(int value) {
        this.requestRefNum = value;
    }

    /**
     * Gets the value of the addressString property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAddressString() {
        return addressString;
    }

    /**
     * Sets the value of the addressString property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAddressString(String value) {
        this.addressString = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return possible object is
     * {@link AddressXfinityCriteriaType }
     */
    public AddressXfinityCriteriaType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value allowed object is
     *              {@link AddressXfinityCriteriaType }
     */
    public void setAddress(AddressXfinityCriteriaType value) {
        this.address = value;
    }

}
