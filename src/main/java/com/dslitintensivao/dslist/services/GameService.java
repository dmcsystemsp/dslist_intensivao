package com.dslitintensivao.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dslitintensivao.dslist.dto.GameDTO;
import com.dslitintensivao.dslist.dto.GameMinDTO;
import com.dslitintensivao.dslist.entities.Game;
import com.dslitintensivao.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		
		Game result = repository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		
		List<Game> result = repository.findAll();
		
		//List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	

}
