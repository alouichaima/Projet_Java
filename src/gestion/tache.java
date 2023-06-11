package gestion;
import java.util.Date;

public class tache extends projet {
    
		// TODO Auto-generated constructor stub
	

	private String nom;
    private Date dateDebut;
    private Date dateFin;
    private String description;

    public tache(String nom, Date dateDebut, Date dateFin, String description) {
        super("", null, null);
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.description = description;
    }

    // Getters et setters pour les attributs de Tache
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}