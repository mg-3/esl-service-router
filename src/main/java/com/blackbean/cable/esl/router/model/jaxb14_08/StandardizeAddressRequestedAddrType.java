
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardizeAddressRequestedAddrType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="StandardizeAddressRequestedAddrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="addressCriteria" type="{http://xml.blackbean.com/location/types}AddressStandardizationCriteriaType"/>
 *         &lt;element name="constraintCriteria" type="{http://xml.blackbean.com/location/types}AddressStandardizationConstraintCriteriaType" minOccurs="0"/>
 *         &lt;element name="marketID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardizeAddressRequestedAddrType", propOrder = {
        "requestRefNum",
        "addressCriteria",
        "constraintCriteria",
        "marketID"
})
public class StandardizeAddressRequestedAddrType {

    @XmlElement(name = "RequestRefNum")
    protected int requestRefNum;
    @XmlElement(required = true)
    protected AddressStandardizationCriteriaType addressCriteria;
    protected AddressStandardizationConstraintCriteriaType constraintCriteria;
    protected Long marketID;

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
     * Gets the value of the addressCriteria property.
     *
     * @return possible object is
     * {@link AddressStandardizationCriteriaType }
     */
    public AddressStandardizationCriteriaType getAddressCriteria() {
        return addressCriteria;
    }

    /**
     * Sets the value of the addressCriteria property.
     *
     * @param value allowed object is
     *              {@link AddressStandardizationCriteriaType }
     */
    public void setAddressCriteria(AddressStandardizationCriteriaType value) {
        this.addressCriteria = value;
    }

    /**
     * Gets the value of the constraintCriteria property.
     *
     * @return possible object is
     * {@link AddressStandardizationConstraintCriteriaType }
     */
    public AddressStandardizationConstraintCriteriaType getConstraintCriteria() {
        return constraintCriteria;
    }

    /**
     * Sets the value of the constraintCriteria property.
     *
     * @param value allowed object is
     *              {@link AddressStandardizationConstraintCriteriaType }
     */
    public void setConstraintCriteria(AddressStandardizationConstraintCriteriaType value) {
        this.constraintCriteria = value;
    }

    /**
     * Gets the value of the marketID property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getMarketID() {
        return marketID;
    }

    /**
     * Sets the value of the marketID property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setMarketID(Long value) {
        this.marketID = value;
    }

}
