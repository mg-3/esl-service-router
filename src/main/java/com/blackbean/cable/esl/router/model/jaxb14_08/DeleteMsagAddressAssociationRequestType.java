
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteMsagAddressAssociationRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="DeleteMsagAddressAssociationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msagDataID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteMsagAddressAssociationRequestType", propOrder = {
        "msagDataID",
        "locationID"
})
public class DeleteMsagAddressAssociationRequestType {

    protected long msagDataID;
    protected long locationID;

    /**
     * Gets the value of the msagDataID property.
     */
    public long getMsagDataID() {
        return msagDataID;
    }

    /**
     * Sets the value of the msagDataID property.
     */
    public void setMsagDataID(long value) {
        this.msagDataID = value;
    }

    /**
     * Gets the value of the locationID property.
     */
    public long getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     */
    public void setLocationID(long value) {
        this.locationID = value;
    }

}
