package company.house;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sun.xml.bind.v2.runtime.reflect.ListIterator;

public class BasicXmlTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		String fileName = "/Users/jacquisj/Documents/DevWorkspace/house/src/main/java/resources/AP01Temp.xml";
		File fileAp01 = new File(fileName);
		fileName = "/Users/jacquisj/Documents/DevWorkspace/house/src/main/java/resources/sampleXml.xml";
		File file = new File(fileName);
		

		//use of the JAXB library for parsing xml and validation of the schema
//		Directors form = null;
//		try{
//			JAXBContext jContext = JAXBContext.newInstance(Directors.class);
//			Unmarshaller jUnmash = jContext.createUnmarshaller();
//			form = (Directors) jUnmash.unmarshal(fileAp01);
//		} catch (JAXBException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		List<Director> exec = form.getDirectors();
//		System.out.println(exec.size());
//		// iterate through the unmarshelled object
//		Iterator<Director> iter = exec.iterator();
//		while(iter.hasNext()){
//			Director dir = iter.next();
//			System.out.println(dir.getForename());
//			System.out.println(dir.getSurname());
//		}
		
		
		MyLomBok lom;
		//Lombok version to reduce the boiler plate
		try {
			
			JAXBContext jaxbContext = JAXBContext.newInstance(MyLomBok.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			lom = (MyLomBok) jaxbUnmarshaller.unmarshal(file);
			System.out.println(lom.getName());
			lom.setName("the company");
			System.out.println(lom.getName());
			
			
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// write this to a file
//		OutputFormat format = new OutputFormat(parser.getXMLDoc());
//		format.setIndenting(true);
//		String filename = "myXMLDocument"+System.currentTimeMillis()+".xml";
//		XMLSerializer serializer;
//		try {
//			serializer = new XMLSerializer(
//			    new FileOutputStream(new File(filename)), format);
//			serializer.serialize(parser.getXMLDoc());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
