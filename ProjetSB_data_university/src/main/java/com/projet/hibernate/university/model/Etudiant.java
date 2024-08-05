package com.projet.hibernate.university.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "etudiants")
@PrimaryKeyJoinColumn(name = "id")


public class Etudiant extends Utilisateur {
    private LocalDate dateNaissance;
}