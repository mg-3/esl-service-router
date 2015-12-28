
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillerInformationType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="BillerInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CSGLocationInformation" type="{http://xml.comcast.com/location/types}CSGBillerInformationType" minOccurs="0"/>
 *         &lt;element name="DDPLocationInformation" type="{http://xml.comcast.com/location/types}DDPBillerInformationType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillerInformationType", propOrder = {
        "csgLocationInformation",
        "ddpLocationInformation"
})
public class BillerInformationType {

    @XmlElementRef(name = "CSGLocationInformation", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<CSGBillerInformationType> csgLocationInformation;
    @XmlElementRef(name = "DDPLocationInformation", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<DDPBillerInformationType> ddpLocationInformation;

    /**
     * Gets the value of the csgLocationInformation property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link CSGBillerInformationType }{@code >}
     */
    public JAXBElement<CSGBillerInformationType> getCSGLocationInformation() {
        return csgLocationInformation;
    }

    /**
     * Sets the value of the csgLocationInformation property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link CSGBillerInformationType }{@code >}
     */
    public void setCSGLocationInformation(JAXBElement<CSGBillerInformationType> value) {
        this.csgLocationInformation = value;
    }

    /**
     * Gets the value of the ddpLocationInformation property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DDPBillerInformationType }{@code >}
     */
    public JAXBElement<DDPBillerInformationType> getDDPLocationInformation() {
        return ddpLocationInformation;
    }

    /**
     * Sets the value of the ddpLocationInformation property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DDPBillerInformationType }{@code >}
     */
    public void setDDPLocationInformation(JAXBElement<DDPBillerInformationType> value) {
        this.ddpLocationInformation = value;
    }

}
