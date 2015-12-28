
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMarketByBoundaryResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryMarketByBoundaryResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketReference" type="{http://xml.comcast.com/location/types}ArrayOfMarketReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMarketByBoundaryResponseType", propOrder = {
        "marketReference"
})
public class QueryMarketByBoundaryResponseType {

    protected ArrayOfMarketReferenceType marketReference;

    /**
     * Gets the value of the marketReference property.
     *
     * @return possible object is
     * {@link ArrayOfMarketReferenceType }
     */
    public ArrayOfMarketReferenceType getMarketReference() {
        return marketReference;
    }

    /**
     * Sets the value of the marketReference property.
     *
     * @param value allowed object is
     *              {@link ArrayOfMarketReferenceType }
     */
    public void setMarketReference(ArrayOfMarketReferenceType value) {
        this.marketReference = value;
    }

}
