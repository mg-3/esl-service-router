
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryNodeDefaultSearchCriteriaType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="QueryNodeDefaultSearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elocMarketID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryNodeDefaultSearchCriteriaType", propOrder = {
        "elocMarketID",
        "nodeName",
        "nodeStatus"
})
public class QueryNodeDefaultSearchCriteriaType {

    protected Long elocMarketID;
    protected String nodeName;
    protected String nodeStatus;

    /**
     * Gets the value of the elocMarketID property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getElocMarketID() {
        return elocMarketID;
    }

    /**
     * Sets the value of the elocMarketID property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setElocMarketID(Long value) {
        this.elocMarketID = value;
    }

    /**
     * Gets the value of the nodeName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the nodeStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNodeStatus() {
        return nodeStatus;
    }

    /**
     * Sets the value of the nodeStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNodeStatus(String value) {
        this.nodeStatus = value;
    }

}
