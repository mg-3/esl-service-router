
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMsagDataRequestType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AddMsagDataRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestRefNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MsagData" type="{http://xml.comcast.com/location/types}MsagDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMsagDataRequestType", propOrder = {
        "requestRefNum",
        "addressId",
        "msagData"
})
public class AddMsagDataRequestType {

    @XmlElement(name = "RequestRefNum")
    protected int requestRefNum;
    @XmlElement(name = "AddressId")
    protected Long addressId;
    @XmlElement(name = "MsagData", required = true)
    protected MsagDataType msagData;

    /**
     * Gets the value of the requestRefNum property.
     */
    public int getRequestRefNum() {
        return requestRefNum;
    }

    /**
     * Sets the value of the requestRefNum property.
     */
    public void setRequestRefNum(int value) {
        this.requestRefNum = value;
    }

    /**
     * Gets the value of the addressId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setAddressId(Long value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the msagData property.
     *
     * @return possible object is
     * {@link MsagDataType }
     */
    public MsagDataType getMsagData() {
        return msagData;
    }

    /**
     * Sets the value of the msagData property.
     *
     * @param value allowed object is
     *              {@link MsagDataType }
     */
    public void setMsagData(MsagDataType value) {
        this.msagData = value;
    }

}
