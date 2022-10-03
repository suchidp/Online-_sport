package com.cybage.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Component
@Table(name="players")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "player_id")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int player_id;
	@Column(length = 20, nullable = false)
	private String password;
	@Column(unique = true, nullable = false)
	private String email;
	
	
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "playersubscription_id")
	    private Playersubscription playersubscription;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int player_id, String password, String email, Playersubscription playersubscription) {
		super();
		this.player_id = player_id;
		this.password = password;
		this.email = email;
		this.playersubscription = playersubscription;
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
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
	public Playersubscription getPlayersubscription() {
		return playersubscription;
	}
	public void setPlayersubscription(Playersubscription playersubscription) {
		this.playersubscription = playersubscription;
	}
	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", password=" + password + ", email=" + email
				+ ", playersubscription=" + playersubscription + "]";
	}
	
	
}
