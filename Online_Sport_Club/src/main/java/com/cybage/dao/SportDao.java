package com.cybage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cybage.model.Sport;



public interface SportDao extends JpaRepository<Sport, Integer> {
	@Query("select u from Sport u")
	List<Sport> getSportList();
   
	
	/*
	@Query("SELECT p FROM Sport p WHERE CONCAT(p.name ,p.description) LIKE %?1%")
	List<Sport> search(String keyword);*/
}
