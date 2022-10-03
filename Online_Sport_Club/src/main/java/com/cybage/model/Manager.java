package com.cybage.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="manager")
@Component

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "manager_id")
public class Manager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int manager_id;
	@Column(length = 20, nullable = false)
     private String manager_name;
	
	
	
	@Column(length = 20)
	private String password;
	@Column
	private String email;
	
	
	@OneToMany(mappedBy = "manager_batch")
	@JsonManagedReference(value="manager_batch")
	
	private List<Batches> batches;
  
  @ManyToOne
  @JsonBackReference(value="manager")
   @JoinColumn(name = "admin_id")
   private Admin ad;
  
  
  
 

public Manager() {
	super();
	// TODO Auto-generated constructor stub
}
public Manager(int manager_id, String manager_name, String password, String email, List<Batches> batches) {
	super();
	this.manager_id = manager_id;
	this.manager_name = manager_name;
	this.password = password;
	this.email = email;
	this.batches = batches;
}
public int getManager_id() {
	return manager_id;
}
public void setManager_id(int manager_id) {
	this.manager_id = manager_id;
}
public String getManager_name() {
	return manager_name;
}
public void setManager_name(String manager_name) {
	this.manager_name = manager_name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public List<Batches> getBatches() {
	return batches;
}
public void setBatches(List<Batches> batches) {
	this.batches = batches;
}
@Override
public String toString() {
	return "Manager [manager_id=" + manager_id + ", manager_name=" + manager_name + ", password=" + password
			+ ", email=" + email + ", batches=" + batches + "]";
}







  
}
