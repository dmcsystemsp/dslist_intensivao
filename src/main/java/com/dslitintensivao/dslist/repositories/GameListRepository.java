package com.dslitintensivao.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dslitintensivao.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
