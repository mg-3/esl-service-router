
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
 *         &lt;element name="AddMsagData" type="{http://xml.blackbean.com/location/types}AddMsagDataRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "addMsagData"
})
@XmlRootElement(name = "addMsagData", namespace = "http://xml.blackbean.com/location/services")
public class AddMsagData {

    @XmlElementRef(name = "AddMsagData", namespace = "http://xml.blackbean.com/location/services", type = JAXBElement.class, required = false)
    protected JAXBElement<AddMsagDataRequestType> addMsagData;

    /**
     * Gets the value of the addMsagData property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link AddMsagDataRequestType }{@code >}
     */
    public JAXBElement<AddMsagDataRequestType> getAddMsagData() {
        return addMsagData;
    }

    /**
     * Sets the value of the addMsagData property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link AddMsagDataRequestType }{@code >}
     */
    public void setAddMsagData(JAXBElement<AddMsagDataRequestType> value) {
        this.addMsagData = value;
    }

}
