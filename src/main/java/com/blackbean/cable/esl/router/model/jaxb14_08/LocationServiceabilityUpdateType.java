
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationServiceabilityUpdateType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationServiceabilityUpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceableFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="updateAction" type="{http://xml.blackbean.com/location/types}ServiceabilityUpdateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationServiceabilityUpdateType", propOrder = {
        "serviceableFlag",
        "updateAction"
})
public class LocationServiceabilityUpdateType {

    @XmlElementRef(name = "serviceableFlag", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> serviceableFlag;
    @XmlElementRef(name = "updateAction", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceabilityUpdateType> updateAction;

    /**
     * Gets the value of the serviceableFlag property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public JAXBElement<Boolean> getServiceableFlag() {
        return serviceableFlag;
    }

    /**
     * Sets the value of the serviceableFlag property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public void setServiceableFlag(JAXBElement<Boolean> value) {
        this.serviceableFlag = value;
    }

    /**
     * Gets the value of the updateAction property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ServiceabilityUpdateType }{@code >}
     */
    public JAXBElement<ServiceabilityUpdateType> getUpdateAction() {
        return updateAction;
    }

    /**
     * Sets the value of the updateAction property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ServiceabilityUpdateType }{@code >}
     */
    public void setUpdateAction(JAXBElement<ServiceabilityUpdateType> value) {
        this.updateAction = value;
    }

}
