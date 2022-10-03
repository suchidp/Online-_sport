package com.cybage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cybage.model.Batches;
import com.cybage.model.Playersubscription;
import com.cybage.model.Sport;



public interface Playersubscriptiondao  extends JpaRepository< Playersubscription, Integer > {
	//@Query("select a from playersubscription a where a.playersubscription_id=:playersubscription_id")
	//Playersubscription getPlayersubscriptionById(int playersubscription_id);
	@Query(value="select * from playersubscription c join sport r on c.sport_id=:sport_id and r.sport_id=:sport_id",nativeQuery = true)
	List<Playersubscription> findBysportId(int sport_id);
	
	
	@Query(value="select * from playersubscription c join batches r on c.batch_id=:batch_id and r.batch__id=:batch_id",nativeQuery = true)
List<Playersubscription> findBybatchtId(int batch_id);
	
	//@Query("select u from playersubscription u")
	//List<Playersubscription> getPlayersubscription();
	
	
	@Query(value ="select * from playersubscription where playersubscription_id =:playersubscription_id and status=0",nativeQuery = true)
	List<Playersubscription> findNewsubscriptionByPlayersubscription_id(int playersubscription_id);

	
	@Query(value ="select * from playersubscriptiont where playersubscription_id =:playersubscription_id and status=1 or status=2",nativeQuery=true)
	List<Playersubscription> findPendingsubscriptionByPlayersubscription_id(int playersubscription_id);
	

	@Modifying
	@Query(value ="select * from playersubscriptiont where playersubscription_id =:playersubscription_id and status=1 ",nativeQuery=true)
	List<Playersubscription> findCompletesubscriptionByPlayersubscription_id(@Param("playersubscription_id ")int playersubscription_id );
}
