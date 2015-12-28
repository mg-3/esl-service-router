
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternateNodeName complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AlternateNodeName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alternateNodeNameSequence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="alternateNodeNameValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateNodeName", propOrder = {
        "alternateNodeNameSequence",
        "alternateNodeNameValue"
})
public class AlternateNodeName {

    @XmlElementRef(name = "alternateNodeNameSequence", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> alternateNodeNameSequence;
    @XmlElementRef(name = "alternateNodeNameValue", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternateNodeNameValue;

    /**
     * Gets the value of the alternateNodeNameSequence property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    public JAXBElement<Integer> getAlternateNodeNameSequence() {
        return alternateNodeNameSequence;
    }

    /**
     * Sets the value of the alternateNodeNameSequence property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    public void setAlternateNodeNameSequence(JAXBElement<Integer> value) {
        this.alternateNodeNameSequence = value;
    }

    /**
     * Gets the value of the alternateNodeNameValue property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getAlternateNodeNameValue() {
        return alternateNodeNameValue;
    }

    /**
     * Sets the value of the alternateNodeNameValue property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setAlternateNodeNameValue(JAXBElement<String> value) {
        this.alternateNodeNameValue = value;
    }

}
