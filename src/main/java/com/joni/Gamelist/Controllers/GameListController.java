package com.joni.Gamelist.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joni.Gamelist.Services.GameListService;
import com.joni.Gamelist.dto.GameDTO;
import com.joni.Gamelist.dto.GameListDTO;

@RestController
@RequestMapping("/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;

	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}

}
