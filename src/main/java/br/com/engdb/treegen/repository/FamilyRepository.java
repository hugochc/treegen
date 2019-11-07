package br.com.engdb.treegen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.engdb.treegen.domain.Family;

public interface FamilyRepository extends JpaRepository<Family, Long> {

}
