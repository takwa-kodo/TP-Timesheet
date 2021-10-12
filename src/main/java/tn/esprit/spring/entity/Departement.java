package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class Departement implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int id;
	private String name;
	@ManyToMany(mappedBy="Departements", cascade = CascadeType.ALL)
	private Set<Employe> employes;
	@ManyToOne
	Entreprise entreprise;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="departement")
	private Set<Mission> Missions;
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departement(int id, String name, Set<Employe> employes, Entreprise entreprise, Set<Mission> missions) {
		super();
		this.id = id;
		this.name = name;
		this.employes = employes;
		this.entreprise = entreprise;
		Missions = missions;
	}
	public Departement(String name, Set<Employe> employes, Entreprise entreprise, Set<Mission> missions) {
		super();
		this.name = name;
		this.employes = employes;
		this.entreprise = entreprise;
		Missions = missions;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(Set<Employe> employes) {
		this.employes = employes;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	public Set<Mission> getMissions() {
		return Missions;
	}
	public void setMissions(Set<Mission> missions) {
		Missions = missions;
	}
	@Override
	public String toString() {
		return "Departement [id=" + id + ", name=" + name ;
	}
	
}
