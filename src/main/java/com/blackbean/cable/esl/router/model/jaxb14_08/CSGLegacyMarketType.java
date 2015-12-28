
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CSGLegacyMarketType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="CSGLegacyMarketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSGSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Principle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Agent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSGLegacyMarketType", propOrder = {
        "csgSystem",
        "principle",
        "agent"
})
public class CSGLegacyMarketType {

    @XmlElement(name = "CSGSystem", required = true)
    protected String csgSystem;
    @XmlElement(name = "Principle", required = true)
    protected String principle;
    @XmlElement(name = "Agent", required = true)
    protected String agent;

    /**
     * Gets the value of the csgSystem property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCSGSystem() {
        return csgSystem;
    }

    /**
     * Sets the value of the csgSystem property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCSGSystem(String value) {
        this.csgSystem = value;
    }

    /**
     * Gets the value of the principle property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPrinciple() {
        return principle;
    }

    /**
     * Sets the value of the principle property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrinciple(String value) {
        this.principle = value;
    }

    /**
     * Gets the value of the agent property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAgent(String value) {
        this.agent = value;
    }

}
