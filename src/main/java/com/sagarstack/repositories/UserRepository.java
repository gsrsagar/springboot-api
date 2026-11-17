package com.sagarstack.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sagarstack.entities.User;

import jakarta.transaction.Transactional;


@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
	
	public User getById(Long id);
	public Optional<User> findById(Long id);
	public Optional<User> findByEmail(String email);
	public void deleteById(Long id);
	
	
}
