package com.projetogames.games.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetogames.games.dto.GameMinDTO;
import com.projetogames.games.services.GameService;

// porta de entrada do backend, disponibiliza a api

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameservice;
	
	@GetMapping //mapeando com verbo http GET/buscar
	public List<GameMinDTO> findALL(){
		List<GameMinDTO> result = gameservice.findALL();
		return result;
	}
}
