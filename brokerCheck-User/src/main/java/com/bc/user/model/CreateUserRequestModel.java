package com.bc.user.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class CreateUserRequestModel {
	
	@NotNull(message="cannot be null")
	private String fistName;
	@NotNull(message="cannot be null")
	private String lastName;
	@NotNull(message="cannot be null")
	private String password;
	@NotNull(message="cannot be null")
	@Email
	private String email;
	
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
