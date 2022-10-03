package com.cybage.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.ManagerDao;
import com.cybage.dao.Manager_subscriptiondao;
import com.cybage.dao.Playersubscriptiondao;
import com.cybage.dao.SportDao;
import com.cybage.model.Batches;
import com.cybage.model.Enrollmentstatus;
import com.cybage.model.Manager;
import com.cybage.model.Manager_subscription;
import com.cybage.model.Playersubscription;
import com.cybage.model.Sport;

@Service
public class Manager_subscriptionservice {
	@Autowired
	Manager_subscriptiondao  manager_subscriptiondao;
	
	@Autowired
	ManagerDao managerdao;
	@Autowired
	SportDao sportdao;
	@Autowired
	Playersubscriptiondao playersubscriptiondao;

	
/*	
	
	public  Manager_subscription save(Manager_subscription manager_subscription , Sport sport, Manager manager, Batches batches) {
		manager_subscription.setManagersubscription_id(managersubscription_id);
		manager_subscription.setBatches(batches);
		
		manager_subscription.setSport(sport);
      
        
        return  manager_subscriptiondao.save(manager_subscription);
    }
	
	
	
	
	
	
	
	


	public List<Playersubscription> findPendingsubscriptionByPlayersubscription_id(int playersubscription_id) {
		// TODO Auto-generated method stub
		return  manager_subscriptiondao.findPendingsubscriptionByPlayersubscription_id(playersubscription_id);
	}


	public List<Playersubscription> findNewsubscriptionByPlayersubscription_id(int playersubscription_id) {
		// TODO Auto-generated method stub
		return  manager_subscriptiondao.findNewsubscriptionByPlayersubscription_id(playersubscription_id);
	}

	public Object acceptSubscription(int playersubscription_id) {
		// TODO Auto-generated method stub
		Playersubscription playersubscription = playersubscriptiondao.findById(playersubscription_id).get();
		if(Playersubscription.getEnrollmentstatus().equals(Enrollmentstatus.APPLIED)) {
			Playersubscription.setEnrollmentstatus(Enrollmentstatus.INPROGRESS);
			playersubscriptiondao.save(playersubscription);
		


	
	*/
}
