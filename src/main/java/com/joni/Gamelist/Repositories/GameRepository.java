package com.joni.Gamelist.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joni.Gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

}
