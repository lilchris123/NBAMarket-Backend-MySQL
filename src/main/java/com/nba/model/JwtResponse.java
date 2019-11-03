package com.nba.model;

import java.io.Serializable;


public class JwtResponse implements Serializable{

	private static final long serialVersionUID = -8091879091924046844L;
	private User user;
	private final String jwttoken;
	
	public JwtResponse(String jwttoken,User user) {
		this.user= user;
		this.jwttoken = jwttoken;

	}
	
	public String getToken() {
		return this.jwttoken;
	}

	public User getUser() {
		return user;
	}

}
