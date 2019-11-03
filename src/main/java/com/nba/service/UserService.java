package com.nba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nba.model.User;
import com.nba.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public User getUser(String username){
		return userRepository.findByUsername(username);
	}
	
	public void createUser(User user){
		userRepository.save(user);
	}

	public void deleteUser(int id) {
		userRepository.deleteById(id);
		
	}
}
