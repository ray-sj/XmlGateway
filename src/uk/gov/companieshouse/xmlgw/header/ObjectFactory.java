//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.09 at 09:38:00 AM GMT 
//


package uk.gov.companieshouse.xmlgw.header;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.gov.companieshouse.xmlgw.header package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.gov.companieshouse.xmlgw.header
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FormSubmission }
     * 
     */
    public FormSubmission createFormSubmission() {
        return new FormSubmission();
    }

    /**
     * Create an instance of {@link FormSubmission.FormHeader }
     * 
     */
    public FormSubmission.FormHeader createFormSubmissionFormHeader() {
        return new FormSubmission.FormHeader();
    }

    /**
     * Create an instance of {@link FormSubmission.Form }
     * 
     */
    public FormSubmission.Form createFormSubmissionForm() {
        return new FormSubmission.Form();
    }

    /**
     * Create an instance of {@link FormSubmission.AdditionalInformation }
     * 
     */
    public FormSubmission.AdditionalInformation createFormSubmissionAdditionalInformation() {
        return new FormSubmission.AdditionalInformation();
    }

    /**
     * Create an instance of {@link FormSubmission.Document }
     * 
     */
    public FormSubmission.Document createFormSubmissionDocument() {
        return new FormSubmission.Document();
    }

}
