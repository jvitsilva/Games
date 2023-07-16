package com.projetogames.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetogames.games.dto.GameMinDTO;
import com.projetogames.games.entities.Game;
import com.projetogames.games.repositories.GameRepository;


@Service // camdada de serviço
public class GameService {
	
	@Autowired
	private GameRepository gamerepository;
	
	public List<GameMinDTO> findALL(){
		List<Game> result = gamerepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	
}
