package gestion;
import java.util.Date;

public class contrat {
    private int idcontrat;
    private Date dateDebut;
    private Date dateFin;
    private double salaire;
    private employée employe; // Référence à l'employé correspondant

    public contrat(int idcontrat, Date dateDebut, Date dateFin, double salaire, employée employe) {
        this.idcontrat = idcontrat;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.salaire = salaire;
        this.employe = employe;
    }

    public int getIdcontrat() {
        return idcontrat;
    }

    public void setIdcontrat(int idcontrat) {
        this.idcontrat = idcontrat;
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

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public employée getEmploye() {
        return employe;
    }
}

