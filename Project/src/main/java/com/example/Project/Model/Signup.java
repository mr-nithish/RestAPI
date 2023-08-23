package com.example.Project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "signup")
public class Signup {
	
	private String username;
	@Id
	private String email;
	private long mobileno;
	private String password;
	private String adderess;
	private String role;
	
	public Signup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Signup(String username, String email, long mobileno, String password, String adderess, String role) {
		super();
		this.username = username;
		this.email = email;
		this.mobileno = mobileno;
		this.password = password;
		this.adderess = adderess;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdderess() {
		return adderess;
	}

	public void setAdderess(String adderess) {
		this.adderess = adderess;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
