package com.projetogames.games.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetogames.games.dto.GameDTO;
import com.projetogames.games.dto.GameMinDTO;
import com.projetogames.games.services.GameService;

// porta de entrada do backend, disponibiliza a api

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameservice;
	
	@GetMapping(value = "/{id}") //mapeando com verbo http GET/buscar
	public GameDTO findbyid(@PathVariable Long id){
		GameDTO result = gameservice.findbyid(id);
		return result;
	} //endpoint: serve para buscar cada jogo pelo seu id. ex: localhost:8090/games/2
	
	@GetMapping //mapeando com verbo http GET/buscar
	public List<GameMinDTO> findALL(){
		List<GameMinDTO> result = gameservice.findALL();
		return result;
	}
}
