package com.dslitintensivao.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dslitintensivao.dslist.dto.GameListDTO;
import com.dslitintensivao.dslist.dto.GameMinDTO;
import com.dslitintensivao.dslist.services.GameListService;
import com.dslitintensivao.dslist.services.GameService;

@RestController
@RequestMapping(value ="/lists")
public class GameListController {
	
	@Autowired 
	private GameListService service;
	
	@Autowired 
	private GameService gameService;
	@GetMapping
	public List<GameListDTO> findAll(){
		
		List<GameListDTO> result = service.findAll();
		return result;
		
	}
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
		
	}

}
