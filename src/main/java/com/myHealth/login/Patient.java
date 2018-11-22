package com.myHealth.login;

import org.springframework.stereotype.Service;

@Service
public class Patient {

	
	private String patientName;
	private String patientPassword;
	

	
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String patientName, String patientPassword) {
		super();
		this.patientName = patientName;
		this.patientPassword = patientPassword;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientPassword() {
		return patientPassword;
	}
	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}
	
	
	
	
}
