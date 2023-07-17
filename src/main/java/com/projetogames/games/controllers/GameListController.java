package com.projetogames.games.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetogames.games.dto.GameListDTO;
import com.projetogames.games.dto.GameMinDTO;
import com.projetogames.games.services.GameListService;
import com.projetogames.games.services.GameService;

// porta de entrada do backend, disponibiliza a api

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gamelistservice;
	
	@Autowired
	private GameService gameservice;
	
	@GetMapping //mapeando com verbo http GET/buscar
	public List<GameListDTO> findALL(){
		return gamelistservice.findALL();
		
	}
	
	@GetMapping(value = "/{listid}/games") 
	public List<GameMinDTO> findByList(@PathVariable Long listid){
		List<GameMinDTO> result = gameservice.findByList(listid);
		return result;
	}
}
