
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NodeType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="NodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elocMarketID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="elocNodeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nodeStatus" type="{http://xml.blackbean.com/location/types}NodeStatusSimpleType" minOccurs="0"/>
 *         &lt;element name="plannedAvailabilityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateNodeNames" type="{http://xml.blackbean.com/location/types}ArrayOfAlternateNodeName" minOccurs="0"/>
 *         &lt;element name="hubID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeHubLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeBoundary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeBoundaryType" type="{http://xml.blackbean.com/location/types}NodeBoundaryTypeSimpleType" minOccurs="0"/>
 *         &lt;element name="nodePaths" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeCapabilities" type="{http://xml.blackbean.com/location/types}CapabilitiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeType", propOrder = {
        "elocMarketID",
        "elocNodeID",
        "nodeStatus",
        "plannedAvailabilityDate",
        "nodeName",
        "nodeDescription",
        "alternateNodeNames",
        "hubID",
        "nodeHubLocation",
        "nodeBoundary",
        "nodeBoundaryType",
        "nodePaths",
        "nodeCapabilities"
})
public class NodeType {

    @XmlElementRef(name = "elocMarketID", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> elocMarketID;
    @XmlElementRef(name = "elocNodeID", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> elocNodeID;
    @XmlElementRef(name = "nodeStatus", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeStatusSimpleType> nodeStatus;
    @XmlElementRef(name = "plannedAvailabilityDate", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedAvailabilityDate;
    @XmlElementRef(name = "nodeName", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nodeName;
    @XmlElementRef(name = "nodeDescription", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nodeDescription;
    @XmlElementRef(name = "alternateNodeNames", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAlternateNodeName> alternateNodeNames;
    @XmlElementRef(name = "hubID", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hubID;
    @XmlElementRef(name = "nodeHubLocation", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nodeHubLocation;
    @XmlElementRef(name = "nodeBoundary", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nodeBoundary;
    @XmlElementRef(name = "nodeBoundaryType", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeBoundaryTypeSimpleType> nodeBoundaryType;
    @XmlElementRef(name = "nodePaths", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nodePaths;
    @XmlElementRef(name = "nodeCapabilities", namespace = "http://xml.blackbean.com/location/types", type = JAXBElement.class, required = false)
    protected JAXBElement<CapabilitiesType> nodeCapabilities;

    /**
     * Gets the value of the elocMarketID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    public JAXBElement<Long> getElocMarketID() {
        return elocMarketID;
    }

    /**
     * Sets the value of the elocMarketID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    public void setElocMarketID(JAXBElement<Long> value) {
        this.elocMarketID = value;
    }

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
     * Gets the value of the alternateNodeNames property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ArrayOfAlternateNodeName }{@code >}
     */
    public JAXBElement<ArrayOfAlternateNodeName> getAlternateNodeNames() {
        return alternateNodeNames;
    }

    /**
     * Sets the value of the alternateNodeNames property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ArrayOfAlternateNodeName }{@code >}
     */
    public void setAlternateNodeNames(JAXBElement<ArrayOfAlternateNodeName> value) {
        this.alternateNodeNames = value;
    }

    /**
     * Gets the value of the hubID property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getHubID() {
        return hubID;
    }

    /**
     * Sets the value of the hubID property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setHubID(JAXBElement<String> value) {
        this.hubID = value;
    }

    /**
     * Gets the value of the nodeHubLocation property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getNodeHubLocation() {
        return nodeHubLocation;
    }

    /**
     * Sets the value of the nodeHubLocation property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setNodeHubLocation(JAXBElement<String> value) {
        this.nodeHubLocation = value;
    }

    /**
     * Gets the value of the nodeBoundary property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getNodeBoundary() {
        return nodeBoundary;
    }

    /**
     * Sets the value of the nodeBoundary property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setNodeBoundary(JAXBElement<String> value) {
        this.nodeBoundary = value;
    }

    /**
     * Gets the value of the nodeBoundaryType property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link NodeBoundaryTypeSimpleType }{@code >}
     */
    public JAXBElement<NodeBoundaryTypeSimpleType> getNodeBoundaryType() {
        return nodeBoundaryType;
    }

    /**
     * Sets the value of the nodeBoundaryType property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link NodeBoundaryTypeSimpleType }{@code >}
     */
    public void setNodeBoundaryType(JAXBElement<NodeBoundaryTypeSimpleType> value) {
        this.nodeBoundaryType = value;
    }

    /**
     * Gets the value of the nodePaths property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getNodePaths() {
        return nodePaths;
    }

    /**
     * Sets the value of the nodePaths property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setNodePaths(JAXBElement<String> value) {
        this.nodePaths = value;
    }

    /**
     * Gets the value of the nodeCapabilities property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link CapabilitiesType }{@code >}
     */
    public JAXBElement<CapabilitiesType> getNodeCapabilities() {
        return nodeCapabilities;
    }

    /**
     * Sets the value of the nodeCapabilities property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link CapabilitiesType }{@code >}
     */
    public void setNodeCapabilities(JAXBElement<CapabilitiesType> value) {
        this.nodeCapabilities = value;
    }

}
