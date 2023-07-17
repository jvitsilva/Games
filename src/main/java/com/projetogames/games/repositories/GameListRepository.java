package com.projetogames.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetogames.games.entities.GameList;

// acesso a dados, consulta banco de dados
public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
