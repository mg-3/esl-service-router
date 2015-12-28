
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryNodeResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryNodeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nodeReference" type="{http://xml.blackbean.com/location/types}ArrayOfNodeReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryNodeResponseType", propOrder = {
        "nodeReference"
})
public class QueryNodeResponseType {

    protected ArrayOfNodeReferenceType nodeReference;

    /**
     * Gets the value of the nodeReference property.
     *
     * @return possible object is
     * {@link ArrayOfNodeReferenceType }
     */
    public ArrayOfNodeReferenceType getNodeReference() {
        return nodeReference;
    }

    /**
     * Sets the value of the nodeReference property.
     *
     * @param value allowed object is
     *              {@link ArrayOfNodeReferenceType }
     */
    public void setNodeReference(ArrayOfNodeReferenceType value) {
        this.nodeReference = value;
    }

}
