package com.nba.mapper;

import org.springframework.stereotype.Component;

import com.nba.dto.NbaDto;
import com.nba.model.Player;

@Component
public class NbaMapper {
	public Player toEntity(NbaDto dto) {
		Player nba= new Player();
		nba.setId(dto.getId());
		nba.setFirst_name(dto.getFirst_name());
		nba.setLast_name(dto.getLast_name());
		nba.setTeam_name(dto.getTeam_name());
		nba.setPosition(dto.getPosition());
		nba.setOverall(dto.getOverall());
		
		return nba;
	}
	
	public NbaDto toDto(Player entity) {
		NbaDto dto =new NbaDto();
		dto.setId(entity.getId());
		dto.setFirst_name(entity.getFirst_name());
		dto.setLast_name(entity.getLast_name());
		dto.setTeam_name(entity.getTeam_name());
		dto.setPosition(entity.getPosition());
		dto.setOverall(entity.getOverall());
		return dto;
	}

}
