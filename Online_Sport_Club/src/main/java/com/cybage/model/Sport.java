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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Component
@Table(name="sport")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "sport_id")

public class Sport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sport_id;
	@Column(length = 20, nullable = false)
    private String sportname;
	
	@ManyToMany(fetch = FetchType.LAZY,
		      cascade =CascadeType.ALL
		        
		      )
		  @JoinTable(name = "sports_managersubscription",
		        joinColumns = { @JoinColumn(name = "sport_id") },
		        inverseJoinColumns = { @JoinColumn(name = "managersubscription_id") })
		  private Set<Manager_subscription> manager_subscription = new HashSet<>();

	



		public Sport() {
			super();
			// TODO Auto-generated constructor stub
		}





		public Sport(int sport_id, String sportname, Set<Manager_subscription> manager_subscription) {
			super();
			this.sport_id = sport_id;
			this.sportname = sportname;
			//this.manager_subscription = manager_subscription;
		}





		public int getSport_id() {
			return sport_id;
		}





		public void setSport_id(int sport_id) {
			this.sport_id = sport_id;
		}





		public String getSportname() {
			return sportname;
		}





		public void setSportname(String sportname) {
			this.sportname = sportname;
		}





		





		public Set<Manager_subscription> getManager_subscription() {
			return manager_subscription;
		}





		public void setManager_subscription(Set<Manager_subscription> manager_subscription) {
			this.manager_subscription = manager_subscription;
		}





		@Override
		public String toString() {
			return "Sport [sport_id=" + sport_id + ", sportname=" + sportname + ", manager_subscription="
					+ manager_subscription + "]";
		}







		
        
        
        
}
