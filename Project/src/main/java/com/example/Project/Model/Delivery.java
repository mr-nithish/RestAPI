package com.example.Project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Delivery {
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private int packageid;
	private String location;
	private String packstatus;
	
	public Delivery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Delivery(int packageid, String location, String packstatus) {
		super();
		this.packageid = packageid;
		this.location = location;
		this.packstatus = packstatus;
	}

	public int getPackageid() {
		return packageid;
	}

	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPackstatus() {
		return packstatus;
	}

	public void setPackstatus(String packstatus) {
		this.packstatus = packstatus;
	}
	
	
}
