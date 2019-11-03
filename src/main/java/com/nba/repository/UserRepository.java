package com.nba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nba.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
		User findByUsername(String username);
}
