package com.ensa.projects.oop.C.entity;

public class Etudiant {
    String nom;
    String filiere;
    Adresse adresse;
    Ecole ecole;
    Emploi emploiActuel;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setEcole(Ecole ecole) {
        this.ecole = ecole;
    }

    public void setEmploiActuel(Emploi emploiActuel) {
        this.emploiActuel = emploiActuel;
    }
}