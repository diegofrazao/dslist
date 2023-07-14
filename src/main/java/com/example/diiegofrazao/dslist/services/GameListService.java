package com.example.diiegofrazao.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.diiegofrazao.dslist.dto.GameListDTO;
import com.example.diiegofrazao.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
//	@Transactional(readOnly = true)
//	public GameListDTO findById(Long id) {
//		Game game = gameRepository.findById(id).get();
//		return new GameDTO(game);
//	}

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		return gameListRepository.findAll()
				.stream()
				.map(gameList -> new GameListDTO(gameList))
				.toList();
	}

}
