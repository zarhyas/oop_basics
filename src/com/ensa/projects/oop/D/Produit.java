package com.ensa.projects.oop.D;

public class Produit {
    String nom;
    int quantite;
    double prix;

    public Produit(String nom, double prix, int quantite){
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
    }
    public double getPrixTotal(){
        return prix * quantite;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", quantite=" + quantite +
                ", prix=" + prix +
                '}';
    }
}
