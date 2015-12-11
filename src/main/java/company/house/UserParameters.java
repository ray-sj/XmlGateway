package company.house;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.lf5.util.DateFormatManager;
import org.apache.tools.ant.util.Tokenizer;
import org.apache.xerces.util.URI;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;

import junit.extensions.TestSetup;
import lombok.Data;
import uk.gov.ch.builder.FormSubmissionBuilder;
import uk.gov.ch.builder.GovTalkMessageBuilder;
import uk.gov.ch.builder.OfficerAppointmentBuilder;
import uk.gov.ch.schema.FormSubmission;
import uk.gov.ch.schema.GovTalkMessage;
import uk.gov.ch.schema.OfficerAppointmentType;
import uk.gov.ch.schema.OfficerApptType;

@Data
public class UserParameters {

	private HashMap<String, String> fSubmission;
	private enum Type {AP01, ST01, AP04};
	private enum FormEnums{COMPANYNAME, COMPANYNUMBER, COMPANYAUTHENTICATIONCODE, CONTACTNAME, CONTACTNUMBER, APPOINTMENTDATE, FORENAME, SURNAME, SAMEASREGISTEREDOFFICE, DOB, NATIONALITY, OCCUPATION, COUNTRYOFRESIDENCE, PREMISE, STREET, POSTTOWN, COUNTRY, POSTCODE};
	private String fName;
	private File file;
	private String line;
	private String key;
	private String value;
	private FileReader fReader;
	private BufferedReader bReader;
	private OfficerApptType officerApptType;
	private FormSubmission formSubmission;
	private GovTalkMessage govTalkMessage;
	private HttpsURLConnection connection;
	private String formOut;
	private JAXBContext jaxbContext;
	private ArrayList testParameteres;

	
	public UserParameters(String fName){
		this.fName = fName;
		file = new File(fName);
		fSubmission = new HashMap<>();
	}
	
	public String getLineofText(File file){
		
		try {
			fReader  = new FileReader(file);
			bReader = new BufferedReader(fReader);
			if ((line = bReader.readLine()) != null){
			}
			bReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;		
	}

	public ArrayList<String> getParameterCollection(File file){
		try {
			fReader  = new FileReader(file);
			bReader = new BufferedReader(fReader);
			testParameteres = new ArrayList();
			while((line = bReader.readLine()) != null){
				testParameteres.add(line);
			}
			bReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testParameteres;		
	}
	
	public void setParamsintoHashMap(String params){
		String fLine;
		StringTokenizer tok;
		fLine = getLineofText(file);
		tok = new StringTokenizer(fLine, ",");
		if (params == null){
			while (tok.hasMoreTokens()){
				key = tok.nextToken();
				value = tok.nextToken();
				fSubmission.put(key, value);
			}
		} else {
			
		}
	}
	
	public void setUpdatedValue(Set params){
		
		Iterator<String> itr = params.iterator();
		while(itr.hasNext()){
			String str = itr.next();
			String tmpStr = str.trim();
			String str1 = tmpStr.toUpperCase();
			FormEnums fEnums = FormEnums.valueOf(str1);
			switch(fEnums){
			case COMPANYNAME:
				formSubmission.getFormHeader().setCompanyName(fSubmission.get(str));
				break;
			case COMPANYNUMBER:
				formSubmission.getFormHeader().setCompanyNumber(BigInteger.valueOf(Long.parseLong(fSubmission.get(str).trim())));
				break;
			case COMPANYAUTHENTICATIONCODE:
				formSubmission.getFormHeader().setCompanyAuthenticationCode(fSubmission.get(str));
				break;
			case CONTACTNAME:
				formSubmission.getFormHeader().setContactName(fSubmission.get(str));
				break;
			case CONTACTNUMBER:
				formSubmission.getFormHeader().setContactNumber(fSubmission.get(str));
				break;
			case APPOINTMENTDATE:
				GregorianCalendar gDate = new GregorianCalendar();
				Date date = null;
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				String sDate = fSubmission.get(str);
				XMLGregorianCalendar xmlgDate = null;
				try {
					date=df.parse(fSubmission.get(str));
					gDate.setTime(date);
					xmlgDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gDate);
				} catch (DatatypeConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				officerApptType.setAppointmentDate(xmlgDate);
				break;
			case FORENAME:
				officerApptType.getDirector().getPerson().setForename(fSubmission.get(str));
				break;
			case SURNAME:
				officerApptType.getDirector().getPerson().setSurname(fSubmission.get(str));
				break;
			case SAMEASREGISTEREDOFFICE:
				officerApptType.getDirector().getPerson().getServiceAddress().setSameAsRegisteredOffice(fSubmission.get(str));;
				break;
			case DOB:
				GregorianCalendar gDob = new GregorianCalendar();
				Date dob = null;
				DateFormat dfDob = new SimpleDateFormat("yyyy-MM-dd");
				String sDob = fSubmission.get(str);
				XMLGregorianCalendar xmlgDob = null;
				try {
					dob=dfDob.parse(fSubmission.get(str));
					gDob.setTime(dob);
					xmlgDob = DatatypeFactory.newInstance().newXMLGregorianCalendar(gDob);
				} catch (DatatypeConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				officerApptType.getDirector().getPerson().setDOB(xmlgDob);
				break;
			case NATIONALITY:
				officerApptType.getDirector().getPerson().setNationality(fSubmission.get(str));;
				break;
			case OCCUPATION:
				officerApptType.getDirector().getPerson().setOccupation(fSubmission.get(str));;
				break;
			case COUNTRYOFRESIDENCE:
				officerApptType.getDirector().getPerson().setCountryOfResidence(fSubmission.get(str));;
				break;
			case PREMISE:
				officerApptType.getDirector().getPerson().getResidentialAddress().getAddress().setPremise(fSubmission.get(str));;
				break;
			case STREET:
				officerApptType.getDirector().getPerson().getResidentialAddress().getAddress().setStreet(fSubmission.get(str));
				break;
			case POSTTOWN:
				officerApptType.getDirector().getPerson().getResidentialAddress().getAddress().setPostTown(fSubmission.get(str));;
				break;
			case COUNTRY:
				officerApptType.getDirector().getPerson().getResidentialAddress().getAddress().setCountry(fSubmission.get(str));;
				break;
			case POSTCODE:
				officerApptType.getDirector().getPerson().getResidentialAddress().getAddress().setPostcode(fSubmission.get(str));;
				break;
			default:;
				System.out.println("ENUM NOT RECOGNISED " + fEnums.toString());
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public void updateXmlMessage(String type){

		Set list;

		list = fSubmission.keySet();
		switch(Type.valueOf(type)){
		case AP01:
			officerApptType = new OfficerAppointmentBuilder("xml/OfficerAppointment.xml").build();
	        formSubmission = new FormSubmissionBuilder("xml/FormSubmission.xml").withOfficerApptType(
	                officerApptType).build();
	        govTalkMessage = new GovTalkMessageBuilder("xml/AP01.xml").withFormSubmission(formSubmission)
            .build();
	        setUpdatedValue(list);
			break;
		case ST01:
			break;
		case AP04:
			break;
		default:;
		}
	}
	
	public void generateXmlFile(GovTalkMessage govTalkMessage){
		try {
			jaxbContext = null;
	        jaxbContext = JAXBContext.newInstance(GovTalkMessage.class);
//	        jaxbContext = JAXBContext.newInstance(GovTalkMessage.class, FormSubmission.class, OfficerApptType.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
	        int size = govTalkMessage.getBody().getAny().size();
	        govTalkMessage.getBody().getAny().remove(0);
	        size = govTalkMessage.getBody().getAny().size();
	        StringWriter stringWriter = new StringWriter();
	        marshaller.marshal(govTalkMessage, stringWriter);
	        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
	        marshaller.marshal( govTalkMessage, new File( "NewAP01.xml" ) );
	        marshaller.marshal(govTalkMessage, System.out);
	        marshaller.marshal(govTalkMessage, stringWriter);
	        formOut = stringWriter.toString();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void sendXMLtoGateway(){
		// Add stuff to this method
		String url = "https://xmlmurdochtest.orctel.internal:44329/v1-0/xmlgw/Gateway/ Xml should be posted to this";
		String charSet = "UTF-8";
		String xmlForm = null;
		
		try {
			connection = (HttpsURLConnection) new URL(url).openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			formOut = URLEncoder.encode(formOut, charSet);
			xmlForm = formOut;
			OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
			out.write(xmlForm);
			out.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		String name = "/Users/jacquisj/Documents/DevWorkspace/XmlGateway/src/main/java/resources/userparams.txt";
		
		UserParameters uParam = new UserParameters(name );
		uParam.setParamsintoHashMap(null);
		uParam.updateXmlMessage("AP01");
		uParam.generateXmlFile(uParam.getGovTalkMessage());
//		uParam.sendXMLtoGateway();
	}

}
