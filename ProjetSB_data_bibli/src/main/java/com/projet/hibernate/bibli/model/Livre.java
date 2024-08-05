package com.projet.hibernate.bibli.model;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "livre")
public class Livre {
	
  @Id
  @Column(name = "livre_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  
  @Column(name = "nom")
  String nom;
  
  @Column(name = "estDispo")
  boolean estDispo;
  
  @ManyToOne
  @JoinColumn(name = "auteur_id")
  Auteur auteur;
  
  @ManyToMany
  @JoinTable(name = "emprunt",
  joinColumns = @JoinColumn(name="utlisateur_id"),
  inverseJoinColumns = @JoinColumn(name="livre_id"))
  ArrayList<Utilisateur> utilisateurs;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public boolean isEstDispo() {
	return estDispo;
}

public void setEstDispo(boolean estDispo) {
	this.estDispo = estDispo;
}

public Auteur getAuteur() {
	return auteur;
}

public void setAuteur(Auteur auteur) {
	this.auteur = auteur;
}

public ArrayList<Utilisateur> getUtilisateurs() {
	return utilisateurs;
}

public void setUtilisateurs(ArrayList<Utilisateur> utilisateurs) {
	this.utilisateurs = utilisateurs;
}
  
  
}