package com.myHealth.login;

import org.springframework.stereotype.Service;

@Service
public class Nurse {
	
	private String nurseUserName;
	private String nursePassword;
	
	
	
	
	
	
	
	public Nurse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nurse(String nurseUserName, String nursePassword) {
		super();
		this.nurseUserName = nurseUserName;
		this.nursePassword = nursePassword;
		
		
		
	}
	public String getNurseUserName() {
		return nurseUserName;
	}
	public void setNurseUserName(String nurseUserName) {
		this.nurseUserName = nurseUserName;
	}
	public String getNursePassword() {
		return nursePassword;
	}
	public void setNursePassword(String nursePassword) {
		this.nursePassword = nursePassword;
	}
	
	
	
	
	
	

}
