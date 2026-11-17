package com.sagarstack.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagarstack.constants.AllHTTPMessages;
import com.sagarstack.dtos.UserRequestDTO;
import com.sagarstack.dtos.UserResponse;
import com.sagarstack.entities.User;
import com.sagarstack.services.IUserService;
import com.sagarstack.utils.UserValidator;


@RestController
@RequestMapping("api/users")
public class UserController {

	
	
	@Autowired
	private IUserService service;
	
	
	
	@GetMapping("/getall")
	public ResponseEntity<UserResponse> getUsers() {
		 UserResponse response = new UserResponse();
	    try {
	        List<User> users = this.service.getAllUsers();
	        
	       
	        response.setUsers(users);
	        response.setStatus(AllHTTPMessages.SUCCESS_200_OK);
	        response.setStatusCode(200);
	       
	        return ResponseEntity
	                .status(HttpStatus.OK)
	                .body(response);

	    } catch (Exception e) {
	        e.printStackTrace();
	        String error = e.getMessage();
	        response.setErrorMessage(error);
	        return ResponseEntity
	                .status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body(response);
	    }
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<UserResponse> deleteById(@PathVariable Long id){
		UserResponse resp = new UserResponse();
		if(id>0) {
			try {
				boolean isDeleted = this.service.deleteUser(id);
				if(isDeleted ==true) {
					resp.setStatusCode(AllHTTPMessages.SUCCESS_200_CODE);
					resp.setStatus(AllHTTPMessages.SUCCESS_200_OK);	
				}
				else {
					resp.setStatusCode(AllHTTPMessages.NOT_FOUND_404_CODE);
					resp.setStatus(AllHTTPMessages.CLIENT_ERROR_404_NOT_FOUND);	
				}
				
				return ResponseEntity.status(HttpStatus.OK).body(resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				resp.setErrorMessage(e.getMessage());
				resp.setStatusCode(AllHTTPMessages.NOT_FOUND_404_CODE);
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resp);
				
			}
		} else {
			resp.setErrorMessage("Invalid Id"+": "+id+" "+"No data found for this ");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(resp);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserResponse> getUserById(@PathVariable Long id){
		UserResponse resp = new UserResponse();
		if(id>0) {
			try {
				User u = this.service.getById(id);
				List<User> users = new ArrayList<>();
				users.add(u);
				resp.setUsers(users);
				resp.setStatus(AllHTTPMessages.SUCCESS_200_OK);
				resp.setStatusCode(AllHTTPMessages.SUCCESS_200_CODE);	
				return ResponseEntity.status(HttpStatus.OK).body(resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				resp.setErrorMessage(e.getMessage());
				resp.setStatusCode(AllHTTPMessages.NOT_FOUND_404_CODE);
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resp);
				
			}
		} else {
			resp.setErrorMessage("Invalid Id"+": "+id+" "+"No data found for this ");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(resp);
		}
	}
	
	@PostMapping
	public  ResponseEntity<UserResponse> createUser(@RequestBody UserRequestDTO user) {
		boolean isValidated = UserValidator.validate(user);
		System.out.println(user.getAddress());
		User u = new User();
		u.setAddress(user.getAddress());
		u.setEmail(user.getEmail());
		u.setName(user.getName());
		
		UserResponse response = new UserResponse();
		if(isValidated) {
			User userResp =  this.service.addUser(u);
			List<User> users = new ArrayList<>();
			users.add(userResp);
			response.setUsers(users);
			response.setStatus(AllHTTPMessages.SUCCESS_200_OK);
			response.setStatusCode(200);
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		} else {
			response.setErrorMessage("bad request or the user body data which you provied is wrong");
			response.setStatusCode(400);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		}
		
	}
	
	@PutMapping("/{id}")
	public  ResponseEntity<UserResponse> updateUser(@RequestBody UserRequestDTO user, @PathVariable Long id) {
		boolean isValidated = UserValidator.validate(user);
		System.out.println(user.getAddress());
		User u = new User();
		u.setAddress(user.getAddress());
		u.setEmail(user.getEmail());
		u.setName(user.getName());
		
		UserResponse response = new UserResponse();
		
		if(isValidated && id>0) {
			User userResp;
			try {
				userResp = this.service.updateUser(id,u);
				List<User> users = new ArrayList<>();
				users.add(userResp);
				response.setUsers(users);
				response.setStatus(AllHTTPMessages.SUCCESS_202_ACCEPTED);
				response.setStatusCode(AllHTTPMessages.ACCEPTED_202_CODE);
				return ResponseEntity.status(HttpStatus.CREATED).body(response);
			} catch (Exception e) {
				
				// TODO Auto-generated catch block
				response.setErrorMessage(e.getMessage());
				response.setStatusCode(AllHTTPMessages.NOT_FOUND_404_CODE);
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
			}
			
		} else {
			response.setErrorMessage("bad request or the user body data which you provied is wrong");
			response.setStatusCode(400);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		}
		
	}
}
