package com.nba.dto;

import javax.validation.constraints.NotNull;


public class NbaDto {
	@NotNull
	private int id;
	
	@NotNull
	private String first_name;
	
	@NotNull
	private String last_name;
	
	@NotNull
	private String team_name;
	
	@NotNull
	private String position;
	
	@NotNull
	private int overall;
	

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

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getOverall() {
		return overall;
	}

	public void setOverall(int overall) {
		this.overall = overall;
	}
	
	
}
