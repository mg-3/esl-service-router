
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLocationReferenceDataResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryLocationReferenceDataResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceDataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="item" type="{http://xml.blackbean.com/location/types}ArrayOfReferenceDataItemType" minOccurs="0"/>
 *         &lt;element name="ResponseStatus" type="{http://xml.blackbean.com/location/types}ResponseStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLocationReferenceDataResponseType", propOrder = {
        "referenceDataType",
        "item",
        "responseStatus"
})
public class QueryLocationReferenceDataResponseType {

    protected String referenceDataType;
    protected ArrayOfReferenceDataItemType item;
    @XmlElement(name = "ResponseStatus", required = true)
    protected ResponseStatusType responseStatus;

    /**
     * Gets the value of the referenceDataType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getReferenceDataType() {
        return referenceDataType;
    }

    /**
     * Sets the value of the referenceDataType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReferenceDataType(String value) {
        this.referenceDataType = value;
    }

    /**
     * Gets the value of the item property.
     *
     * @return possible object is
     * {@link ArrayOfReferenceDataItemType }
     */
    public ArrayOfReferenceDataItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     *
     * @param value allowed object is
     *              {@link ArrayOfReferenceDataItemType }
     */
    public void setItem(ArrayOfReferenceDataItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the responseStatus property.
     *
     * @return possible object is
     * {@link ResponseStatusType }
     */
    public ResponseStatusType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     *
     * @param value allowed object is
     *              {@link ResponseStatusType }
     */
    public void setResponseStatus(ResponseStatusType value) {
        this.responseStatus = value;
    }

}
