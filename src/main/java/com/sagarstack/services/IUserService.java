package com.sagarstack.services;

import java.util.List;

import com.sagarstack.dtos.UserRequestDTO;
import com.sagarstack.entities.User;

public interface IUserService {

	
	public User addUser(User body);
	public boolean deleteUser(Long id) throws Exception;
	public List<User> getAllUsers();
	public User getById(Long id) throws Exception;
	public User updateUser(Long id, User body) throws Exception;
}
