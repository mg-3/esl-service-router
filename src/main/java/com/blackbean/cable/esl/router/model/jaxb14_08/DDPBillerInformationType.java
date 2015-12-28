
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DDPBillerInformationType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="DDPBillerInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hotTap" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *               &lt;pattern value="[0-1]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="serviceStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DDPBillerInformationType", propOrder = {
        "hotTap",
        "serviceStatus"
})
public class DDPBillerInformationType {

    protected String hotTap;
    protected String serviceStatus;

    /**
     * Gets the value of the hotTap property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotTap() {
        return hotTap;
    }

    /**
     * Sets the value of the hotTap property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotTap(String value) {
        this.hotTap = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

}
