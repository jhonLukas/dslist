package com.joni.Gamelist.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joni.Gamelist.Repositories.GameListRepository;
import com.joni.Gamelist.Repositories.GameRepository;
import com.joni.Gamelist.dto.GameListDTO;
import com.joni.Gamelist.entities.GameList;
import com.joni.Gamelist.projections.GameMinProjection;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
@Transactional
	public void move(Long listid, int sourceIndex, int destinationIndex) {
		List<GameMinProjection> list = gameRepository.searchByList(listid);

		GameMinProjection obj = list.remove(sourceIndex);

		list.add(destinationIndex, obj);

		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;

		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		for (int i = min; i >= max; i++) {
			gameListRepository.updateBelongingPosition(listid, list.get(i).getId(), i);
		}
	}

}
