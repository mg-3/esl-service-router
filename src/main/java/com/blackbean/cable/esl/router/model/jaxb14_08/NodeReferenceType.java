
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NodeReferenceType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="NodeReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elocNodeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="marketID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeStatus" type="{http://xml.blackbean.com/location/types}NodeStatusSimpleType" minOccurs="0"/>
 *         &lt;element name="nodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plannedAvailabilityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeReferenceType", propOrder = {
        "elocNodeID",
        "marketID",
        "nodeName",
        "nodeStatus",
        "nodeDescription",
        "plannedAvailabilityDate"
})
public class NodeReferenceType {

    @XmlElementRef(name = "elocNodeID", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> elocNodeID;
    @XmlElementRef(name = "marketID", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> marketID;
    @XmlElementRef(name = "nodeName", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nodeName;
    @XmlElementRef(name = "nodeStatus", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeStatusSimpleType> nodeStatus;
    @XmlElementRef(name = "nodeDescription", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nodeDescription;
    @XmlElementRef(name = "plannedAvailabilityDate", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedAvailabilityDate;

    /**
     * Gets the value of the elocNodeID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    public JAXBElement<Long> getElocNodeID() {
        return elocNodeID;
    }

    /**
     * Sets the value of the elocNodeID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    public void setElocNodeID(JAXBElement<Long> value) {
        this.elocNodeID = value;
    }

    /**
     * Gets the value of the marketID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    public JAXBElement<Long> getMarketID() {
        return marketID;
    }

    /**
     * Sets the value of the marketID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    public void setMarketID(JAXBElement<Long> value) {
        this.marketID = value;
    }

    /**
     * Gets the value of the nodeName property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setNodeName(JAXBElement<String> value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the nodeStatus property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link NodeStatusSimpleType }{@code >}
     */
    public JAXBElement<NodeStatusSimpleType> getNodeStatus() {
        return nodeStatus;
    }

    /**
     * Sets the value of the nodeStatus property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link NodeStatusSimpleType }{@code >}
     */
    public void setNodeStatus(JAXBElement<NodeStatusSimpleType> value) {
        this.nodeStatus = value;
    }

    /**
     * Gets the value of the nodeDescription property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getNodeDescription() {
        return nodeDescription;
    }

    /**
     * Sets the value of the nodeDescription property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setNodeDescription(JAXBElement<String> value) {
        this.nodeDescription = value;
    }

    /**
     * Gets the value of the plannedAvailabilityDate property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedAvailabilityDate() {
        return plannedAvailabilityDate;
    }

    /**
     * Sets the value of the plannedAvailabilityDate property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    public void setPlannedAvailabilityDate(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedAvailabilityDate = value;
    }

}
