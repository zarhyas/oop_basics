package com.ensa.projects.oop.D;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    List<Produit> produits;
    private double total;

    public Commande() {
        produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        if (produit != null){
            produits.add(produit);
            updateTotal(produit);
    }
}

    public void updateTotal(Produit p) {
            total += p.getPrixTotal();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("La commande: \n");
        for (Produit p : produits) {
            sb.append(p.toString());
            sb.append("\n");
        }
        sb.append("Montant: ");
        sb.append(total);
        return sb.toString();
    }
}
