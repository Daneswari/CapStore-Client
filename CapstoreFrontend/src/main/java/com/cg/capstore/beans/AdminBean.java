package com.cg.capstore.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class AdminBean {

	private String emailId;

	private String password;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminBean [emailId=" + emailId + ", Password=" + password + "]";
	}

	public AdminBean(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

	public AdminBean() {
		super();

	}

}