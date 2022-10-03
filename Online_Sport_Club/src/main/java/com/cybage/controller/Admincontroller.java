package com.cybage.controller;

import java.util.List;

import javax.transaction.Transactional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Manager;
import com.cybage.model.Sport;
import com.cybage.service.Adminservice;
import com.cybage.service.Managerservice;
import com.cybage.service.Sportservice;


@RestController
@EnableAutoConfiguration
@RequestMapping("/admin")
@CrossOrigin(origins = "*")
@Transactional
public class Admincontroller {
	
	
	@Autowired
	Adminservice adminservice;
	@Autowired
	Sportservice sportservice;
	
	@Autowired
	Managerservice managerservice;
	
	@PostMapping("/addmanager")
	public ResponseEntity<?>saveManagerDetails(@RequestBody @Valid Manager manager)
	{
		System.out.println("Manager saved");
		

		return new ResponseEntity<>(managerservice.saveManagerDetails(manager),HttpStatus.CREATED);
	}
	
/*	
	@PostMapping("/login")
	public Manager managerLogin(@RequestBody @Valid LoginRequest payload)
	{
		System.out.println("auth vendor"+payload);
		

		return managerservice.managerLogin(payload.getEmail(),payload.getPassword());
		
	}
	
	
	*/
	
	
	
	
	@PostMapping("/addSport")
	public ResponseEntity<?>saveSportDetails(@RequestBody @Valid Sport sport)
	{
		System.out.println("sport added");
		
		return new ResponseEntity<>(sportservice.saveSport(sport),HttpStatus.CREATED);
	}
	
	@GetMapping("/findsport/{sport_id}")
	public ResponseEntity<?> getSportDetailsById(@PathVariable int sport_id){
		System.out.println("sport details "+ sport_id);
		

		return ResponseEntity.ok(sportservice.getSportById(sport_id));
		
	}
	
	@DeleteMapping("/deletesport/{sport_id}")
	public ResponseEntity<String> deleteSportDetails(@PathVariable int sport_id){
		System.out.println("delete sportdetails "+sport_id);
	

		return ResponseEntity.ok(sportservice.deleteSportDetails(sport_id));
	}
	
	@PutMapping("/update1/{id}")
	public ResponseEntity<?> updateSportDetails(@RequestBody Sport detachedsport,@PathVariable("id") int sport_id){
		

		return ResponseEntity.ok(sportservice.updateSportDetails(detachedsport, sport_id));
	}
	
	@GetMapping("/getSport")
	public List<Sport> getSportList()
	{
		return sportservice.getSportList();
	}
	
}
