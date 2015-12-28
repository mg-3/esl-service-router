
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetNodeResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="GetNodeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="node" type="{http://xml.comcast.com/location/types}NodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNodeResponseType", propOrder = {
        "node"
})
public class GetNodeResponseType {

    @XmlElement(required = true)
    protected NodeType node;

    /**
     * Gets the value of the node property.
     *
     * @return possible object is
     * {@link NodeType }
     */
    public NodeType getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     *
     * @param value allowed object is
     *              {@link NodeType }
     */
    public void setNode(NodeType value) {
        this.node = value;
    }

}
