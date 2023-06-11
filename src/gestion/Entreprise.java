package gestion;

import java.util.ArrayList;

public class Entreprise {
    private String nom;
    private ArrayList<Departement> departements;
    

    public Entreprise(String nom) {
        this.nom = nom;
        departements = new ArrayList<>();
    }

   
	public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

	

    public ArrayList<Departement> getDepartements() {
        return departements;
    }

    public void afficherDepartements() {
        System.out.println("Liste des départements de l'entreprise " + nom + ":");
        for (Departement departement : departements) {
            System.out.println("- " + departement.getNom());
        }
    }
}

   