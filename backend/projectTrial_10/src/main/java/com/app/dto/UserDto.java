package com.app.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;//JPA : Java EE specs

import com.app.pojos.Role;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

//user : one , parent , inverse : since DOES NOT FK


public class UserDto{
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String mobNo;
	
	private String password;
	
//	private Role userRole;
	
	private AadharCardDto aadharCardDto;


	public UserDto() {
		// TODO Auto-generated constructor stub
	}
	
	public UserDto(String firstName, String lastName, String email, String mobNo, String password, 
			AadharCardDto aadharCardDto) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobNo = mobNo;
		this.password = password;
		this.aadharCardDto = aadharCardDto;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobNo() {
		return mobNo;
	}


	


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


//	public Role getUserRole() {
//		return userRole;
//	}


//	public void setUserRole(Role userRole) {
//		this.userRole = Role.CUSTOMER;
//	}


	public AadharCardDto getAadharCardDto() {
		return aadharCardDto;
	}


	public void setAadharCardDto(AadharCardDto aadharCardDto) {
		this.aadharCardDto = aadharCardDto;
	}


	@Override
	public String toString() {
		return "UserDto [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobNo=" + mobNo
				+ ", password=" + password +  "]";
	}


	




	
}
