package com.form.details.entity;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Login {

	@NotBlank(message = "username cannot be empty")
	@Size(min = 3, max = 20, message = "username must be between 3-20 characters")
	private String username;
	
	@NotBlank(message = "1.Password must contain at least one digit [0-9].\r\n"
			+ "2.Password must contain at least one lowercase Latin character [a-z].\r\n"
			+ "3.Password must contain at least one uppercase Latin character [A-Z].\r\n"
			+ "4.Password must contain at least one special character like ! @ # & ( ).\r\n"
			+ "5.Password must contain a length of at least 8 characters and a maximum of 20 characters.")
	@Pattern(regexp = 
			  "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")
	private String password;
	
	@AssertTrue(message = "must agree terms and conditions")
	private boolean agreed;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	
	
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}

	
	
}
