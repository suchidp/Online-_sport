package com.cybage.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.service.Adminservice;
import com.cybage.service.Manager_subscriptionservice;
import com.cybage.service.Managerservice;
import com.cybage.service.Playersubscriptionservice;
import com.cybage.service.Sportservice;

@RestController
@EnableAutoConfiguration
@RequestMapping("/manager")
@CrossOrigin(origins = "*")
@Transactional
public class Managercontroller {
	
	@Autowired
	Adminservice adminservice;
	@Autowired
	Sportservice sportservice;
	
	@Autowired
	Managerservice managerservice;
	
	@Autowired
	Manager_subscriptionservice manager_subscriptionservice ;
	
	@Autowired
	Playersubscriptionservice playersubscriptionservice ;
	
	

}
