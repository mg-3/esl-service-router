
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMsagDataRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetMsagDataRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msagDataId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMsagDataRequestType", propOrder = {
        "msagDataId"
})
public class GetMsagDataRequestType {

    protected long msagDataId;

    /**
     * Gets the value of the msagDataId property.
     */
    public long getMsagDataId() {
        return msagDataId;
    }

    /**
     * Sets the value of the msagDataId property.
     */
    public void setMsagDataId(long value) {
        this.msagDataId = value;
    }

}
