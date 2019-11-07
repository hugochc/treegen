package br.com.engdb.treegen.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.engdb.treegen.domain.Family;
import br.com.engdb.treegen.service.FamilyService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/family", produces = MediaType.APPLICATION_JSON_VALUE)
public class FamilyResource {

	private final FamilyService familyService;
	
	public FamilyResource(FamilyService familyService) {
		this.familyService = familyService;
	}
	
	@GetMapping
	@ApiOperation(value = "Find all families", response = List.class)
	public ResponseEntity<List<Family>> findAll() {
		return ResponseEntity.ok(familyService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	@ApiOperation(value = "Find a family by id", response = Family.class)
	public ResponseEntity<Family> findById(@PathVariable(value = "id") long id) {
		Optional<Family> family = familyService.findById(id);
		if (family.isPresent()) {
			return ResponseEntity.ok(family.get());
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ApiOperation(value = "Create a new family", response = Family.class)
	public ResponseEntity<Family> save(@RequestBody Family family) {
		return ResponseEntity.ok(familyService.save(family));
	}
	
	@DeleteMapping(value = "/{id}")
	@ApiOperation(value = "Delete a family")
	public ResponseEntity<Family> excluir(@PathVariable(value = "id") long id) {
		Optional<Family> family = familyService.findById(id);
		if (family.isPresent()) {
			familyService.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping
	@ApiOperation(value = "Update a family", response = Family.class)
	public ResponseEntity<Family> update(@RequestBody Family family, @PathVariable(value = "id") long id) {
		Optional<Family> oldFamily = familyService.findById(id);
		if (oldFamily.isPresent()) {
			return ResponseEntity.ok(familyService.save(family));
		}
		
		return ResponseEntity.notFound().build();
	}
	
}
