package com.projetogames.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetogames.games.entities.Game;

// acesso a dados, consulta banco de dados
public interface GameRepository extends JpaRepository<Game, Long>{
	
}
