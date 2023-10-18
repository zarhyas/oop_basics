package com.ensa.projects.oop.D;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Produit produitA = new Produit("Produit A", 10.0, 2);
        Produit produitB = new Produit("Produit B", 15.0, 3);

        Commande commande = new Commande();

        commande.ajouterProduit(produitA);
        commande.ajouterProduit(produitB);

        System.out.println(commande);
    }
}

