package gestion;

import java.util.List;

public class modifierEmploye extends nouveauemployé {
    private String nom;
    private String prénom;
    private String adresse;
    private String email;
    private String telephone;
    private int idEmp;

    public void modifierEmployeById(int idEmp, String nom, String prenom, String adresse, String email, String telephone, List<employée> employees) {
        // Recherche de l'employé correspondant à l'id
        employée employe = rechercherEmployeParId(employees, idEmp);

        // Vérification que l'employé existe bien

        if (employe != null) {

            // Modification des informations personnelles
            employe.setNom(nom);
            employe.setPrenom(prenom);
            employe.setAdresse(adresse);
            employe.setEmail(email);
            employe.setTelephone(telephone);

            // Affichage d'un message de confirmation

            System.out.println("Les informations personnelles de l'employé ont été modifiées avec succès.");
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


