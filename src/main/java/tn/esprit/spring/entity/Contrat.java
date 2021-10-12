package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contrat implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reference;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	private long Salaire;
	private String typeContrat;
	@OneToOne
	private Employe employe;
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contrat(int reference, Date dateDebut, long salaire, String typeContrat, Employe employe) {
		super();
		this.reference = reference;
		this.dateDebut = dateDebut;
		Salaire = salaire;
		this.typeContrat = typeContrat;
		this.employe = employe;
	}
	
	public Contrat(Date dateDebut, long salaire, String typeContrat) {
		super();
		this.dateDebut = dateDebut;
		Salaire = salaire;
		this.typeContrat = typeContrat;
	}
	public Contrat(Date dateDebut, long salaire, String typeContrat, Employe employe) {
		super();
		this.dateDebut = dateDebut;
		Salaire = salaire;
		this.typeContrat = typeContrat;
		this.employe = employe;
	}
	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public long getSalaire() {
		return Salaire;
	}
	public void setSalaire(long salaire) {
		Salaire = salaire;
	}
	public String getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	
	

}
