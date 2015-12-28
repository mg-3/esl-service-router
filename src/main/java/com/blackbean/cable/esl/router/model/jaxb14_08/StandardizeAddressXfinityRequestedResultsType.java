
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardizeAddressXfinityRequestedResultsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="StandardizeAddressXfinityRequestedResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geography" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="telephony" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="msag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardizeAddressXfinityRequestedResultsType", propOrder = {
        "geography",
        "telephony",
        "msag"
})
public class StandardizeAddressXfinityRequestedResultsType {

    @XmlElementRef(name = "geography", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> geography;
    @XmlElementRef(name = "telephony", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> telephony;
    @XmlElementRef(name = "msag", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> msag;

    /**
     * Gets the value of the geography property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public JAXBElement<Boolean> getGeography() {
        return geography;
    }

    /**
     * Sets the value of the geography property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public void setGeography(JAXBElement<Boolean> value) {
        this.geography = value;
    }

    /**
     * Gets the value of the telephony property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public JAXBElement<Boolean> getTelephony() {
        return telephony;
    }

    /**
     * Sets the value of the telephony property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public void setTelephony(JAXBElement<Boolean> value) {
        this.telephony = value;
    }

    /**
     * Gets the value of the msag property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public JAXBElement<Boolean> getMsag() {
        return msag;
    }

    /**
     * Sets the value of the msag property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public void setMsag(JAXBElement<Boolean> value) {
        this.msag = value;
    }

}
