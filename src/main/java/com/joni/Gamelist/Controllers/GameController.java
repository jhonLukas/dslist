package com.joni.Gamelist.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joni.Gamelist.Services.GameService;
import com.joni.Gamelist.dto.GameDTO;
import com.joni.Gamelist.dto.GameMinDTO;

@RestController
@RequestMapping("/games") 
public class GameController {
    
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
    	  List<GameMinDTO> result = gameService.findAll();
    	  return result;
    }

    @GetMapping(value ="/{id}" )
    public GameDTO findByid(@PathVariable Long id) {
    	  GameDTO result = gameService.findByid(id);
    	  return result;
    }
}
