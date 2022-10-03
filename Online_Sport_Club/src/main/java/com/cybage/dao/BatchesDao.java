package com.cybage.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cybage.model.Batches;



public interface BatchesDao extends JpaRepository<Batches, Integer>{
	@Transactional
	@Modifying
	@Query("select a from Batches a where a.batch_id=:batch_id")
	Batches getBatchesById(int batch_id);

	@Query(value="select * from batches c join manager r on c.manager_id=:manager_id and r.manager_id=:manager_id",nativeQuery = true)
List<Batches> findBymanagerId(int manager_id);
	
	
	
	@Query("select u from Batches u")
	List<Batches> getBatches();

	
}
