package com.projet.hibernate.location.model;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "agence")
public class Agence {
	
	@Id
	@Column(name = "agence_id")
	int agenceId;
	
	@Column(name = "name")
	String name;
	
	@ManyToMany
	@JoinTable(name = "agence_logement",
			joinColumns = @JoinColumn(name="agence_id"),
			inverseJoinColumns = @JoinColumn(name="logement_id"))
	ArrayList<Logement> logements;

}
