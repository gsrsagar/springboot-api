package com.sagarstack.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.sagarstack.dtos.UserRequestDTO;
import com.sagarstack.entities.User;


@Service
public class UserService1  implements IUserService{

	
	
	@Override
	public User addUser(User body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public User getById(Long id) {
		return null;
	}
	
	public List<User> getAllUsers(){
		return new ArrayList<User>();
	}
	
	@Override
	public User updateUser(Long id, User body) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
