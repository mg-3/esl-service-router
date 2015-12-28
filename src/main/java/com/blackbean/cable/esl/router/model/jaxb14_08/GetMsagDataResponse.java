
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
 *         &lt;element name="getMsagDataReturn" type="{http://xml.comcast.com/location/types}GetMsagDataResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getMsagDataReturn"
})
@XmlRootElement(name = "getMsagDataResponse", namespace = "http://xml.comcast.com/location/services")
public class GetMsagDataResponse {

    @XmlElementRef(name = "getMsagDataReturn", namespace = "http://xml.comcast.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetMsagDataResponseType> getMsagDataReturn;

    /**
     * Gets the value of the getMsagDataReturn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetMsagDataResponseType }{@code >}
     */
    public JAXBElement<GetMsagDataResponseType> getGetMsagDataReturn() {
        return getMsagDataReturn;
    }

    /**
     * Sets the value of the getMsagDataReturn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetMsagDataResponseType }{@code >}
     */
    public void setGetMsagDataReturn(JAXBElement<GetMsagDataResponseType> value) {
        this.getMsagDataReturn = value;
    }

}
