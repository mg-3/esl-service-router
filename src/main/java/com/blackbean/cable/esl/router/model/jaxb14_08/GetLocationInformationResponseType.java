
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLocationInformationResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetLocationInformationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationReference" type="{http://xml.blackbean.com/location/types}ArrayOfLocationReferenceType" minOccurs="0"/>
 *         &lt;element name="fiberNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLocationInformationResponseType", propOrder = {
        "locationReference",
        "fiberNodeName"
})
public class GetLocationInformationResponseType {

    @XmlElementRef(name = "locationReference", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLocationReferenceType> locationReference;
    @XmlElementRef(name = "fiberNodeName", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fiberNodeName;

    /**
     * Gets the value of the locationReference property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfLocationReferenceType }{@code >}
     */
    public JAXBElement<ArrayOfLocationReferenceType> getLocationReference() {
        return locationReference;
    }

    /**
     * Sets the value of the locationReference property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfLocationReferenceType }{@code >}
     */
    public void setLocationReference(JAXBElement<ArrayOfLocationReferenceType> value) {
        this.locationReference = value;
    }

    /**
     * Gets the value of the fiberNodeName property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getFiberNodeName() {
        return fiberNodeName;
    }

    /**
     * Sets the value of the fiberNodeName property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setFiberNodeName(JAXBElement<String> value) {
        this.fiberNodeName = value;
    }

}
