package com.cybage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cybage.model.Manager;


public interface ManagerDao extends JpaRepository<Manager, Integer>{

	
	
	
	
	  
	
/*
	
	@Query("select a from manager a where a.manager_id=:manager_id")
        Manager getManagerById(int manager_id);
	
	/*
	@Query("select a from manager a ")
       List<Manager> getManager(int manager_id);


/*
	@Query("select a from manager a where a.email =:email and a.password =:password")
	Manager findManagerByEmailAndPassword(String email, String password);
	/*
	
	@Query(value ="select * from complaint where owner_id =:ownerId and status=0",nativeQuery = true)
	List<Order> findNewComplaintByOwnerId(int ownerId);
//	public List<Complaint> findByUser(User user);
	
	@Query(value ="select * from complaint where owner_id =:ownerId and status=1 or status=2",nativeQuery=true)
	List<Order> findPendingComplaintByOwnerId(int ownerId);
	

	@Modifying
	@Query(value ="select * from complaint where owner_id =:ownerId and status=3 or status=4",nativeQuery = true)
	List<Order> findCompleteOrderByUserId(@Param("ownerId")int ownerId);
	*/
}
