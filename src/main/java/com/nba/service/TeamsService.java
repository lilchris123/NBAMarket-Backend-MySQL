package com.nba.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nba.model.Team;
import com.nba.repository.TeamsRepository;


@Service
public class TeamsService {
	
	@Autowired
	TeamsRepository teamRepository;
	
	public List<Team> getAllTeams(){
		List<Team> teams=new ArrayList<Team>();
		teamRepository.findAll().forEach(teams::add);
		return teams;
	}
	
	public Team getTeam(String name) {
		return teamRepository.findByName(name);
	}
	
	

}
