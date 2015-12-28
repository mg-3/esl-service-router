
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMsagDataResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetMsagDataResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msagDataResponse" type="{http://xml.comcast.com/location/types}MsagDataType" minOccurs="0"/>
 *         &lt;element name="msagDataId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMsagDataResponseType", propOrder = {
        "msagDataResponse",
        "msagDataId"
})
public class GetMsagDataResponseType {

    protected MsagDataType msagDataResponse;
    protected long msagDataId;

    /**
     * Gets the value of the msagDataResponse property.
     *
     * @return possible object is
     * {@link MsagDataType }
     */
    public MsagDataType getMsagDataResponse() {
        return msagDataResponse;
    }

    /**
     * Sets the value of the msagDataResponse property.
     *
     * @param value allowed object is
     *              {@link MsagDataType }
     */
    public void setMsagDataResponse(MsagDataType value) {
        this.msagDataResponse = value;
    }

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
