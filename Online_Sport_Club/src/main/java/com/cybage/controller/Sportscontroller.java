package com.cybage.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Sport;
import com.cybage.service.Sportservice;

@RestController
@EnableAutoConfiguration
@RequestMapping("/sports")
@CrossOrigin(origins = "*")
@Transactional
public class Sportscontroller {
	@Autowired
	Sportservice sportservice;
	
	@GetMapping("/getSport")
	public List<Sport> getSportList()
	{
		return sportservice.getSportList();
	}
	
	
}
