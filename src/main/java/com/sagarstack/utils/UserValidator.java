package com.sagarstack.utils;

import com.sagarstack.dtos.UserRequestDTO;

public class UserValidator {

	
	public static boolean validate(UserRequestDTO body) {
		if(body.getAddress()==null || body.getAddress().isEmpty()) {
			return false;
		}
		if(body.getEmail()==null || body.getEmail().isEmpty()) {
			return false;
		}
		
		if(body.getName()==null || body.getName().isEmpty()) {
			return false;
		}
		
		return true;
	}
}
