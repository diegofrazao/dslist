package com.example.diiegofrazao.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.diiegofrazao.dslist.dto.GameDTO;
import com.example.diiegofrazao.dslist.dto.GameMinDTO;
import com.example.diiegofrazao.dslist.entities.Game;
import com.example.diiegofrazao.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game game = gameRepository.findById(id).get();
		return new GameDTO(game);
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		return gameRepository.findAll()
				.stream()
				.map(game -> new GameMinDTO(game))
				.toList();
	}

}
