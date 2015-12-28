
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for E911AvailabilityType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="E911AvailabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSAGMatched" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RateCenterCertification" type="{http://xml.comcast.com/location/types}E911RateCenterCertificationType"/>
 *         &lt;element name="RateCenterServiceable" type="{http://xml.comcast.com/location/types}E911RateCenterServiceableType"/>
 *         &lt;element name="MsagData" type="{http://xml.comcast.com/location/types}ArrayOfMsagDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "E911AvailabilityType", propOrder = {
        "msagMatched",
        "rateCenterCertification",
        "rateCenterServiceable",
        "msagData"
})
public class E911AvailabilityType {

    @XmlElement(name = "MSAGMatched")
    protected boolean msagMatched;
    @XmlElement(name = "RateCenterCertification", required = true)
    @XmlSchemaType(name = "string")
    protected E911RateCenterCertificationType rateCenterCertification;
    @XmlElement(name = "RateCenterServiceable", required = true)
    protected E911RateCenterServiceableType rateCenterServiceable;
    @XmlElement(name = "MsagData")
    protected ArrayOfMsagDataType msagData;

    /**
     * Gets the value of the msagMatched property.
     */
    public boolean isMSAGMatched() {
        return msagMatched;
    }

    /**
     * Sets the value of the msagMatched property.
     */
    public void setMSAGMatched(boolean value) {
        this.msagMatched = value;
    }

    /**
     * Gets the value of the rateCenterCertification property.
     *
     * @return possible object is
     * {@link E911RateCenterCertificationType }
     */
    public E911RateCenterCertificationType getRateCenterCertification() {
        return rateCenterCertification;
    }

    /**
     * Sets the value of the rateCenterCertification property.
     *
     * @param value allowed object is
     *              {@link E911RateCenterCertificationType }
     */
    public void setRateCenterCertification(E911RateCenterCertificationType value) {
        this.rateCenterCertification = value;
    }

    /**
     * Gets the value of the rateCenterServiceable property.
     *
     * @return possible object is
     * {@link E911RateCenterServiceableType }
     */
    public E911RateCenterServiceableType getRateCenterServiceable() {
        return rateCenterServiceable;
    }

    /**
     * Sets the value of the rateCenterServiceable property.
     *
     * @param value allowed object is
     *              {@link E911RateCenterServiceableType }
     */
    public void setRateCenterServiceable(E911RateCenterServiceableType value) {
        this.rateCenterServiceable = value;
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
