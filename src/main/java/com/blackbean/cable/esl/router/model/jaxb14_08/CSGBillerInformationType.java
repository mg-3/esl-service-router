
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CSGBillerInformationType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="CSGBillerInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lineOfBusiness" type="{http://xml.blackbean.com/location/types}ArrayOfLocationLegacyDetailsCSGLineOfBusinessType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSGBillerInformationType", propOrder = {
        "lineOfBusiness"
})
public class CSGBillerInformationType {

    protected ArrayOfLocationLegacyDetailsCSGLineOfBusinessType lineOfBusiness;

    /**
     * Gets the value of the lineOfBusiness property.
     *
     * @return possible object is
     * {@link ArrayOfLocationLegacyDetailsCSGLineOfBusinessType }
     */
    public ArrayOfLocationLegacyDetailsCSGLineOfBusinessType getLineOfBusiness() {
        return lineOfBusiness;
    }

    /**
     * Sets the value of the lineOfBusiness property.
     *
     * @param value allowed object is
     *              {@link ArrayOfLocationLegacyDetailsCSGLineOfBusinessType }
     */
    public void setLineOfBusiness(ArrayOfLocationLegacyDetailsCSGLineOfBusinessType value) {
        this.lineOfBusiness = value;
    }

}
