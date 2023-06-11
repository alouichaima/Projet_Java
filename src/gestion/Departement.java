package gestion;


import java.util.ArrayList;
import java.util.List;

public class Departement {
    private String nom;
    private int idD;
    private int nbEmployes;
    private List<employée> employes;
    
    public Departement(String nom, int nbEmployes) {
        this.nom = nom;
        this.nbEmployes = nbEmployes;
        this.idD = idD;
        this.employes = new ArrayList<employée>();
    }
    
    public int getIdD() {
		return idD;
	}

	public void setIdD(int idD) {
		this.idD = idD;
	}

	public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getNbEmployes() {
        return nbEmployes;
    }
    
    public void setNbEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }
    public List<employée> getEmployes() {
        return employes;
    }

    public void setEmployes(List<employée> employes) {
        this.employes = employes;
    }

    public void ajouterEmploye(employée employe) {
        this.employes.add(employe);
    }

    public void supprimerEmploye(employée employe) {
        this.employes.remove(employe);
    }
    
    public void modifierEmploye(employée employe, String nom, String prenom, String sexe, int age, String dn, String departement, String adresse, String email, String telephone) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getIdEmp() == employe.getIdEmp()) {
                employes.get(i).modifierEmploye(nom, prenom, sexe, age, dn, departement, adresse, email, telephone);
                break;
            }
        
        }}}

