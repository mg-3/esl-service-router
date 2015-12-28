
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephonyType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="TelephonyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rateCenterCertification" type="{http://xml.blackbean.com/location/types}E911RateCenterCertificationType" minOccurs="0"/>
 *         &lt;element name="rateCenterServiceable" type="{http://xml.blackbean.com/location/types}E911RateCenterServiceableType" minOccurs="0"/>
 *         &lt;element name="LATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LATAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ILECName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PSAPAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PSAPId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateCenterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TNOrderPool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wireCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephonyType", propOrder = {
        "rateCenterCertification",
        "rateCenterServiceable",
        "lata",
        "lataName",
        "ilecName",
        "psapAgency",
        "psapId",
        "rateCenterName",
        "tnOrderPool",
        "wireCenter"
})
public class TelephonyType {

    @XmlElementRef(name = "rateCenterCertification", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<E911RateCenterCertificationType> rateCenterCertification;
    @XmlElementRef(name = "rateCenterServiceable", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<E911RateCenterServiceableType> rateCenterServiceable;
    @XmlElementRef(name = "LATA", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lata;
    @XmlElementRef(name = "LATAName", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lataName;
    @XmlElementRef(name = "ILECName", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ilecName;
    @XmlElementRef(name = "PSAPAgency", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> psapAgency;
    @XmlElementRef(name = "PSAPId", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> psapId;
    @XmlElementRef(name = "rateCenterName", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rateCenterName;
    @XmlElementRef(name = "TNOrderPool", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tnOrderPool;
    @XmlElementRef(name = "wireCenter", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wireCenter;

    /**
     * Gets the value of the rateCenterCertification property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link E911RateCenterCertificationType }{@code >}
     */
    public JAXBElement<E911RateCenterCertificationType> getRateCenterCertification() {
        return rateCenterCertification;
    }

    /**
     * Sets the value of the rateCenterCertification property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link E911RateCenterCertificationType }{@code >}
     */
    public void setRateCenterCertification(JAXBElement<E911RateCenterCertificationType> value) {
        this.rateCenterCertification = value;
    }

    /**
     * Gets the value of the rateCenterServiceable property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link E911RateCenterServiceableType }{@code >}
     */
    public JAXBElement<E911RateCenterServiceableType> getRateCenterServiceable() {
        return rateCenterServiceable;
    }

    /**
     * Sets the value of the rateCenterServiceable property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link E911RateCenterServiceableType }{@code >}
     */
    public void setRateCenterServiceable(JAXBElement<E911RateCenterServiceableType> value) {
        this.rateCenterServiceable = value;
    }

    /**
     * Gets the value of the lata property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getLATA() {
        return lata;
    }

    /**
     * Sets the value of the lata property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setLATA(JAXBElement<String> value) {
        this.lata = value;
    }

    /**
     * Gets the value of the lataName property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getLATAName() {
        return lataName;
    }

    /**
     * Sets the value of the lataName property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setLATAName(JAXBElement<String> value) {
        this.lataName = value;
    }

    /**
     * Gets the value of the ilecName property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getILECName() {
        return ilecName;
    }

    /**
     * Sets the value of the ilecName property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setILECName(JAXBElement<String> value) {
        this.ilecName = value;
    }

    /**
     * Gets the value of the psapAgency property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getPSAPAgency() {
        return psapAgency;
    }

    /**
     * Sets the value of the psapAgency property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setPSAPAgency(JAXBElement<String> value) {
        this.psapAgency = value;
    }

    /**
     * Gets the value of the psapId property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getPSAPId() {
        return psapId;
    }

    /**
     * Sets the value of the psapId property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setPSAPId(JAXBElement<String> value) {
        this.psapId = value;
    }

    /**
     * Gets the value of the rateCenterName property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getRateCenterName() {
        return rateCenterName;
    }

    /**
     * Sets the value of the rateCenterName property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setRateCenterName(JAXBElement<String> value) {
        this.rateCenterName = value;
    }

    /**
     * Gets the value of the tnOrderPool property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getTNOrderPool() {
        return tnOrderPool;
    }

    /**
     * Sets the value of the tnOrderPool property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setTNOrderPool(JAXBElement<String> value) {
        this.tnOrderPool = value;
    }

    /**
     * Gets the value of the wireCenter property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getWireCenter() {
        return wireCenter;
    }

    /**
     * Sets the value of the wireCenter property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setWireCenter(JAXBElement<String> value) {
        this.wireCenter = value;
    }

}
