package com.projet.hibernate.location.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "personne")
public class Personne {

	@Id
	@Column(name= "personne_id")
	int personneId;
	
	@Column(name= "personne_name")
	String name;
	
	@ManyToOne
	@JoinColumn(name = "logement_id")
	Logement logement;
}
