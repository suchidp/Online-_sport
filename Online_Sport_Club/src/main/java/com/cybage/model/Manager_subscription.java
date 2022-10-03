package com.cybage.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="manager_subscription")
@Component

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "manager_id")
public class Manager_subscription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int managersubscription_id;
	@Column(length = 20, nullable = false)
    private String manager_name;
	
	
	 @ManyToMany(mappedBy = "manager_subscription",fetch = FetchType.LAZY	)
		  @JsonIgnore
		  private Set<Sport> sport = new HashSet<>();
	 
	 
	 @ManyToMany(mappedBy = "manager_subscription",fetch = FetchType.LAZY	)
	  @JsonIgnore
	  private Set<Batches> batches = new HashSet<>();
	 
	 
	 
	 @ManyToMany(mappedBy = "manager_subscription",fetch = FetchType.LAZY	)
	  @JsonIgnore
	  private Set<Playersubscription> playersubscription = new HashSet<>();



	public Manager_subscription() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Manager_subscription(int managersubscription_id, String manager_name, Set<Sport> sport, Set<Batches> batches,
			Set<Playersubscription> playersubscription) {
		super();
		this.managersubscription_id = managersubscription_id;
		this.manager_name = manager_name;
		this.sport = sport;
		this.batches = batches;
		this.playersubscription = playersubscription;
	}



	public int getManagersubscription_id() {
		return managersubscription_id;
	}



	public void setManagersubscription_id(int managersubscription_id) {
		this.managersubscription_id = managersubscription_id;
	}



	public String getManager_name() {
		return manager_name;
	}



	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}



	public Set<Sport> getSport() {
		return sport;
	}



	public void setSport(Set<Sport> sport) {
		this.sport = sport;
	}



	public Set<Batches> getBatches() {
		return batches;
	}



	public void setBatches(Set<Batches> batches) {
		this.batches = batches;
	}



	public Set<Playersubscription> getPlayersubscription() {
		return playersubscription;
	}



	public void setPlayersubscription(Set<Playersubscription> playersubscription) {
		this.playersubscription = playersubscription;
	}



	@Override
	public String toString() {
		return "Manager_subscription [managersubscription_id=" + managersubscription_id + ", manager_name="
				+ manager_name + ", sport=" + sport + ", batches=" + batches + ", playersubscription="
				+ playersubscription + "]";
	}
	 
	 
	 
}
