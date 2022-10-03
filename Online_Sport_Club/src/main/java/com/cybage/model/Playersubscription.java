package com.cybage.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="playersubscription")
@Component

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "playersubscription_id")
public class Playersubscription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int playersubscription_id;
	@Column(length=20,nullable = false)
	private Enrollmentstatus enrollmentstatus ;
	
	@ManyToMany(fetch = FetchType.LAZY,
		      cascade =CascadeType.ALL
		        
		      )
		  @JoinTable(name = "player_managersubscription",
		        joinColumns = { @JoinColumn(name = "playersubscription_id") },
		        inverseJoinColumns = { @JoinColumn(name = "managersubscription_id") })
		  private Set<Manager_subscription> manager_subscription = new HashSet<>();

		  @OneToOne(mappedBy = "playersubscription")
		    private Player player;
		 
	public Playersubscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Playersubscription(int playersubscription_id, Enrollmentstatus enrollmentstatus,
			Set<Manager_subscription> manager_subscription, Player player) {
		super();
		this.playersubscription_id = playersubscription_id;
		this.enrollmentstatus = enrollmentstatus;
		this.manager_subscription = manager_subscription;
		this.player = player;
	}

	public int getPlayersubscription_id() {
		return playersubscription_id;
	}

	public void setPlayersubscription_id(int playersubscription_id) {
		this.playersubscription_id = playersubscription_id;
	}

	public Enrollmentstatus getEnrollmentstatus() {
		return enrollmentstatus;
	}

	public void setEnrollmentstatus(Enrollmentstatus enrollmentstatus) {
		this.enrollmentstatus = enrollmentstatus;
	}

	public Set<Manager_subscription> getManager_subscription() {
		return manager_subscription;
	}

	public void setManager_subscription(Set<Manager_subscription> manager_subscription) {
		this.manager_subscription = manager_subscription;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Playersubscription [playersubscription_id=" + playersubscription_id + ", enrollmentstatus="
				+ enrollmentstatus + ", manager_subscription=" + manager_subscription + ", player=" + player + "]";
	}

	
		  
		  
}
