package com.nba.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.nba.dto.UserDTO;
import com.nba.model.User;
import com.nba.repository.UserRepository;

@Service
public class JwtUserDetailsService  implements UserDetailsService{
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				new ArrayList<>());
		 
	}
	public User save(UserDTO user) {
		User newUser = new User();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setFirst_name(user.getFirst_name());
		newUser.setLast_name(user.getLast_name());
		newUser.setRole(user.getRole());
		return userRepository.save(newUser);
	}
	
}
