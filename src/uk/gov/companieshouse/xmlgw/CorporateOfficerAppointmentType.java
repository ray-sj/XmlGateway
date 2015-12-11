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
 * A Corporate Officer Appointment 
 * 
 * <p>Java class for CorporateOfficerAppointmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateOfficerAppointmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}NameType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/>
 *         &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}CompanyAddressType"/>
 *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CompanyIdentification"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateOfficerAppointmentType", propOrder = {
    "corporateName",
    "address",
    "companyIdentification"
})
public class CorporateOfficerAppointmentType
    extends NameType
{

    @XmlElement(name = "CorporateName", required = true)
    protected String corporateName;
    @XmlElement(name = "Address", required = true)
    protected CompanyAddressType address;
    @XmlElement(name = "CompanyIdentification", required = true)
    protected CompanyIdentification companyIdentification;

    /**
     * Gets the value of the corporateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateName() {
        return corporateName;
    }

    /**
     * Sets the value of the corporateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateName(String value) {
        this.corporateName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyAddressType }
     *     
     */
    public CompanyAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyAddressType }
     *     
     */
    public void setAddress(CompanyAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the companyIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentification }
     *     
     */
    public CompanyIdentification getCompanyIdentification() {
        return companyIdentification;
    }

    /**
     * Sets the value of the companyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentification }
     *     
     */
    public void setCompanyIdentification(CompanyIdentification value) {
        this.companyIdentification = value;
    }

}
