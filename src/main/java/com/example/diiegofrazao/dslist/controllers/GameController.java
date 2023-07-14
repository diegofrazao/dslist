package com.example.diiegofrazao.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.diiegofrazao.dslist.dto.GameDTO;
import com.example.diiegofrazao.dslist.dto.GameMinDTO;
import com.example.diiegofrazao.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;

	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		return gameService.findById(id);
	}

	@GetMapping
	public List<GameMinDTO> findAll() {
		return gameService.findAll();
	}

}
