package gestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub
		
		// ajout et supresiion et modification des employées dans les département
		

		
		       /* // Création de deux départements
		        Departement departement1 = new Departement("Informatique", 50);
		        Departement departement2 = new Departement("Ressources Humaines", 40);
		        
		        // Création de trois employés
		        employée employe1 = new employée(1, 'Aloui', 'chaima', 'femme', 35, '01/01/1989', 'Informatique', 'Ariana', 'aloui.@gmail.com', '20132547');
		        employée employe2 = new employée(2, 'guedri', 'oumaima', 'femme', 35, '01/01/1989', 'Informatique', 'Ariana', 'guedri.@gmail.com', '20132547');
		        employée employe3 = new employée(3, 'sahar', 'kadri', 'femme', 35, '01/01/1989', 'Informatique', 'Ariana', 'kadri.@gmail.com', '20132547');
		        employée employe4 = new employée(4, 'baklouti', 'nour', 'femme', 35, '01/01/1989', 'Informatique', 'Ariana', 'aloui.@gmail.com', '20132547');

		        
		        // Ajout des employés aux départements
		        departement1.ajouterEmploye(employe1);
		        departement1.ajouterEmploye(employe2);
		        departement2.ajouterEmploye(employe3);
		        departement2.ajouterEmploye(employe4);

		        
		        // Suppression d'un employé
		        //departement1.supprimerEmploye(employe2);
		       
		        
		        // Affichage des employés de chaque département
		     // Affichage des employés de chaque département
		        System.out.println("Employés du département " + departement1.getNom() + ":");
		        for (employée employe : departement1.getEmployes()) {
		            System.out.println("ID: " + employe.getIdEmp() + " | Nom: " + employe.getNom() + " | Prénom: " + employe.getPrenom() + " | Sexe: " + employe.getSexe() + " | Âge: " + employe.getAge() + " | Date de naissance: " + employe.getDn() + " | Département: " + employe.getDepartement() + " | Adresse: " + employe.getAdresse() + " | E-mail: " + employe.getEmail() + " | Téléphone: " + employe.getTelephone());
		        }

		        System.out.println("Employés du département " + departement2.getNom() + ":");
		        for (employée employe : departement2.getEmployes()) {
		            System.out.println("ID: " + employe.getIdEmp() + " | Nom: " + employe.getNom() + " | Prénom: " + employe.getPrenom() + " | Sexe: " + employe.getSexe() + " | Âge: " + employe.getAge() + " | Date de naissance: " + employe.getDn() + " | Département: " + employe.getDepartement() + " | Adresse: " + employe.getAdresse() + " | E-mail: " + employe.getEmail() + " | Téléphone: " + employe.getTelephone());
		        }

		        //modification des informations personelles
		        departement1.modifierEmploye(employe1,'Aloui', 'chaima', 'femme', 35, '01/01/1989', 'Informatique', 'Ariana', 'aloui.@gmail.com', '20132547');
		        System.out.println("aprés modification"); 
		        System.out.println("Employés du département " + departement1.getNom() + ":");
		        for (employée employe : departement1.getEmployes()) {
		            System.out.println("ID: " + employe.getIdEmp() + " | Nom: " + employe.getNom() + " | Prénom: " + employe.getPrenom() + " | Sexe: " + employe.getSexe() + " | Âge: " + employe.getAge() + " | Date de naissance: " + employe.getDn() + " | Département: " + employe.getDepartement() + " | Adresse: " + employe.getAdresse() + " | E-mail: " + employe.getEmail() + " | Téléphone: " + employe.getTelephone());
		        }

		        System.out.println("Employés du département " + departement2.getNom() + ":");
		        for (employée employe : departement2.getEmployes()) {
		            System.out.println("ID: " + employe.getIdEmp() + " | Nom: " + employe.getNom() + " | Prénom: " + employe.getPrenom() + " | Sexe: " + employe.getSexe() + " | Âge: " + employe.getAge() + " | Date de naissance: " + employe.getDn() + " | Département: " + employe.getDepartement() + " | Adresse: " + employe.getAdresse() + " | E-mail: " + employe.getEmail() + " | Téléphone: " + employe.getTelephone());
		        }
		    }*/
	
            
	
	           
		

		
		
		
	/*	
		//calcule du salaire de l'employé
		gestionsalaire employé1= new gestionsalaire("sahar", 12.0, 30);
		double salaire1 = employé1.calculeSalaire();
		System.out.println("employé1 salaire:" +salaire1);
		gestionsalaire employé2 = new gestionsalaire("chaima", 12.0, 45);
        double salaire2 = employé2.calculeSalaire();
        System.out.println("Employé2 Salaire: " +salaire2);//12.0 * 40 + 12.0 * 1.5 * 5 = 660.0.
    
	}}*/





	   //calcule du congé des employé
		
	/*
		        // Création d'un objet congé
		        congé congé1 = new congé("xxx", "Femme", false, 30, 300);

		        // Affichage des informations initiales du congé
		        System.out.println("Informations du congé : ");
		        congé1.printcongéInfo();

		        // Utilisation de la méthode joursRestants pour mettre à jour les jours restants
		        congé1.joursRestants();

		        // Affichage des informations après la mise à jour des jours restants
		        System.out.println("Informations du congé après mise à jour des jours restants : ");
		        congé1.printcongéInfo();

		        // Utilisation de la méthode prendreCongé pour prendre 10 jours de congé
		        congé1.prendrecongé(10);

		        // Utilisation de la méthode joursRestants pour mettre à jour les jours restants après la prise de congé
		        congé1.joursRestants();

		        // Affichage des informations après la prise de congé
		        System.out.println("Informations du congé après la prise de congé : ");
		        congé1.printcongéInfo();
		    }
		}

		*/

        

        
        
        
		
		
        //entreprise et département
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom de l'entreprise : ");
        String nomEntreprise = scanner.nextLine();

        Entreprise entreprise = new Entreprise(nomEntreprise);

        // Ajouter un département
        System.out.print("Entrez le nom du département à ajouter : ");
        String nomDepartement1 = scanner.nextLine();
        System.out.print("Entrez le nombre d'employés du département : ");
        int nbEmployes = scanner.nextInt();

        Departement departement = new Departement(nomDepartement1, nbEmployes);

        entreprise.ajouterDepartement(departement);

        System.out.println("Le département " + nomDepartement1 + " a été ajouté à l'entreprise " + nomEntreprise + ".");
        System.out.println("Liste des départements de l'entreprise " + nomEntreprise + ":");
        entreprise.afficherDepartements();
        entreprise.afficherDepartements();

        // Modifier un département
        System.out.print("Entrez le nom du département à modifier : ");
        String nomDepartementAModifier = scanner.next();

        ArrayList<Departement> departements = entreprise.getDepartements();
        Departement departementAModifier = null;

        for (Departement d : departements) {
            if (d.getNom().equals(nomDepartementAModifier)) {
                departementAModifier = d;
                break;
            }
        }

        if (departementAModifier != null) {
            System.out.print("Entrez le nouveau nom du département : ");
            String nouveauNom = scanner.next();
            System.out.print("Entrez le nouveau nombre d'employés du département : ");
            int nouveauNbEmployes = scanner.nextInt();

            departementAModifier.setNom(nouveauNom);
            departementAModifier.setNbEmployes(nouveauNbEmployes);

            System.out.println("Le département " + nomDepartementAModifier + " a été modifié avec succès.");
            System.out.println("Liste des départements de l'entreprise " + nomEntreprise + ":");
            entreprise.afficherDepartements();
        } else {
            System.out.println("Le département " + nomDepartementAModifier + " n'a pas été trouvé dans l'entreprise " + nomEntreprise + ".");
        }

        // Supprimer un département
        System.out.print("Entrez le nom du département à supprimer : ");
        String nomDepartementASupprimer = scanner.next();

        departements = entreprise.getDepartements();
        Departement departementASupprimer = null;

        for (Departement d : departements) {
            if (d.getNom().equals(nomDepartementASupprimer)) {
                departementASupprimer = d;
                break;
            }
        }

        if (departementASupprimer != null) {
            entreprise.supprimerDepartement(departementASupprimer);
            System.out.println("Le département " + nomDepartementASupprimer + " a été supprimé de l'entreprise " + nomEntreprise + ".");
            System.out.println("Liste des départements de l'entreprise " + nomEntreprise + ":");
            entreprise.afficherDepartements();
        } else {
            System.out.println("Le département " + nomDepartementASupprimer + " n'a pas été trouvé dans l entreprise");



        }
        System.out.println("Liste des départements de l'entreprise " + nomEntreprise + ":");
        entreprise.afficherDepartements();
        
	}
}
		
         // tache et projet 
	/*
		    // Créer un nouveau projet
		Date maDate1 = new Date(2023, 4, 27);
		Date maDate2 = new Date(2023, 6, 27);
		    projet projet1 = new projet("php", maDate1, maDate2);

		    // Créer deux nouvelles tâches pour le projet
		    Date maDate3 = new Date(2023, 5, 26);
		    Date maDate4 = new Date(2023, 7, 27);
		    Date maDate5 = new Date(2023, 8, 27);
		    Date maDate6 = new Date(2023, 10, 27);
		    tache tache1 = new tache("bakend", maDate3, maDate4, "cette tache inclut;...");
		    tache tache2 = new tache("fronend", maDate5, maDate6, "cette tache inclut:....");

		    // Ajouter les tâches au projet
		    projet1.ajouterTache(tache1);
		    projet1.ajouterTache(tache2);

		    // Afficher les informations du projet et des tâches
		    System.out.println("Nom du projet: " + projet1.getNom());
		    System.out.println("Date de début du projet: " + projet1.getDateDebut());
		    System.out.println("Date de fin du projet: " + projet1.getDateFin());

		    System.out.println("\nNom de la tache 1: " + tache1.getNom());
		    System.out.println("Date de début de la tache 1: " + tache1.getDateDebut());
		    System.out.println("Date de fin de la tache 1: " + tache1.getDateFin());
		    System.out.println("Description de la tache 1: " + tache1.getDescription());

		    System.out.println("\nNom de la tache 2: " + tache2.getNom());
		    System.out.println("Date de début de la tache 2: " + tache2.getDateDebut());
		    System.out.println("Date de fin de la tache 2: " + tache2.getDateFin());
		    System.out.println("Description de la tache 2: " + tache2.getDescription());

		    // Supprimer la tâche 2 du projet
		    projet1.supprimerTache(tache2);

		    // Afficher à nouveau les informations du projet
		    System.out.println("\nInformations mises à jour du projet : ");
		    System.out.println("Nom du projet: " + projet1.getNom());
		    System.out.println("Date de début du projet: " + projet1.getDateDebut());
		    System.out.println("Date de fin du projet: " + projet1.getDateFin());

		    // Vérifier le nombre de tâches dans le projet
		    System.out.println("\nNombre de taches dans le projet: " + projet1.getTaches().size());

		    // Afficher les informations de la tâche 2 supprimée
		    System.out.println("\nNom de la tache 2 après suppression: " + tache2.getNom());
		    System.out.println("Date de début de la tache 2 après suppression: " + tache2.getDateDebut());
		    System.out.println("Date de fin de la tache 2 après suppression: " + tache2.getDateFin());
		    System.out.println("Description de la tache 2 après suppression: " + tache2.getDescription());

	
	}}
	*/
	//contrat
//	employée employe = new employée(1, 'Aloui', 'chaima', 'femme', 35, '01/01/1989', 'Informatique', 'Ariana', 'aloui.@gmail.com', '20132547');
	

	// Créer une instance de Contrat liée à l'employé
	/*Date dateDebut = new Date(122, 0, 1); // 1 janvier 2022
	Date dateFin = new Date(123, 11, 31); // 31 décembre 2023
	contrat contrat = new contrat(1, dateDebut, dateFin, 600, employe);*/



	// Afficher les informations du contrat et de l'employé correspondant
	
	/*System.out.println("ID du contrat : " + contrat.getIdcontrat());
	System.out.println("Date de début : " + contrat.getDateDebut());
	System.out.println("Date de fin : " + contrat.getDateFin());
	System.out.println("Salaire : " + contrat.getSalaire() + " dinars");
	System.out.println("ID : " + employe.getIdEmp() + ", Nom : " + employe.getNom() + ", Prénom : " + employe.getPrenom() + ", Sexe : " + employe.getSexe() + ", Date de naissance : " + employe.getDn() + ", Département : " + employe.getDepartement());*/

	//}
	//}
	
	


	


