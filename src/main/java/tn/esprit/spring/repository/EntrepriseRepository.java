package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Entreprise;

public interface EntrepriseRepository  extends CrudRepository<Entreprise,Integer> {

}
