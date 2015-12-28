
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephonyInfoType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="TelephonyInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="psapId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="psapAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lataName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ilecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tnOrderPool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateCenterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateCenterCertification" type="{http://xml.comcast.com/location/types}E911RateCenterCertificationType" minOccurs="0"/>
 *         &lt;element name="rateCenterServiceable" type="{http://xml.comcast.com/location/types}E911RateCenterServiceableType" minOccurs="0"/>
 *         &lt;element name="wireCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephonyInfoType", propOrder = {
        "psapId",
        "psapAgency",
        "lata",
        "lataName",
        "ilecName",
        "tnOrderPool",
        "rateCenterName",
        "rateCenterCertification",
        "rateCenterServiceable",
        "wireCenter"
})
public class TelephonyInfoType {

    protected String psapId;
    protected String psapAgency;
    protected String lata;
    protected String lataName;
    protected String ilecName;
    protected String tnOrderPool;
    protected String rateCenterName;
    @XmlSchemaType(name = "string")
    protected E911RateCenterCertificationType rateCenterCertification;
    protected E911RateCenterServiceableType rateCenterServiceable;
    protected String wireCenter;

    /**
     * Gets the value of the psapId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPsapId() {
        return psapId;
    }

    /**
     * Sets the value of the psapId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPsapId(String value) {
        this.psapId = value;
    }

    /**
     * Gets the value of the psapAgency property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPsapAgency() {
        return psapAgency;
    }

    /**
     * Sets the value of the psapAgency property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPsapAgency(String value) {
        this.psapAgency = value;
    }

    /**
     * Gets the value of the lata property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLata() {
        return lata;
    }

    /**
     * Sets the value of the lata property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLata(String value) {
        this.lata = value;
    }

    /**
     * Gets the value of the lataName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLataName() {
        return lataName;
    }

    /**
     * Sets the value of the lataName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLataName(String value) {
        this.lataName = value;
    }

    /**
     * Gets the value of the ilecName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIlecName() {
        return ilecName;
    }

    /**
     * Sets the value of the ilecName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIlecName(String value) {
        this.ilecName = value;
    }

    /**
     * Gets the value of the tnOrderPool property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTnOrderPool() {
        return tnOrderPool;
    }

    /**
     * Sets the value of the tnOrderPool property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTnOrderPool(String value) {
        this.tnOrderPool = value;
    }

    /**
     * Gets the value of the rateCenterName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRateCenterName() {
        return rateCenterName;
    }

    /**
     * Sets the value of the rateCenterName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRateCenterName(String value) {
        this.rateCenterName = value;
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
     * Gets the value of the wireCenter property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWireCenter() {
        return wireCenter;
    }

    /**
     * Sets the value of the wireCenter property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWireCenter(String value) {
        this.wireCenter = value;
    }

}
