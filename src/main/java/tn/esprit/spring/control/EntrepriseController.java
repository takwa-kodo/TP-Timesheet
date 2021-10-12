package tn.esprit.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Departement;
import tn.esprit.spring.entity.Employe;
import tn.esprit.spring.entity.Entreprise;
import tn.esprit.spring.service.EntrepriseServiceImpl;

@RestController
public class EntrepriseController {
	@Autowired
	EntrepriseServiceImpl entrepriseService;

	// http://localhost:8081/SpringMVC/servlet/add-Departement
	@PostMapping("/add-Departement")
	@ResponseBody
	public int ajouterDepartement(@RequestBody Departement dep) {
		return entrepriseService.ajouterDepartement(dep);
	}

	// http://localhost:8081/SpringMVC/servlet/add-Departement
	@PostMapping("/add-Entreprise")
	@ResponseBody
	public int ajouterEntreprise(@RequestBody Entreprise entreprise) {

		return entrepriseService.ajouterEntreprise(entreprise);
	}

	// http://localhost:8081/SpringMVC/servlet/DepartmentNames-Entreprise/{Entreprise-id}
	@GetMapping("/DepartmentNames-Entreprise/{Entreprise-id}")
	@ResponseBody
	public List<String> getAllDepartementsNamesByEntreprise(@PathVariable("Entreprise-id") String entrepriseId) {

		return entrepriseService.getAllDepartementsNamesByEntreprise(Integer.valueOf(entrepriseId));
	}

	// http://localhost:8081/SpringMVC/servlet/Affecter-Departement-Entreprise/{Departement-id}/{Entreprise-id}
	@PutMapping("/Affecter-Departement-Entreprise/{Departement-id}/{Entreprise-id}")
	@ResponseBody
	public void affecterDepartementAEntreprise(@PathVariable("Entreprise-id") String entrepriseId,
			@PathVariable("Departement-id") String depId) {

		entrepriseService.affecterDepartementAEntreprise(Integer.valueOf(depId), Integer.valueOf(entrepriseId));
	}

}
