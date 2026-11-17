package com.sagarstack.entities;

import jakarta.persistence.Entity; //JPA -> Hibernate 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users_Table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // table 
	
	
	private String name;
	private String email;
	private String address;
	
	
	public User(Long id, String name, String email, String addres) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = addres;
	}
	
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
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
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
