package gestion;

public class gestionsalaire {
	

    private String nom;
    private double tauxhoraire ;
    private int heurestravailler;

    public gestionsalaire(String nom, double tauxhoraire, int heurestravailler) {
        this.nom = nom;
        this.tauxhoraire = tauxhoraire;
        this.heurestravailler = heurestravailler;
    }

    public double calculeSalaire() {
        double salaire = tauxhoraire * heurestravailler;

        if (heurestravailler> 40) {
            double tempspayé = (heurestravailler - 40) * tauxhoraire * 1.5;
            salaire += tempspayé;
        }
        return salaire ;
    }
}