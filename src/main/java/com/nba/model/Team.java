package com.nba.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "teams")
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String location;
	
	private int offensiveRating;
	private int defensiveRating;
	private int overallRating;
	
	@OneToMany(mappedBy="team")
	private List<Player> players;
	
	public Team() {};
	public Team(int id, String name, String location, int offensiveRating, int defensiveRating, int overallRating) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.offensiveRating = offensiveRating;
		this.defensiveRating = defensiveRating;
		this.overallRating = overallRating;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getOffensiveRating() {
		return offensiveRating;
	}
	public void setOffensiveRating(int offensiveRating) {
		this.offensiveRating = offensiveRating;
	}
	public int getDefensiveRating() {
		return defensiveRating;
	}
	public void setDefensiveRating(int defensiveRating) {
		this.defensiveRating = defensiveRating;
	}
	public int getOverallRating() {
		return overallRating;
	}
	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	

}
