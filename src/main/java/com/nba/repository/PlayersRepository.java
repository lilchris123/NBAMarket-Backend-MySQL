package com.nba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nba.model.Player;

@Repository
public interface PlayersRepository extends JpaRepository<Player,Integer>{
	public List<Player> findByTeamName(String teamName);
}
