package com.cybage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cybage.model.Admin;




@Repository
public interface AdminDao extends JpaRepository<Admin, Integer>{
	@Query("select a from Admin a where a.email =:email and a.password =:password")
   	

	Admin findByEmailandPassword(String email, String password);
}
