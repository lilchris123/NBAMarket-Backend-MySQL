package com.nba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nba.model.Team;
import com.nba.service.TeamsService;

@RestController
public class TeamsController {
	
	@Autowired
	TeamsService teamService;
	
	@GetMapping("/api/teams")
	public List<Team>  getAllTeams() {
		return 	teamService.getAllTeams();
	}
	
	@GetMapping("/api/teams/{name}")
	public Team  getTeam(@PathVariable String name) {
		return teamService.getTeam(name);
	}

}
