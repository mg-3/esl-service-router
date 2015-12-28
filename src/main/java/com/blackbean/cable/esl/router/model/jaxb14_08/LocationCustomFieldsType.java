
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCustomFieldsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationCustomFieldsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomFieldDefinitionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomFieldLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomFieldValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCustomFieldsType", propOrder = {
        "customFieldDefinitionId",
        "customFieldLabel",
        "customFieldValue"
})
public class LocationCustomFieldsType {

    @XmlElement(name = "CustomFieldDefinitionId", required = true)
    protected String customFieldDefinitionId;
    @XmlElement(name = "CustomFieldLabel", required = true)
    protected String customFieldLabel;
    @XmlElement(name = "CustomFieldValue", required = true)
    protected String customFieldValue;

    /**
     * Gets the value of the customFieldDefinitionId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCustomFieldDefinitionId() {
        return customFieldDefinitionId;
    }

    /**
     * Sets the value of the customFieldDefinitionId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCustomFieldDefinitionId(String value) {
        this.customFieldDefinitionId = value;
    }

    /**
     * Gets the value of the customFieldLabel property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCustomFieldLabel() {
        return customFieldLabel;
    }

    /**
     * Sets the value of the customFieldLabel property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCustomFieldLabel(String value) {
        this.customFieldLabel = value;
    }

    /**
     * Gets the value of the customFieldValue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCustomFieldValue() {
        return customFieldValue;
    }

    /**
     * Sets the value of the customFieldValue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCustomFieldValue(String value) {
        this.customFieldValue = value;
    }

}
