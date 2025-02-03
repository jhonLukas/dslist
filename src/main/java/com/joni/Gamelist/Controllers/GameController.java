package com.joni.Gamelist.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joni.Gamelist.Services.GameService;
import com.joni.Gamelist.dto.GameMinDTO;
import com.joni.Gamelist.entities.Game;

@RestController
@RequestMapping("/games") // Correção aqui
public class GameController {
    
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
    	  List<GameMinDTO> result = gameService.findAll();
    	  return result;
    }
}
