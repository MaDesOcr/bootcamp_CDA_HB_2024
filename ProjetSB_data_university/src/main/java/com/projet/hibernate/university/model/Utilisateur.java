package com.projet.hibernate.university.model;

import jakarta.persistence.*;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class Utilisateur {
    @Id
    private int id;

    private String nom;
}
 