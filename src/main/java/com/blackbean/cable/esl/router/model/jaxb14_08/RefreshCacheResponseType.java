
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshCacheResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="RefreshCacheResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefreshCacheResponses" type="{http://xml.comcast.com/location/types}ArrayOfRefreshCacheResponseItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefreshCacheResponseType", propOrder = {
        "refreshCacheResponses"
})
public class RefreshCacheResponseType {

    @XmlElement(name = "RefreshCacheResponses", required = true)
    protected ArrayOfRefreshCacheResponseItemType refreshCacheResponses;

    /**
     * Gets the value of the refreshCacheResponses property.
     *
     * @return possible object is
     * {@link ArrayOfRefreshCacheResponseItemType }
     */
    public ArrayOfRefreshCacheResponseItemType getRefreshCacheResponses() {
        return refreshCacheResponses;
    }

    /**
     * Sets the value of the refreshCacheResponses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfRefreshCacheResponseItemType }
     */
    public void setRefreshCacheResponses(ArrayOfRefreshCacheResponseItemType value) {
        this.refreshCacheResponses = value;
    }

}
