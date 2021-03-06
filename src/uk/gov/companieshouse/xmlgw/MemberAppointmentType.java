//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.09 at 09:36:09 AM GMT 
//


package uk.gov.companieshouse.xmlgw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An LLP Member Type 
 * 
 * <p>Java class for MemberAppointmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberAppointmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DesignatedInd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="Person">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PersonBaseType">
 *                   &lt;sequence>
 *                     &lt;element name="ServiceAddress" type="{http://xmlgw.companieshouse.gov.uk}ServiceAddressType"/>
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB"/>
 *                     &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CountryOfResidence"/>
 *                     &lt;element name="PreviousNames" type="{http://xmlgw.companieshouse.gov.uk}PreviousNameType" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element name="ResidentialAddress" type="{http://xmlgw.companieshouse.gov.uk}ResidentialAddressType"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Corporate" type="{http://xmlgw.companieshouse.gov.uk}CorporateOfficerAppointmentType"/>
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
@XmlType(name = "MemberAppointmentType", propOrder = {
    "designatedInd",
    "person",
    "corporate"
})
public class MemberAppointmentType {

    @XmlElement(name = "DesignatedInd", required = true)
    protected String designatedInd;
    @XmlElement(name = "Person")
    protected MemberAppointmentType.Person person;
    @XmlElement(name = "Corporate")
    protected CorporateOfficerAppointmentType corporate;

    /**
     * Gets the value of the designatedInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignatedInd() {
        return designatedInd;
    }

    /**
     * Sets the value of the designatedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignatedInd(String value) {
        this.designatedInd = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link MemberAppointmentType.Person }
     *     
     */
    public MemberAppointmentType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberAppointmentType.Person }
     *     
     */
    public void setPerson(MemberAppointmentType.Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateOfficerAppointmentType }
     *     
     */
    public CorporateOfficerAppointmentType getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateOfficerAppointmentType }
     *     
     */
    public void setCorporate(CorporateOfficerAppointmentType value) {
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
     *     &lt;extension base="{http://xmlgw.companieshouse.gov.uk}PersonBaseType">
     *       &lt;sequence>
     *         &lt;element name="ServiceAddress" type="{http://xmlgw.companieshouse.gov.uk}ServiceAddressType"/>
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}DOB"/>
     *         &lt;element ref="{http://xmlgw.companieshouse.gov.uk}CountryOfResidence"/>
     *         &lt;element name="PreviousNames" type="{http://xmlgw.companieshouse.gov.uk}PreviousNameType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ResidentialAddress" type="{http://xmlgw.companieshouse.gov.uk}ResidentialAddressType"/>
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
        "serviceAddress",
        "dob",
        "countryOfResidence",
        "previousNames",
        "residentialAddress"
    })
    public static class Person
        extends PersonBaseType
    {

        @XmlElement(name = "ServiceAddress", required = true)
        protected ServiceAddressType serviceAddress;
        @XmlElement(name = "DOB", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dob;
        @XmlElement(name = "CountryOfResidence", required = true)
        protected String countryOfResidence;
        @XmlElement(name = "PreviousNames")
        protected List<PreviousNameType> previousNames;
        @XmlElement(name = "ResidentialAddress", required = true)
        protected ResidentialAddressType residentialAddress;

        /**
         * Gets the value of the serviceAddress property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceAddressType }
         *     
         */
        public ServiceAddressType getServiceAddress() {
            return serviceAddress;
        }

        /**
         * Sets the value of the serviceAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceAddressType }
         *     
         */
        public void setServiceAddress(ServiceAddressType value) {
            this.serviceAddress = value;
        }

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
         * Gets the value of the countryOfResidence property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryOfResidence() {
            return countryOfResidence;
        }

        /**
         * Sets the value of the countryOfResidence property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryOfResidence(String value) {
            this.countryOfResidence = value;
        }

        /**
         * Gets the value of the previousNames property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the previousNames property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreviousNames().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PreviousNameType }
         * 
         * 
         */
        public List<PreviousNameType> getPreviousNames() {
            if (previousNames == null) {
                previousNames = new ArrayList<PreviousNameType>();
            }
            return this.previousNames;
        }

        /**
         * Gets the value of the residentialAddress property.
         * 
         * @return
         *     possible object is
         *     {@link ResidentialAddressType }
         *     
         */
        public ResidentialAddressType getResidentialAddress() {
            return residentialAddress;
        }

        /**
         * Sets the value of the residentialAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResidentialAddressType }
         *     
         */
        public void setResidentialAddress(ResidentialAddressType value) {
            this.residentialAddress = value;
        }

    }

}
