package com.cybage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cybage.model.Manager;
import com.cybage.model.Player;

public interface PlayersDao extends JpaRepository<Player, Integer>{
	@Query("select a from players a where a.email =:email and a.password =:password")
	Player findPlayerByEmailAndPassword(String email, String password);
}
