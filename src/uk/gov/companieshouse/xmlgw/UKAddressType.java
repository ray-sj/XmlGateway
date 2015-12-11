//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.09 at 09:36:09 AM GMT 
//


package uk.gov.companieshouse.xmlgw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UKAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UKAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Premise"/>
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Street" minOccurs="0"/>
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Thoroughfare" minOccurs="0"/>
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}PostTown"/>
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}County" minOccurs="0"/>
 *         &lt;element name="Country">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="GB-ENG"/>
 *               &lt;enumeration value="GB-WLS"/>
 *               &lt;enumeration value="GB-SCT"/>
 *               &lt;enumeration value="GB-NIR"/>
 *               &lt;enumeration value="GBR"/>
 *               &lt;enumeration value="UNDEF"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Postcode" minOccurs="0"/>
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CareofName" minOccurs="0"/>
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}PoBox" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UKAddressType", propOrder = {
    "premise",
    "street",
    "thoroughfare",
    "postTown",
    "county",
    "country",
    "postcode",
    "careofName",
    "poBox"
})
public class UKAddressType {

    @XmlElement(name = "Premise", required = true)
    protected String premise;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "Thoroughfare")
    protected String thoroughfare;
    @XmlElement(name = "PostTown", required = true)
    protected String postTown;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "Postcode")
    protected String postcode;
    @XmlElement(name = "CareofName")
    protected String careofName;
    @XmlElement(name = "PoBox")
    protected String poBox;

    /**
     * Gets the value of the premise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremise() {
        return premise;
    }

    /**
     * Sets the value of the premise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremise(String value) {
        this.premise = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the thoroughfare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThoroughfare() {
        return thoroughfare;
    }

    /**
     * Sets the value of the thoroughfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThoroughfare(String value) {
        this.thoroughfare = value;
    }

    /**
     * Gets the value of the postTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostTown() {
        return postTown;
    }

    /**
     * Sets the value of the postTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostTown(String value) {
        this.postTown = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the careofName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareofName() {
        return careofName;
    }

    /**
     * Sets the value of the careofName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareofName(String value) {
        this.careofName = value;
    }

    /**
     * Gets the value of the poBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoBox(String value) {
        this.poBox = value;
    }

}
