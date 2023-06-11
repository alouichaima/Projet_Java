package gestion;

import java.util.ArrayList;
import java.util.Date;

public class projet {
    private String nom;
    private Date dateDebut;
    private Date dateFin;
    private ArrayList<tache> taches;

    public projet(String nom, Date dateDebut, Date dateFin) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.taches = new ArrayList<tache>();
    }

    // Getters et setters pour les attributs de Projet
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public ArrayList<tache> getTaches() {
        return taches;
    }

    // Méthodes pour gérer les tâches
    public void ajouterTache(tache tache) {
        taches.add(tache);
    }

    public void supprimerTache(tache tache) {
        taches.remove(tache);
    }
}