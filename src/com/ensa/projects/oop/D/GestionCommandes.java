package com.ensa.projects.oop.D;

import java.util.ArrayList;
import java.util.List;

public class GestionCommandes {
    private List<String> produits;
    private List<Double> prix;
    private List<Integer> quantites;

    public GestionCommandes() {
        produits = new ArrayList<>();
        prix = new ArrayList<>();
        quantites = new ArrayList<>();
    }

    public void ajouterProduit(String produit, double prix, int quantite) {
        produits.add(produit);
        this.prix.add(prix);
        quantites.add(quantite);
    }

    public double calculerMontantTotal() {
        double total = 0;
        for (int i = 0; i < produits.size(); i++) {
            total += prix.get(i) * quantites.get(i);
        }
        return total;
    }

    public void afficherCommande() {
        for (int i = 0; i < produits.size(); i++) {
            System.out.println("Produit : " + produits.get(i) + ", Prix : " + prix.get(i) + ", Quantité : " + quantites.get(i));
        }
        System.out.println("Montant total de la commande : " + calculerMontantTotal());
    }

    public static void main(String[] args) {
        GestionCommandes gestionCommandes = new GestionCommandes();
        gestionCommandes.ajouterProduit("Produit A", 10.0, 2);
        gestionCommandes.ajouterProduit("Produit B", 15.0, 3);
        gestionCommandes.afficherCommande();
    }
}

