package entities;

import java.sql.Date;
import java.sql.Time;

public class cours {
    private int idC;
    private Date date;
    private Time heureDebut;
    private Time heureFin;
    private Professeur professeur;
    private Module module;
    public int getIdC() {
        return idC;
    }
    public void setIdC(int idC) {
        this.idC = idC;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Time getHeureDebut() {
        return heureDebut;
    }
    public void setHeureDebut(Time heureDebut) {
        this.heureDebut = heureDebut;
    }
    public Time getHeureFin() {
        return heureFin;
    }
    public void setHeureFin(Time heureFin) {
        this.heureFin = heureFin;
    }
    public Professeur getProfesseur() {
        return professeur;
    }
    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
    public Module getModule() {
        return module;
    }
    public void setModule(Module module) {
        this.module = module;
    }
}
