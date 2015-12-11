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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersCorpAuthType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersCorpAuthType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PersonalDetails" type="{http://xmlgw.companieshouse.gov.uk}PersonalAttributeType" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="Corporate" type="{http://xmlgw.companieshouse.gov.uk}NameType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersCorpAuthType", propOrder = {
    "personalDetails",
    "corporate"
})
public class PersCorpAuthType {

    @XmlElement(name = "PersonalDetails")
    protected List<PersonalAttributeType> personalDetails;
    @XmlElement(name = "Corporate")
    protected NameType corporate;

    /**
     * Gets the value of the personalDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalAttributeType }
     * 
     * 
     */
    public List<PersonalAttributeType> getPersonalDetails() {
        if (personalDetails == null) {
            personalDetails = new ArrayList<PersonalAttributeType>();
        }
        return this.personalDetails;
    }

    /**
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setCorporate(NameType value) {
        this.corporate = value;
    }

}
