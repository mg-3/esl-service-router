
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLocationQueueResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryLocationQueueResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationQueueReference" type="{http://xml.blackbean.com/location/types}ArrayOfLocationQueueReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLocationQueueResponseType", propOrder = {
        "locationQueueReference"
})
public class QueryLocationQueueResponseType {

    @XmlElement(required = true)
    protected ArrayOfLocationQueueReferenceType locationQueueReference;

    /**
     * Gets the value of the locationQueueReference property.
     *
     * @return possible object is
     * {@link ArrayOfLocationQueueReferenceType }
     */
    public ArrayOfLocationQueueReferenceType getLocationQueueReference() {
        return locationQueueReference;
    }

    /**
     * Sets the value of the locationQueueReference property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationQueueReferenceType }
     */
    public void setLocationQueueReference(ArrayOfLocationQueueReferenceType value) {
        this.locationQueueReference = value;
    }

}
