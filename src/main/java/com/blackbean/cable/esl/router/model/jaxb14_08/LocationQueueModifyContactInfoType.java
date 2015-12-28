
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationQueueModifyContactInfoType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationQueueModifyContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://xml.blackbean.com/location/types}LocationQueueOrigType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationQueueModifyContactInfoType", propOrder = {
        "email",
        "ntid",
        "organization",
        "name",
        "phone"
})
public class LocationQueueModifyContactInfoType {

    @XmlElementRef(name = "email", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "NTID", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ntid;
    @XmlElementRef(name = "organization", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<LocationQueueOrigType> organization;
    @XmlElementRef(name = "name", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "phone", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;

    /**
     * Gets the value of the email property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the ntid property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getNTID() {
        return ntid;
    }

    /**
     * Sets the value of the ntid property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setNTID(JAXBElement<String> value) {
        this.ntid = value;
    }

    /**
     * Gets the value of the organization property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link LocationQueueOrigType }{@code >}
     */
    public JAXBElement<LocationQueueOrigType> getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link LocationQueueOrigType }{@code >}
     */
    public void setOrganization(JAXBElement<LocationQueueOrigType> value) {
        this.organization = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the phone property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = value;
    }

}
