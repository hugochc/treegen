package br.com.engdb.treegen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.engdb.treegen.domain.Family;
import br.com.engdb.treegen.domain.Person;

public interface FamilyRepository extends JpaRepository<Family, Long> {
	
	@Query("select p from Person p where p.family.id = :familyId")
	List<Person> getMembersByFamilyId(@Param("familyId") long familyId);
	
}
