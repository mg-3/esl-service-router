
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationLegacyDetailsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationLegacyDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSGLegacyDetails" type="{http://xml.comcast.com/location/types}ArrayOfLocationLegacyDetailsCSGType" minOccurs="0"/>
 *         &lt;element name="DSTLegacyDetails" type="{http://xml.comcast.com/location/types}ArrayOfLocationLegacyDetailsDSTType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationLegacyDetailsType", propOrder = {
        "csgLegacyDetails",
        "dstLegacyDetails"
})
public class LocationLegacyDetailsType {

    @XmlElementRef(name = "CSGLegacyDetails", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLocationLegacyDetailsCSGType> csgLegacyDetails;
    @XmlElementRef(name = "DSTLegacyDetails", namespace = "http://xml.comcast.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLocationLegacyDetailsDSTType> dstLegacyDetails;

    /**
     * Gets the value of the csgLegacyDetails property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfLocationLegacyDetailsCSGType }{@code >}
     */
    public JAXBElement<ArrayOfLocationLegacyDetailsCSGType> getCSGLegacyDetails() {
        return csgLegacyDetails;
    }

    /**
     * Sets the value of the csgLegacyDetails property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfLocationLegacyDetailsCSGType }{@code >}
     */
    public void setCSGLegacyDetails(JAXBElement<ArrayOfLocationLegacyDetailsCSGType> value) {
        this.csgLegacyDetails = value;
    }

    /**
     * Gets the value of the dstLegacyDetails property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfLocationLegacyDetailsDSTType }{@code >}
     */
    public JAXBElement<ArrayOfLocationLegacyDetailsDSTType> getDSTLegacyDetails() {
        return dstLegacyDetails;
    }

    /**
     * Sets the value of the dstLegacyDetails property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfLocationLegacyDetailsDSTType }{@code >}
     */
    public void setDSTLegacyDetails(JAXBElement<ArrayOfLocationLegacyDetailsDSTType> value) {
        this.dstLegacyDetails = value;
    }

}
