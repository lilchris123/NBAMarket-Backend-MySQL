package com.nba.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "players")
public class Player implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name ="id")
	private int id;
	
	private String first_name;
	private String last_name;
	private String team_name;
	private String position;
	private int overall;
	
	@ManyToOne
	@JoinColumn(name="Team_id")
	private Team team;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team) {
		this.team_name = team;
	}
	public int getOverall() {
		return overall;
	}
	public void setOverall(int overall) {
		this.overall = overall;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	

	
}
