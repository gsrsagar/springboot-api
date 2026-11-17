package com.sagarstack.dtos;

import java.util.List;

import com.sagarstack.entities.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

	
	private List<User> users;
	private String status;
	private int statusCode;
	private String errorMessage;
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserResponse(List<User> users, String status, int statusCode, String errorMessage) {
		super();
		this.users = users;
		this.status = status;
		this.statusCode = statusCode;
		this.errorMessage = errorMessage;
	}
	
	
	
	
}
