package com.joni.Gamelist.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joni.Gamelist.Repositories.GameRepository;
import com.joni.Gamelist.dto.GameDTO;
import com.joni.Gamelist.dto.GameMinDTO;
import com.joni.Gamelist.entities.Game;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public GameDTO findByid(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);

	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
