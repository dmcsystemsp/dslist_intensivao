package com.dslitintensivao.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dslitintensivao.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
