package com.ensa.projects.oop.C;

import com.ensa.projects.oop.C.entity.Emploi;
import com.ensa.projects.oop.C.entity.Etudiant;
import com.ensa.projects.oop.C.entity.Ecole;
import com.ensa.projects.oop.C.entity.Adresse;
class EtudiantFactory {

    public static Etudiant createEtudiant(String nom, String filiere, Adresse adresse, Ecole ecole) {
        Etudiant etudiant = new Etudiant();

        etudiant.setNom(nom);
        etudiant.setFiliere(filiere);
        etudiant.setAdresse(adresse);
        etudiant.setEcole(ecole);

        return etudiant;
    }

    public static Etudiant createEtudiantWithEmploi(String nom, String filiere, Adresse adresse, Ecole ecole, Emploi emploi) {
        Etudiant etudiant = createEtudiant(nom, filiere, adresse, ecole);
        etudiant.setEmploiActuel(emploi);
        return etudiant;
    }
}

