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
 * <p>Java class for CompanyAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyAddressType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}AddressBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CareofName" minOccurs="0"/>
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}PoBox" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyAddressType", propOrder = {
    "careofName",
    "poBox"
})
public class CompanyAddressType
    extends AddressBaseType
{

    @XmlElement(name = "CareofName")
    protected String careofName;
    @XmlElement(name = "PoBox")
    protected String poBox;

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
