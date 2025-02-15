package com.joni.Gamelist.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joni.Gamelist.entities.Game;
import com.joni.Gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
