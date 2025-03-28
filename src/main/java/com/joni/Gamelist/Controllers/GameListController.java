package com.joni.Gamelist.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joni.Gamelist.Services.GameListService;
import com.joni.Gamelist.Services.GameService;
import com.joni.Gamelist.dto.GameListDTO;
import com.joni.Gamelist.dto.GameMinDTO;
import com.joni.Gamelist.dto.ReplacementDTO;

@RestController
@RequestMapping("/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;

	@Autowired
	private GameService gameservice;

	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}

	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId) {
	    System.out.println("Recebendo listId: " + listId);
	    List<GameMinDTO> result = gameservice.findByList(listId);
	    return result;
	}
	
	@PostMapping(value = "/{listId}/replacement")
	public void  move(@PathVariable Long listId,@RequestBody ReplacementDTO body) {
	    List<GameMinDTO> result = gameservice.findByList(listId);
	    gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
	}

}
