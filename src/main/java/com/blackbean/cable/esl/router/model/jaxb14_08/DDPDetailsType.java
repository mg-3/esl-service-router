
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DDPDetailsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="DDPDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="franchiseTaxArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="managementArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constructionArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dwellingTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dwellingCodeDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardDwellingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dupHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dualHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="houseComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="controlArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="map" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mkt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ovug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="drop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxX1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxX2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxX3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxY2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxY3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxY7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxY6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testFiberNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotTap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Serviceability" type="{http://xml.comcast.com/location/types}LocationDSTServicabilityTypes" minOccurs="0"/>
 *         &lt;element name="serviceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DDPDetailsType", propOrder = {
        "houseNumber",
        "franchiseTaxArea",
        "managementArea",
        "accountNumber",
        "customerNumber",
        "dual",
        "constructionArea",
        "dwellingTypeCode",
        "dwellingCodeDescr",
        "standardDwellingCode",
        "customerType",
        "dupHouse",
        "dualHouse",
        "networkInfo",
        "networkID",
        "houseComment",
        "complex",
        "controlArea",
        "info",
        "map",
        "mkt",
        "ovug",
        "drop",
        "salesRoute",
        "auxX1",
        "auxX2",
        "auxX3",
        "auxY1",
        "auxY2",
        "auxY3",
        "auxY7",
        "auxY6",
        "testFiberNode",
        "lineTag",
        "hotTap",
        "serviceability",
        "serviceStatus"
})
public class DDPDetailsType {

    protected String houseNumber;
    protected String franchiseTaxArea;
    protected String managementArea;
    protected String accountNumber;
    protected String customerNumber;
    protected String dual;
    protected String constructionArea;
    protected String dwellingTypeCode;
    protected String dwellingCodeDescr;
    protected String standardDwellingCode;
    protected String customerType;
    protected String dupHouse;
    protected String dualHouse;
    protected String networkInfo;
    protected String networkID;
    protected String houseComment;
    protected String complex;
    protected String controlArea;
    protected String info;
    protected String map;
    protected String mkt;
    protected String ovug;
    protected String drop;
    protected String salesRoute;
    protected String auxX1;
    protected String auxX2;
    protected String auxX3;
    protected String auxY1;
    protected String auxY2;
    protected String auxY3;
    protected String auxY7;
    protected String auxY6;
    protected String testFiberNode;
    protected String lineTag;
    protected String hotTap;
    @XmlElement(name = "Serviceability")
    protected LocationDSTServicabilityTypes serviceability;
    protected String serviceStatus;

    /**
     * Gets the value of the houseNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the franchiseTaxArea property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFranchiseTaxArea() {
        return franchiseTaxArea;
    }

    /**
     * Sets the value of the franchiseTaxArea property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFranchiseTaxArea(String value) {
        this.franchiseTaxArea = value;
    }

    /**
     * Gets the value of the managementArea property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getManagementArea() {
        return managementArea;
    }

    /**
     * Sets the value of the managementArea property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setManagementArea(String value) {
        this.managementArea = value;
    }

    /**
     * Gets the value of the accountNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the customerNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the dual property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDual() {
        return dual;
    }

    /**
     * Sets the value of the dual property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDual(String value) {
        this.dual = value;
    }

    /**
     * Gets the value of the constructionArea property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getConstructionArea() {
        return constructionArea;
    }

    /**
     * Sets the value of the constructionArea property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setConstructionArea(String value) {
        this.constructionArea = value;
    }

    /**
     * Gets the value of the dwellingTypeCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDwellingTypeCode() {
        return dwellingTypeCode;
    }

    /**
     * Sets the value of the dwellingTypeCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDwellingTypeCode(String value) {
        this.dwellingTypeCode = value;
    }

    /**
     * Gets the value of the dwellingCodeDescr property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDwellingCodeDescr() {
        return dwellingCodeDescr;
    }

    /**
     * Sets the value of the dwellingCodeDescr property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDwellingCodeDescr(String value) {
        this.dwellingCodeDescr = value;
    }

    /**
     * Gets the value of the standardDwellingCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStandardDwellingCode() {
        return standardDwellingCode;
    }

    /**
     * Sets the value of the standardDwellingCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStandardDwellingCode(String value) {
        this.standardDwellingCode = value;
    }

    /**
     * Gets the value of the customerType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the dupHouse property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDupHouse() {
        return dupHouse;
    }

    /**
     * Sets the value of the dupHouse property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDupHouse(String value) {
        this.dupHouse = value;
    }

    /**
     * Gets the value of the dualHouse property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDualHouse() {
        return dualHouse;
    }

    /**
     * Sets the value of the dualHouse property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDualHouse(String value) {
        this.dualHouse = value;
    }

    /**
     * Gets the value of the networkInfo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNetworkInfo() {
        return networkInfo;
    }

    /**
     * Sets the value of the networkInfo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNetworkInfo(String value) {
        this.networkInfo = value;
    }

    /**
     * Gets the value of the networkID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNetworkID() {
        return networkID;
    }

    /**
     * Sets the value of the networkID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNetworkID(String value) {
        this.networkID = value;
    }

    /**
     * Gets the value of the houseComment property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHouseComment() {
        return houseComment;
    }

    /**
     * Sets the value of the houseComment property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHouseComment(String value) {
        this.houseComment = value;
    }

    /**
     * Gets the value of the complex property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getComplex() {
        return complex;
    }

    /**
     * Sets the value of the complex property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setComplex(String value) {
        this.complex = value;
    }

    /**
     * Gets the value of the controlArea property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getControlArea() {
        return controlArea;
    }

    /**
     * Sets the value of the controlArea property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setControlArea(String value) {
        this.controlArea = value;
    }

    /**
     * Gets the value of the info property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInfo(String value) {
        this.info = value;
    }

    /**
     * Gets the value of the map property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMap(String value) {
        this.map = value;
    }

    /**
     * Gets the value of the mkt property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMkt() {
        return mkt;
    }

    /**
     * Sets the value of the mkt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMkt(String value) {
        this.mkt = value;
    }

    /**
     * Gets the value of the ovug property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOvug() {
        return ovug;
    }

    /**
     * Sets the value of the ovug property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOvug(String value) {
        this.ovug = value;
    }

    /**
     * Gets the value of the drop property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDrop() {
        return drop;
    }

    /**
     * Sets the value of the drop property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDrop(String value) {
        this.drop = value;
    }

    /**
     * Gets the value of the salesRoute property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSalesRoute() {
        return salesRoute;
    }

    /**
     * Sets the value of the salesRoute property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSalesRoute(String value) {
        this.salesRoute = value;
    }

    /**
     * Gets the value of the auxX1 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAuxX1() {
        return auxX1;
    }

    /**
     * Sets the value of the auxX1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAuxX1(String value) {
        this.auxX1 = value;
    }

    /**
     * Gets the value of the auxX2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAuxX2() {
        return auxX2;
    }

    /**
     * Sets the value of the auxX2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAuxX2(String value) {
        this.auxX2 = value;
    }

    /**
     * Gets the value of the auxX3 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAuxX3() {
        return auxX3;
    }

    /**
     * Sets the value of the auxX3 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAuxX3(String value) {
        this.auxX3 = value;
    }

    /**
     * Gets the value of the auxY1 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAuxY1() {
        return auxY1;
    }

    /**
     * Sets the value of the auxY1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAuxY1(String value) {
        this.auxY1 = value;
    }

    /**
     * Gets the value of the auxY2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAuxY2() {
        return auxY2;
    }

    /**
     * Sets the value of the auxY2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAuxY2(String value) {
        this.auxY2 = value;
    }

    /**
     * Gets the value of the auxY3 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAuxY3() {
        return auxY3;
    }

    /**
     * Sets the value of the auxY3 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAuxY3(String value) {
        this.auxY3 = value;
    }

    /**
     * Gets the value of the auxY7 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAuxY7() {
        return auxY7;
    }

    /**
     * Sets the value of the auxY7 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAuxY7(String value) {
        this.auxY7 = value;
    }

    /**
     * Gets the value of the auxY6 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAuxY6() {
        return auxY6;
    }

    /**
     * Sets the value of the auxY6 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAuxY6(String value) {
        this.auxY6 = value;
    }

    /**
     * Gets the value of the testFiberNode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTestFiberNode() {
        return testFiberNode;
    }

    /**
     * Sets the value of the testFiberNode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTestFiberNode(String value) {
        this.testFiberNode = value;
    }

    /**
     * Gets the value of the lineTag property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLineTag() {
        return lineTag;
    }

    /**
     * Sets the value of the lineTag property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLineTag(String value) {
        this.lineTag = value;
    }

    /**
     * Gets the value of the hotTap property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotTap() {
        return hotTap;
    }

    /**
     * Sets the value of the hotTap property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotTap(String value) {
        this.hotTap = value;
    }

    /**
     * Gets the value of the serviceability property.
     *
     * @return possible object is
     * {@link LocationDSTServicabilityTypes }
     */
    public LocationDSTServicabilityTypes getServiceability() {
        return serviceability;
    }

    /**
     * Sets the value of the serviceability property.
     *
     * @param value allowed object is
     *              {@link LocationDSTServicabilityTypes }
     */
    public void setServiceability(LocationDSTServicabilityTypes value) {
        this.serviceability = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

}
