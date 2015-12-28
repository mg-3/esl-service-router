
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshCacheRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="RefreshCacheRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefreshCacheRequests" type="{http://xml.comcast.com/location/types}ArrayOfRefreshCacheRequestItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefreshCacheRequestType", propOrder = {
        "refreshCacheRequests"
})
public class RefreshCacheRequestType {

    @XmlElement(name = "RefreshCacheRequests", required = true)
    protected ArrayOfRefreshCacheRequestItemType refreshCacheRequests;

    /**
     * Gets the value of the refreshCacheRequests property.
     *
     * @return possible object is
     * {@link ArrayOfRefreshCacheRequestItemType }
     */
    public ArrayOfRefreshCacheRequestItemType getRefreshCacheRequests() {
        return refreshCacheRequests;
    }

    /**
     * Sets the value of the refreshCacheRequests property.
     *
     * @param value allowed object is
     *              {@link ArrayOfRefreshCacheRequestItemType }
     */
    public void setRefreshCacheRequests(ArrayOfRefreshCacheRequestItemType value) {
        this.refreshCacheRequests = value;
    }

}
