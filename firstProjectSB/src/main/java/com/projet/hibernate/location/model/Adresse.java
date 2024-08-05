package com.projet.hibernate.location.model;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "adresse")
public class Adresse {
	
	@Id
	@Column(name = "adresse_id")
	int adresseId;
	
	@Column(name="num")
	int num;
	
	@Column(name="nomRue")
	String nomRue;
	
	@Column(name="ville")
	String ville;
	
	@OneToMany
	@JoinColumn(name = "adresse_id")
	ArrayList<Logement> logements;
}
