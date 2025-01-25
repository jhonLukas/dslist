package com.joni.Gamelist.entities;

import java.util.Objects;

import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="tb_game") 
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(name = "game_Year")
	private Integer year;
	private String genre;
	private String plataform;
	private String imgUrl;
	private String shortDescription;
	private String LongDescription;

	public Game() {

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

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlataform() {
		return plataform;
	}

	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return LongDescription;
	}

	public void setLongDescription(String longDescription) {
		LongDescription = longDescription;
	}

	public Game(Long id, String name, Integer year, String genre, String plataform, String imgUrl,
			String shortDescription, String longDescription) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.genre = genre;
		this.plataform = plataform;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		LongDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}

}
