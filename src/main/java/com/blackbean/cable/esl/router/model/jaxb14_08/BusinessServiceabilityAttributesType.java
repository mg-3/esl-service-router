
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessServiceabilityAttributesType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="BusinessServiceabilityAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuildingAttribute" type="{http://xml.blackbean.com/location/types}BuildingAttributesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessServiceabilityAttributesType", propOrder = {
        "buildingAttribute"
})
public class BusinessServiceabilityAttributesType {

    @XmlElementRef(name = "BuildingAttribute", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<BuildingAttributesType> buildingAttribute;

    /**
     * Gets the value of the buildingAttribute property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link BuildingAttributesType }{@code >}
     */
    public JAXBElement<BuildingAttributesType> getBuildingAttribute() {
        return buildingAttribute;
    }

    /**
     * Sets the value of the buildingAttribute property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link BuildingAttributesType }{@code >}
     */
    public void setBuildingAttribute(JAXBElement<BuildingAttributesType> value) {
        this.buildingAttribute = value;
    }

}
