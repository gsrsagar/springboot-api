package com.sagarstack.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.sagarstack.dtos.UserRequestDTO;
import com.sagarstack.entities.User;
import com.sagarstack.repositories.UserRepository;


@Service
@Primary
public class UserService  implements IUserService{

	
	
	@Autowired
	private UserRepository repo;
	
	
	@Override
	public User addUser(User body) {
		return this.repo.saveAndFlush(body);
	}

	@Override
	public boolean deleteUser(Long id) throws Exception {
		Optional<User> user = this.repo.findById(id);
		if(user.get()!=null) {
			this.repo.deleteById(id);
			return true;
		} else {
			 throw new Exception("No user found with id"+":"+id);
		}
	}
	
	@Override
	public User getById(Long id) throws Exception {
		Optional<User> user = this.repo.findById(id);
		if(user.get()!=null) {
			return user.get();
		} else {
			 throw new Exception("No user found with id"+":"+id);
		}
	}
	
	public List<User> getAllUsers(){
		return this.repo.findAll();
	}

	@Override
	public User updateUser(Long id, User body) throws Exception {
		Optional<User> user = this.repo.findById(id);
		if(user.get()!=null) {
			User respUser = user.get();
			respUser.setAddress(body.getAddress());
			respUser.setEmail(body.getEmail());
			respUser.setName(body.getName());
			respUser.setId(id);
			
			this.repo.saveAndFlush(respUser);
			return respUser;
		} else {
			 throw new Exception("No user found with id"+":"+id);
		}
	}

	
}
