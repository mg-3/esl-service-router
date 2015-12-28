
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
 *         &lt;element name="GetMsagData" type="{http://xml.blackbean.com/location/types}GetMsagDataRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getMsagData"
})
@XmlRootElement(name = "getMsagData", namespace = "http://xml.blackbean.com/location/services")
public class GetMsagData {

    @XmlElementRef(name = "GetMsagData", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<GetMsagDataRequestType> getMsagData;

    /**
     * Gets the value of the getMsagData property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link GetMsagDataRequestType }{@code >}
     */
    public JAXBElement<GetMsagDataRequestType> getGetMsagData() {
        return getMsagData;
    }

    /**
     * Sets the value of the getMsagData property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link GetMsagDataRequestType }{@code >}
     */
    public void setGetMsagData(JAXBElement<GetMsagDataRequestType> value) {
        this.getMsagData = value;
    }

}
