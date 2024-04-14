package com.guru.GBOES.Project.Modell;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BookTableCustomer")
public class Bokkings {
	
	private String name;
	private String timings;
	private String dates;
	@Id
	private String email;
	public Bokkings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bokkings(String name, String timings, String dates, String email) {
		super();
		this.name = name;
		this.timings = timings;
		this.dates = dates;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Bokkings [name=" + name + ", timings=" + timings + ", dates=" + dates + ", email=" + email + "]";
	}
	
	
	

}
