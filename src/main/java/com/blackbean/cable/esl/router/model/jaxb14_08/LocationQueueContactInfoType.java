
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for LocationQueueContactInfoType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationQueueContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NTID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="organization" type="{http://xml.blackbean.com/location/types}LocationQueueOrigType"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationQueueContactInfoType", propOrder = {
        "email",
        "ntid",
        "organization",
        "name",
        "phone"
})
public class LocationQueueContactInfoType {

    @XmlElement(required = true)
    protected String email;
    @XmlElement(name = "NTID", required = true)
    protected String ntid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LocationQueueOrigType organization;
    protected String name;
    protected String phone;

    /**
     * Gets the value of the email property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the ntid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNTID() {
        return ntid;
    }

    /**
     * Sets the value of the ntid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNTID(String value) {
        this.ntid = value;
    }

    /**
     * Gets the value of the organization property.
     *
     * @return possible object is
     * {@link LocationQueueOrigType }
     */
    public LocationQueueOrigType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     *
     * @param value allowed object is
     *              {@link LocationQueueOrigType }
     */
    public void setOrganization(LocationQueueOrigType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the phone property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPhone(String value) {
        this.phone = value;
    }

}
