package com.projet.hibernate.location.model;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="logement")
public class Logement {
	
	@Id
	@Column(name= "logement_id")
	int logement_id;
	
	@OneToMany
	@JoinColumn(name = "logement_id")
	ArrayList<Personne> locataires;
	
	@ManyToOne
	@JoinColumn(name = "adresse_id")
	Adresse adresse;
	
	@ManyToMany(mappedBy = "logements")
	ArrayList<Agence> agences;
	
}
