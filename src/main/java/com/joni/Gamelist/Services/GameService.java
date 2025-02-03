package com.joni.Gamelist.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joni.Gamelist.Repositories.GameRepository;
import com.joni.Gamelist.dto.GameMinDTO;
import com.joni.Gamelist.entities.Game;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;  

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
