
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getNodeReturn" type="{http://xml.comcast.com/location/types}GetNodeResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getNodeReturn"
})
@XmlRootElement(name = "getNodeResponse", namespace = "http://xml.comcast.com/location/services")
public class GetNodeResponse {

    @XmlElementRef(name = "getNodeReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetNodeResponseType> getNodeReturn;

    /**
     * Gets the value of the getNodeReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetNodeResponseType }{@code >}
     */
    public JAXBElement<GetNodeResponseType> getGetNodeReturn() {
        return getNodeReturn;
    }

    /**
     * Sets the value of the getNodeReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetNodeResponseType }{@code >}
     */
    public void setGetNodeReturn(JAXBElement<GetNodeResponseType> value) {
        this.getNodeReturn = value;
    }

}
