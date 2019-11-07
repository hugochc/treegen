package br.com.engdb.treegen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.engdb.treegen.domain.Family;
import br.com.engdb.treegen.domain.Person;
import br.com.engdb.treegen.repository.FamilyRepository;

@Service
public class FamilyServiceImpl implements FamilyService {

	private FamilyRepository familyRepository;
	
	public FamilyServiceImpl(FamilyRepository familyRepository) {
		this.familyRepository = familyRepository;
	}

	@Override
	public List<Family> findAll() {
		return familyRepository.findAll();
	}

	@Override
	public Optional<Family> findById(long id) {
		return familyRepository.findById(id);
	}

	@Override
	public Family save(Family family) {
		return familyRepository.save(family);
	}

	@Override
	public void deleteById(long id) {
		familyRepository.deleteById(id);
	}

	@Override
	public List<Person> getMembersByFamilyId(long familyId) {
		return familyRepository.getMembersByFamilyId(familyId);
	}
	
}
