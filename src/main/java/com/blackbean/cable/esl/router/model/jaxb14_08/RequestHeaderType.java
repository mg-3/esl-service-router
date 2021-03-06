
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RequestHeaderType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="RequestHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sourceSystemId" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="sourceSystemUserId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="sourceServerId" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="trackingId" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="environmentId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeaderType", namespace = "http://xml.blackbean.com/types", propOrder = {
        "timestamp",
        "sourceSystemId",
        "sourceSystemUserId",
        "sourceServerId",
        "trackingId",
        "sessionId",
        "environmentId"
})
public class RequestHeaderType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sourceSystemId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sourceSystemUserId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sourceServerId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String trackingId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sessionId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String environmentId;

    /**
     * Gets the value of the timestamp property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the sourceSystemId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSourceSystemId() {
        return sourceSystemId;
    }

    /**
     * Sets the value of the sourceSystemId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSourceSystemId(String value) {
        this.sourceSystemId = value;
    }

    /**
     * Gets the value of the sourceSystemUserId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSourceSystemUserId() {
        return sourceSystemUserId;
    }

    /**
     * Sets the value of the sourceSystemUserId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSourceSystemUserId(String value) {
        this.sourceSystemUserId = value;
    }

    /**
     * Gets the value of the sourceServerId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSourceServerId() {
        return sourceServerId;
    }

    /**
     * Sets the value of the sourceServerId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSourceServerId(String value) {
        this.sourceServerId = value;
    }

    /**
     * Gets the value of the trackingId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTrackingId() {
        return trackingId;
    }

    /**
     * Sets the value of the trackingId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTrackingId(String value) {
        this.trackingId = value;
    }

    /**
     * Gets the value of the sessionId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the environmentId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    /**
     * Sets the value of the environmentId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEnvironmentId(String value) {
        this.environmentId = value;
    }

}
