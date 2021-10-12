package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Employe;

@Repository
public interface EmployeRepository extends CrudRepository<Employe,Integer> {

	@Query("SELECT count(*) as nbr FROM Employe")
	int getNombreEmployeJPQL();
	@Query("SELECT nom as nbr FROM Employe")
	List<String> getAllEmployeNamesJPQL();
	
}
