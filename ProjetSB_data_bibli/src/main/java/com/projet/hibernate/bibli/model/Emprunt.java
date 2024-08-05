package com.projet.hibernate.bibli.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emprunt")
public class Emprunt {
  @Id
  @Column(name = "emprunt_id")
  int id;
  
  @Column(name = "date_emprunt")
  LocalDateTime dateEmprunt;
  
  @Column(name = "date_retour")
  LocalDateTime dateRetour;
  
}