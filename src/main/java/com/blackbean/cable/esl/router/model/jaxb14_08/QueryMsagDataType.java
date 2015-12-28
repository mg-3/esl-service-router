
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMsagDataType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryMsagDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msagDataID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MsagData" type="{http://xml.comcast.com/location/types}ArrayOfMsagDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMsagDataType", propOrder = {
        "msagDataID",
        "msagData"
})
public class QueryMsagDataType {

    protected long msagDataID;
    @XmlElement(name = "MsagData")
    protected ArrayOfMsagDataType msagData;

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
     * Gets the value of the msagData property.
     *
     * @return possible object is
     * {@link ArrayOfMsagDataType }
     */
    public ArrayOfMsagDataType getMsagData() {
        return msagData;
    }

    /**
     * Sets the value of the msagData property.
     *
     * @param value allowed object is
     *              {@link ArrayOfMsagDataType }
     */
    public void setMsagData(ArrayOfMsagDataType value) {
        this.msagData = value;
    }

}
