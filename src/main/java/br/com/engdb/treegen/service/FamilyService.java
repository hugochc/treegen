package br.com.engdb.treegen.service;

import java.util.List;
import java.util.Optional;

import br.com.engdb.treegen.domain.Family;

public interface FamilyService {

	List<Family> findAll();
	
	Optional<Family> findById(long id);
	
	Family save(Family family);
	
	void deleteById(long id);
	
}
