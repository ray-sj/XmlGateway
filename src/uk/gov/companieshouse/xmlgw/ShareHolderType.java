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
 * <p>Java class for ShareHolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareHolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/>
 *           &lt;element name="Person">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="Name" type="{http://xmlgw.companieshouse.gov.uk}NameType"/>
 *                     &lt;element name="AmalgamatedName">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nameAddressString">
 *                           &lt;maxLength value="160"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="Address" type="{http://xmlgw.companieshouse.gov.uk}ShareholderAddressType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareHolderType", propOrder = {
    "corporateName",
    "person",
    "address"
})
public class ShareHolderType {

    @XmlElement(name = "CorporateName")
    protected String corporateName;
    @XmlElement(name = "Person")
    protected ShareHolderType.Person person;
    @XmlElement(name = "Address", required = true)
    protected ShareholderAddressType address;

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
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link ShareHolderType.Person }
     *     
     */
    public ShareHolderType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareHolderType.Person }
     *     
     */
    public void setPerson(ShareHolderType.Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ShareholderAddressType }
     *     
     */
    public ShareholderAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareholderAddressType }
     *     
     */
    public void setAddress(ShareholderAddressType value) {
        this.address = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="Name" type="{http://xmlgw.companieshouse.gov.uk}NameType"/>
     *         &lt;element name="AmalgamatedName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://xmlgw.companieshouse.gov.uk}nameAddressString">
     *               &lt;maxLength value="160"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "amalgamatedName"
    })
    public static class Person {

        @XmlElement(name = "Name")
        protected NameType name;
        @XmlElement(name = "AmalgamatedName")
        protected String amalgamatedName;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link NameType }
         *     
         */
        public NameType getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link NameType }
         *     
         */
        public void setName(NameType value) {
            this.name = value;
        }

        /**
         * Gets the value of the amalgamatedName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmalgamatedName() {
            return amalgamatedName;
        }

        /**
         * Sets the value of the amalgamatedName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmalgamatedName(String value) {
            this.amalgamatedName = value;
        }

    }

}
