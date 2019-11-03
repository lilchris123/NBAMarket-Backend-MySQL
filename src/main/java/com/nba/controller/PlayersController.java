package com.nba.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.nba.dto.NbaDto;
import com.nba.model.Player;
import com.nba.service.PlayersService;

@RestController
public class PlayersController {
	
	private final PlayersService playersService;
	
	public PlayersController(PlayersService nbaService) {
		this.playersService = nbaService;
	}
	
	
	@GetMapping("/api/players")
	public List<NbaDto> getAll(){
		return playersService.findAll();
	}
	
	@GetMapping("/api/players/{id}")
	public ResponseEntity<NbaDto> get(@PathVariable int id) {
		NbaDto nba= playersService.findOne(id);
		return ResponseEntity.ok(nba);
	}
	
	@PostMapping("/api/players")
	public ResponseEntity<NbaDto> create(@RequestBody @Valid NbaDto nba) throws URISyntaxException {
		NbaDto result= playersService.save(nba);
		return ResponseEntity.created(new URI("/api/players" +result.getId())).body(nba);
	}
	
	@PutMapping("/api/players")
	public ResponseEntity<NbaDto> update(@RequestBody @Valid NbaDto nba) {
		NbaDto result= playersService.update(nba);
		return ResponseEntity.ok().body(result);
	}
	
	@DeleteMapping("/api/players")
	public ResponseEntity<NbaDto> delete(@PathVariable int id) {
		playersService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/api/teams/{team_name}/players")
	public List<Player> getAllTeamPlayers(@PathVariable String team_name){
		return playersService.getTeamPlayers(team_name);
	}

}
