package com.nba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nba.model.Team;

@Repository
public interface TeamsRepository extends JpaRepository<Team, Integer> {
	
	public Team findByName(String name);
	//public List<Player> findByPlayerTeam(String teamName);
}
