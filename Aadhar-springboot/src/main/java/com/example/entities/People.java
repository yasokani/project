package com.example.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class People {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int people_id;
	private String name;
	private String dob;
	private String emailid;
	private String mobileno;
	private String gender;
	private String address;
	
	public int getPeopleId() {
		return people_id;
	}
	public void setPeopleId(int peopleId) {
		this.people_id = peopleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "People [people_id=" + people_id + ", name=" + name + ", dob=" + dob + ", emailid=" + emailid
				+ ", mobileno=" + mobileno + ", gender=" + gender + ", address=" + address + "]";
	}
	

}