package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Timesheet implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int id;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	private int isValide;
	@ManyToOne
	Employe employe;
	@ManyToOne
	Mission mission;
	public Timesheet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Timesheet(Date dateDebut, Date dateFin, int isValide, Employe employe, Mission mission) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.isValide = isValide;
		this.employe = employe;
		this.mission = mission;
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
	public int getIsValide() {
		return isValide;
	}
	public void setIsValide(int isValide) {
		this.isValide = isValide;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Mission getMission() {
		return mission;
	}
	public void setMission(Mission mission) {
		this.mission = mission;
	}
	
}
