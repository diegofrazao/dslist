package com.example.diiegofrazao.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.diiegofrazao.dslist.dto.GameListDTO;
import com.example.diiegofrazao.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;

//	@GetMapping(value = "/{id}")
//	public GameDTO findById(@PathVariable Long id) {
//		return gameListService.findById(id);
//	}

	@GetMapping
	public List<GameListDTO> findAll() {
		return gameListService.findAll();
	}

}
