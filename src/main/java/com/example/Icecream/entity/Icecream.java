package com.example.Icecream.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="franchise_form")
public class Icecream {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="city")
	private String city;
	
	@Column(name="pincode")
	private int pincode;
	
	@Column(name="mobile_no")
	private long mobileno;
	
	@Column(name="password")
	private String password;
	
	
	@Column(name="no_of_store")
	private String noOfStore;


	public Icecream() {
		super();
	}


	public Icecream(int id, String firstname, String lastname, String email, String city, int pincode, long mobileno,
			String password, String noOfStore) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.city = city;
		this.pincode = pincode;
		this.mobileno = mobileno;
		this.password = password;
		this.noOfStore = noOfStore;
	}


	public Icecream(String firstname, String lastname, String email, String city, int pincode, long mobileno,
			String password, String noOfStore) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.city = city;
		this.pincode = pincode;
		this.mobileno = mobileno;
		this.password = password;
		this.noOfStore = noOfStore;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public long getMobileno() {
		return mobileno;
	}


	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNoOfStore() {
		return noOfStore;
	}


	public void setNoOfStore(String noOfStore) {
		this.noOfStore = noOfStore;
	}


	@Override
	public String toString() {
		return "Icecream [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", city=" + city + ", pincode=" + pincode + ", mobileno=" + mobileno + ", password=" + password
				+ ", noOfStore=" + noOfStore + "]";
	}

	
	
	
	
	
	
	
	
}
	
	
	
	