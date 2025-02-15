package com.joni.Gamelist.dto;

import com.joni.Gamelist.entities.GameList;

public class GameListDTO {
	Long id;
	String name;

	public GameListDTO() {

	}

	public GameListDTO(GameList entity) {

		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
