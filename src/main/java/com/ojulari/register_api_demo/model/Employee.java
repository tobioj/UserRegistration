package com.ojulari.register_api_demo.model;

public class Employee {
	
	private String full_name;
	private String email;
	private String dob;
	private String address;
	
	public Employee() {
		
	}

	public Employee(String full_name, String email, String dob, String address) {
		this.full_name = full_name;
		this.email = email;
		this.dob = dob;
		this.address = address;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



}
