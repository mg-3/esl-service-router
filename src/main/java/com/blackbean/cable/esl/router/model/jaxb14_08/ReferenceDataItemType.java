
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceDataItemType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ReferenceDataItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="props" type="{http://xml.comcast.com/location/types}ArrayOfReferenceDataPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceDataItemType", propOrder = {
        "props"
})
public class ReferenceDataItemType {

    @XmlElement(required = true)
    protected ArrayOfReferenceDataPropertyType props;

    /**
     * Gets the value of the props property.
     *
     * @return possible object is
     * {@link ArrayOfReferenceDataPropertyType }
     */
    public ArrayOfReferenceDataPropertyType getProps() {
        return props;
    }

    /**
     * Sets the value of the props property.
     *
     * @param value allowed object is
     *              {@link ArrayOfReferenceDataPropertyType }
     */
    public void setProps(ArrayOfReferenceDataPropertyType value) {
        this.props = value;
    }

}
