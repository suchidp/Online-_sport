package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.cybage.dao.Playersubscriptiondao;
import com.cybage.model.Playersubscription;



@Service
public class Playersubscriptionservice {
	
	
	@Autowired
	Playersubscriptiondao playersubscriptiondao;
	
	public String addPlayersubscription(Playersubscription playersubscription) {
		Playersubscription addPlayersubscription =playersubscriptiondao.save(playersubscription);
		return addPlayersubscription.getPlayersubscription_id()
				+",sucessfully added with id : "
				 +addPlayersubscription.getPlayersubscription_id();
	}
	public List<Playersubscription> getPlayersubscription() {
		return  playersubscriptiondao.findAll();
	}
	public List<Playersubscription> findBysportId(int sport_id) {
		// TODO Auto-generated method stub
		return playersubscriptiondao.findBysportId(sport_id);
	}
public Playersubscription getPlayersubscriptionById(int id) {
		
		return playersubscriptiondao.findById(id).get();
	}
public List<Playersubscription> findBybatchtId(int batch_id) {
	// TODO Auto-generated method stub
	return playersubscriptiondao.findBybatchtId(batch_id);
	
	
	
	
	
	
}
}
