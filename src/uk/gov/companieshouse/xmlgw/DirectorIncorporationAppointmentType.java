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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A Company Director Appointment 
 * 
 * <p>Java class for DirectorIncorporationAppointmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectorIncorporationAppointmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://xmlgw.companieshouse.gov.uk}DirectorAddressType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="Person">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PersonBaseType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB"/>
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Nationality"/>
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Occupation"/>
 *                     &lt;element name="PreviousName" type="{http://xmlgw.companieshouse.gov.uk}PreviousNameType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Corporate">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://xmlgw.companieshouse.gov.uk}NameType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectorIncorporationAppointmentType", propOrder = {
    "address",
    "person",
    "corporate"
})
public class DirectorIncorporationAppointmentType {

    @XmlElement(name = "Address", required = true)
    protected DirectorIncorporationAppointmentType.Address address;
    @XmlElement(name = "Person")
    protected DirectorIncorporationAppointmentType.Person person;
    @XmlElement(name = "Corporate")
    protected DirectorIncorporationAppointmentType.Corporate corporate;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link DirectorIncorporationAppointmentType.Address }
     *     
     */
    public DirectorIncorporationAppointmentType.Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectorIncorporationAppointmentType.Address }
     *     
     */
    public void setAddress(DirectorIncorporationAppointmentType.Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link DirectorIncorporationAppointmentType.Person }
     *     
     */
    public DirectorIncorporationAppointmentType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectorIncorporationAppointmentType.Person }
     *     
     */
    public void setPerson(DirectorIncorporationAppointmentType.Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link DirectorIncorporationAppointmentType.Corporate }
     *     
     */
    public DirectorIncorporationAppointmentType.Corporate getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectorIncorporationAppointmentType.Corporate }
     *     
     */
    public void setCorporate(DirectorIncorporationAppointmentType.Corporate value) {
        this.corporate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}DirectorAddressType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address
        extends DirectorAddressType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}NameType">
     *       &lt;sequence>
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CorporateName"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "corporateName"
    })
    public static class Corporate
        extends NameType
    {

        @XmlElement(name = "CorporateName", required = true)
        protected String corporateName;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PersonBaseType">
     *       &lt;sequence>
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB"/>
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Nationality"/>
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}Occupation"/>
     *         &lt;element name="PreviousName" type="{http://xmlgw.companieshouse.gov.uk}PreviousNameType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dob",
        "nationality",
        "occupation",
        "previousName"
    })
    public static class Person
        extends PersonBaseType
    {

        @XmlElement(name = "DOB", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dob;
        @XmlElement(name = "Nationality", required = true)
        protected String nationality;
        @XmlElement(name = "Occupation", required = true)
        protected String occupation;
        @XmlElement(name = "PreviousName")
        protected PreviousNameType previousName;

        /**
         * Gets the value of the dob property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDOB() {
            return dob;
        }

        /**
         * Sets the value of the dob property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDOB(XMLGregorianCalendar value) {
            this.dob = value;
        }

        /**
         * Gets the value of the nationality property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNationality() {
            return nationality;
        }

        /**
         * Sets the value of the nationality property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNationality(String value) {
            this.nationality = value;
        }

        /**
         * Gets the value of the occupation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOccupation() {
            return occupation;
        }

        /**
         * Sets the value of the occupation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOccupation(String value) {
            this.occupation = value;
        }

        /**
         * Gets the value of the previousName property.
         * 
         * @return
         *     possible object is
         *     {@link PreviousNameType }
         *     
         */
        public PreviousNameType getPreviousName() {
            return previousName;
        }

        /**
         * Sets the value of the previousName property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreviousNameType }
         *     
         */
        public void setPreviousName(PreviousNameType value) {
            this.previousName = value;
        }

    }

}
