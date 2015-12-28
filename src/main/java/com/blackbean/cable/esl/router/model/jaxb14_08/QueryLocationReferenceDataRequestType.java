
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLocationReferenceDataRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryLocationReferenceDataRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceDataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchParameters" type="{http://xml.blackbean.com/location/types}ArrayOfQueryLocationReferenceDataSearchParamsType" minOccurs="0"/>
 *         &lt;element name="propertyNames" type="{http://xml.blackbean.com/location/types}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="resultSpec" type="{http://xml.blackbean.com/location/types}QueryResultSpecType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLocationReferenceDataRequestType", propOrder = {
        "referenceDataType",
        "searchParameters",
        "propertyNames",
        "resultSpec"
})
public class QueryLocationReferenceDataRequestType {

    protected String referenceDataType;
    protected ArrayOfQueryLocationReferenceDataSearchParamsType searchParameters;
    protected ArrayOfString propertyNames;
    protected QueryResultSpecType resultSpec;

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
     * Gets the value of the searchParameters property.
     *
     * @return possible object is
     * {@link ArrayOfQueryLocationReferenceDataSearchParamsType }
     */
    public ArrayOfQueryLocationReferenceDataSearchParamsType getSearchParameters() {
        return searchParameters;
    }

    /**
     * Sets the value of the searchParameters property.
     *
     * @param value allowed object is
     *              {@link ArrayOfQueryLocationReferenceDataSearchParamsType }
     */
    public void setSearchParameters(ArrayOfQueryLocationReferenceDataSearchParamsType value) {
        this.searchParameters = value;
    }

    /**
     * Gets the value of the propertyNames property.
     *
     * @return possible object is
     * {@link ArrayOfString }
     */
    public ArrayOfString getPropertyNames() {
        return propertyNames;
    }

    /**
     * Sets the value of the propertyNames property.
     *
     * @param value allowed object is
     *              {@link ArrayOfString }
     */
    public void setPropertyNames(ArrayOfString value) {
        this.propertyNames = value;
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
