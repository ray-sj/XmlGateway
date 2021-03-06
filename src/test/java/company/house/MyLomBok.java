package company.house;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@XmlAccessorType(XmlAccessType.FIELD)
@Data
@XmlRootElement (name = "Company")
public class MyLomBok {

	//data members
	@XmlElement (name = "Name")
	String name;
	@XmlElement (name = "Executive")
	String executive;
	@XmlAttribute
	String type;
	String lastName;
	String firstName;
	String city;
	String street;
	String state;
	String postCode;
	
 /*
	public String getName(){
		return name;
	}
	
	@XmlElement (name = "Name")
	public void setName(String name){
		this.name = name;
	}
	
	public String getExecutive(){
		return executive;
	}

	@XmlElement (name = "Executive")
	public void setExecutuve(String exec){
		this.executive = exec;
	}

	String type;
	@XmlAttribute (name = "type")
	public void setType(String type){
		this.type = type;
	}

	public String getLastName(){
		return lastName;
	}

	@XmlElement (name = "LastName")
	public void setLastName(String lname){
		this.lastName = lname;
	}

	public String getFirstName(){
		return firstName;
	}

	@XmlElement (name = "FirstName")
	public void setFirstName(String fname){
		this.firstName = fname;
	}
	
	public String getCity(){
		return city;
	}

	@XmlElement (name = "city")
	public void setCity(String city){
		this.city = city;
	}

	public String getStreet(){
		return street;
	}

	@XmlElement (name = "street")
	public void setStreet(String street){
		this.street = street;
	}

	public String getState(){
		return state;
	}

	@XmlElement (name = "state")
	public void setState(String state){
		this.state = state;
	}

	public String getPostCode(){
		return postCode;
	}

	@XmlElement (name = "postcode")
	public void setPostCode(String pc){
		this.postCode = pc;
	}
*/

}
