package com.dslitintensivao.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dslitintensivao.dslist.dto.GameListDTO;
import com.dslitintensivao.dslist.entities.GameList;
import com.dslitintensivao.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		
		List<GameList> result = repository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
