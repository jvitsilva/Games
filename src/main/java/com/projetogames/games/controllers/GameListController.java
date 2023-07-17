package com.projetogames.games.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetogames.games.dto.GameListDTO;
import com.projetogames.games.services.GameListService;

// porta de entrada do backend, disponibiliza a api

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gamelistservice;
	
	@GetMapping //mapeando com verbo http GET/buscar
	public List<GameListDTO> findALL(){
		return gamelistservice.findALL();
		
	}
}
