package tn.esprit.spring.service;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Contrat;
import tn.esprit.spring.entity.Departement;
import tn.esprit.spring.entity.Employe;
import tn.esprit.spring.entity.Entreprise;
import tn.esprit.spring.repository.ContratRepository;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EmployeRepository;
import tn.esprit.spring.repository.EntrepriseRepository;
@Service
public class EmployeServiceImpl implements EmployeService{
	@Autowired
	EmployeRepository employeRepository;
	@Autowired
	DepartementRepository departementRepository;
	@Autowired
	ContratRepository contratRepository;
	
	private static final Logger l = LogManager.getLogger(EmployeServiceImpl.class);
	@Override
	public int ajouterEmploye(Employe employe) {
		l.info("employe user : " + employe);
		employeRepository.save(employe);
		return 1;
	}

	@Override
	public void affecterEmployeADepartement(int employeId, int depId) {
Employe e =employeRepository.findById(employeId).get();

Departement d = departementRepository.findById(depId).get();
Set<Departement> Departements  = new HashSet();
Departements.add(d);
e.setDepartements(Departements);
employeRepository.save(e);
		
	}

	@Override
	public int ajouterContrat(Contrat contrat) {
		contratRepository.save(contrat);
		return 0;
	}

	@Override
	public void affecterContratAEmploye(int contratId, int employeId) {
		Contrat c =contratRepository.findById(contratId).get();
		Employe e =employeRepository.findById(employeId).get();
c.setEmploye(e);
contratRepository.save(c);
		
	}

	@Override
	public String getEmployePrenomById(int employeId) {
		Employe e =employeRepository.findById(employeId).get();
		return e.getPrenom();
	}

	@Override
	public long getNombreEmployeJPQL() {
		// TODO Auto-generated method stub
		return Long.valueOf(employeRepository.getNombreEmployeJPQL());
	}

	@Override
	public List<String> getAllEmployeNamesJPQL() {
		
		return employeRepository.getAllEmployeNamesJPQL();
	}

	
}
