
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ResponseMessageType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ResponseMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Severity" type="{http://xml.comcast.com/location/types}MessageSeverity"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseMessageType", propOrder = {
        "severity",
        "code",
        "description"
})
public class ResponseMessageType {

    @XmlElement(name = "Severity", required = true)
    @XmlSchemaType(name = "string")
    protected MessageSeverity severity;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Description", required = true)
    protected String description;

    /**
     * Gets the value of the severity property.
     *
     * @return possible object is
     * {@link MessageSeverity }
     */
    public MessageSeverity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     *
     * @param value allowed object is
     *              {@link MessageSeverity }
     */
    public void setSeverity(MessageSeverity value) {
        this.severity = value;
    }

    /**
     * Gets the value of the code property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
