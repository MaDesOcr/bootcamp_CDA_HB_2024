package com.projet.hibernate.bibli.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "auteur")
public class Auteur {

	@Id
	@Column(name= "auteur_id")
	int auteurId;
	
	@Column(name= "auteur_name")
	String name;
	
	@ManyToOne
	@JoinColumn(name = "livre_id")
	Livre livre;
}
