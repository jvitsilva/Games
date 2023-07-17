package com.projetogames.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.projetogames.games.dto.GameListDTO;
import com.projetogames.games.entities.GameList;
import com.projetogames.games.repositories.GameListRepository;


@Service // camdada de serviço
public class GameListService {
	
	@Autowired
	private GameListRepository gamelistrepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findALL(){
		List<GameList> result = gamelistrepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
		 
	}
	
	
	
}
