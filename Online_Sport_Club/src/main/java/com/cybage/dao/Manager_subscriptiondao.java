package com.cybage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cybage.model.Batches;
import com.cybage.model.Manager;
import com.cybage.model.Manager_subscription;
import com.cybage.model.Playersubscription;
import com.cybage.model.Sport;

public interface Manager_subscriptiondao  extends JpaRepository<Manager_subscription, Integer>{
	@Query("select a from Batches a where a.batch_id=:batch_id")
	Batches getBatchesById(int batch_id);

	@Query(value="select * from batches c join manager r on c.manager_id=:manager_id and r.manager_id=:manager_id",nativeQuery = true)
List<Batches> findBymanagerId(int manager_id);
	
	
	
	
	//public Manager_subscription save(Manager_subscription manager_subscription , Sport sport, Manager manager, Batches batches);

	@Query(value ="select * from playersubscription where playersubscription_id =:playersubscription_id and status=0",nativeQuery = true)
	List<Playersubscription> findNewsubscriptionByPlayersubscription_id(int playersubscription_id);

	
	@Query(value ="select * from playersubscriptiont where playersubscription_id =:playersubscription_id and status=1 or status=2",nativeQuery=true)
	List<Playersubscription> findPendingsubscriptionByPlayersubscription_id(int playersubscription_id);
	

	@Modifying
	@Query(value ="select * from playersubscriptiont where playersubscription_id =:playersubscription_id and status=3 ",nativeQuery=true)
	List<Playersubscription> findCompletesubscriptionByPlayersubscription_id(@Param("playersubscription_id ")int playersubscription_id );
}
