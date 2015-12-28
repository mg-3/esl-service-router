
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ModifyLocationHouseAssociationType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ModifyLocationHouseAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssociationAction" type="{http://xml.blackbean.com/location/types}HouseAssociationActionType"/>
 *         &lt;element name="LegacyLocationId" type="{http://xml.blackbean.com/location/types}LegacyLocationIDType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyLocationHouseAssociationType", propOrder = {
        "associationAction",
        "legacyLocationId"
})
public class ModifyLocationHouseAssociationType {

    @XmlElement(name = "AssociationAction", required = true)
    @XmlSchemaType(name = "string")
    protected HouseAssociationActionType associationAction;
    @XmlElement(name = "LegacyLocationId", required = true)
    protected LegacyLocationIDType legacyLocationId;

    /**
     * Gets the value of the associationAction property.
     *
     * @return possible object is
     * {@link HouseAssociationActionType }
     */
    public HouseAssociationActionType getAssociationAction() {
        return associationAction;
    }

    /**
     * Sets the value of the associationAction property.
     *
     * @param value allowed object is
     *              {@link HouseAssociationActionType }
     */
    public void setAssociationAction(HouseAssociationActionType value) {
        this.associationAction = value;
    }

    /**
     * Gets the value of the legacyLocationId property.
     *
     * @return possible object is
     * {@link LegacyLocationIDType }
     */
    public LegacyLocationIDType getLegacyLocationId() {
        return legacyLocationId;
    }

    /**
     * Sets the value of the legacyLocationId property.
     *
     * @param value allowed object is
     *              {@link LegacyLocationIDType }
     */
    public void setLegacyLocationId(LegacyLocationIDType value) {
        this.legacyLocationId = value;
    }

}
