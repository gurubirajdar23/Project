package com.guru.GBOES.Project.Modell;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contactDetails")
public class Contact {
	
	private String name;
	private String address;
	private String mobile;
	
	@Id
	private String email;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String name, String address, String mobile, String email) {
		super();
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", address=" + address + ", mobile=" + mobile + ", email=" + email + "]";
	}
	
	
	
	

}
