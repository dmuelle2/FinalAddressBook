package edu.gac.MCS270.AddressBook.shared;

import java.io.Serializable;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.IdentityType; 

@PersistenceCapable(identityType=IdentityType.APPLICATION)
public class EntryData implements Serializable, Comparable<EntryData>{
	private static final long serialVersionUID = 1L;
	
	private String id;

	@Persistent
	private String firstName="no name";
	@Persistent
	private String lastName="no name";
	@Persistent
	private String address="empty";
	@Persistent
	private String city="empty";
	@Persistent
	private String state="empty";
	@Persistent
	private int zip= 0;
	@Persistent
	private String email="empty";
	@Persistent
	private int phone= 0;
	
	
	public EntryData() {}

	public EntryData(String firstName, String lastName, String add, String c, String s, int z, String em, int ph){
		this.firstName = firstName;
		this.lastName = lastName;
		address = add;
		city = c;
		state = s;
		zip = z;
		email = em;
		phone = ph;

	}

	// Getters and Setters
	public String getFirstName(){
		return firstName;	
	}
	public String getLastName(){
		return lastName;
	}
	public String getAddress(){
		return address;
	}
	public String getCity(){
		return city;
	}
	public String getState(){
		return state;
	}
	public int getZip(){
		return zip;
	}
	public String getEmail(){
		return email;
	}
	public int getPhone(){
		return phone;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setAddress(String add){
		address = add;
	}
	public void setCity(String c){
		city = c;
	}
	public void setState(String s){
		state = s;
	}
	public void setZip(int z){
		zip = z;
	}
	public void setEmail(String e){
		email = e;
	}
	public void setPhone(int ph){
		phone = ph;
	}

	public String getID() {
		return id;
	}

	public String stringRep() {	
		return "Name: " + firstName + " " + lastName +
				"\n Address: " + address +
				"\n          " + city+", " + state + " " + zip +
				"\n E-mail: " + email +
				"\n Phone: " + phone;
	}

	@Override
	public int compareTo(EntryData o) {
		// TODO Auto-generated method stub
		return this.lastName.compareTo(o.lastName);
	}
}