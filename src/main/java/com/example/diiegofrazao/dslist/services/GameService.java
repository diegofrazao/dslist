package com.example.diiegofrazao.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.diiegofrazao.dslist.dto.GameMinDTO;
import com.example.diiegofrazao.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		return gameRepository.findAll().stream().map(game -> new GameMinDTO(game)).toList();
	}

}
