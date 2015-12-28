
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetNodeRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetNodeRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elocNodeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNodeRequestType", propOrder = {
        "elocNodeID"
})
public class GetNodeRequestType {

    protected long elocNodeID;

    /**
     * Gets the value of the elocNodeID property.
     */
    public long getElocNodeID() {
        return elocNodeID;
    }

    /**
     * Sets the value of the elocNodeID property.
     */
    public void setElocNodeID(long value) {
        this.elocNodeID = value;
    }

}
