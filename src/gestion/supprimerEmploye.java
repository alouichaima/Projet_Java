package gestion;

import java.util.List;

public class supprimerEmploye extends nouveauemployé {

    public void supprimerEmployeById(int idEmp, List<employée> employees) {
        // Recherche de l'employé correspondant à l'id
        employée employe = rechercherEmployeParId(employees, idEmp);

        // Vérification que l'employé existe bien
        if (employe != null) {

            // Suppression de l'employé de la liste des employés de l'entreprise
            employees.remove(employe);

            // Affichage d'un message de confirmation
            System.out.println("L'employé a été supprimé avec succès.");

        } else {
            // Affichage d'un message d'erreur si l'employé n'existe pas
            System.out.println("Aucun employé correspondant à cet identifiant n'a été trouvé.");
        }
    }

    public employée rechercherEmployeParId(List<employée> employees, int idEmp) {
        // Recherche de l'employé dans la liste des employés de l'entreprise

        for (employée employee : employees) {
            if (employee.getIdEmp() == idEmp) {
                return employee;
            }
        }

        // Retourne null si l'employé n'est pas trouvé
        return null;
    }
}