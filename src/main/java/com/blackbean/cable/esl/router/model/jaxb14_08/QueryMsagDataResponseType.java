
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMsagDataResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryMsagDataResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MsagData" type="{http://xml.blackbean.com/location/types}ArrayOfQueryMsagDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMsagDataResponseType", propOrder = {
        "msagData"
})
public class QueryMsagDataResponseType {

    @XmlElement(name = "MsagData")
    protected ArrayOfQueryMsagDataType msagData;

    /**
     * Gets the value of the msagData property.
     *
     * @return possible object is
     * {@link ArrayOfQueryMsagDataType }
     */
    public ArrayOfQueryMsagDataType getMsagData() {
        return msagData;
    }

    /**
     * Sets the value of the msagData property.
     *
     * @param value allowed object is
     *              {@link ArrayOfQueryMsagDataType }
     */
    public void setMsagData(ArrayOfQueryMsagDataType value) {
        this.msagData = value;
    }

}
