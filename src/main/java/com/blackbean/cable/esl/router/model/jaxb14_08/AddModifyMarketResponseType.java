
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddModifyMarketResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddModifyMarketResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="responseStatus" type="{http://xml.blackbean.com/location/types}ResponseStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddModifyMarketResponseType", propOrder = {
        "marketID",
        "responseStatus"
})
public class AddModifyMarketResponseType {

    protected long marketID;
    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;

    /**
     * Gets the value of the marketID property.
     */
    public long getMarketID() {
        return marketID;
    }

    /**
     * Sets the value of the marketID property.
     */
    public void setMarketID(long value) {
        this.marketID = value;
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
