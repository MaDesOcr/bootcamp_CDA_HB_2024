package com.projet.hibernate.university.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "enseignants")
@PrimaryKeyJoinColumn(name = "id")

public class Enseignant extends Utilisateur {

    private String departement;

}