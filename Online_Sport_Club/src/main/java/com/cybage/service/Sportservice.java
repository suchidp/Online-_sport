package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.SportDao;
import com.cybage.model.Sport;

@Service
public class Sportservice {
	
	
	@Autowired
	SportDao sportdao;
	
	public String saveSport(Sport sport) {
		Sport sportdetails = sportdao.save(sport);
		return sportdetails.getSportname()
				+", successfully registered";}
	
	
	public Sport updateSportDetails(Sport sport,int sport_id) {
		
		Sport sport1=sportdao.findById(sport_id).get();
		
		
		sport1.setSportname(sport1.getSportname());
		


		Sport sportdetails = sportdao.save(sport1);
		return sportdetails;
	}
	
	public Sport getSportById(int id) {
		
		return sportdao.findById(id).get();
	}

	
	public String deleteSportDetails(int sport_id) {
		
		sportdao.deleteById(sport_id);
		return "Sport details deleted successfully with id : "+sport_id;
	}


	public List<Sport> getall() {
		// TODO Auto-generated method stub
		return sportdao.findAll();
	}
/*
	 public List<Sport> findbyTitle(String keyword) {
	        if (keyword != null) {
	            return sportdao.search(keyword);
	        }
	        return sportdao.findAll();
	    }*/
public List<Sport> getSportList()
{
   return sportdao.getSportList();
}
}
