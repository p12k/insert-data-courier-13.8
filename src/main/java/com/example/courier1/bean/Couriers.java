package com.example.courier1.bean;

//package com.bookmyshow.BookMyshow.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courier")
public class Couriers {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;  
	private String mobile;
	public Couriers()
	{
		
	}
	
	
	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id =id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
}
