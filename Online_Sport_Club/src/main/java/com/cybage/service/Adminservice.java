package com.cybage.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.AdminDao;
import com.cybage.model.Admin;


@Service
public class Adminservice {
	
	@Autowired
	AdminDao admindao;
	
	public Admin adminLogin(String email,String password)
	{
		
		return admindao.findByEmailandPassword(email, password);
	}


	public Object saveadminDetails(Admin admin) {
		// TODO Auto-generated method stub
		return admindao.save(admin);
	}
}
