package com.projet.hibernate.bibli.model;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
  @Id
  @Column(name = "utilisateur_id")
  int id;
  
  @Column(name = "nom")
  String nom;
  
  @Column(name = "numeroMembre")
  int numeroMembre;
  
  @ManyToMany(mappedBy = "utilisateurs")
  ArrayList<Livre> livres;
}