package gestion;

public class congé {
	private String nom;
	private String genre;
	private boolean estEnceinte;
	private int joursRestants;
	private double salaire;

	    public congé(String nom, String genre, boolean estEnceinte, int joursRestants, double salaire) {
	        this.nom = nom;
	        this.genre = genre;
	        this.estEnceinte = estEnceinte;
	        this.joursRestants = joursRestants;
	        this.salaire= salaire;
	    }

	    public void joursRestants() {
	        if (joursRestants > 0) {
	            if (estEnceinte) {
	                joursRestants -= 45;
	            } else if (genre.equals("Femme")) {
	                joursRestants -= 30;
	            } else {
	                joursRestants -= 30;
	            }
	        } else {
	            salaire -= 60;
	    }
	    }

	    public void printcongéInfo() {
	        System.out.println("Employé nom: " + nom);
	        System.out.println("Genre: " + genre);
	        System.out.println("Enceinte: " + estEnceinte);
	        System.out.println("joursRestants: " + joursRestants);
	        System.out.println("Salaire: " + salaire);
	    }

		public String getNom() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getGenre() {
			// TODO Auto-generated method stub
			return null;
		}

		public String isEstEnceinte() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getJoursRestants() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getSalaire() {
			// TODO Auto-generated method stub
			return null;
		}
		public void prendrecongé(int jours) {
		    this.joursRestants -= jours;
		}

}
